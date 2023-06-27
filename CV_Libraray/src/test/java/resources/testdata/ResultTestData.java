package resources.testdata;

import org.testng.annotations.DataProvider;

public class ResultTestData {

    @DataProvider(name="jobdata")
    public Object[][] getData() {

        Object[][] data = new Object[][]{
                {"Tester","Harrow","5 miles","30000","50000", "Per annum", "Permanent","Permanent Tester jobs in Harrow"},
               {"Software Test Engineer","Harrow on the Hill, Greater London","5 miles","30000","50000", "Per annum", "Permanent","Permanent Software Test Engineer jobs in Harrow on the Hill"},
               {"Test Engineer","Stanmore, Greater London","5 miles","30000","50000", "Per annum", "Permanent","Permanent Test Engineer jobs in Stanmore"},
                {"Test Analyst","Borehamwood, Hertfordshire","5 miles","30000","50000", "Per annum", "Permanent","Permanent Test Analyst jobs in Borehamwood"},
               {"Qa Engineer","St Albans, Hertfordshire","5 miles","30000","50000", "Per annum", "Permanent","Permanent Qa Engineer jobs in St Albans"},
                {"Automation Tester","Watford, Hertfordshire","5 miles","30000","50000", "Per annum", "Permanent","Permanent Automation Tester jobs in Watford"},

        };
        return data;
    }
}
