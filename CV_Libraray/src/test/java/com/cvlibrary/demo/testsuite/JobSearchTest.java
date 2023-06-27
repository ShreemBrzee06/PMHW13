package com.cvlibrary.demo.testsuite;

import com.cvlibrary.demo.testbase.TestBase;
import com.cvlibrary.pages.HomePage;
import com.cvlibrary.pages.ResultPage;
import org.testng.annotations.Test;
import resources.testdata.ResultTestData;
import resources.testdata.TestData;

public class JobSearchTest extends TestBase {

    HomePage homePage = new HomePage();
    ResultPage resultPage = new ResultPage();


    @Test (dataProvider = "jobdata", dataProviderClass = ResultTestData.class)
    public void verifyJobSearchResultUsingDifferentDataSet(String jobTitle, String location, String distance, String salaryMin, String salaryMax, String salaryType, String jobType, String result) throws InterruptedException {
        homePage.iframeHandle();
        homePage.enterJobTitle(jobTitle);
        homePage.enterLocation(location);
        homePage.selectDistance(distance);
        homePage.clickOnMoreSearchOptionLink();
        homePage.enterMinSalary(salaryMin);
        homePage.enterMaxSalary(salaryMax);
        homePage.selectSalaryType(salaryType);
        homePage.selectJobType(jobType);
        homePage.clickOnFindJobsButton();
        resultPage.resultText(result);
    }
}
   /* @Test (priority = 0)
    public void firstDataSet() throws InterruptedException {
        verifyJobSearchResultUsingDifferentDataSet("Tester","Harrow, Greater London","5 miles","30000","50000","annum","Permanent","Permanent Tester jobs in Harrow");
            }

    @Test(priority = 1)
    public void secondDataSet() throws InterruptedException {
        verifyJobSearchResultUsingDifferentDataSet("Tester","Borehamwood, Hertfordshire","5 miles","30000","50000","annum","Permanent","Permanent Tester jobs in Borehamwood");
    }
    @Test(priority = 2)
    public void thirdDataSet() throws InterruptedException {
        verifyJobSearchResultUsingDifferentDataSet("Tester","Edgware, Greater London","5 miles","30000","50000","annum","Permanent","Permanent Tester jobs in Edgware");
    }
    @Test(priority = 3)
    public void fourthDataSet() throws InterruptedException {
        verifyJobSearchResultUsingDifferentDataSet("Tester","Stanmore, Greater London","5 miles","40000","50000","annum","Permanent","Permanent Tester jobs in Stanmore");
    }
    @Test(priority = 4)
    public void fifthDataSet() throws InterruptedException {
        verifyJobSearchResultUsingDifferentDataSet("Tester","Watford, Hertfordshire","5 miles","40000","50000","annum","Permanent","Permanent Tester jobs in Watford");
    }
    @Test(priority = 5)
    public void sixthDataSet() throws InterruptedException {
        verifyJobSearchResultUsingDifferentDataSet("Tester","Harrow on the Hill, Greater London","5 miles","30000","50000","annum","Permanent","Permanent Tester jobs in Harrow on the Hill");
            }
}*/
