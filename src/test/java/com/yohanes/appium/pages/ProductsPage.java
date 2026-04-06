
package com.yohanes.appium.pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class ProductsPage {

    AndroidDriver driver;

    public ProductsPage(AndroidDriver driver) {
        this.driver = driver;
    }

    By title = By.xpath("//android.widget.TextView[@text='PRODUCTS']");
    By sortBtn = By.xpath("//android.view.ViewGroup[@content-desc='test-Modal Selector Button']");
    By lowToHigh = By.xpath("//android.widget.TextView[@text='Price (low to high)']");
    By addToCart = By.xpath("(//android.view.ViewGroup[@content-desc='test-ADD TO CART'])[1]");
    By cart = By.xpath("//android.view.ViewGroup[@content-desc='test-Cart']");

    public boolean isDisplayed() {
        return driver.findElement(title).isDisplayed();
    }

    public void sortLowToHigh() {
        driver.findElement(sortBtn).click();
        driver.findElement(lowToHigh).click();
    }

    public void addFirstProduct() {
        driver.findElement(addToCart).click();
    }

    public void goToCart() {
        driver.findElement(cart).click();
    }
}



