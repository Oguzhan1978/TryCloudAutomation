package com.trycloud.tests.UserStories.FilesModule;

import com.trycloud.tests.base.TestBase;
import com.trycloud.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.File;

public class AppStorageUsage_Lola extends TestBase {

    //  Test case #10 - verify users see the app storage usage

    // 1.Login as a user

    @Test
    public void Tc_10() {
        // 2.Check the current storage usage

        String storageUsage = "75 KB used";
        BrowserUtils.sleep(2);


        // 3.Upload a file
        String fileName = "displayname";


        // 4.Refresh the page
        // 5.Verify the storage usage is increased

    }
}