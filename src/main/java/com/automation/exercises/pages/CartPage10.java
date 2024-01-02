package com.automation.exercises.pages;

import com.automation.exercises.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CartPage10 extends Utility
{
    private static final Logger log = LogManager.getLogger(CartPage10.class.getName());

    @CacheLookup
    @FindBy(xpath="//h2[normalize-space()='Subscription']")
    WebElement subscriptionInCartPage;

    @CacheLookup
    @FindBy(xpath="//input[@id='susbscribe_email']")
    WebElement emailAddressInSubscriptionOfCartPage;

    @CacheLookup
    @FindBy(xpath = "//i[@class='fa fa-arrow-circle-o-right']")
    WebElement arrowSubscriptionCartPage;

    @CacheLookup
    @FindBy(xpath = "//div[@class='alert-success alert']")
    WebElement subscriptonSuccessMessageInCart;

    @CacheLookup
    @FindBy(xpath = "//div[@class='table-responsive cart_info']//table/tbody/tr")
    List<WebElement> twoProductsInsideTheCart;

    @CacheLookup
    @FindBy(xpath = "//li[@class='active']")
    WebElement shoppingCartText;

    @CacheLookup
    @FindBy(xpath = "//td[@class='cart_price']")
    List<WebElement> pricesOfTwoProductsInTheCart;

    @CacheLookup
    @FindBy(xpath = "//td[@class='cart_quantity']")
    List<WebElement> quantityOfTwoProductsInTheCart;

    @CacheLookup
    @FindBy(xpath = "//p[@class='cart_total_price']")
    List<WebElement> totalPricesOfTwoProductsInTheCart;

    @CacheLookup
    @FindBy(xpath = "(//div[@class='table-responsive cart_info']//table/tbody/tr)[3]")
    List<WebElement> frozenTopsForKidsDescription;

    @CacheLookup
    @FindBy(xpath = "//tr[@id='product-13']//button[@class='disabled'][normalize-space()='4']")
    WebElement quantityForFrozenTopsForKidsDescription;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Proceed To Checkout']")
    WebElement proceedToCheckOutButton;

    @CacheLookup
    @FindBy(xpath = "//u[normalize-space()='Register / Login']")
    WebElement registerOrLoginInProceedToCheckOut;

    @CacheLookup
    @FindBy(xpath = "//i[@class='fa fa-times']")
    WebElement crossButtonOfAParticularProduct;

    @CacheLookup
    @FindBy(xpath = "//b[normalize-space()='Cart is empty!']")
    WebElement cartIsEmptyText;

    @CacheLookup
    @FindBy(xpath = "//div[@class='table-responsive cart_info']")
    WebElement cartInfoTableProductsVisible;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Signup / Login']")
    WebElement signUpOrLoginButtonInCartPage;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Winter Top']")
    WebElement winterTopInCartPage;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Madame Top For Women']")
    WebElement madameTopForWomenText;



    public String getTextFromSubscriptionOfCartPage()
    {
        return getTextFromElement(subscriptionInCartPage);
    }
    public void scrollDownToFooterSubscriptionInCart() throws InterruptedException
    {
        Point coordinates = subscriptionInCartPage.getLocation();
        int x = coordinates.getX();
        int y = coordinates.getY();
        System.out.println("X coordinate of Subscription in Cart page :" +x);
        System.out.println("Y coordinate of Subscription in Cart page :" +y);
        Thread.sleep(2000);
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,"+y+")");
    }
    public void enterEmailAddressInSubscriptionOfCartPage(String text)
    {
        sendTextToElement(emailAddressInSubscriptionOfCartPage,text);
    }
    public void clickOnArrowSubscriptionCartPage()
    {
        clickOnElement(arrowSubscriptionCartPage);
    }
    public String getSubscriptonSuccessMessageInCart()
    {
        return getTextFromElement(subscriptonSuccessMessageInCart);
    }
    public String verificationOfItemsInsideTheCart()
    {
        for (WebElement product:twoProductsInsideTheCart)
        {
            log.info("Verify items inside the cart :" +twoProductsInsideTheCart.toString());
            return getTextFromElement(product);
        }
        return "text";
    }
    public String getTextFromShoppingCart()
    {
        return getTextFromElement(shoppingCartText);
    }
    public String getTextFromPricesOfTwoProductsInTheCart()
    {
        for (WebElement price :pricesOfTwoProductsInTheCart)
        {
            log.info("Getting prices of both products :" + pricesOfTwoProductsInTheCart.toString());
            return getTextFromElement(price);
        }
        return "Price";
    }
    public String getTextFromQuantityOfTwoProductsInTheCart()
    {
        for (WebElement quantity :quantityOfTwoProductsInTheCart)
        {
            log.info("Getting quantity of both products :" + quantityOfTwoProductsInTheCart.toString());
            return getTextFromElement(quantity);
        }
        return "quantity";
    }
    public String getTextFromTotalPricesOfTwoProductsInTheCart()
    {
        for (WebElement totalPrices:totalPricesOfTwoProductsInTheCart)
        {
            log.info("Getting total prices of both products :" + totalPricesOfTwoProductsInTheCart.toString());
            return getTextFromElement(totalPrices);
        }
        return "Total Prices";
    }
    public String getTextFromFrozenTopsForKidsDescription()
    {
        for (  WebElement frozen : frozenTopsForKidsDescription )
        {
            return getTextFromElement(frozen);
        }
        getTextFromElement(quantityForFrozenTopsForKidsDescription);
        return "description";
    }
    public void clickOnProceedToCheckOutButton()
    {
        clickOnElement(proceedToCheckOutButton);
    }
    public void clickOnRegisterOrLoginInProceedToCheckOut()
    {
        clickOnElement(registerOrLoginInProceedToCheckOut);
    }
    public void clickOnCrossButtonOfAParticularProduct()
    {
        clickOnElement(crossButtonOfAParticularProduct);
    }
    public String getTextFromCartIsEmpty()
    {
        return getTextFromElement(cartIsEmptyText);
    }
    public String getTextFromCartInfoTableProductsVisible()
    {
        return getTextFromElement(cartInfoTableProductsVisible);
    }
    public void clickOnSignUpOrLoginButtonInCartPage()
    {
        clickOnElement(signUpOrLoginButtonInCartPage);
    }
    public String getTextFromWinterTopInCartPage()
    {
       return  getTextFromElement(winterTopInCartPage);
    }
    public String getTextFromMadameTopForWomen()
    {
        return getTextFromElement(madameTopForWomenText);
    }
}
