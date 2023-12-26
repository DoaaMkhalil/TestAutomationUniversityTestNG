package testSteps;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;

public class LoginTest extends BaseTest{
    // in test layer we will add test steps for our scenarios
@Test
    public  void testSuccessfulLogin()  {
     LoginPage loginPage= homePage.clickFormAuthentication();
     loginPage.setUsernameField("tomsmith");
     loginPage.setPasswordField("SuperSecretPassword!");
     SecureAreaPage secureAreaPage=loginPage.clickLogin();
    String alertText = secureAreaPage.getAlertText();
     // selenium no verification tool , it only used to automate actions
        // so if we need to verify , we will use test framework
       Assert.assertTrue(alertText.contains("secure area"),
               "alert message is incorrect");
    }
}
