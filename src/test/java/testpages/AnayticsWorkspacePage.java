package testpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import testutils.DriverManager;
import webelements.AnalyticsWorkspace;
import webelements.CommonElements;

import java.time.Duration;

public class AnayticsWorkspacePage {

    private final WebDriver driver;

    public AnayticsWorkspacePage() {
        this.driver = DriverManager.getDriver();
    }

    public void switchToAnalyticsWorkSpaceIframe(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath(AnalyticsWorkspace.ANALYTICSWORSPACEIFRAME.getLocator())));
    }
    public void clickOnDevelopement() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement developementButton =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath(AnalyticsWorkspace.DEVELOPEMENTBUTTONLOCATOR.getLocator())));
        developementButton.click();
    }
    public void clickOnTestAssigment(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(
                By.cssSelector(CommonElements.LOADER.getLocator())
        ));
        WebElement testAssignmentLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(AnalyticsWorkspace.TESTASSIGNMENTLINK.getLocator())));
        testAssignmentLink.click();
    }

}
