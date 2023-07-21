package com.nimikash.test;

import com.nimikash.pages.LoginPage;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class AppConfig extends BaseTest {

    @Test
    public void launchApp() throws MalformedURLException {
//        new LoginPage().clickLoginBtn("login");
        System.out.println("Successful ");
    }

}
