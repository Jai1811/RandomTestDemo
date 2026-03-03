package testpages;


import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import testutils.DriverManager;
import webelements.assessmentpage;


import java.time.Duration;
import java.util.List;


public class AssementPage extends ContentAssementPage {

   final WebDriver  driver;

    public AssementPage() {
       this.driver = DriverManager.getDriver();
    }
    public void switchToAssementBuilderIframe(){
        driver.switchTo().frame(driver.findElement(By.xpath(assessmentpage.ASSESSMENTBUILDERIFRAME.getLocator())));
    }
    public void selectAnswerForRainbowQuestion() {
       WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
       WebElement answerForRainbowQuestion = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(assessmentpage.RAINBOWQUESTIONCORRECTANSWER.getLocator())));
        answerForRainbowQuestion.click();
    }
    public void selectAnswerForVideoGames() {
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        WebElement answerForVideoGameQuestion = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(assessmentpage.VIDEOGAMEANSWER.getLocator())));
        answerForVideoGameQuestion.click();
    }

    public void answerWhoIsWHO(String Answer){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        WebElement answerForVideoGameQuestion = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(assessmentpage.WHOTEXTANSWER.getLocator())));
        answerForVideoGameQuestion.sendKeys(Answer);
    }
    public void switchBackToParentFrame(){
        driver.switchTo().parentFrame();
    }
    public void clearAnswer(){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        WebElement clearAnswer = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(assessmentpage.CLEARRAINBOWQUESTIONANSWER.getLocator())));
        clearAnswer.click();
    }
    public void clearAnswers()  {
      List<WebElement> clearAnswers =  driver.findElements(By.xpath(assessmentpage.CLEARANSWERS.getLocator()));
      for(WebElement element: clearAnswers){
          element.click();
      }
    }
    public void selectGroup2() {
        driver.findElement(By.xpath(assessmentpage.GROUP2TAB.getLocator())).click();
    }
    public void selectCorrectAnswerForSunRiseQuestion(){
        driver.findElement(By.xpath(assessmentpage.SUNRISEQUESTIONCORRECTANSWER.getLocator())).click();
    }
}
