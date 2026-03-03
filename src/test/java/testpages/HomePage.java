package testpages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import testutils.DriverManager;
import webelements.commonelements;
import webelements.homepage;

import java.time.Duration;

public class HomePage {
    private final WebDriver driver;

    public HomePage() {
        this.driver = DriverManager.getDriver();
    }
    public void clickOnMenu(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(
                By.cssSelector(commonelements.LOADER.getLocator())
        ));
       WebElement menuButton =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath(homepage.MENUBUTTONLOCATOR.getLocator())));
        menuButton.click();
    }
    public void clickOnAnalytics(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement analyticsButtonLocator = wait.until(
                ExpectedConditions.elementToBeClickable(By.xpath(homepage.ANALYTICSBUTTONLOCATOR.getLocator()))
        );
        analyticsButtonLocator.click();
    }
    public void clickOnAnalyticsWorkspace(){
        WebElement element = driver.findElement(By.xpath(homepage.ANALYTICSWORKSPACEBUTTONLOCATOR.getLocator()));
        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].click();", element);
    }

}
