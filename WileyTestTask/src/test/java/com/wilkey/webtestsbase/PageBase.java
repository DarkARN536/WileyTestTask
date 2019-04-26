package com.wilkey.webtestsbase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public abstract class PageBase{
    protected WebDriver driver;
    protected WebDriverWait wait;
    protected Actions action;

    protected PageBase() {
        driver = WebDriverBase.getDriver();
        wait = WebDriverBase.getWait();
        action = WebDriverBase.getAction();
    }

    public List<WebElement> getElementsFormList(By element) {
        List<WebElement> elements = driver.findElements(element);
        return elements;
    }

    public void waitVisibilityOfElement(By element) {
        wait.withTimeout(Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOfElementLocated(element));
    }

    public void waitInvisibilityOfElement(By element) {
        wait.withTimeout(Duration.ofSeconds(5)).until(ExpectedConditions.invisibilityOfElementLocated(element));
    }

    public void waitClickableOfElement(By element) {
        wait.withTimeout(Duration.ofSeconds(3)).until(ExpectedConditions.elementToBeClickable(element));
    }

    public void goToBackTab() {
        driver.navigate().back();
    }

    public void goToForwardTab() {
        driver.navigate().forward();
    }
}
