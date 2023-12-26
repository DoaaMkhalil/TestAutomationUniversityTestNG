package testSteps;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AlertsPage;

public class AlertTest extends BaseTest{
    @Test
    public void testAcceptAlert(){
      AlertsPage alertsPage= homePage.clickJavaScriptAlerts();
      alertsPage.triggerAlert();
      alertsPage.alert_clickAccept();
        Assert.assertEquals(alertsPage.getAlertResult()
                ,"You successfully clicked an alert",
                "alert action is incorrect");
    }
    @Test
    public void testGetAlertText(){
     var alertPage=   homePage.clickJavaScriptAlerts();
        alertPage.triggerConfirm();
        String message = alertPage.alertGetMessage();
        alertPage.alertClickDismiss();
      Assert.assertEquals(message,"I am a JS Confirm",
              "alert message is incorrect");
    }

    @Test
    public void testSentAlertText(){
        var alertPage=   homePage.clickJavaScriptAlerts();
        alertPage.triggerPrompt();
        String text ="test";
        alertPage.alertSetInput(text);
    alertPage.alert_clickAccept(); //switch to any alert appear no specific one
        Assert.assertTrue(alertPage.getAlertResult().contains(text),
                "alert message is incorrect");
    }
}
