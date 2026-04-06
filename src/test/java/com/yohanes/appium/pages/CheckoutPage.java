package com.yohanes.appium.pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class CheckoutPage {

    AndroidDriver driver;

    public CheckoutPage(AndroidDriver driver) {
        this.driver = driver;
    }

    By firstName = By.xpath("//android.widget.EditText[@content-desc='test-First Name']");
    By lastName = By.xpath("//android.widget.EditText[@content-desc='test-Last Name']");
    By zip = By.xpath("//android.widget.EditText[@content-desc='test-Zip/Postal Code']");
    By continueBtn = By.xpath("//android.view.ViewGroup[@content-desc='test-CONTINUE']");
    By finishBtn = By.xpath("//android.view.ViewGroup[@content-desc='test-FINISH']");
    By success = By.xpath("//android.widget.TextView[contains(@text,'THANK YOU')]");

    public void fillForm(String f, String l, String z) {
        driver.findElement(firstName).sendKeys(f);
        driver.findElement(lastName).sendKeys(l);
        driver.findElement(zip).sendKeys(z);
        driver.findElement(continueBtn).click();
    }

    public void finish() {
        driver.findElement(finishBtn).click();
    }

    public boolean isSuccess() {
        return driver.findElement(success).isDisplayed();
    }
}