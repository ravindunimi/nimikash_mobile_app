package com.nimikash.test;

import com.nimikash.driver.Driver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;

import static com.nimikash.driver.Driver.quitDriver;

public class BaseTest {

    @BeforeMethod
    public void setUp() throws MalformedURLException {
        Driver.initDriver();
    }

    @AfterMethod
    public void tearDownTest() {
        quitDriver();
    }
}
