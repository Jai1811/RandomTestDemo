package testpages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import testutils.DriverManager;
import webelements.commonelements;

import java.time.Duration;

public class TestAssignmentPage {
    private final WebDriver driver;

    public TestAssignmentPage() {
        this.driver = DriverManager.getDriver();
    }

    public void switchToTestAssigmentTab(){
        String parentWindow = driver.getWindowHandle();
        for (String w : driver.getWindowHandles()) {
            if (!w.equals(parentWindow)) {
                driver.switchTo().window(w);
            }
        }
    }
    public void clickOnContinueModuleButton()
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(
                By.cssSelector(commonelements.LOADER.getLocator())
        ));

        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".module-start-button.cover-art")));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement button = (WebElement) js.executeScript(
                "return document.querySelector('.module-start-button.cover-art')" +
                        ".shadowRoot.querySelector('.gux-primary')"
        );
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", button);
    }
}
