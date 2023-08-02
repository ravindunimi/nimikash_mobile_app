package com.nimikash.driver;

import com.nimikash.exception.FrameworkException;
import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;

public final class DriverFactory {

    private DriverFactory(){}

    public static WebDriver get(Modes mode) throws MalformedURLException {

        WebDriver driver = null;

        if (mode.equals(Modes.LOCAL)) {
            driver = new LocalDriverImpl().getDriver();
        }
        else if (mode.equals(Modes.BS)) {
            driver = new BrowserStackImpl().getDriver();
        }
        else{
            throw new FrameworkException("No cloud provider with the name you mentioned is configured");
        }


        return driver;
    }

}
