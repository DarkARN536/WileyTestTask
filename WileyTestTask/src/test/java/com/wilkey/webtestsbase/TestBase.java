package com.wilkey.webtestsbase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

public class TestBase {
    protected WebDriver driver;
    protected WebDriverWait wait;
    protected Actions action;

    @BeforeSuite
    protected void BeforeSuite() {
        /**
         * Available are CHROME or FIREFOX
         */
        WebDriverBase.selectBrowser("CHROME");
        /**
         * Enter the window size (height, width) or enter "max" or "full" for the full window
         */
        WebDriverBase.windowSize(1280, 720);
    }

    @AfterSuite(alwaysRun = true)
    protected void AfterSuite() {
        WebDriverBase.finishBrowser();
    }

    @BeforeClass
    protected void BeforeClass() {
        driver = WebDriverBase.getDriver();
        wait = WebDriverBase.getWait();
        action = WebDriverBase.getAction();
    }
}
