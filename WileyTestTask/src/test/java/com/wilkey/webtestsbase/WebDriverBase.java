package com.wilkey.webtestsbase;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import java.util.concurrent.TimeUnit;

public class WebDriverBase {
    protected static WebDriver driver;
    protected static WebDriverWait webDriverWait;
    protected static Actions action;

    public static WebDriver getDriver() {
        return driver;
    }

    public static void selectBrowser(String browser) {
        if (browser == "CHROME") {
            System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
            driver = new ChromeDriver();
        }
        if (browser == "FIREFOX") {
            System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver.exe");
            driver = new FirefoxDriver();
        }
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        webDriverWait = new WebDriverWait(driver, 30);
    }

    public static void windowSize(int width, int height) {
        driver.manage().window().setSize(new Dimension(width, height));
    }

    public static void windowSize(String size) {
        if (size == "max" | size == "full") {
            driver.manage().window().maximize();
        }
        else {
            Reporter.log("Unable to recognize screen resolution. Set standard - 1280х720", true);
            driver.manage().window().setSize(new Dimension(1280, 720));
        }
    }

    public static void finishBrowser() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

    public static WebDriverWait getWait() {
        return webDriverWait;
    }

    public static Actions getAction() {
        action = new Actions(driver);
        return action;
    }
}