package com.trycloud.tests.UserStories.FilesModule;

import com.trycloud.tests.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SelectUplFile_Manshuk extends TestBase {
    //Test case #2  verify users can select all the uploaded files from the page

    @Test (description = "verify users can select all the uploaded files from the page" )
    public void select_file(){
        // #1 Login as a user

        //#2 Click the top left checkbox of the table
       // driver.findElement(By.xpath()).click();


       // driver.findElement(By.id("select_all_files")).click();

        /*WebElement selectButton1 = driver.findElement(By.xpath("//input[@id='select-files-84021']/following-sibling::label"));
        selectButton1.click();
        WebElement selectButton2= driver.findElement(By.xpath("//input[@id='select-files-84369']/following-sibling::label"));
        selectButton2.click();

         */

        //3 Assert all the files are selected

       // Assert.assertTrue(selectButton1.isSelected());
       // Assert.assertTrue(selectButton2.isSelected());



         


    }

}
