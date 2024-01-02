package com.automation.exercises.pages;

import com.automation.exercises.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class AccountCreatedPage4 extends Utility
{

    private static final Logger log = LogManager.getLogger(AccountCreatedPage4.class.getName());


    //Scenario 1
    @CacheLookup
    @FindBy(xpath = "//b[contains(text(),'Account Created!')]")
    WebElement accountCreatedText;

    //Scenario 1
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Continue']")
    WebElement continueButton;

    //Scenario 1,2
    @CacheLookup
    @FindBy(xpath = "//li[10]//a[1]")
    WebElement loggedInAsUserName;

    //Scenario 4
    @CacheLookup
    @FindBy(xpath = "//a[@href='/logout']")
    WebElement logOutButton;


    //Methods

    //Scenario 1
    public String verifyAccountCreated()
    {
        String expectedText = "ACCOUNT CREATED!";
        Assert.assertEquals(accountCreatedText.getText(),expectedText,"Account successfully created");
        log.info("Verifying account creation successfully");
        return getTextFromElement(accountCreatedText);
    }
    public void verifyAccountCreatedUrl()
    {
        Assert.assertEquals(driver.getCurrentUrl(),"https://automationexercise.com/account_created","Account Created Page");
    }
    //Scenario 1
    public void clickOnContinueButton() throws InterruptedException {
        Thread.sleep(2000);
        clickOnElement(continueButton);
        log.info("Clicking on Continue button and navigating to HomePage with registered Username ");
    }
    //Scenario 1,2(new correct email and pwd),3(incorrect),4
    //Verify 'Login to your account' is visible
    public String verifyLoggedInAsUserName()
    {
        log.info("Verifying Logged in as registered UserName");
        return getTextFromElement(loggedInAsUserName);
    }

    //Scenario 4
    public void clickOnlogOutButton()
    {
        clickOnElement(logOutButton);
        log.info(("Click onto logout button and user navigated to login page"));
    }

}
