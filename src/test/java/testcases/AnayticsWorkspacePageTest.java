package testcases;

import org.testng.annotations.Test;
import testpages.AnayticsWorkspacePage;


public class AnayticsWorkspacePageTest {

AnayticsWorkspacePage anayticsWorkspacePage = new AnayticsWorkspacePage();

@Test
    public void clickOnDevelopement() throws InterruptedException {
    anayticsWorkspacePage.switchToAnalyticsWorkSpaceIframe();
    anayticsWorkspacePage.clickOnDevelopement();
}
@Test(dependsOnMethods = {"clickOnDevelopement"})
    public void clickOnTestAssignment() {
    anayticsWorkspacePage.clickOnTestAssigment();
}
}