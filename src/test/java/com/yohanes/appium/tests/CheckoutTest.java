package com.yohanes.appium.tests;

import com.yohanes.appium.pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckoutTest extends BaseTest {

    @Test
    public void CheckoutTestFullFlow() {
        LoginPage login = new LoginPage(driver);
        login.login("standard_user", "secret_sauce");

        ProductsPage product = new ProductsPage(driver);
        product.addFirstProduct();
        product.goToCart();

        CartPage cart = new CartPage(driver);
        cart.clickCheckout();

        CheckoutPage checkout = new CheckoutPage(driver);
        checkout.fillForm("John", "Doe", "12345");
        checkout.finish();

        Assert.assertTrue(checkout.isSuccess());
    }
}