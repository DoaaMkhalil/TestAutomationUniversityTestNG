package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class InfiniteScrollPage {
   private WebDriver driver;
   // in this web page items are dynamically added in dom page when we scroll
    By textBlock = By.className("jscroll-added");
    public InfiniteScrollPage(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * scroll until paragraph with specific index is in view
     * @param index  1 based
     */
    public void scrollIntoParagraph(int index){
        String script ="window.scrollTo(0,document.body.scrollHeight)";
        // scroll 0 at x axis & normal scroll at y axis : 1 time
       var jsExecute = (JavascriptExecutor)driver;
        while (countParagraph()<index){
            jsExecute.executeScript(script);
        }
    }
    private int countParagraph(){
        int count = driver.findElements(textBlock).size();
        return count;
    }
}
