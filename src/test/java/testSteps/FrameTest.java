package testSteps;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.WYSIWYGEditorPage;

public class FrameTest extends BaseTest{
    @Test
    public void testTypeInFrameTextArea(){
        WYSIWYGEditorPage wysiwygEditorPage =homePage.clickWYSIWYGEditorLink();
        wysiwygEditorPage.clearTextArea();

        String text1 ="Hello ";
        String text2 ="world ";
        wysiwygEditorPage.setTextArea(text1);
        wysiwygEditorPage.clickButton();
        wysiwygEditorPage.setTextArea(text2);
        Assert.assertEquals(wysiwygEditorPage.getTextArea(),text1+text2
        ,"text from text area is incorrect");
    }
    /////// nested frames
    @Test
    public void testLeftAndButtonFrames(){
        var nestedFrames=  homePage.clickNestedFrameLink();

        Assert.assertEquals(nestedFrames.getLeftFrameText(),"LEFT",
                "LEFT frame name is incorrect");
        Assert.assertEquals(nestedFrames.getButtonFrameText(),"BOTTOM",
                "BOTTOM frame name is incorrect");
    }
}
