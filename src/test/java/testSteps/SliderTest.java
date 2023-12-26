package testSteps;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SliderTest extends BaseTest{
    @Test
    public void testHorizontalSlider(){
         var slider=  homePage.clickHorizontalSlider();
         slider.setSlider("4");
        Assert.assertEquals(slider.getSliderValue(),"4"); ;
    }
}
