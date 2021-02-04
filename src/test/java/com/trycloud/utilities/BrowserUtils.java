package com.trycloud.utilities;

import com.trycloud.tests.base.TestBase;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class BrowserUtils extends TestBase {

   public static void sleep(int seconds){
       seconds *= 1000;
       try {
           Thread.sleep(seconds);
       } catch (InterruptedException e) {
           e.printStackTrace();
       }
   }

    public static void takeScreenShot(String path){

        File screen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(screen, new File(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
