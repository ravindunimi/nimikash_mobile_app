package com.nimikash.driver;

import io.appium.java_client.CommandExecutionHelper;
import io.appium.java_client.ExecutesMethod;
import io.appium.java_client.MobileCommand;
import io.appium.java_client.android.nativekey.KeyEvent;

import java.util.AbstractMap;

public interface PressesKey extends ExecutesMethod {

    default void pressKey(KeyEvent keyEvent) {
        CommandExecutionHelper.execute(this, new AbstractMap.SimpleEntry(MobileCommand.PRESS_KEY_CODE, keyEvent.build()));
    }

    default void longPressKey(KeyEvent keyEvent) {
        CommandExecutionHelper.execute(this, new AbstractMap.SimpleEntry(MobileCommand.LONG_PRESS_KEY_CODE, keyEvent.build()));
    }
}
