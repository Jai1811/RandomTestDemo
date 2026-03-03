package testpages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import testutils.DriverManager;
import webelements.ContentAssement;

import java.time.Duration;


public class ContentAssementPage  {
    private final WebDriver driver;
    public ContentAssementPage() {
        this.driver = DriverManager.getDriver();
    }

    public void richTextScrollToComplete() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement scrollableElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(ContentAssement.RICHTEXTSCROLLABLEELEMENT.getLocator())));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight;",scrollableElement);
    }
    public  String  progressBarCheck(String percentage) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.attributeToBe(
                By.xpath(ContentAssement.FILLPERCENTAGE.getLocator()),
                "fill-percent",
                percentage
        ));
        return driver.findElement(By.xpath(ContentAssement.PROGRESSBARINFO.getLocator())).getText();
    }
    public void enableUrlRadioButton() {
        driver.findElement(By.xpath(ContentAssement.ENABLEURLRADIOBUTTON.getLocator())).click();
    }
    public void clickNext() {
        driver.findElement(By.xpath(ContentAssement.NEXTBUTTON.getLocator())).click();
    }
}
