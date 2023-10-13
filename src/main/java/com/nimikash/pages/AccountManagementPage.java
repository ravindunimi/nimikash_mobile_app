package com.nimikash.pages;

import org.openqa.selenium.By;

public class AccountManagementPage {

    private final By deleteBtn = By.xpath("//android.view.ViewGroup[2]/android.widget.TextView[3]");
    private final By editMySalaryBtn = By.xpath("//android.view.ViewGroup[3]/android.widget.TextView[2]");
    private final By addNRFCAccountBtn = By.xpath("//android.widget.TextView[@text='Add NRFC Account']");
    private final By nameField = By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText");
    private final By accountNoField = By.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.EditText");
    private final By addAccountBtn = By.xpath("//android.widget.TextView[@text='Add Account']");
    private final By skipBtn = By.xpath("//android.widget.TextView[@text='Skip']");


}
