package com.wilkey.pages;

import com.wilkey.pages.elements.Header;
import com.wilkey.pages.elements.SearchInput;
import com.wilkey.webtestsbase.WilkeyPageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class StudentsPage extends WilkeyPageBase {
    @Override
    public String getUrlPage() {
        return "students";
    }

    public Header header;
    public SearchInput searchInput;

    private By headerStudents = By.cssSelector("body > main > div.main-page-container.container-fluid.partnership-solution-page > div > div.hero-banner.collection-banner > div.container > article > div:nth-child(1) > p.sg-title-h1 > span:nth-child(1)");
    private By linkLearnMore = By.xpath("//p//a[contains(@href,'www.wileyplus.com')]");

    public StudentsPage() {
        this.header = new Header();
        this.searchInput = new SearchInput();
    }

    public boolean isDisplayedHeaderStudents() {
        return driver.findElement(headerStudents).isDisplayed();
    }

    public void clickOnLinkLearnMore(int itemElement) {
        getElementsFormList(linkLearnMore).get(itemElement).click();
    }

    public String getUrlAndGoBack() {
        wait.withTimeout(Duration.ofSeconds(5)).until(ExpectedConditions.urlContains("www.wileyplus.com"));
        String url = driver.getCurrentUrl();
        goToBackTab();
        return url;
    }


}
