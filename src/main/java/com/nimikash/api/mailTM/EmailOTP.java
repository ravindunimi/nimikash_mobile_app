package com.nimikash.api.mailTM;

import com.nimikash.pages.BasePage;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static io.restassured.RestAssured.*;

public class EmailOTP extends BasePage {

    public void mailTMLogin(){
        baseURI = "https://api.mail.tm";
        RequestSpecification request = RestAssured.given();

        String payload = "{\n" +
                "    \"address\": \"gdhddnbdbc@exelica.com\",\n" +
                "    \"password\": \"Password@2023\"\n" +
                "}";
        request.header("Content-Type","application/json");
        Response response = request.body(payload).post("/token");
        String jsonString = response.getBody().asString();
        String token = JsonPath.from(jsonString).get("token");

        request.header("Authorization","Bearer " + token)
                .header("Content-Type","application/json");
        Response response1 = request.get("/messages");
        String jsonString1 = response1.getBody().asString();
        String message = JsonPath.from(jsonString1).get("'hydra:member'[0].intro");

        String regex = "[0-9]{6}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(message);

        if (matcher.find()) {
            OTP = matcher.group();
            System.out.println(OTP);
        } else {
            System.out.println("No match found");
        }
    }

}
