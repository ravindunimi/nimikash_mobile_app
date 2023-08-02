package com.nimikash.reports;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import java.util.Objects;

public class ExtentReport {

    private static ExtentReports extent;

    public static void initReports(){

        if (Objects.isNull(extent)) {
            extent = new ExtentReports();
            ExtentSparkReporter spark = new ExtentSparkReporter(System.getProperty("user.dir") + "/index.html");

            spark.config().setTheme(Theme.DARK);
            spark.config().setReportName("Nimikash - Mobile Automation Report");
            spark.config().setDocumentTitle("Checking");
            extent.attachReporter(spark);
        }
    }

    public static void tearDownReports() {
        if(Objects.isNull(extent)) {
            extent.flush();
            ExtentManager.unload();
        }
    }

    public static void createTest(String testCaseName){
       ExtentManager.setExtentTest(extent.createTest(testCaseName));
    }
}
