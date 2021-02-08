package com.trycloud.tests.UserStories.FilesModule;

import com.trycloud.tests.base.TestBase;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.FileUpload;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.util.List;

public class UserCanUploadFileToHomePage_Aibek extends TestBase {

    @Test(description = "verify user can upload file to home page")
    public void upload_file_to_home_page() {
        //locating and clicking on file module
        BrowserUtils.sleep(3);
        WebElement filesModule = driver.findElement(By.xpath("(//li[@data-id='files'])[1]"));
        filesModule.click();

        //locating path of chosen file
        String path = "C:\\Users\\aibek\\Downloads\\Screenshot 2021-02-02 090805.png";

        //locating and clicking on '+' link
        BrowserUtils.sleep(3);
        WebElement uploadFileButton = driver.findElement(By.xpath("//span[@class='icon icon-add']"));
        uploadFileButton.click();

        //file name and path
        String fileName = "Screenshot 2021-02-02 090805";

        //locating on Upload file
        BrowserUtils.sleep(3);
        WebElement uploadFile = driver.findElement(By.xpath("//span[.='Upload file']"));
        uploadFile.sendKeys(path);

        //Verification that file uploaded
        BrowserUtils.sleep(3);
        Assert.assertEquals(uploadFile.getText(), fileName, "Uploaded file text verification FAILED!");


    }
}
