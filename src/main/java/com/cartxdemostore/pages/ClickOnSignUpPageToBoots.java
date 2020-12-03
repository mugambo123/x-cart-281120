package com.cartxdemostore.pages;

import com.cartxdemostore.utility.Utility;
import org.openqa.selenium.By;

public class ClickOnSignUpPageToBoots extends Utility {

    By signIn = By.xpath("//*[@id=\"header-bar\"]/div[3]/button/span");
    By createAccount = By.xpath("//tbody/tr[4]/td[1]/a[1]");
    By email = By.xpath("//input[@id='login']");
    By pass = By.xpath("//input[@id='password']");
    By confirmPass = By.xpath("//input[@id='password-conf']");
    By create = By.xpath("//button[@type = 'submit']");
    By mouseHoover = By.xpath("//body/div[@id='page-wrapper']/div[@id='page']/div[@id='header-area']/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/span[1]");
    By clickOnSale = By.xpath("//span[@ xpath = '1']");
    By clickBoots = By.xpath("//body/div[@id='page-wrapper']/div[@id='page']/div[@id='main-wrapper']/div[@id='main']/div[1]/div[3]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/ul[1]/li[3]/div[1]/div[1]/a[1]/img[1]");
    By bootsText = By.xpath("//h1[contains(text(),'Lace-Up Boots in Light Brown')]");

    public void clickOnSignUpToBoots(String emailAddress, String password) {
        implicitWait(20);
        //Click on sign in/sign up button
        clickOnElement(signIn);

        implicitWait(10);
        //Click on to create account
        clickOnElement(createAccount);
        implicitWait(10);
        //Enter email to create new account
        sendTextToElement(email, emailAddress);
        String loginEmail = emailAddress;
        implicitWait(10);
        //Enter password to create new account
        sendTextToElement(pass, password);
        String confirmPassword = password;
        implicitWait(10);
        //Confirm Password
        sendTextToElement(confirmPass, confirmPassword);
        implicitWait(10);
        //Click on Create to Create New Account
        clickOnElement(create);

        //Click on Sale
        mouseHoverToElement(mouseHoover);
        clickOnElement(clickOnSale);

        //Click on Boots
        clickOnElement(clickBoots);

    }

    public String getBootText() {
        return getTextFromElement(bootsText);
    }
}
