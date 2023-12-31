package com.nimikash.reports;

import com.aventstack.extentreports.ExtentTest;

public final class ExtentManager {

    private ExtentManager(){}

    private static ThreadLocal<ExtentTest> test = new ThreadLocal<>();

    public static ExtentTest getExtentTest(){
        return test.get();
    };

    public static void setExtentTest(ExtentTest extentTest){
        test.set(extentTest);
    }

    public static void unload(){
        test.remove();
    }
}
