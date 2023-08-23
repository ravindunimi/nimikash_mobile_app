package com.nimikash.pages;

import com.nimikash.driver.DriverManager;
import com.nimikash.utils.DynamicXpathUtils;
import org.openqa.selenium.By;

public class LoginPage extends BasePage {

    private final By loginBtn = By.xpath("//android.widget.Button[@index='0']");
    private final By emailField = By.xpath("//android.view.ViewGroup[1]/android.widget.EditText");
    private final By passwordField = By.xpath("//android.view.ViewGroup[2]/android.widget.EditText");
    private final By addBankAccountsBtn = By.xpath("//*[contains(@text,'Add Bank Accounts')]");
    private final By welcomeUndefinedElm = By.xpath("//*[contains(@text,'Welcome undefined')]");
    private String randomBtn = "//android.widget.TextView[contains(@text,'%s') and @id='%s']";

    public void clickLoginBtn() throws InterruptedException {
        click(loginBtn,"Login");
        Thread.sleep(2000);
    }
    public void enterEmail(String email){
        sendKeys(emailField, email, "Email");
    }
    public void enterPassword(String password){
        sendKeys(passwordField, password, "Password");
    }
    public void clickRandomBtn(String btnName, String btnId) throws InterruptedException {
        String newxpath = randomBtn.replace("%replaceable1%",btnName).replace("%replaceable2%",btnId);
//        String newxpath1 = String.format(randomBtn, btnName);
        DriverManager.getDriver().findElement(By.xpath(newxpath)).click();
        Thread.sleep(500);
    }
}
