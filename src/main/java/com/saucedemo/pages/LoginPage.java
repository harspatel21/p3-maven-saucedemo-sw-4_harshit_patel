package com.saucedemo.pages;
// **** Created By Harshit Patel ****


import com.saucedemo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LoginPage extends Utility {

    By userNameField = By.id("user-name");

    By passwordField = By.id("password");

    By loginButton = By.xpath("//input[@id='login-button']");

    By verifyProductText = By.xpath("//span[text()='Products']");

    By numberOfProduct = By.xpath("//div[@class='inventory_item_name']");


    public void enterUserName(String userNameText) {
        sendTextToElement(userNameField, userNameText);
    }

    public void enterPassword(String passwordText) {
        sendTextToElement(passwordField, passwordText);
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
    }

    public String getSecureAreaText() {
        return getTextFromElement(verifyProductText);
    }

    public int numberOfProductDisplayed() {
        List<WebElement> list = driver.findElements(numberOfProduct);
        System.out.println("List of total number pf product on the page  : " + list.size());
        return list.size();

    }
}
