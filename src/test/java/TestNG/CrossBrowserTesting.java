package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTesting {
WebDriver driver;
@Test
@Parameters({"URL","Browser Type"})
public void verifyWebsite(String URL ,String browserType)
    {
      if (browserType.equalsIgnoreCase("firefox"))
      { driver =new FirefoxDriver();}
      else if (browserType.equalsIgnoreCase("chrome"))
      {driver = new ChromeDriver();}
      driver.get(URL);

    }
}
