package com.nimikash.test;

import com.aventstack.extentreports.ExtentTest;
import com.nimikash.driver.Driver;
import com.nimikash.reports.ExtentReport;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;

import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;

import static com.nimikash.driver.Driver.quitDriver;

public class BaseTest {


    @BeforeMethod
    public void setUp(Method m) throws MalformedURLException {
        Driver.initDriver();
    }

    @AfterMethod
    public void tearDownTest() {
        Driver.quitDriver();
    }
}
