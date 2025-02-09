package com.cucumber.hooks;

import com.cucumber.tools.WebdriverTool;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
@Before
    public void beforEachScenario() {
        WebdriverTool.setupDriver();
    }

    @After
    public void afterEachScenarion() {
        WebdriverTool.tearDown();
    }
}
