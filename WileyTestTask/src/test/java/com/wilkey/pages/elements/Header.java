package com.wilkey.pages.elements;

import com.wilkey.webtestsbase.ElementBase;
import org.openqa.selenium.By;

public class Header extends ElementBase {

    private By linkWhoWeServe = By.cssSelector("#main-header-navbar > ul.navigation-menu-items.initialized > li:nth-child(1) > a");
    private By linkAbout = By.cssSelector("#main-header-navbar > ul.navigation-menu-items.initialized > li:nth-child(4) > a");
    private By linkSubjects = By.xpath("//li[@class='dropdown-submenu']//a[contains(@href,'subjects')]");
    private By titlesSubHeadersOnWhoWeServe = By.xpath("//div[@id='Level1NavNode1']//li[@class='dropdown-item ']");
    private By linkEducationonSubjects = By.xpath("//div[@id='Level1NavNode2']//a[contains(@href,'Education-c-ED00')]");
    private By logoWileyInHeader = By.xpath("//img[@title='Wiley']");

    public String getTextLinkWhoWeServe() {
        return driver.findElement(linkWhoWeServe).getText();
    }

    public String getTextLinkAbout() {
        return driver.findElement(linkAbout).getText();
    }

    public String getTextSubjects() {
        return driver.findElement(linkSubjects).getText();
    }

    public void hoverCursorOnLinkWhoWeServe() {
        action.moveToElement(driver.findElement(linkWhoWeServe)).build().perform();
        waitVisibilityOfElement(titlesSubHeadersOnWhoWeServe);
    }

    public int getSizeSubHeaderUnderWhoWeServe() {
        return getElementsFormList(titlesSubHeadersOnWhoWeServe).size();
    }

    public String getTextTitleSubHeaderOnLinkWhoWeServe(int i) {
        return getElementsFormList(titlesSubHeadersOnWhoWeServe).get(i).getText();
    }

    public void clickOnLinkStudents() {
        hoverCursorOnLinkWhoWeServe();
        getElementsFormList(titlesSubHeadersOnWhoWeServe).get(0).click();
    }

    public void hoverCursorOnLinSubjects() {
        action.moveToElement(driver.findElement(linkSubjects)).build().perform();
        waitVisibilityOfElement(linkEducationonSubjects);
    }

    public void clickOnLinkEducation() {
        hoverCursorOnLinSubjects();
        getElementsFormList(linkEducationonSubjects).get(0).click();
    }

    public void clickLogoWileyInHeader() {
        driver.findElement(logoWileyInHeader).click();
    }
}
