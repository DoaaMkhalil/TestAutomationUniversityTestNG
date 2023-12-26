package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
// pom design pattern : every page in app represent as class
//locate element& interaction with it will be in main directory (frameWork layer)
public class HomePage {
    // locator for the element
    private By formAuthenticationLink = By.linkText("Form Authentication");


    WebDriver driver;

    public HomePage(WebDriver driver) /* when we use this class we must pass
    the driver that has been initialized already
    */
    {
        this.driver = driver;
    }
    public LoginPage clickFormAuthentication(){
        // this action will navigate to new page ,so we will make it returned method
        driver.findElement(formAuthenticationLink).click();
        return new LoginPage(driver); // pass driver with this interaction to continue the interaction
    }
    ////////////////////////////////////////////////
    private void clickLink(String linkText)
    {
        //another way to click because all links can locate with the link text
        driver.findElement(By.linkText(linkText)).click();
    }
    public DropdownPage clickDropdown(){

        clickLink("Dropdown");
        return new DropdownPage(driver);
    }
    public HoversPage clickHoversLink(){

        clickLink("Hovers");
        return new HoversPage(driver);
    }
    public KeyPressesPage clickKeyPresses(){

        clickLink("Key Presses");
        return new KeyPressesPage(driver);
    }
    public SliderPage clickHorizontalSlider(){

        clickLink("Horizontal Slider");
        return new SliderPage(driver);
    }
    public  AlertsPage clickJavaScriptAlerts(){

        clickLink("JavaScript Alerts");
        return new AlertsPage(driver);
    }
    public  FileUploadPage clickFileUpload(){

        clickLink("File Upload");
        return new FileUploadPage(driver);
    }
    public  EntryAdPage clickEntryAdLink(){

        clickLink("Entry Ad");
        return new EntryAdPage(driver);
    }

    public  WYSIWYGEditorPage clickWYSIWYGEditorLink(){

        clickLink("WYSIWYG Editor");
        return new WYSIWYGEditorPage(driver);
    }
    public  NestedFramePage clickNestedFrameLink(){

        clickLink("Nested Frames");
        return new NestedFramePage(driver);
    }
    public  DynamicLoadingPage clickDynamicLoadingLink(){

        clickLink("Dynamic Loading");
        return new DynamicLoadingPage(driver);
    }
    public  LargeDeepDOMPage clickLargeDeepDOMLink(){

        clickLink("Large & Deep DOM");
        return new LargeDeepDOMPage(driver);
    }
    public  InfiniteScrollPage clickInfiniteScrollLink(){

        clickLink("Infinite Scroll");
        return new InfiniteScrollPage(driver);
    }


    public  MultipleWindowsPage clickMultipleWindowsLink(){

        clickLink("Multiple Windows");
        return new MultipleWindowsPage(driver);
    }








}
