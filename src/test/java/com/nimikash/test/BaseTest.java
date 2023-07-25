package com.nimikash.test;

import com.aventstack.extentreports.ExtentTest;
import com.nimikash.driver.Driver;
import com.nimikash.reports.ExtentReport;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;

import static com.nimikash.driver.Driver.quitDriver;

public class BaseTest {

    @BeforeSuite
    public void setUpTest() {
        ExtentReport.initReports();
    }

    @AfterSuite
    public void tearDownSuite() {
        ExtentReport.tearDownReports();
    }

    @BeforeMethod
    public void setUp(Method m) throws MalformedURLException {
        ExtentReport.createTest(m.getName());
        Driver.initDriver();
    }

    @AfterMethod
    public void tearDownTest() {
        quitDriver();
    }
}
