package com.wilkey.pages;

import com.wilkey.pages.elements.Header;
import com.wilkey.pages.elements.SearchInput;
import com.wilkey.webtestsbase.WilkeyPageBase;
import org.openqa.selenium.By;

public class HomePage extends WilkeyPageBase {
    @Override
    public String getUrlPage() {
        return "";
    }

    public Header header;
    public SearchInput searchInput;

    private By btnCloseModal = By.className("close");
    private By btnYesOnModal = By.cssSelector("#country-location-form > div.modal-footer > button.changeLocationConfirmBtn.button.large.button-teal");
    private By linkLearnMoreAboutUs = By.xpath("//div[@class='yCmsComponent']//a[@class='link-button']");

    public HomePage() {
        this.header = new Header();
        this.searchInput = new SearchInput();
    }

    public void clickButtonCloseModal() {
        driver.findElement(btnCloseModal).click();
    }

    public void clickButtonYesOnModal() {
        if (driver.findElement(btnYesOnModal).isDisplayed()) {
            driver.findElement(btnYesOnModal).click();
            waitInvisibilityOfElement(btnYesOnModal);
        }
    }

    public String getTextLinkLearnMoreAboutUs() {
        return driver.findElement(linkLearnMoreAboutUs).getText();
    }
}
