package testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import testutils.DriverManager;

public class BaseTest {
    private final WebDriver driver;

    public BaseTest() {
        this.driver = DriverManager.getDriver();
    }

    @AfterSuite()
    public void tearDown(){
        DriverManager.quitDriver();
    }

}
