package com.trycloud.tests.UserStories.FilesModule;

import com.github.javafaker.Faker;
import com.trycloud.tests.base.TestBase;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.FileUpload;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.File;
import java.util.List;

//Test case #7 - verify users can upload a file inside a folder
//Test case #2 - verify users can send notes in the page

public class FeatureEgemen extends TestBase {

    @Test(description = "Verify users can upload a file inside a folder")
    public void uploadFileInsideFolder() {

        //Click specific folder, navigate folder page
        WebElement folder = driver.findElement(By.xpath("(//span[contains(text(),'Talk')])[3]"));
        folder.click();

        //Click to add file button
        WebElement addButton = driver.findElement(By.cssSelector("a[class='button new']"));
        addButton.click();
        WebElement uploadFile = driver.findElement(By.cssSelector("label[for='file_upload_start']"));
        uploadFile.click();

        //Upload File
        String fileName = "TryCloud-Assignment";
        driver.findElement(By.cssSelector("label[for='file_upload_start']")).sendKeys("/Users/egemeneliz/Desktop/TryCloud-Assignment.pdf");
        /*
        File file = new File("/Users/egemeneliz/Desktop/" + fileName + ".pdf");
        FileUpload.getUpload(file);
        BrowserUtils.sleep(7);*/

        //Verify file uploaded
        List<WebElement> fileList = driver.findElements(By.xpath("//span[@class='innernametext']"));
        for (WebElement each : fileList) {
            if (each.getText().equals(fileName)) {
                Assert.assertEquals(each.getText(), fileName);
                return;
            }
        }
        Assert.fail("NO SUCH A FILE!!");


    }

    @Test(description = "Verify users can send notes in the page")
    public void sendNotes() {
        WebElement folder = driver.findElement(By.xpath("(//span[contains(text(),'Talk')])[3]"));
        folder.click();
        WebElement notes = driver.findElement(By.xpath("//p[@data-empty-text='Add notes, lists or links …']"));
        notes.click();
        Faker faker = new Faker();
        notes.sendKeys(faker.commerce().department());
        BrowserUtils.sleep(2);
    }
}
