package com.wilkey.pages;

import com.wilkey.pages.elements.Header;
import com.wilkey.pages.elements.SearchInput;
import com.wilkey.webtestsbase.WilkeyPageBase;
import org.openqa.selenium.By;

public class SearchPage extends WilkeyPageBase {
    @Override
    public String getUrlPage() {
        SEARCH_WORD = "Java";
        return "search?pq=" + SEARCH_WORD + "%7Crelevance";
    }

    public Header header;
    public SearchInput searchInput;

    private String SEARCH_WORD;

    private By titlesWithJava = By.xpath("//h3//a[contains(@href,'Java')]");
    private By allSearchTitles = By.xpath("//div[@class='products-list']//h3");
    private By productContent = By.xpath("//div[@class='product-content']");

    public SearchPage() {
        this.header = new Header();
        this.searchInput = new SearchInput();
    }

    public int getSizeTitlesWithJava() {
        return getElementsFormList(titlesWithJava).size();
    }

    public int getSizeAllSearchTitles() {
        return getElementsFormList(allSearchTitles).size();
    }

    public int findButtonAddToCart() {
        int count = 0;
        for (int x = 0; x < getElementsFormList(productContent).size(); x++){
            if (getElementsFormList(productContent).get(0).getText().contains("ADD TO CART")) {
                count++;
            }
        }
        return count;
    }


}
