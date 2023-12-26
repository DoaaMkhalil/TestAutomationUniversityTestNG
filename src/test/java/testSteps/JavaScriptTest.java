package testSteps;

import org.testng.annotations.Test;

public class JavaScriptTest extends  BaseTest{
    @Test
    public void testScrollTable(){
      var largeDeepPage=  homePage.clickLargeDeepDOMLink();
              largeDeepPage.scrollToTable();
    }
    @Test
    public void testScrollToFifthP(){
        homePage.clickInfiniteScrollLink().scrollIntoParagraph(5);

    }
}
