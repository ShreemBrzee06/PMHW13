package com.paraben.pages;

import com.paraben.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

/**
 * Created by Bhavesh
 */
public class LoginPage extends Utility {

    By welcomeLogo = By.cssSelector(".caption");
    By emailfield = By.cssSelector("input[name='username']");
    By passwordField = By.cssSelector("input[name='password']");
    By loginButton = By.xpath("//input[@class='button']");
    By errorMag = By.xpath("//p[@class='error']");

    By logOutLink = By.linkText("Log Out");

    By verifyLogoutMsg = By.xpath("//div[@id='leftPanel']//h2");


    public String getWelcomeLogo() {

        Reporter.log("get welcome text" +welcomeLogo.toString());return getTextFromElement(welcomeLogo);
    }

    public void enterEmailId(String email) {
        Reporter.log("Enter email ID" +email.toString());
        sendTextToElement(emailfield, email);
    }

    public void enterPassword(String password) {
        Reporter.log("Enter Password :" +password.toString());
        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
    }

    public String getErrorMessage() {
        Reporter.log("Error message:"+errorMag.toString());
          return getTextFromElement(errorMag);
    }


    public void loginToApplication(String username, String password) {
        enterEmailId(username);
        enterPassword(password);
        clickOnLoginButton();

    }

    public void logOut(){
        clickOnElement(logOutLink);
    }

    public String logOutMsg(){
        Reporter.log("Verify the Logout Messsage"+verifyLogoutMsg.toString());
        return getTextFromElement(verifyLogoutMsg);
    }


}
