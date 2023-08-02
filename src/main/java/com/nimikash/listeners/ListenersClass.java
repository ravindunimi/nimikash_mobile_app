package com.nimikash.listeners;

import com.nimikash.reports.ExtentLogger;
import com.nimikash.reports.ExtentReport;
import org.testng.*;

import static com.nimikash.driver.Driver.quitDriver;

public class ListenersClass implements ITestListener, ISuiteListener {

    @Override
    public void onStart(ISuite iSuite) {
        ExtentReport.initReports();
    }

    @Override
    public void onFinish(ISuite iSuite) {
        ExtentReport.tearDownReports();
    }

    @Override
    public void onTestStart(ITestResult iTestResult) {
        ExtentReport.createTest(iTestResult.getName());
    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        ExtentLogger.pass(iTestResult.getName() + "Passed");
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        ExtentLogger.fail(iTestResult.getName() + "Failed");
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {
        ExtentLogger.skip(iTestResult.getName() + "Skipped");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext iTestContext) {

    }

    @Override
    public void onFinish(ITestContext iTestContext) {

    }
}
