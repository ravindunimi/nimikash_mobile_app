package com.nimikash.test;

import com.nimikash.function.CommonFunctions;
import com.nimikash.pages.HomePage;
import com.nimikash.pages.ProfilePage;
import com.nimikash.pages.SettingsPage;
import com.nimikash.utils.StringUtils;
import org.codehaus.groovy.util.StringUtil;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class HomeTabTests extends BaseTest {

    @Test(priority = 2)
    public void Profile() throws MalformedURLException, InterruptedException {

        HomePage homePage = new HomePage();
        SettingsPage settingsPage = new SettingsPage();
        CommonFunctions commonFunctions = new CommonFunctions();
        ProfilePage profilePage = new ProfilePage();
        StringUtils stringUtils = new StringUtils();
        String firstName = stringUtils.generateFirstName();
        String lastName = stringUtils.generateLastName();
        String mobileNumber = stringUtils.generateMobileNumber();

        commonFunctions.loginToApp();
        homePage.clickSettingBtn();
        settingsPage.clickProfileBtn();
        profilePage.clickEditMyProfileBtn();
        profilePage.enterFirstName(firstName);
        profilePage.enterLastName(lastName);
        profilePage.enterMobileName(mobileNumber);
        profilePage.clickUpdateBtn();

    }
}
