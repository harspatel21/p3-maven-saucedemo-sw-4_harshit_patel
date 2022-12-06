package com.saucedemo.testsuite;
// **** Created By Harshit Patel ****

import com.saucedemo.pages.LoginPage;
import com.saucedemo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {

    LoginPage loginPage = new LoginPage();

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {

        loginPage.enterUserName("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickOnLoginButton();
        String expectedMessage = "PRODUCTS";
        Assert.assertEquals(loginPage.getSecureAreaText(), expectedMessage, "User Not Logged In");
    }

    @Test
    public void verifyThatSixProductsAreDisplayedOnPage() {
        loginPage.enterUserName("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickOnLoginButton();

        int expectedNumberOfProducts = 6;
        Assert.assertEquals(loginPage.numberOfProductDisplayed(), expectedNumberOfProducts, "Number of Products not Matching");

    }
}

