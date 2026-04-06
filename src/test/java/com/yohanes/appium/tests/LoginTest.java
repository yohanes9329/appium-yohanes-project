package com.yohanes.appium.tests;

import com.yohanes.appium.pages.LoginPage;
import com.yohanes.appium.pages.ProductsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void ValidLoginTest() {
        LoginPage login = new LoginPage(driver);
        login.login("standard_user", "secret_sauce");

        ProductsPage products = new ProductsPage(driver);
        Assert.assertTrue(products.isDisplayed());
    }

    @Test
    public void InvalidLoginTest() {
        LoginPage login = new LoginPage(driver);
        login.login("invalid_user", "wrong_password");

        Assert.assertTrue(login.isErrorDisplayed());
    }
}