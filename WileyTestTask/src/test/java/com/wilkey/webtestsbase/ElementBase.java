package com.wilkey.webtestsbase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class ElementBase extends PageBase{
    protected WebDriver driver;
    protected WebDriverWait wait;
    protected Actions action;

    protected ElementBase() {
        driver = WebDriverBase.getDriver();
        wait = WebDriverBase.getWait();
        action = WebDriverBase.getAction();
    }
}
