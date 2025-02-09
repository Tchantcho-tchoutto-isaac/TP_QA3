package com.cucumber.tools;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverTool {
    static public WebDriver driver;

    static public void setupDriver() {
        driver = new ChromeDriver();
    }

    static public WebDriver getDriver() {
        return driver;
    }

    static public void tearDown() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

}
