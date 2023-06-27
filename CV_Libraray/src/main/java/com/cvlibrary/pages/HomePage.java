package com.cvlibrary.pages;

import com.cvlibrary.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;


public class HomePage extends Utility {

By jobTitle = By.id("keywords");
By location = By.id("location");
By distanceDropDown = By.id("distance");
By moreSearchOptionsLink =By.cssSelector("div.hp-search-more>#toggle-hp-search");
By salaryMin =By.cssSelector("input#salarymin");
By salaryMax =By.cssSelector("input#salarymax");
By salaryTypeDropDown =By.cssSelector("select[id='salarytype']");
By jobTypeDropDown = By.cssSelector("select#tempperm");
By findJobsBtn = By.cssSelector("input#hp-search-btn");



public void enterJobTitle(String jobTitles){
    Reporter.log("Job Title:"+ jobTitles.toString());
    sendTextToElement(jobTitle,jobTitles);
}

public void enterLocation(String locationName){
    Reporter.log("Location"+ location.toString());
    sendTextToElement(location,locationName);
    }

public void selectDistance(String dropDownOptions){
    Reporter.log("Distance DropDown Method"+ distanceDropDown.toString());
   selectByVisibleTextFromDropDown(distanceDropDown,dropDownOptions);
}

public void clickOnMoreSearchOptionLink(){
    Reporter.log("More Search option Link Method"+ moreSearchOptionsLink.toString());
    clickOnElement(moreSearchOptionsLink);
}

public void enterMinSalary(String salaryMins){
    Reporter.log("salary min"+ salaryMins.toString());
    sendTextToElement(salaryMin,salaryMins);
}

public void enterMaxSalary(String salaryMaxs){
    Reporter.log("salary Max"+ salaryMaxs.toString());
    sendTextToElement(salaryMax,salaryMaxs);
}

public void selectSalaryType(String option) {

    Reporter.log("salary type dropdown method"+option.toString());
    selectByVisibleTextFromDropDown(salaryTypeDropDown,option);
}

public void selectJobType(String jobType){
    Reporter.log("Select Job Type"+ jobType.toString());
    selectByVisibleTextFromDropDown(jobTypeDropDown,jobType);
}

public void clickOnFindJobsButton(){
    clickOnElement(findJobsBtn);
}

    public void iframeHandle() throws InterruptedException {
        driver.switchTo().frame("gdpr-consent-notice");
        driver.findElement(By.xpath("//button[@id='save']")).click();
        driver.switchTo().defaultContent();
    }


}
