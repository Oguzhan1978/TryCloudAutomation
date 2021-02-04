package com.trycloud.tests.UserStories.FilesModule;

import com.trycloud.tests.base.TestBase;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.FileUpload;
import org.openqa.selenium.By;
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

        //locating and clicking on '+' link
        BrowserUtils.sleep(3);
        WebElement uploadFileButton = driver.findElement(By.xpath("//span[@class='icon icon-add']"));
        uploadFileButton.click();

        //locating on Upload file
        BrowserUtils.sleep(3);
        WebElement uploadFile = driver.findElement(By.xpath("//span[.='Upload file']"));
        uploadFile.click();

        //File uploading
        BrowserUtils.sleep(3);
        String fileName = "PictureOfBeautifulPlace";
        String path = "C:\\Users\\aibek\\Downloads\\PictureOfBeautifulPlace.jpg";
        File file = new File(path + fileName);
        FileUpload.getUpload(file);


        //Verification that file uploaded
        BrowserUtils.sleep(3);
        List<WebElement> filesList = driver.findElements(By.xpath("//span[@class='innernametext']"));
        for (WebElement each : filesList) {
            if (each.getText().equals(fileName)) {
                Assert.assertEquals(each.getText(), fileName);
                return;
            }
        }
        Assert.fail("No such file displayed!");


    }
}
