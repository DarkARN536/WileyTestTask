package com.wilkey.tests;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.get;

import io.restassured.response.Response;
import org.json.JSONException;
import org.testng.Assert;

@Test(groups = "Part 2. API")
public class ApiTests {
    @Test(description = "GET/delay/{delay} - Returns a delayed response (max of 10 seconds).")
    public void getRequestHttpbinOrgDelay() throws JSONException {
        long assertTime;
        int delay = 111;
        if (delay <= 10) {
            assertTime = (delay + 1) * 1000;
        }
        else {
            assertTime = 11000;
        }
        Response response = get("http://httpbin.org/delay/" + delay);
        long i = response.getTime();
        System.out.print("Time waiting for the response: " + i + "ms");
        long s = response.statusCode();
        System.out.print("\nStatus code: " + s + "\n");
        Assert.assertTrue(i <= assertTime);
    }

    @Test(description = "GET/image/png - Returns a simple PNG image.")
    public void getRequestHttpbinOrgImage() throws JSONException {
        Response response = get("http://httpbin.org/image/png");
        String str = response.contentType();
        Assert.assertEquals(str, "image/png", "Not got a image");
    }
}
