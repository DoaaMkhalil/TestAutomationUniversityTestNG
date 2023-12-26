package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

  // file upload is a form in dom page
public class FileUploadPage {
   private WebDriver driver;
private By fileUploadInput =By.id("file-upload");
private By uploadButton =By.id("file-submit");
private By fileUploaded =By.id("uploaded-files");
    public FileUploadPage(WebDriver driver) {
        this.driver = driver;
    }
    public void uploadFile(String path){
     driver.findElement(fileUploadInput).sendKeys(path);
     clickUploadButton();
    }

    public void clickUploadButton(){
        driver.findElement(uploadButton).click();
    }
    public String getFileUploadedName(){
      return   driver.findElement(fileUploaded).getText();
    }

}
