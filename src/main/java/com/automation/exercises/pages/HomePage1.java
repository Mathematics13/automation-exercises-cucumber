package com.automation.exercises.pages;

import com.automation.exercises.propertyreader.PropertyReader;
import com.automation.exercises.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HomePage1 extends Utility
{
    private static final Logger log = LogManager.getLogger(HomePage1.class.getName());

    //TC 1,2,3,4,5,6,7
    @CacheLookup
    @FindBy(xpath = "//img[@alt='Website for practice automation']")
    WebElement homePageVisibilityText;

    //Scenario 1,2,3,4,5
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Signup / Login']")
    WebElement signUpOrLoginButton;

    //Scenario 1,2
    //For Delete account in Result page navigating to HomePage back
    @CacheLookup
    @FindBy(xpath = "//a[@href='/delete_account']")
    WebElement deleteAccountButtonLink;

    //Scenario 6
    @CacheLookup
    @FindBy(xpath = "//a[@href='/contact_us']")
    WebElement contactUsButton;

    //TC 7
    @CacheLookup
    @FindBy(xpath = "//a[@href='/test_cases']")
    WebElement testCasesButton;

    @CacheLookup
    @FindBy(xpath = "//b[normalize-space()='Test Cases']")
    WebElement testCasesText;

    @CacheLookup
    @FindBy(xpath = "(//ul[@class='nav navbar-nav']/li/a)[2]")
    WebElement products;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Subscription']")
    WebElement subscription;

    @CacheLookup
    @FindBy(xpath = "//input[@id='susbscribe_email']")
    WebElement emailAddressUnderSubscription;

    @CacheLookup
    @FindBy(xpath = "//i[@class='fa fa-arrow-circle-o-right']")
    WebElement arrowButtonInSubscription;

    @CacheLookup
    @FindBy(xpath = "//div[@class='alert-success alert']")
    WebElement subscriptonSuccessMessage;

    @CacheLookup
    @FindBy(xpath = "(//ul[@class='nav navbar-nav']/li/a)[3]")
    WebElement cartTopMenuTab;

    @CacheLookup
    @FindBy(xpath = "(//a[contains(text(),'View Product')])[11]")
    WebElement frozenTopsForKidsAnyproduct;

    @CacheLookup
    @FindBy(xpath = "(//a[@class='btn btn-default add-to-cart'][normalize-space()='Add to cart'])[38]")
    WebElement longMaxiTulleFancyDress;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue Shopping']")
    WebElement continueShoppingGreenButton;


    @CacheLookup
    @FindBy(xpath = "(//a[@class='btn btn-default add-to-cart'][normalize-space()='Add to cart'])[32]")
    WebElement sleevelessUnicornPatchGown;

    @CacheLookup
    @FindBy(xpath = "//div[@class='overlay-content']//p[contains(text(),'Blue Top')]")
    WebElement firstProductBlueTop;

    @CacheLookup
    @FindBy(xpath = "(//a[@class='btn btn-default add-to-cart'][normalize-space()='Add to cart'])[2]")
    WebElement addToCartOfBlueTop;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue Shopping']")
    WebElement continueShoppingButton;


    @CacheLookup
    @FindBy(xpath="//div[@class='overlay-content']//p[contains(text(),'Men Tshirt')]")
    WebElement secondProductMenTShirt;

    @CacheLookup
    @FindBy(xpath = "(//a[@class='btn btn-default add-to-cart'][normalize-space()='Add to cart'])[4]")
    WebElement addToCartOfMenTShirt;

    @CacheLookup
    @FindBy(xpath = "//u[normalize-space()='View Cart']")
    WebElement viewCartAfterAdding;


    @CacheLookup
    @FindBy(xpath = "//b[normalize-space()='Order Placed!']")
    WebElement orderPlacedText;

    @CacheLookup
    @FindBy(xpath = "//p[normalize-space()='Congratulations! Your order has been confirmed!']")
    WebElement congratulationsOrderPlacedText;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Category']")
    WebElement category;

    @CacheLookup
    @FindBy(xpath = "(//a[normalize-space()='Women'])[1]")
    WebElement womenCategory;

    @CacheLookup
    @FindBy(xpath = "//div[@id='Women']//a[contains(text(),'Dress')]")
    WebElement dressUnderWomenCategory;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='recommended items']")
    WebElement recommendedItemsVisibility;

    @CacheLookup
    @FindBy(xpath = "(//a[@class='btn btn-default add-to-cart'][normalize-space()='Add to cart'])[73]")
    WebElement winterTopRecommendedAddToCart;

    @CacheLookup
    @FindBy(xpath = "(//u[normalize-space()='View Cart'])[1]")
    WebElement viewCartOfWinterTop;

    @CacheLookup
    @FindBy(xpath = "//div[@class='item active']//h2[contains(text(),'Full-Fledged practice website for Automation Engin')]")
    WebElement fullFledgedPracticeWebsiteText;

    @CacheLookup
    @FindBy(xpath = "//i[@class='fa fa-angle-up']")
    WebElement upArrowButtonToScrollUp;

    @CacheLookup
    @FindBy(xpath = "(//a[@class='btn btn-default add-to-cart'][normalize-space()='Add to cart'])[14]")
    WebElement madameTopForWomenAddToCart;


    //TC 1,2,3,4,5,6,7
    public void verifyHomePage()
    {
        String actualUrl = driver.getCurrentUrl();                                                 //actual what we see
        String expectedUrl = PropertyReader.getInstance().getProperty("baseUrl");
        log.info("verifying homepage url");                                                     //This info will be present in log.out under logs
        Assert.assertEquals(expectedUrl,actualUrl);
    }
    //Scenario 1,2,3,4,5

    public void clickOnSignUpOrLoginButton()
    {
        clickOnElement(signUpOrLoginButton);
        log.info("Click on the SignUp or login button to navigate to the New User Page");
    }
    //Scenario 1,2
    //For Delete account in Result page navigating to HomePage back
    public void clickOnDeleteAccountButtonLink()
    {
        clickOnElement(deleteAccountButtonLink);
    }
    //Scenario 6
    public void clickOnContactUsButton()
    {
        clickOnElement(contactUsButton);
        log.info("Click on to contact us button and navigates to Contact Us Page");
    }
    //TC 7
    public void clickOnTestCasesButtonButton()
    {
        clickOnElement(testCasesButton);
        log.info("Click on test cases button and navigates to test cases page successfully ");
    }
    //TC 7
    public void verifyTestCasesPageUrl()
    {
        Assert.assertEquals(driver.getCurrentUrl(),"https://automationexercise.com/test_cases","Navigation to test cases page");
    }
    public void verifyTestCasesText()
    {
        Assert.assertEquals(testCasesText.getText(),"TEST CASES","Test Cases Display text");
    }
    public void clickOnProductsButton()
    {
        clickOnElement(products);
        log.info("Clicking on products button");
    }
    public String getTextFromSubscription()
    {
        return getTextFromElement(subscription);
    }
    public void scrollDownToSubscriptionFooter() throws InterruptedException {
        Point coordinates = subscription.getLocation();
        int x = coordinates.getX();
        int y = coordinates.getY();
        System.out.println("X coordinate of Subscription : "+x);
        System.out.println("Y coordinate of Subscription : "+y);
        Thread.sleep(2000);
        JavascriptExecutor jse = (JavascriptExecutor) driver;                     //Scroll By on Y axis , x=0 , y = positive(opposite)
        jse.executeScript("window.scrollBy(0, "+y+")");                    //Always enclosed in double quotes
    }
    public void scrollUpToFullFledgedPracticeWebsite() throws InterruptedException {

         JavascriptExecutor jse = (JavascriptExecutor) driver;
         Thread.sleep(2000);
         jse.executeScript("window.scrollBy(0,-9000)");              //you can scroll up only if you scroll down
    }
    public String getTextFromFullFledgedPracticeWebsite()
    {
        return getTextFromElement(fullFledgedPracticeWebsiteText);
    }
    public void enterEmailAddressUnderSubscription()
    {
        sendTextToElement(emailAddressUnderSubscription,"final123@gmail.com");
    }
    public void clickOnArrowButtonInSubscription()
    {
        clickOnElement(arrowButtonInSubscription);
    }
    public String  getTextFromSubscriptionSuccessMessage()
    {
       return  getTextFromElement(subscriptonSuccessMessage);
    }
    public void clickOnCartTopMenuTab()
    {
        clickOnElement(cartTopMenuTab);
    }

    public void clickOnFrozenTopsForKidsAnyproduct() throws InterruptedException {
        Thread.sleep(3000);
        clickOnElement(frozenTopsForKidsAnyproduct);
    }
    public void clickOnSleevelessUnicornPatchGown()
    {
        clickOnElement(sleevelessUnicornPatchGown);
    }
    public void clickOnLongMaxiTulleFancyDress()
    {
        clickOnElement(longMaxiTulleFancyDress);
    }
    public void clickOnContinueShoppingGreenButton()
    {
        clickOnElement(continueShoppingGreenButton);
    }
    public void clickOnAddToCartOfBlueTop()
    {
        try {
            clickOnElement(addToCartOfBlueTop);
        }catch(StaleElementReferenceException s1)
        {
            System.out.println("Handling the exception");
        }
    }
    public void clickOnContinueShoppingButton()
    {
        clickOnElement(continueShoppingButton);
    }

    public void hoverOverFirstProductBlueTop()
    {
        //Actions a1 = new Actions(driver);
        //a1.moveToElement(firstProductBlueTop).build().perform();
        mouseHoverToElement(firstProductBlueTop);
    }
    public void mouseHoverToSecondProductMenTShirt()
    {
        mouseHoverToElement(secondProductMenTShirt);
    }
    public void clickOnAddToCartOfMenTShirt()
    {
        clickOnElement(addToCartOfMenTShirt);
    }

    public String getTextFromOrderPlaced()
    {
        return getTextFromElement(orderPlacedText);
    }
    public String getTextFromCongratulationsOrderPlacedText()
    {
        return getTextFromElement(congratulationsOrderPlacedText);               //Congratulations! Your order has been confirmed!
    }
    public void clickOnViewCartAfterAdding()
    {
        clickOnElement(viewCartAfterAdding);
    }
    public String getTextFromCategory()
    {
        return getTextFromElement(category);
    }
    public void clickOnWomenCategory()
    {
        clickOnElement(womenCategory);
    }
    public void clickOnDressUnderWomenCategory()
    {
        clickOnElement(dressUnderWomenCategory);
    }
    public void  scrollToBottomForRecommendedItems()
    {
        Point coordinates = recommendedItemsVisibility.getLocation();
        int x = coordinates.getX();
        int y = coordinates.getY();
        System.out.println("X coordinate of RecommendedItems:" +x);
        System.out.println("Y coordinate of RecommendedItems:" +y);
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,"+y+")");
    }
    public String getTextFromRecommendedItems() {
        return getTextFromElement(recommendedItemsVisibility);
    }
    public void clickOnWinterTopRecommendedAddToCart()
    {
        clickOnElement(winterTopRecommendedAddToCart);
    }
    public void clickOnViewCartOfWinterTop()
    {
        clickOnElement(viewCartOfWinterTop);
    }
    public void clickOnUpArrowButtonToScrollUp()
    {
        clickOnElement(upArrowButtonToScrollUp);
    }
    public void mouseHoverOnMadameTopForWomenAddToCart()
    {
        mouseHoverToElementAndClick(madameTopForWomenAddToCart);
    }

}



