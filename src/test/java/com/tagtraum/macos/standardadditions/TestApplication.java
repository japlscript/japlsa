/*
 * =================================================
 * Copyright 2021 tagtraum industries incorporated
 * All rights reserved.
 * =================================================
 */
package com.tagtraum.macos.standardadditions;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.util.Map;

/**
 * TestApplication.
 *
 * @author <a href="mailto:hs@tagtraum.com">Hendrik Schreiber</a>
 */
public class TestApplication {

    @Test
    public void testBeep() {
        final ScriptingAddition scriptingAddition = ScriptingAddition.getInstance();
        scriptingAddition.beep(2);
    }

    @Test
    public void testGetSystemInfo() {
        final ScriptingAddition scriptingAddition = ScriptingAddition.getInstance();
        final SystemInformation systemInformation = scriptingAddition.systemInfo();
        final String bootVolume = systemInformation.getBootVolume();
        System.out.println(bootVolume);
        final Map<String, Object> properties = systemInformation.getProperties();
        System.out.println(properties);
    }

    @Test
    @Disabled("Requires user input")
    public void testChooseColor() {
        final ScriptingAddition scriptingAddition = ScriptingAddition.getInstance();
        final Color color = scriptingAddition.chooseColor(Color.RED);
        System.out.println(color);
    }

}
