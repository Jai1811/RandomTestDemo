package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import testpages.AssementPage;


public class AssessmentPageProgressBarTest {
    AssementPage assementPage = new AssementPage();

    @Test(priority = 0)
    public void testAnswersToQuestionOfGroup1() {
        assementPage.switchToAssementBuilderIframe();
        assementPage.selectAnswerForRainbowQuestion();
        assementPage.answerWhoIsWHO("World Health Organization");
        assementPage.selectAnswerForVideoGames();
        assementPage.switchBackToParentFrame();
       Assert.assertEquals(assementPage.progressBarCheck("91"),"91% complete");
    }
    @Test(priority = 1)
    public void testClearAnswerForQuestion1OfGroup1(){
        assementPage.switchToAssementBuilderIframe();
        assementPage.clearAnswer();
        assementPage.switchBackToParentFrame();
        Assert.assertEquals(assementPage.progressBarCheck("83"),"83% complete");
    }
    @Test(priority = 2)
    public void testClearAllAnswersforQuestionsOfGroup1(){
        assementPage.switchToAssementBuilderIframe();
        assementPage.clearAnswers();
        assementPage.switchBackToParentFrame();
        Assert.assertEquals(assementPage.progressBarCheck("66"),"66% complete");
    }

    @Test(priority = 3)
    public void testAnswersToQuestionOfGroup1AndGroup2() {
        assementPage.switchToAssementBuilderIframe();
        assementPage.selectAnswerForRainbowQuestion();
        assementPage.answerWhoIsWHO("World Health Organization");
        assementPage.selectAnswerForVideoGames();
        assementPage.switchBackToParentFrame();
        assementPage.selectGroup2();
        assementPage.switchToAssementBuilderIframe();
        assementPage.selectCorrectAnswerForSunRiseQuestion();
        assementPage.switchBackToParentFrame();
        Assert.assertEquals(assementPage.progressBarCheck("100"),"100% complete");
    }
}
