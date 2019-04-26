package com.wilkey.pages.elements;

import com.wilkey.webtestsbase.ElementBase;
import org.openqa.selenium.By;

public class SearchInput extends ElementBase {

    private By areaWithContentOfSearch = By.cssSelector("#ui-id-2");
    private By btnSearch = By.xpath("//span[@class='input-group-btn']//button[@type='submit']");
    private By inputSearch = By.id("js-site-search-input");
    private By searchSectionSuggestions = By.xpath("//section[contains(@class,'suggestions')]//span[contains(text(),'java')]");
    private By searchSectionProducts = By.xpath("//section[contains(@class,'products')]//span[contains(text(),'Java')]");


    public boolean isDisplayedAreaWithContentOfSearch() {
        waitVisibilityOfElement(areaWithContentOfSearch);
        return driver.findElement(areaWithContentOfSearch).isDisplayed();
    }

    public void clickButtonSearch() {
        driver.findElement(btnSearch).click();
    }

    public void enterWordInInputSearch(String word) {
        driver.findElement(inputSearch).click();
        driver.findElement(inputSearch).clear();
        driver.findElement(inputSearch).sendKeys(word);
    }

    public int getSizeSearchSectionSuggestions() {
        return getElementsFormList(searchSectionSuggestions).size();
    }

    public int getSizeSearchSectionProducts() {
        return getElementsFormList(searchSectionProducts).size();
    }
}
