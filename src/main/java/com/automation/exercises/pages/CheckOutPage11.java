package com.automation.exercises.pages;

import com.automation.exercises.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class CheckOutPage11 extends Utility {
    private static final Logger log = LogManager.getLogger(CheckOutPage11.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Address Details']")
    WebElement addressDetailsText;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Review Your Order']")
    WebElement reviewYourOrderText;

    @CacheLookup
    @FindBy(xpath = "//textarea[@name='message']")
    WebElement commentTextArea;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Place Order']")
    WebElement placeOrder;

    @CacheLookup
    @FindBy(xpath = "//ul[@id='address_delivery']")
    WebElement yourDeliveryAddress;

    @CacheLookup
    @FindBy(xpath = "//ul[@id='address_invoice']")
    WebElement yourBillingAddress;

    public String  getTextFromAddressDetails()
     {
       return getTextFromElement(addressDetailsText);
     }
    public String  getTextFromReviewYourOrder()
    {
        return getTextFromElement(reviewYourOrderText);
    }
    public void enterDescriptionInCommentTextArea()
    {
        sendTextToElement(commentTextArea,"If any size discrepancy will exchange.Thanks" );
    }
    public void clickOnPlaceOrder()
    {
        clickOnElement(placeOrder);
    }

    public String getTextFromYourDeliveryAddress()
    {
       return getTextFromElement(yourDeliveryAddress);
    }
    public String getTextFromYourBillingAddress()
    {
       return  getTextFromElement(yourBillingAddress);
    }

}
