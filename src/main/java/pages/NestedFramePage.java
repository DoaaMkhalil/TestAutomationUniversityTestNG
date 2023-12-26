package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NestedFramePage {
    private WebDriver driver;
 private By frame = By.tagName("body");
    public NestedFramePage(WebDriver driver) {
        this.driver = driver;
    }

    private void switchToFrames(String frameName){
        driver.switchTo().frame(frameName);
    }
    private void switchToMainFrame(){
        driver.switchTo().parentFrame();
    }
    public String getLeftFrameText(){
        switchToFrames("frame-top");
        switchToFrames("frame-left");
        String text= driver.findElement(frame).getText();
        switchToMainFrame();
        switchToMainFrame();
        return text;
    }
    public String getButtonFrameText(){
        switchToFrames("frame-bottom");
        String text= driver.findElement(frame).getText();
        switchToMainFrame();
        return text;
    }



}
