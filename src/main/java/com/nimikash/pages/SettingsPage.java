package com.nimikash.pages;

import org.openqa.selenium.By;

public class SettingsPage extends BasePage {

    private final By accountManagementBtn = By.xpath("//android.widget.TextView[@text='Account Management']");
    private final By profileBtn = By.xpath("//android.widget.TextView[@text='Profile']");

    private final By resetPasswordBtn = By.xpath("//android.widget.TextView[@text='Reset Password']");

    private final By logoutBtn = By.xpath("//android.widget.TextView[@text='Logout']");


    public void clickProfileBtn() {
        click(profileBtn,"Profile Btn");
    }
    public void clickAccountManagementBtn() {
        click(accountManagementBtn,"Account Management Btn");
    }

}
