package com.trycloud.tests.UserStories.FilesModule;


//Click Settings on the left bottom corner
//Verify user can click any buttons.

import com.trycloud.tests.base.TestBase;
import com.trycloud.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AppSetting_Aamir extends TestBase {

    @Test
    public void Tc09_change_the_app_setting() {

        //Finding the setting button and clicking it
        driver.findElement(By.xpath("//button[normalize-space()='Settings']")).click();
        BrowserUtils.sleep(5);

        //verifying if all Buttons are clickable
        boolean FirstCheckBox = driver.findElement(By.xpath("//label[normalize-space(text())='Show rich workspaces']")).isEnabled();
        boolean SecondCheckBox = driver.findElement(By.xpath("//label[.='Show recommendations']")).isEnabled();
        boolean ThirdCheckBox = driver.findElement(By.cssSelector("div[id='files-setting-showhidden']>label")).isEnabled();


        Assert.assertTrue(FirstCheckBox && SecondCheckBox && ThirdCheckBox);

    }

}
