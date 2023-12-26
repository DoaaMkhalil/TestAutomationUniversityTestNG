package navigation;

import org.testng.annotations.Test;
import testSteps.BaseTest;
import utils.WindowManager;

public class NavigationTest extends BaseTest {
    @Test
    public void testNavigator(){
        homePage.clickDynamicLoadingLink().clickExample1Link();
        getWindowManager().goBack();
        getWindowManager().refreshPage();
        getWindowManager().goForward();
        getWindowManager().navigateToURL("https://www.google.com/");
    }

    @Test
    public void testSwitchTab(){
        homePage.clickMultipleWindowsLink().clickHere();
        getWindowManager().switchToTab("New Window");
    }
}
