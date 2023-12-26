package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class HoversPage {
    private WebDriver driver;
private By figureBox = By.className("figure");
    private By captionBox = By.className("figcaption");
    public HoversPage(WebDriver driver) {
        this.driver = driver;
    }
    // webElement class does not have method to hover on element (and other action)
    // action class contains some advanced method to deal with webElement

    /**
     *
     * @param index stars with 1
     */
    public FigureCaption hoverOverFigure(int index){
        List<WebElement> figureList = driver.findElements(figureBox);
        WebElement figure =figureList.get(index-1);
        Actions actions =new Actions(driver);
        actions.moveToElement(figure).perform();
   ///////////////// we need every method do specific action so i create internal class
        /// because it is in the same web page
        return new FigureCaption(figure.findElement(captionBox));
//figure.findElement(captionBox): find children of this parent webElement(figure)
    }
public class FigureCaption{

        private WebElement caption;
       private By header = By.tagName("h5");
    private By link = By.tagName("a");
    public FigureCaption(WebElement caption) {
        this.caption = caption;
    }
    public boolean isDisplayedCaption(){
        return caption.isDisplayed();  // parent class contains caption & link
    }
    public String getHeaderText(){
        return caption.findElement(header).getText();
    }
    public String getLink(){
        return caption.findElement(link).getAttribute("href");
    }
    public String getLinkText(){
        return caption.findElement(link).getText();
    }
}
}
