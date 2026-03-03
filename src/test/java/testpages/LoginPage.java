package testpages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import testutils.DriverManager;
import webelements.loginpage;

import java.time.Duration;

public class LoginPage  {
    private final WebDriver driver;


    public LoginPage() {
        this.driver = DriverManager.getDriver();
    }

    public void navigateToLoginPage(String appUrl){
        driver.get(appUrl);
    }
    public void enterUserName(String userName) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement username = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath(loginpage.USERNAMELOCATOR.getLocator())
        ));
        username.sendKeys(userName);
    }
    public void enterPassWord(String passWord) {
        driver.findElement(By.xpath(loginpage.PASSWORDLOCATOR.getLocator())).sendKeys(passWord);
    }
    public void clickLogin(){
        driver.findElement(By.xpath(loginpage.LOGINBUTTON.getLocator())).click();
    }

}
