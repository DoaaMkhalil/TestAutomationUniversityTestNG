package utils;

import org.openqa.selenium.WebDriver;

import java.util.List;

public class WindowManager {
    private WebDriver driver;
    private  WebDriver.Navigation navigate ;

    public WindowManager(WebDriver driver) {
        this.driver = driver;
        navigate = driver.navigate();
    }
    public void goBack(){
       navigate.back();
    }
    public void goForward(){
        navigate.forward();
    }
    public void refreshPage(){
        navigate.refresh();
    }
    public void navigateToURL(String url){
        navigate.to(url);
    }
    public void switchToTab(String tabTitle){
      var windows= driver.getWindowHandles(); // return list of string contains page titles
        System.out.println(windows.size());
        windows.forEach(System.out::println);
        for (String window:windows){
            System.out.println("switch to tab: "+window);
            driver.switchTo().window(window);
            System.out.println("current window is "+driver.getTitle() );
            if (tabTitle.equals(driver.getTitle()))
            {  break;}
        }
    }
}
