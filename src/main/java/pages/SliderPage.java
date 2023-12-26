package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class SliderPage {
    private WebDriver driver;
   private By slider = By.cssSelector("input[type=\"range\"]");
   private By sliderValue = By.id("range");
    public SliderPage(WebDriver driver) {
        this.driver = driver;
    }
    public void setSlider(String value){
        while (!getSliderValue().equals(value)){
        driver.findElement(slider).sendKeys(Keys.ARROW_RIGHT);}
    }
    public String getSliderValue(){
      return   driver.findElement(sliderValue).getText();
    }

}