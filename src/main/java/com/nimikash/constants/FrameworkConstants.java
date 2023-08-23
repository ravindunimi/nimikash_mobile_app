package com.nimikash.constants;

import lombok.Getter;

import java.util.Objects;

@Getter
public final class FrameworkConstants {

    private static FrameworkConstants frameworkConstants;

    public static synchronized FrameworkConstants getInstance(){
        if (Objects.isNull(frameworkConstants)){
            frameworkConstants = new FrameworkConstants();
        }
        return frameworkConstants;
    }

    private final String apkfilepath = System.getProperty("user.dir") + "/src/test/resources/apkfiles/NimiKash.apk";
    private final String configfilepath = System.getProperty("user.dir")+"//src//test//resources//config//config.properties";

}
