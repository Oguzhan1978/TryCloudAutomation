package com.trycloud.tests.UserStories.FilesModule;

import com.trycloud.tests.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import com.trycloud.tests.base.TestBase;
import com.trycloud.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.util.List;

public class Elvin extends TestBase {

    //3. Story: As a user, I should be able to access to Files module.
    // Test case #8 - verify users can delete a file/folder
    @Test

    public void tc07_verify_users_can_delete_file_folder() {
        //3. Story: As a user, I should be able to access to Files module.
        //Test case #8 - verify users can delete a file/folder.

        //2. Click action-icon from any file on the page
        WebElement allFiles = driver.findElement(By.cssSelector("a[class='nav-icon-files svg active']"));
        allFiles.click();
        //3. Choose “delete files” option
        BrowserUtils.sleep(2);
        //4. Click deleted files on the left bottom corner
        WebElement deleteFiles = driver.findElement(By.cssSelector("a[class='nav-icon-trashbin svg']"));
        deleteFiles.click();
        BrowserUtils.sleep(2);
        //5. Verify the deleted file is displayed no the page.

        //Select clickDelete = new Select( driver.findElement(By.xpath("//label[@for='select_all_trash']")) );
        WebElement clickDelete = driver.findElement(By.xpath("//label[@for='select_all_trash']"));
        BrowserUtils.sleep(2);
        clickDelete.click();
        BrowserUtils.sleep(2);
        /*
        List<WebElement> allOption = clickDelete.
        for (WebElement each : allOption){
            each.click();
            System.out.println("Selected: " + each.getText());
        }
        clickDelete.deselectAll();
        for (WebElement each : allOption) {
            //assertTrue: expecting true boolean value to pass the test
            Assert.assertTrue(!each.isSelected());
        }
*/
    }
}
