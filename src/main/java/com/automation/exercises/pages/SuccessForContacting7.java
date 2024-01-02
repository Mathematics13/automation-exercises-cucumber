package com.automation.exercises.pages;

import com.automation.exercises.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class SuccessForContacting7 extends Utility
{
    private static final Logger log = LogManager.getLogger(SuccessForContacting7.class.getName());

    //Test Case 6
    @CacheLookup
    @FindBy(xpath = "(//div[contains(text(),'Success! Your details have been submitted successfully.')])[1]")
    WebElement successMessageForGettingInTouch;

    //Test Case 6
    @CacheLookup
    @FindBy(xpath = "//span[.=' Home']")
    WebElement homeButtonUnderContactUs;

    //Methods
    //TC 6
    public void verifySuccessMessageForGettingInTouch()
    {
        Assert.assertEquals(successMessageForGettingInTouch.getText(),"Success! Your details have been submitted successfully.","Success Message");
    }
    //TC 6
    public void clickOnHomeButtonUnderContactUs()
    {
        clickOnElement(homeButtonUnderContactUs);
        log.info("Clicking on home button and landing to home page");
    }

}
