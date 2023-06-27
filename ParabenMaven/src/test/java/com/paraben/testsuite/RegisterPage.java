package com.paraben.testsuite;

import com.paraben.pages.HomePage;
import com.paraben.pages.RegisterPge;
import com.paraben.testbase.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterPage extends TestBase {
    RegisterPge registerPge = new RegisterPge();
    HomePage homePage= new HomePage();
    @Test
    public void verifyThatSigningUpPageDisplay(){
        //* click on the ‘Register’ link
        driver.findElement(By.linkText("Register")).click();
        //* Verify the text ‘Signing up is easy!’
       String actualRegisterMsg = registerPge.getRegisterPage();
       String expectedRegisterMsg ="Signing up is easy!";
       Assert.assertEquals(actualRegisterMsg,expectedRegisterMsg);

    }

    @Test
    public void userShouldRegisterAccountSuccessfully(){
        //* click on the ‘Register’ link
        homePage.clickOnRegisterLink();

        //* Enter First name//* Enter Last name
        registerPge.personalInfo("Ganesha", "Shiv");

        //* Enter Address//* Enter City//* Enter State//* Enter Zip Code//* Enter Phone//* Enter SSN
        registerPge.address("Test Street","Test City","Test State","PE124 256","1234562426","1524714311");

        //* Enter Username //* Enter Password //* Enter Confirm
        registerPge.resisterInfo("ganesha1@gmail.com","test12345","test12345");

        //* Click on REGISTER button
        registerPge.registerButton();

        //* Verify the text "Your account was created successfully. You are now logged in."
        String actualWelcomeTxtMsg = registerPge.registerSuccessfulTxtMsg();
        System.out.println(actualWelcomeTxtMsg);
        String expectedMsg ="Verifying Register Message";
        Assert.assertEquals("Verifying Register Message", expectedMsg,actualWelcomeTxtMsg);


    }


}
