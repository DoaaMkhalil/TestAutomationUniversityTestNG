package testSteps;

import org.testng.Assert;
import org.testng.annotations.Test;

public class WaitTests extends BaseTest{
    @Test
    public void testWaitUntilHidden(){
       var examples =homePage.clickDynamicLoadingLink();
     var loadingPage=   examples.clickExample1Link();
     loadingPage.clickOnStartButton();
     Assert.assertEquals(loadingPage.getText(),"Hello World!"
     ,"message is incorrect");
    }
}
