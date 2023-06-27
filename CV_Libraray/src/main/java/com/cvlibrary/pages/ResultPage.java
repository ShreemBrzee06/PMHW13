package com.cvlibrary.pages;
import java.lang.String;
import com.cvlibrary.utility.Utility;
import java.lang.String;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;

import java.util.List;

public class ResultPage extends Utility {
By result= By.cssSelector("h1.search-header__title");

public void resultText(String expected){
    Reporter.log("Result Text"+result.toString());

    java.lang.String actualMsg = driver.findElement(result).getText();
       Assert.assertEquals(actualMsg,expected);

 }


}
