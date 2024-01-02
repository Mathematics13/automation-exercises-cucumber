package com.automation.exercises.pages;

import com.automation.exercises.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class CategoryProductsPage13 extends Utility {
    private static final Logger log = LogManager.getLogger(CategoryProductsPage13.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Women - Dress Products']")
    WebElement womenDressProductsDisplayText;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Men']")
    WebElement menCategory;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Jeans']")
    WebElement jeansUnderMenCategory;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Men - Jeans Products']")
    WebElement menJeanProductsDisplayText;

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Brand -')]")
    WebElement brandPoloProductsDisplayText;

    @CacheLookup
    @FindBy(xpath = "//a[@href='/brand_products/H&M']")
    WebElement brandHM;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Brand - H&M Products']")
    WebElement brandHMProductsDisplayText;


    public String getTextFromWomenDressProductsDisplayText()
    {
        return getTextFromElement(womenDressProductsDisplayText);
    }
    public void clickOnMenCategory()
    {
        clickOnElement(menCategory);
    }
    public void clickOnJeansUnderMenCategory()
    {
        clickOnElement(jeansUnderMenCategory);
    }
    public String getTextFromMenJeanProductsDisplayText()
    {
        return getTextFromElement(menJeanProductsDisplayText);
    }
    public String getTextFromBrandPoloProductsDisplayText()
    {
        return getTextFromElement(brandPoloProductsDisplayText);
    }
    public void clickOnBrandHM()
    {
        clickOnElement(brandHM);
    }
    public String getTextFromBrandHMProductsDisplay()
    {
        return getTextFromElement(brandHMProductsDisplayText);
    }


}
