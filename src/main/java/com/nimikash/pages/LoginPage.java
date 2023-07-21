package com.nimikash.pages;

import com.nimikash.driver.DriverManager;
import com.nimikash.utils.DynamicXpathUtils;
import org.openqa.selenium.By;

public class LoginPage {

    private String loginBtn = "//android.widget.TextView[contains(@text,'%replaceable%')]";
    private String randomBtn = "//android.widget.TextView[contains(@text,'%s') and @id='%s']";

    public void clickLoginBtn(String btnName){
        String newxpath = DynamicXpathUtils.getXpath(loginBtn,btnName);
        DriverManager.getDriver().findElement(By.xpath(newxpath)).click();
    }

    public void clickRandomBtn(String btnName, String btnId){
        String newxpath = randomBtn.replace("%replaceable1%",btnName).replace("%replaceable2%",btnId);
//        String newxpath1 = String.format(randomBtn, btnName);
        DriverManager.getDriver().findElement(By.xpath(newxpath)).click();
    }
}
