package com.nimikash.test;

import com.nimikash.data.LoginData;
import com.nimikash.pages.LoginPage;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class LoginTests extends BaseTest {

    LoginData loginData = new LoginData();

    @Test
    public void login() throws MalformedURLException {

        LoginPage loginPage = new LoginPage();

        loginPage.enterEmail(loginData.email);
        loginPage.enterPassword(loginData.password);
        loginPage.clickLoginBtn();
        System.out.println("Successful ");
    }

//    @Test(dataProvider = "getData")
//    public void multipleDevice () {
//
//    }
//
//    @DataProvider(parallel = false)
//    public Object[] getData() throws IOException {
//
//        HashMap<String, String> hashMap = new ObjectMapper().readValue(new File(System.getProperty("user.dir") +
//                "/src/test/resources/jsontestdata/dataBS1.json"), HashMap.class);
//
//        HashMap<String, String> hashMap1 = new ObjectMapper().readValue(new File(System.getProperty("user.dir") +
//                "/src/test/resources/jsontestdata/dataBS2.json"), HashMap.class);
//
//        return new Object[]{hashMap,hashMap1};
//    }


}
