package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import testpages.ContentAssementPage;

public class ContentAssementProgressBarTest {

    ContentAssementPage contentAssementPage = new ContentAssementPage();

    @Test(priority = 0)
    public void verifyRichTextScrollingUpdatesProgressBar(){
        contentAssementPage.richTextScrollToComplete();
        Assert.assertEquals(contentAssementPage.progressBarCheck("33"),"33% complete");
    }
    @Test(priority = 1)
    public void verifyEnablingURLRadioButtonUpdatesProgressBar(){
        contentAssementPage.enableUrlRadioButton();
        Assert.assertEquals(contentAssementPage.progressBarCheck("66"),"66% complete");
        contentAssementPage.clickNext();
    }
}
