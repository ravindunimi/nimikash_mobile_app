package com.nimikash.driver;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;

public class BrowserStackImpl implements IDriver{

    public WebDriver getDriver() throws MalformedURLException {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("browserstack.user","prodengleads_iEuyg3");
        capabilities.setCapability("browserstack.key","LJpcyD2rWPxxSp1QmLy1");
        capabilities.setCapability("deviceName","Samsung Galaxy S22 Ultra");
        capabilities.setCapability("platformVersion","12.0");
        capabilities.setCapability("platformName","android");
        capabilities.setCapability(MobileCapabilityType.APP,"bs://b4c07d6f5678135b4f44ef587f4849d243d235fc");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");

        WebDriver driver = new AndroidDriver(new URL("http://hub.browserstack.com/wd/hub"), capabilities);
        return driver;
    }

//    public WebDriver getDriver(Map<String, String> map) throws MalformedURLException {
//
//        DesiredCapabilities capabilities = new DesiredCapabilities();
//        capabilities.setCapability("browserstack.user","prodengleads_iEuyg3");
//        capabilities.setCapability("browserstack.key","LJpcyD2rWPxxSp1QmLy1");
//
//        map.forEach(capabilities::setCapability);
//
//        capabilities.setCapability("platformName","android");
//        capabilities.setCapability(MobileCapabilityType.APP,"bs://b4c07d6f5678135b4f44ef587f4849d243d235fc");
//        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
//
//        WebDriver driver = new AndroidDriver(new URL("http://hub.browserstack.com/wd/hub"), capabilities);
//        return driver;
//    }

}
