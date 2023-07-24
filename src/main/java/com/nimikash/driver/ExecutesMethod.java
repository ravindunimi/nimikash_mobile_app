package com.nimikash.driver;

import org.openqa.selenium.remote.Response;

import java.util.Map;

public interface ExecutesMethod {

    Response execute(String var1, Map<String, ?> var2);

    Response execute(String var1);
}
