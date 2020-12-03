package com.cartxdemostore.XcartTestSuites;

import com.cartxdemostore.pages.ClickOnSignUpPageToBoots;
import com.cartxdemostore.testbase.TestBase;
import com.cartxdemostore.utility.Utility;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ClickOnSignUp extends TestBase {
    ClickOnSignUpPageToBoots clickOnSignUpPageToBoots = new ClickOnSignUpPageToBoots();

    @Test
    public void compareBootsText()  {
        clickOnSignUpPageToBoots.clickOnSignUpToBoots(Utility.getRandomString(3) + Utility.getRandomString(900) + "@gmail.com",
                Utility.getRandomString(3) + Utility.getRandomString(900));

        String actualMessage = clickOnSignUpPageToBoots.getBootText();
        String expectedMessage = "Lace-Up Boots in Light Brown";
        Assert.assertEquals(expectedMessage, actualMessage);
    }
}
