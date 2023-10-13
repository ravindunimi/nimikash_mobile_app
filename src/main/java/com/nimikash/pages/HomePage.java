package com.nimikash.pages;

import org.openqa.selenium.By;

public class HomePage extends BasePage {


    private final By settingBtn = By.xpath("//android.view.ViewGroup/android.widget.Button[3]");
    private final By enterFirstDigit = By.xpath("//android.view.ViewGroup/android.widget.EditText[1]");
    private final By verifyBtn = By.xpath("//android.view.ViewGroup/android.widget.Button");

//    Nav Bar and Page Elements
    private final By homeTab = By.xpath("//android.view.ViewGroup/android.view.View/android.view.View[1]");
    private final By nimiKashEle = By.xpath("//*[contains(@text,'NimiKash')]");

    private final By paystubsTab = By.xpath("//android.view.ViewGroup/android.view.View/android.view.View[2]");
    private final By thisMonthEarningsEle = By.xpath("//*[contains(@text,'This Month Earnings')]");

    private final By newsTab = By.xpath("//android.view.ViewGroup/android.view.View/android.view.View[3]");
    private final By newsUpdatesEle = By.xpath("//*[contains(@text,'News Updates')]");

    private final By cardTab = By.xpath("//android.view.ViewGroup/android.view.View/android.view.View[4]");
    private final By nimiCardEle = By.xpath("//android.view.ViewGroup/android.widget.ImageView[2]");

    private final By stocksTab = By.xpath("//android.view.ViewGroup/android.view.View/android.view.View[5]");
    private final By welcomeEle = By.xpath("//*[contains(@text,'Welcome undefined!')]");
    private final By addCreditCard = By.xpath("//android.view.ViewGroup/android.widget.Button");






    public void clickVerifyBtn() throws InterruptedException {
        click(verifyBtn,"Verify Button");
        Thread.sleep(500);
    }

    public void clickSettingBtn() throws InterruptedException {
        click(settingBtn,"Setting Button");
        Thread.sleep(250);
    }

    public void enterFirstDigit(String firstDigit){
        sendKeys(enterFirstDigit, firstDigit, "First Digit");
    }

    public void inputOTP(){
        String otp = OTP;
        for (int i = 1; i < 7; i++) {
            By enterDigit = By.xpath("//android.view.ViewGroup/android.widget.EditText["+i+"]");
            int j = i -1;
            String digit = String.valueOf(otp.charAt(j));
            clear(enterDigit);
            sendKeys((enterDigit), digit,"Digit");
        }
    }
}
