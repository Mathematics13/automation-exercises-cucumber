package com.automation.exercises.pages;

import com.automation.exercises.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class AccountDeletionPage5 extends Utility
{
    private static final Logger log = LogManager.getLogger( AccountDeletionPage5.class.getName());

    //Scenario 1,2
    //Verify that 'ACCOUNT DELETED!' is visible
    @CacheLookup
    @FindBy(xpath = "//b[contains(text(),'Account Deleted!')]")
    WebElement accountDeletedText;

    //Scenario 1
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement continueButtonInAccountDeletedPage;

    //Methods
    //Scenario 1,2
    public String verifyAccountDeletedText()                     //can use any one of these two methods to verify
    {
        Assert.assertEquals(accountDeletedText.getText(),"ACCOUNT DELETED!","Account Deleted Message");
        return getTextFromElement(accountDeletedText);
    }
    //Scenario 1,2
    public void verifyAccountDeletedUrl()                     //To verify url or text anything is fine
    {
        String accountDeletedActualUrl = driver.getCurrentUrl();
        String expectedDeletedAccountUrl = "https://automationexercise.com/delete_account";
        log.info("verifying deleted account  url");
        Assert.assertEquals(accountDeletedActualUrl ,expectedDeletedAccountUrl,"Account Deleted Message");

    }
    //Scenario 1
    public void clickOnContinueButtonInAccountDeletedPage()
    {
        clickOnElement(continueButtonInAccountDeletedPage);
    }

}
