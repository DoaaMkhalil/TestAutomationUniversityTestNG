package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WYSIWYGEditorPage {

    // how to interact with frames.
    // frames is HTML document inside HTML document
    // tag name = iframe
    // html page after iframe tag in dom page
    private WebDriver driver;
    By textArea = By.id("tinymce");  //inside frame
    By decreaseTextButton = By.cssSelector("button[aria-label=\"Increase indent\"]");

    public WYSIWYGEditorPage(WebDriver driver) {
        this.driver = driver;
    }
    // private: because it is our problem to solve not test steps
    private void switchToEditArea(){
        /// switch to embedded dom
        driver.switchTo().frame("mce_0_ifr");
    }
    public void clearTextArea(){
        switchToEditArea();
        driver.findElement(textArea).clear();
        switchToMainArea();
    }
    public void setTextArea(String text){
        switchToEditArea();
        driver.findElement(textArea).sendKeys(text);
        switchToMainArea();
    }
    public String getTextArea( ){
        switchToEditArea();
        String text =driver.findElement(textArea).getText();
        switchToMainArea();
        return text;
    }
    private void switchToMainArea(){
        /// switch to main dom
        driver.switchTo().parentFrame(); // switch context
    }
    public void clickButton(){
        driver.findElement(decreaseTextButton).click();
    }
}
