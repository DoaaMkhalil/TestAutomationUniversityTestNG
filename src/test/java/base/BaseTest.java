package base;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
// webDriver basics
// finding WebElements
public class BaseTest {
    // driver declaration
    // webDriver is an interface ,
    // so we must initial this object with one of implemented classes
    //(ChromeDriver , Opera , FirefoxDriver)
    private WebDriver driver;
    public void setUp()
    {
        // driver initialization , which webDriver you will use (chrome ,firefox)
        driver = new ChromeDriver();
        // any interaction with browser will be done with this driver
        //- load webSite
        String url ="https://the-internet.herokuapp.com/";
        driver.get(url);
        // manage driver window
        ////////////////////////////////////
        driver.manage().window().fullscreen();
        // open mobile mode on website and get width & height
         driver.manage().window().setSize(new Dimension(400,498)); // set size parameter: Dimension object
        driver.manage().window().maximize();
        ////////////////////////////////////////////
        //1- locate element using findElement method
        // findElement return one WebElement , the first one that it finds,
        // if it does not find ,"no such element" or "unable to locate this element" error will occur and terminate code
        //WebElement: class represent the elements in web page
       WebElement inputsLink= driver.findElement(By.linkText("Inputs"));
           // By: class represent how to locate this element and has multiple method to identify (id ,linkText ,..)

        //2- locate elements using findElements method
        // findElements return list of WebElements
       List<WebElement>links= driver.findElements(By.tagName("a"));

        System.out.println(links.size());
        inputsLink.click(); // interact with the element
        // - get the title of the current web page// method deal with browser
        String pageTitle = driver.getTitle();  //The Internet
        System.out.println(pageTitle);

        // last
        driver.close(); // close window ont all the session
        driver.quit(); // close all session
    }

    public static void main(String[] args) {
        BaseTest base = new BaseTest();
        base.setUp();
    }
}
