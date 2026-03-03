package testcases;

import org.testng.annotations.Test;
import testpages.HomePage;

public class HomePageTest {

    HomePage homePage = new HomePage();
    @Test
    public void navigationToAnaticsWorkSpacePage(){

        homePage.clickOnMenu();
        homePage.clickOnAnalytics();
        homePage.clickOnAnalyticsWorkspace();


    }

}
