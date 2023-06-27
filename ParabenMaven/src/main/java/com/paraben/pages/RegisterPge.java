package com.paraben.pages;

import com.paraben.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class RegisterPge extends Utility {

    By RegisterPage = By.cssSelector("h1.title");
    By FirstName = By.id("customer.firstName");
    By LastName = By.id("customer.lastName");
    By Address = By.id("customer.address.street");
    By City =By.id("customer.address.city");
    By State= By.id("customer.address.state");
    By ZipCode = By.id("customer.address.zipCode");
    By Phone = By.id("customer.phoneNumber");
    By SSN= By.id("customer.ssn");

    By UserName = By.id("customer.username");
    By Password = By.id("customer.password");
    By confirmPW = By.id("repeatedPassword");
    By RegisterButton = By.cssSelector("input[value='Register']");

   By registerSuccessfulTxtMsg =By.xpath("//p[@class='smallText']");


    public String getRegisterPage(){
        Reporter.log("get Register Page Msg"+ RegisterPage.toString());
        return getTextFromElement(RegisterPage);
    }

    public void enterFirstName(String firstname){
    Reporter.log("Enter First Name"+FirstName.toString());
    sendTextToElement(FirstName,firstname);
    }
    public void enterLastName(String lastname){
        Reporter.log("Enter Last Name"+LastName.toString());
        sendTextToElement(LastName,lastname);
    }

    public void enterAddressStreet(String streetName){
        Reporter.log("Enter Address Street Name"+streetName.toString());
        sendTextToElement(Address,streetName);
    }

    public void enterCity(String CityName){
        Reporter.log("Enter City Name: " +CityName.toString());
        sendTextToElement(City,CityName);
    }

    public void enterState(String StateName){
        Reporter.log("Enter State Name: " +StateName.toString());
        sendTextToElement(State,StateName);
    }

    public void enterZipCode(String zipCode){
        Reporter.log("Enter Zip Code: " +ZipCode.toString());
        sendTextToElement(ZipCode,zipCode);
    }


    public void enterPhone(String phoneNumber){
        Reporter.log("Enter Phone Number: " +phoneNumber.toString());
        sendTextToElement(Phone,phoneNumber);
    }

    public void enterSsn(String ssn){
        Reporter.log("Enter SSN no: " +ssn.toString());
        sendTextToElement(SSN,ssn);
    }

    public void enterUserName(String userName){
        Reporter.log("Enter User Name"+userName.toString());
        sendTextToElement(UserName,userName);
    }

    public void enterPassword(String password){
        Reporter.log("Enter Password: " +password.toString());
        sendTextToElement(Password,password);
    }
    public void enterConfirmPassword(String confirmPassword){
        Reporter.log("Enter Password: " +confirmPassword.toString());
        sendTextToElement(confirmPW,confirmPassword);
    }


    public void personalInfo(String firstName, String lastname){
        enterFirstName(firstName);
        enterLastName(lastname);
    }

    public void address(String addressStreet, String city, String state, String zipCode,String phone, String ssn){
        enterAddressStreet(addressStreet);
        enterCity(city);
        enterState(state);
        enterZipCode(zipCode);
        enterPhone(phone);
        enterSsn(ssn);

    }

    public void resisterInfo(String userName, String password, String confirmPw){
        enterUserName(userName);
        enterPassword(password);
        enterConfirmPassword(confirmPw);
    }

    public void registerButton (){
        clickOnElement(RegisterButton);
    }

    public String registerSuccessfulTxtMsg(){
        Reporter.log("Successful registration page"+registerSuccessfulTxtMsg.toString());
        return getTextFromElement(registerSuccessfulTxtMsg);
    }

}

