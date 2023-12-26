package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsPage {
  private   WebDriver driver;
  private By triggerAlertButton =By.xpath("//button[text()=\"Click for JS Alert\"]");
    private By triggerConfirmButton =By.xpath("//button[text()=\"Click for JS Confirm\"]");
    private By triggerPromptButton =By.xpath("//button[text()=\" Click for JS Prompt\"]");


 private By alertResult = By.id("result");
    public AlertsPage(WebDriver driver) {
        this.driver = driver;
    }
    public void triggerAlert(){
        driver.findElement(triggerAlertButton).click();
    }

    public void alert_clickAccept(){
        // alert is not an element on dom page it is java script method executes it
        // so i can not access with driver.findElement
        driver.switchTo().alert().accept();
    }
    public String getAlertResult(){
        return driver.findElement(alertResult).getText();
    }
    public void triggerConfirm(){
        driver.findElement(triggerConfirmButton).click();
    }
    public void alertClickDismiss(){
        driver.switchTo().alert().dismiss();
    }
    public String alertGetMessage(){
        return driver.switchTo().alert().getText();
    }

    public void triggerPrompt(){
        driver.findElement(triggerPromptButton).click();
    }
    public void alertSetInput(String text){
        driver.switchTo().alert().sendKeys(text);
    }
}
