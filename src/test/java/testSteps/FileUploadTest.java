package testSteps;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FileUploadPage;

public class FileUploadTest extends BaseTest{
    @Test
    public void testFileUpload(){
        FileUploadPage fileUploadPage = homePage.clickFileUpload();
        fileUploadPage.uploadFile("D:\\web testing deploma\\ISTQB FL\\Capture7.PNG");
        Assert.assertEquals(fileUploadPage.getFileUploadedName(),"Capture7.PNG");
    }
}
