package com.wilkey.webtestsbase;

import org.testng.Reporter;

public abstract class WilkeyPageBase extends PageBase {
    protected String BASE_URL;
    protected String REGION;

    public WilkeyPageBase() {
        BASE_URL = "https://www.wiley.com/";
        REGION = "en-us";
//        REGION = "en-ru";
    }

    public void openPage() {
        String fullUrl = BASE_URL + REGION + getUrlPage();
        Reporter.log("Open " + fullUrl, true);
        driver.get(fullUrl);
    }

    public abstract String getUrlPage();
}
