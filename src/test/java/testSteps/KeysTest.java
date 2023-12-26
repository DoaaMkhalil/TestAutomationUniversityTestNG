package testSteps;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class KeysTest extends BaseTest{
    @Test
    public void testBackSpace(){
       var keyPresses= homePage.clickKeyPresses();
       keyPresses.enterText("text "+ Keys.BACK_SPACE);
     Assert.assertEquals(keyPresses.getResult(),"You entered: BACK_SPACE"); ;
    }
    @Test
    public void testPi(){
        var keyPresses= homePage.clickKeyPresses();
        keyPresses.enterPI();
    }
}
