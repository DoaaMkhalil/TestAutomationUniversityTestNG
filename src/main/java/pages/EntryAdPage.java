package pages;

import org.openqa.selenium.WebDriver;

public class EntryAdPage {
    private WebDriver driver;

   // unlike alert , ad is on dom page, so we can interact with it
    public EntryAdPage(WebDriver driver) {
        this.driver = driver;
    }

}
