package com.nimikash.pages;

import org.openqa.selenium.By;

public class ProfilePage extends BasePage {

    private final By profileEle = By.xpath("//android.widget.TextView[@text='Profile']");
    private final By editMyProfileBtn = By.xpath("//android.view.ViewGroup/android.widget.TextView[2]");
    private final By firstNameEle = By.xpath("//android.widget.TextView[4]");
    private final By lastNameEle = By.xpath("//android.widget.TextView[6]");

    //    My Profile
    private final By myProfileEle = By.xpath("//*[contains(@text,'My Profile')]");
    private final By firstNameField = By.xpath("//android.view.ViewGroup[1]/android.widget.EditText");
    private final By lastNameField = By.xpath("//android.view.ViewGroup[2]/android.widget.EditText");
    private final By countyCodeBtn = By.xpath("//android.view.ViewGroup[3]/android.widget.TextView");
    private final By mobileField = By.xpath("//android.view.ViewGroup[4]/android.widget.EditText");
    private final By updateBtn = By.xpath("//android.view.ViewGroup[5]/android.widget.Button");
    private final By backBtn = By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]");

    public void clickEditMyProfileBtn() throws InterruptedException {
        click(editMyProfileBtn,"Edit MyProfile Btn");
        Thread.sleep(2000);
    }
    public void enterFirstName(String firstName){
        sendKeys(firstNameField, firstName, "First Name");
    }
    public void enterLastName(String lastName){
        sendKeys(lastNameField, lastName, "Last Name");
    }
    public void clickUpdateBtn() {
        click(updateBtn,"Update Btn");
    }
    public void enterMobileName(String mobileNumber){
        sendKeys(mobileField, mobileNumber, "Mobile Number");}
}
