package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class KeyPressesPage {

    private WebDriver driver;
private By inputField = By.id("target");
    private By resultLabel = By.id("result");
    public KeyPressesPage(WebDriver driver) {
        this.driver = driver;
    }
    public void enterPI(){
        driver.findElement(inputField).sendKeys(Keys.chord(Keys.ALT,"P")
        + " = 3.14");
        //chord(): allows to send multiple keys in the same time
    }
    public void enterText(String text){
        driver.findElement(inputField).sendKeys(text);
    }
    public String getResult(){
        return driver.findElement(resultLabel).getText();
    }
}
