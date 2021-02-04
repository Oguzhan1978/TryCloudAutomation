package com.trycloud.tests.UserStories.TalksModule;

import com.trycloud.tests.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Elvin extends TestBase {

    @Test
    public void Verify_user_can_search()  {

        //7. Story: As a user, I should be able to access search any item/ users from the homepage.
//Test case #1 - Verify users can search any files/folder/users from the search box.
//1. Login as a user

//2. Click magnifier icon on the right top
        WebElement magnifier = driver.findElement(By.xpath(" material-design-icon__svg "));
//3. Search any existing file/folder/user name

//4. Verify the app displays the expected result option


    }
}
