package com.automation.exercises.pages;

import com.automation.exercises.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class PaymentPage12 extends Utility {
    private static final Logger log = LogManager.getLogger(PaymentPage12 .class.getName());

    @CacheLookup
    @FindBy(xpath = "//input[@name='name_on_card']")
    WebElement nameOnCard;

    @CacheLookup
    @FindBy(xpath = "//input[@name='card_number']")
    WebElement cardNumber;

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='ex. 311']")
    WebElement cvcNumber;

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='MM']")
    WebElement month;

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='YYYY']")
    WebElement year;

    @CacheLookup
    @FindBy(xpath = "//button[@id='submit']")
    WebElement payAndConfirmOrder;

      public void enterNameOnCard()
      {
          sendTextToElement(nameOnCard,"Anamica Mohan");
      }
    public void enterCardNumber()
    {
        sendTextToElement(cardNumber,"4567 3214 9876 5678");
    }
    public void enterCvcNumber()
    {
        sendTextToElement(cvcNumber,"314");
    }
    public void enterMonth(String monthExpiry)
    {
        sendTextToElement(month,monthExpiry);
    }
    public void enterYear()
    {
        sendTextToElement(year,"2030");
    }
    public void clickOnPayAndConfirmOrder()
    {
       clickOnElement(payAndConfirmOrder);
    }

}
