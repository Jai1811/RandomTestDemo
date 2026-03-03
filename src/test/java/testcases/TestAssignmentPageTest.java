package testcases;

import org.testng.annotations.Test;
import testpages.TestAssignmentPage;

public class TestAssignmentPageTest {

    TestAssignmentPage testAssignmentPage = new TestAssignmentPage();

    @Test
    public void switchToTestAssigmentTabAndClickContinueModule(){

        testAssignmentPage.switchToTestAssigmentTab();
        testAssignmentPage.clickOnContinueModuleButton();
    }

}