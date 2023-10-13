package com.nimikash.function;

import com.nimikash.api.mailTM.EmailOTP;
import com.nimikash.data.LoginData;
import com.nimikash.pages.HomePage;
import com.nimikash.pages.LoginPage;

public class CommonFunctions {

    LoginData loginData = new LoginData();

    public void loginToApp() throws InterruptedException {

        LoginPage loginPage = new LoginPage();
        EmailOTP emailOTP = new EmailOTP();
        HomePage homePage = new HomePage();

        loginPage.enterEmail(loginData.email);
        loginPage.enterPassword(loginData.password);
        loginPage.clickLoginBtn();
        emailOTP.verifyOTPUsingDB();
        homePage.inputOTP();
        homePage.clickVerifyBtn();
    }
}
