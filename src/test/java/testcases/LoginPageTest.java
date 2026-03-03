package testcases;

import org.testng.annotations.Test;
import testpages.LoginPage;
import testutils.Properties;

public class LoginPageTest {

    LoginPage loginPage = new LoginPage();

    @Test
    public void LoginToApplication(){
    loginPage.navigateToLoginPage(Properties.getProperties("URL"));
    loginPage.enterUserName(Properties.getProperties("Username"));
    loginPage.enterPassWord(Properties.getProperties("Password"));
    loginPage.clickLogin();
    }


}
