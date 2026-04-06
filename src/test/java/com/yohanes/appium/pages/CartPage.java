package com.yohanes.appium.pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class CartPage {

    AndroidDriver driver;

    public CartPage(AndroidDriver driver) {
        this.driver = driver;
    }

    By checkout = By.xpath("//android.view.ViewGroup[@content-desc='test-CHECKOUT']");

    public void clickCheckout() {
        driver.findElement(checkout).click();
    }
}