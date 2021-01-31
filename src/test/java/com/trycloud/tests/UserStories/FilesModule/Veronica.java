package com.trycloud.tests.UserStories.FilesModule;

import com.trycloud.tests.base.TestBase;
import com.trycloud.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class Veronica extends TestBase {

    @Test(description = "User Story #3: As a user, I should be able to access to Files module")
    public void tc06_verify_users_can_create_folder() {
        //1. Login as a user

        //2. Click the “+” icon on top
        WebElement newButton = driver.findElement(By.xpath("//a[@class='button new']"));
        newButton.click();

        //3. Click “New Folder”
        WebElement newFolderButton = driver.findElement(By.xpath("//span[.='New folder']"));
        newFolderButton.click();

        //4. Write a folder name
        String namesForFolders = "TFolder10";

        WebElement folderName = driver.findElement(By.id("view13-input-folder"));
        folderName.sendKeys(namesForFolders);

        //5. Click submit icon
        WebElement submitButton = driver.findElement(By.xpath("(//input[@type='submit'])[2]"));
        submitButton.click();

        BrowserUtils.sleep(10);
        //6. Verify the folder is displayed on the page

        List<WebElement> folderNames = driver.findElements(By.xpath("//span[@class='innernametext']"));
        for (WebElement each : folderNames){
            if (each.getText().equals(namesForFolders)){
                Assert.assertEquals(each.getText(),namesForFolders);
                return;
            }
            System.out.println(each.getText());
        }
        Assert.fail("Verification FAILED!");

    }

}
