package com.automation.exercises.pages;

import com.automation.exercises.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ProductDetailPage9 extends Utility
{
    private static final Logger log = LogManager.getLogger(ProductDetailPage9.class.getName());

    @CacheLookup
    @FindBy(xpath="//h2[normalize-space()='Blue Top']")                 //"Blue Top" expected
    WebElement blueTopProductNameText;

    @CacheLookup
    @FindBy(xpath = "//p[normalize-space()='Category: Women > Tops']")
    WebElement categoryOfTheProduct;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Rs. 500']")
    WebElement priceOfBlueTop;

    @CacheLookup
    @FindBy(xpath = "//b[normalize-space()='Availability:']")
    WebElement availabilityOfBlueTop;

    @CacheLookup
    @FindBy(xpath = "//b[normalize-space()='Condition:']")
    WebElement conditionOfBlueTop;

    @CacheLookup
    @FindBy(xpath = "//b[normalize-space()='Brand:']")
    WebElement brandOfBlueTop;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Frozen Tops For Kids']")
    WebElement productDetailFrozenTopsForKids;

    @CacheLookup
    @FindBy(xpath = "//input[@id='quantity']")
    WebElement quantityForFrozenTopsForKidsToIncrease;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Add to cart']")
    WebElement addToCartForFrozenTops;

    @CacheLookup
    @FindBy(xpath = "//u[contains(text(),'View Cart')]")
    WebElement viewCartPopUpForFrozenTops;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Write Your Review']")
    WebElement writeYourReview;

    @CacheLookup
    @FindBy(xpath = "//input[@id='name']")
    WebElement nameUnderReview;

    @CacheLookup
    @FindBy(xpath = "//input[@id='email']")
    WebElement emailUnderReview;

    @CacheLookup
    @FindBy(xpath = "//textarea[@id='review']")
    WebElement addReview;

    @CacheLookup
    @FindBy(xpath = "(//button[normalize-space()='Submit'])[1]")
    WebElement submitButtonUnderReview;

    @CacheLookup
    @FindBy(xpath = "//div[@id='reviews']//div[@class='col-sm-12']")         //span[normalize-space()='Thank you for your review.']
    WebElement thankYouForReview;


    public String getBlueTopProductNameText()
    {
        return getTextFromElement(blueTopProductNameText);
    }
    public String getCategoryTextOfTheBlueTop()
    {
        return getTextFromElement(categoryOfTheProduct);
    }
    public String getPriceTextOfBlueTop()
    {
        return getTextFromElement(priceOfBlueTop);
    }
    public String getAvailabilityTextOfBlueTop()
    {
        return getTextFromElement(priceOfBlueTop);
    }
    public String getConditionTextOfBlueTop()
    {
        return getTextFromElement(conditionOfBlueTop);
    }
    public String getBrandTextOfBlueTop()
    {
        return getTextFromElement(brandOfBlueTop);
    }
    public String getTextProductDetailFrozenTopsForKids()
    {
        return getTextFromElement(productDetailFrozenTopsForKids);
    }
    public void increaseQuantityForFrozenTopsForKids()
    {
        quantityForFrozenTopsForKidsToIncrease.clear();
        sendTextToElement(quantityForFrozenTopsForKidsToIncrease,"4");
    }
    public void clickOnAddToCartForFrozenTops()
    {
        clickOnElement(addToCartForFrozenTops);
    }
    public void clickOnViewCartPopUpForFrozenTops()
    {
        clickOnElement(viewCartPopUpForFrozenTops);
    }
    public String getTextFromWriteYourReview()
    {
        return getTextFromElement(writeYourReview);
    }
    public void enterNameUnderReview(String name)
    {
        sendTextToElement(nameUnderReview,name);
    }
    public void enterEmailAddressUnderReview(String email)
    {
        sendTextToElement(emailUnderReview,email);
    }
    public void enterCommentsInReview(String review)
    {
        sendTextToElement(addReview,review);
    }
    public void clickOnSubmitButtonUnderReview()
    {
        clickOnElement(submitButtonUnderReview);
    }
    public String getTextFromThankYouForReview()
    {
        return getTextFromElement(thankYouForReview);
    }
}
