package com.nimikash.pages;

import com.nimikash.driver.DriverManager;
import com.nimikash.reports.ExtentLogger;
import com.nimikash.reports.ExtentManager;
import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class BasePage {

    protected void click(MobileElement element, String elementName){
        explicitWait(element);
        element.click();
        System.out.println(elementName + "is clicked successfully");
        ExtentLogger.pass(elementName + "is clicked successfully");
    }

    protected void click(By by, String elementName){
        click((MobileElement) DriverManager.getDriver().findElement(by),elementName);
    }

    protected void click(String locatorType, String value, String elementName){
        if(locatorType.equalsIgnoreCase("xpath")){
            click(By.xpath(value),elementName);
        }
        else if(locatorType.equalsIgnoreCase("id")){
            click(By.id(value),elementName);
        }
    }

    protected void chooseItemAndClick(List<MobileElement> list, String menu){
        MobileElement mobileElement = list.parallelStream().filter(e -> e.getText().contains(menu)).findFirst().get();
        click(mobileElement, menu);
    }

    private void explicitWait(MobileElement element) {
        new WebDriverWait(DriverManager.getDriver(),5)
                .withMessage(() -> "Some problems while finding the element")
                .pollingEvery(Duration.ofSeconds(1))
                .until(ExpectedConditions.visibilityOf(element));
    }

    protected void scrollToSpecificElementAndClick(By by){
        while (DriverManager.getDriver().findElements(by).isEmpty()){
            Dimension dimensions = DriverManager.getDriver().manage().window().getSize();
            Double screenHeightStart = dimensions.getHeight() * 0.5;
            int scrollStart = screenHeightStart.intValue();
            Double screenHeightEnd = dimensions.getHeight() * 0.2;
            int scrollEnd = screenHeightEnd.intValue();
            int center = (int) (dimensions.width * 0.5);
            new AndroidTouchAction((PerformsTouchActions) DriverManager.getDriver())
                    .press(PointOption.point(center, scrollStart)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2))).
                    moveTo(PointOption.point(center, scrollEnd)).release().perform();
        }
    }

    protected boolean isDisplayed(By by) {
        return DriverManager.getDriver().findElement(by).isDisplayed();
    }

    protected boolean isSelected(By by) {
        return DriverManager.getDriver().findElement(by).isSelected();
    }

    protected boolean isEnabled(By by) {
        return DriverManager.getDriver().findElement(by).isEnabled();
    }

    protected WebElement getWebElement(By by) {
        return DriverManager.getDriver().findElement(by);
    }

    protected boolean isAllElementsEmpty(By by) {
        return DriverManager.getDriver().findElements(by).isEmpty();
    }

    protected int getAllElementsEmpty(By by) {
        return DriverManager.getDriver().findElements(by).size();
    }

    protected boolean isStringContains(By by, String value) {
        return DriverManager.getDriver().findElement(by).getText().contains(value);
    }

    protected boolean isStringEquals(By by, String value) {
        return DriverManager.getDriver().findElement(by).getText().equals(value);
    }

    protected boolean isStringEqualsIgnoreCase(By by, String value) {
        return DriverManager.getDriver().findElement(by).getText().equalsIgnoreCase(value);
    }





}
