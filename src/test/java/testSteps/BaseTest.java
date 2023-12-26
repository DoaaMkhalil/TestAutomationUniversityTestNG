package testSteps;

import com.google.common.io.Files;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.WebDriverListener;
import org.testng.ITestResult;
import org.testng.annotations.*;
import pages.HomePage;
import utils.EventReporter;
import utils.WindowManager;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class BaseTest {

    private WebDriver driver;
    protected HomePage homePage;

    @BeforeTest
    public void setUp() {
        /*
        EventFiringWebDriver driver1;
        driver1 =new EventFiringWebDriver(new ChromeDriver());
        driver1.register(new EventReporter());
        // to follow any driver action : implement all methods on WebDriverEventListener interface

         */
      //  driver = new ChromeDriver(getChromeOptions());
        driver = new ChromeDriver();
        homePage = new HomePage(driver);
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        // any time you need to interact with any webElement driver should wait for max time (7 s)
        // project level : for all interaction
        // if it finds element before this , interact
        // if it does not find after max time throw "no such element" exception
        goHome();

    }
    @BeforeMethod
    public void goHome() {    // why not run???
    driver.get("https://the-internet.herokuapp.com/");
    }

    @AfterMethod
    public void takeScreenShotRecordFailure(ITestResult result) throws IOException {
       if(ITestResult.FAILURE==result.getStatus()){
           var camera = (TakesScreenshot)driver;
           File screenShot = camera.getScreenshotAs(OutputType.FILE); // save img as file
           Files.move(screenShot,new File("resources/screenShots/"+result.getTestName()+".png"));

           //ITestResult : class in testNG framework
           // getTestName() : get test case name
       }

    }

 //   i have no access to WindowManager :  لازم ابعتلها ال driver تكمل عليه
    public WindowManager getWindowManager(){
        return new WindowManager(driver);
    }

    @AfterTest
    public void turnOut() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

    private ChromeOptions getChromeOptions(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-infobars","--headless=new");
        return options;
    }

}