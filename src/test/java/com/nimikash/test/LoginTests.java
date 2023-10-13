package com.nimikash.test;

import com.nimikash.api.mailTM.EmailOTP;
import com.nimikash.data.LoginData;
import com.nimikash.function.CommonFunctions;
import com.nimikash.pages.HomePage;
import com.nimikash.pages.LoginPage;
import com.nimikash.pages.SettingsPage;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class LoginTests extends BaseTest {

    LoginData loginData = new LoginData();


    @Test(priority = 1)
    public void Profile() throws MalformedURLException, InterruptedException {

        HomePage homePage = new HomePage();
        SettingsPage settingsPage = new SettingsPage();
        CommonFunctions commonFunctions = new CommonFunctions();

        commonFunctions.loginToApp();
        homePage.clickSettingBtn();
    }

//    @Test(dataProvider = "getData")
//    public void multipleDevice () {
//
//    }
//
//    @DataProvider(parallel = false)
//    public Object[] getData() throws IOException {
//
//        HashMap<String, String> hashMap = new ObjectMapper().readValue(new File(System.getProperty("user.dir") +
//                "/src/test/resources/jsontestdata/dataBS1.json"), HashMap.class);
//
//        HashMap<String, String> hashMap1 = new ObjectMapper().readValue(new File(System.getProperty("user.dir") +
//                "/src/test/resources/jsontestdata/dataBS2.json"), HashMap.class);
//
//        return new Object[]{hashMap,hashMap1};
//    }


}
