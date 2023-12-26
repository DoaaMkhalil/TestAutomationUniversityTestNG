package testSteps;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HoversPage;

public class HoverTests extends BaseTest{
    @Test
    public void testHoverUser1(){
     HoversPage hoversPage= homePage.clickHoversLink();
      HoversPage.FigureCaption figureCaption= hoversPage.hoverOverFigure(1);
        Assert.assertTrue(figureCaption.isDisplayedCaption(),"caption is not displayed");
        Assert.assertEquals(figureCaption.getHeaderText(),"name: user1",
                "figure caption is incorrect");
        Assert.assertEquals(figureCaption.getLinkText(),"View profile"
        ,"link text is incorrect");
        Assert.assertTrue(figureCaption.getLink().endsWith("/users/1"),
        "link is incorrect");

    }
}
