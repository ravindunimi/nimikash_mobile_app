package com.nimikash.pages;

import org.openqa.selenium.By;

public class HomePage extends BasePage {

    private final By eleNimiKash = By.xpath("//*[contains(@text,'NimiKash')]");
    private final By settingBtn = By.xpath("//android.view.ViewGroup/android.widget.Button[3]");
    private final By enterFirstDigit = By.xpath("//android.view.ViewGroup/android.widget.EditText[1]");
    private final By verifyBtn = By.xpath("//android.view.ViewGroup/android.widget.Button");



    public void clickVerifyBtn() throws InterruptedException {
        click(verifyBtn,"Verify Button");
        Thread.sleep(500);
    }

    public void clickSettingBtn() throws InterruptedException {
        click(settingBtn,"Setting Button");
        Thread.sleep(500);
    }

    public void enterFirstDigit(String firstDigit){
        sendKeys(enterFirstDigit, firstDigit, "First Digit");
    }

    public void inputOTP() throws InterruptedException {
        String otp = OTP;
        for (int i = 1; i < 7; i++) {
            By enterDigit = By.xpath("//android.view.ViewGroup/android.widget.EditText["+i+"]");
            int j = i -1;
            String digit = String.valueOf(otp.charAt(j));
            System.out.println(digit);
            clear(enterDigit);
            sendKeys((enterDigit), digit,"Digit");
            Thread.sleep(500);
        }
    }
}
