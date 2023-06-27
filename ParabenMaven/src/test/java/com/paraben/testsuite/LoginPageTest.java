package com.paraben.testsuite;

import com.paraben.pages.HomePage;
import com.paraben.pages.LoginPage;
import com.paraben.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;


public class LoginPageTest extends TestBase {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

    @Test(priority = 0)
    public void verifyUserShouldNavigateToLoginPage() {
        homePage.clickOnLoginLink();
        String actualText = loginPage.getWelcomeLogo();
        String expectedTest = "Experience the difference";
        Assert.assertEquals(actualText, expectedTest);

    }

    @Test(priority = 1)
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        loginPage.loginToApplication("ganesha@gmail.com","test12345");
        /*loginPage.enterEmailId("ganesha1@gmail.com");
        loginPage.enterPassword("test12345");
        loginPage.clickOnLoginButton();*/


    }

    @Test(priority = 4)
    public void verifyErrorMessageWithInvalidCredentials() {
        homePage.clickOnLoginLink();
        loginPage.loginToApplication("ganesha1@gmail.com","test123456");
        /*loginPage.enterEmailId("ganesha1@gmail.com");
        loginPage.enterPassword("test123456");
        loginPage.clickOnLoginButton();*/
        String actualMessage = loginPage.getErrorMessage();
        String expectedMessage = "The username and password could not be verified.";
        Assert.assertEquals(actualMessage, expectedMessage);

    }

    @Test(priority = 3)
    public void userShouldLogOutSuccessfully(){
        userShouldLoginSuccessfullyWithValidCredentials();
        loginPage.logOut();
        String actualLogOutMsg =loginPage.logOutMsg();
        String expectedLogOutMsg = "Customer Login";
        Assert.assertEquals(actualLogOutMsg,expectedLogOutMsg);
    }

}
