package com.automation.exercises.pages;

import com.automation.exercises.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class ProductPage8 extends Utility
{
    private static final Logger log = LogManager.getLogger(ProductPage8.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='All Products']")
    WebElement allProductsText;


     @CacheLookup
     @FindBy(xpath = "(//a[contains(text(),'View Product')])[1]")
     WebElement viewProductOfFirstProductBlueTop;

     @CacheLookup
     @FindBy(xpath = "//input[@id='search_product']")
     WebElement searchProductBar;
    @CacheLookup
    @FindBy(xpath = "//i[@class='fa fa-search']")
    WebElement searchButton;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Searched Products']")
    WebElement searchedProductsText;

    @CacheLookup
    @FindBy(xpath = "//div[@class = 'single-products']/div/p")
    List<WebElement> dressProductsNames;

    @CacheLookup
    @FindBy(xpath = "(//div[@class='product-overlay'])[1]")
    WebElement overlayOfFirstProductBlueTop;
    @CacheLookup
    @FindBy(xpath = "//div[@class='overlay-content']//p[contains(text(),'Blue Top')]")
    WebElement firstProductBlueTop;

    @CacheLookup
    @FindBy(xpath = "(//a[contains(text(),'Add to cart')])[2]")
    WebElement addToCartOfBlueTop;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue Shopping']")
    WebElement continueShoppingButton;

    @CacheLookup
    @FindBy(xpath = "(//div[@class='product-overlay'])[2]")
    WebElement overlayOfSecondProductMenTShirt;

    @CacheLookup
    @FindBy(xpath="//div[@class='overlay-content']//p[contains(text(),'Men Tshirt')]")
    WebElement secondProductMenTShirt;

    @CacheLookup
    @FindBy(xpath = "(//a[@class='btn btn-default add-to-cart'][normalize-space()='Add to cart'])[4]")
    WebElement addToCartOfMenTShirt;

    @CacheLookup
    @FindBy(xpath = "//u[normalize-space()='View Cart']")
    WebElement viewCartButtonAfterAddingTwoproducts;

    @CacheLookup
    @FindBy(xpath = "(//div[@class='product-overlay'])[3]")
    WebElement overlayOfAddingProductToCartSleevelessDress;
    @CacheLookup
    @FindBy(xpath = "(//a[@class='btn btn-default add-to-cart'][normalize-space()='Add to cart'])[2]")
    WebElement addingProductToCartSleevelessDress;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Brands']")
    WebElement brands;

    @CacheLookup
    @FindBy(xpath = "//ul[@class='nav nav-pills nav-stacked']/li/a")
    List<WebElement> brandslist;

    @CacheLookup
    @FindBy(xpath = "//a[@href='/brand_products/Polo']")
    WebElement poloBrand;

    @CacheLookup
    @FindBy(xpath = "(//a[contains(text(),'Add to cart')])[14]")
    WebElement longMaxiTullieFancyDressUpOutfits;


    public String getAllProductsText()
    {
        log.info("Getting All Products Text");
        return getTextFromElement(allProductsText);
    }
    public void clickOnViewProductBlueTop()
    {
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(viewProductOfFirstProductBlueTop));
        clickOnElement(viewProductOfFirstProductBlueTop);
        log.info("Clicking on View Product Of First Product Blue Top ");
    }
    public void inputInSearchProductTextField(String productName)
    {
        sendTextToElement(searchProductBar,"dress");
    }
    public void clickOnSearchButton()
    {
        clickOnElement(searchButton);
    }
    public String getSearchedProductsText()
    {
        return getTextFromElement(searchedProductsText);
    }
    public void getTextDressProductNames()
    {
        for ( WebElement dressName  : dressProductsNames  )
        {
            System.out.println(dressName.getText());
        }
        System.out.println(dressProductsNames.size());
    }
    public void hoverOverOnOverlayOfFirstProductBlueTop()
    {
        mouseHoverToElement(overlayOfFirstProductBlueTop);
    }

    public void hoverOverFirstProductBlueTop()
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.visibilityOf(firstProductBlueTop));
                                                                                      //Actions a1 = new Actions(driver);
                                                                                    //a1.moveToElement(firstProductBlueTop).build().perform();
        mouseHoverToElement(firstProductBlueTop);
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
    public void mouseHoverToSecondProductMenTShirt()
    {
        mouseHoverToElement(secondProductMenTShirt);
    }
    public void hoverOnOverlayOfSecondProductMenTShirt()
    {
        mouseHoverToElement(overlayOfSecondProductMenTShirt);
    }

    public void clickOnAddToCartOfMenTShirt()
    {
        clickOnElement(addToCartOfMenTShirt);
    }
    public void clickOnViewCartButtonAfterAddingTwoproducts()
    {
        clickOnElement(viewCartButtonAfterAddingTwoproducts);
    }
    public void mouseHoverOnOverlayOfAddingProductToCartSleevelessDress()
    {
        mouseHoverToElement(overlayOfAddingProductToCartSleevelessDress);
    }
    public void clickOnAddingProductToCartSleevelessDress()
    {
        clickOnElement(addingProductToCartSleevelessDress);
    }
    public String getTextFromBrands()
    {
        return getTextFromElement(brands);
    }
    public void allBrandsList()
    {
        for ( WebElement  eachBrand  : brandslist)
        {
            System.out.println(eachBrand.getText());
        }
        System.out.println(brandslist.size());
    }
    public void clickOnPoloBrand()
    {
        Point coordinates = poloBrand.getLocation();
        int x = coordinates.getX();
        int y = coordinates.getY();
        System.out.println("X coordinate of polo :" +x);
        System.out.println("Y coordinate of polo :" +y);
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,"+y+")");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        clickOnElement(poloBrand);
    }
    public void mouseHoverAndClickOnLongMaxiTullieFancyDressUpOutfits()
    {
        mouseHoverToElementAndClick(longMaxiTullieFancyDressUpOutfits);
    }
    public void mouseHoverAndClickOnSleevelessDress()
    {
        mouseHoverToElementAndClick(addingProductToCartSleevelessDress);
    }



}
