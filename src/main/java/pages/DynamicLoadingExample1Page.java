package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicLoadingExample1Page {
  private   WebDriver driver;
    By startButton = By.xpath("//button[text()=\"Start\"]");
    By loadingShape = By.id("loading");
    By loadingText = By.cssSelector("div[id=\"finish\"] h4");
    public DynamicLoadingExample1Page(WebDriver driver) {
        this.driver = driver;
    }
    public void clickOnStartButton(){
        driver.findElement(startButton).click();
        // explicit wait: wait only this time for specific action
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loadingShape)));

        // fluent wait : more flex
        FluentWait fluentWait = new FluentWait(driver)
                .withTimeout(Duration.ofSeconds(5))
                .pollingEvery(Duration.ofSeconds(1)) // check every second
                .ignoring(NoSuchElementException.class);
    }
    public String getText(){
       return driver.findElement(loadingText).getText();
    }

}
