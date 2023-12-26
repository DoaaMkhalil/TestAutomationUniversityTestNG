package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Task {

    public static void main(String[] args) {
        WebDriver driver =new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
       WebElement shiftingLink= driver.findElement(By.linkText("Shifting Content"));
       shiftingLink.click();
       driver.findElement(By.linkText("Example 1: Menu Element")).click();
      List<WebElement>elements= driver.findElements(By.cssSelector("ul li a"));
        System.out.println("number of menu items is "+elements.size());
    }
}
