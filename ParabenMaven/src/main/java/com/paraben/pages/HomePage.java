package com.paraben.pages;

import com.paraben.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class HomePage extends Utility {

    By loginLink = By.cssSelector("input[type='submit']");
    By registerLink = By.linkText("Register");

    public void clickOnLoginLink() {
        Reporter.log("Click on Login Link" + loginLink.toString() + "<br>");
        clickOnElement(loginLink);
    }

    public void clickOnRegisterLink() {

        Reporter.log("Click on Register Link" + registerLink.toString() + "<br>");
        clickOnElement(By.linkText("Register"));

    }


}
