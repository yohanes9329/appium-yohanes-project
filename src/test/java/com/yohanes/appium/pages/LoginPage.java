package com.yohanes.appium.pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class LoginPage {

    AndroidDriver driver;

    public LoginPage(AndroidDriver driver) {
        this.driver = driver;
    }

    By username = By.xpath("//android.widget.EditText[@content-desc='test-Username']");
    By password = By.xpath("//android.widget.EditText[@content-desc='test-Password']");
    By loginBtn = By.xpath("//android.view.ViewGroup[@content-desc='test-LOGIN']");
    By errorMsg = By.xpath("//android.widget.TextView");

    public boolean isLoginPageDisplayed() {
        return driver.findElement(username).isDisplayed();
    }

    public void login(String user, String pass) {
        driver.findElement(username).sendKeys(user);
        driver.findElement(password).sendKeys(pass);
        driver.findElement(loginBtn).click();
    }

    public boolean isErrorDisplayed() {
        return driver.findElement(errorMsg).isDisplayed();
    }

    public String getErrorText() {
        return driver.findElement(errorMsg).getText();
    }
}