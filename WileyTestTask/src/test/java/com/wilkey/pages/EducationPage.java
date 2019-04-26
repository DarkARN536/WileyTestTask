package com.wilkey.pages;

import com.wilkey.pages.elements.Header;
import com.wilkey.pages.elements.SearchInput;
import com.wilkey.webtestsbase.WilkeyPageBase;
import org.openqa.selenium.By;

public class EducationPage extends WilkeyPageBase {
    @Override
    public String getUrlPage() {
        return "Education-c-ED00";
    }

    public Header header;
    public SearchInput searchInput;

    private By headerEducation = By.cssSelector("body > main > div.main-page-container.container-fluid > div > div > div.hero-banner > div.container > article > div > div.wiley-slogan > h1:nth-child(3) > span");
    private By titlesItemsOnSubjects = By.xpath("//div[@class='side-panel']//li");

    public EducationPage() {
        this.header = new Header();
        this.searchInput = new SearchInput();
    }

    public boolean isDisplayedHeaderEducation() {
        return driver.findElement(headerEducation).isDisplayed();
    }

    public int getSizeItemsOnSubjects() {
        return getElementsFormList(titlesItemsOnSubjects).size();
    }

    public String getTextTitleItemsOnSubjects(int i) {
        return getElementsFormList(titlesItemsOnSubjects).get(i).getText();
    }

}
