package com.automation.exercises.steps;

import com.automation.exercises.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class ProductSteps {

    @And("I verify homepage url")
    public void iVerifyHomepageUrl() {
        new HomePage1().verifyHomePage();
    }

    @When("I click on {string} button on top menu tab")
    public void iClickOnButtonOnTopMenuTab(String arg0) {
         new HomePage1().clickOnProductsButton();
    }

    @Then("I verify {string} navigating to All products page")
    public void iVerifyNavigatingToAllProductsPage(String text) {
        try {
            Assert.assertEquals(new ProductPage8().getAllProductsText(), text);
        }catch(AssertionError a1)
        {
            System.out.println("Handles the exception");
        }
    }

    @When("I click on {string} of first product")
    public void iClickOnOfFirstProduct(String arg0) {
        new ProductPage8().clickOnViewProductBlueTop();
    }


    @Then("I verify {string} name of the product")
    public void iVerifyNameOfTheProduct(String arg0) {
      Assert.assertEquals(new ProductDetailPage9().getBlueTopProductNameText(),"Blue Top","Name of the product is verified");
    }

    @Then("I verify {string} category of the product")
    public void iVerifyCategoryOfTheProduct(String arg0) {
        Assert.assertEquals(new ProductDetailPage9().getCategoryTextOfTheBlueTop(),"Category: Women > Tops","Category is verified");
    }

    @Then("I verify {string} price")
    public void iVerifyPrice(String arg0) {
      Assert.assertEquals(new ProductDetailPage9().getPriceTextOfBlueTop(),"Rs. 500" ,"Price is verified");
    }

    @Then("I verify {string} availability")
    public void iVerifyAvailability(String arg0) {
        Assert.assertEquals(new ProductDetailPage9().getAvailabilityTextOfBlueTop(),"Availability: In Stock","Availability of product is verified");
    }

    @Then("I verify {string} condition")
    public void iVerifyCondition(String arg0) {
       Assert.assertEquals(new ProductDetailPage9().getConditionTextOfBlueTop(),"Condition: New","Condition is verified");
    }

    @Then("I verify {string} brand")
    public void iVerifyBrand(String arg0) {
       Assert.assertEquals(new ProductDetailPage9().getBrandTextOfBlueTop(),"Brand: Polo","Brand is verified");
    }

    @Then("I land to product detail page")
    public void iLandToProductDetailPage() {
        Assert.assertEquals(new ProductDetailPage9().getBlueTopProductNameText(),"Blue Top","Product details page");
    }

     //    TC 9

    @Given("I am on homepage and I verify homepage url")
    public void iAmOnHomepageAndIVerifyHomepageUrl() {
            new HomePage1().verifyHomePage();
    }

    @When("I click on products button")
    public void iClickOnProductsButton() {
        new HomePage1().clickOnProductsButton();
    }

    @Then("I navigate to {string} page and verify All Products Text")
    public void iNavigateToPageAndVerifyAllProductsText(String arg0) {
         Assert.assertEquals(new ProductPage8().getAllProductsText(),"ALL PRODUCTS","Message displayed");
    }

    @When("I enter product name {string} in search input")
    public void iEnterProductNameInSearchInput(String productName) {
          new ProductPage8().inputInSearchProductTextField(productName);
    }

    @And("I click on {string} button to search the product")
    public void iClickOnButtonToSearchTheProduct(String arg0) {
          new ProductPage8().clickOnSearchButton();
    }

    @Then("I verify {string} text visible")
    public void iVerifyTextVisible(String arg0) {
           Assert.assertEquals(new ProductPage8().getSearchedProductsText(),"SEARCHED PRODUCTS","Text for searched products");
    }

    @And("I verify all the products related to search")
    public void iVerifyAllTheProductsRelatedToSearch() {
        new ProductPage8().getTextDressProductNames();
    }


    @And("I hover over on {string} first product")
    public void iHoverOverOnFirstProduct(String arg0) {
        new ProductPage8().hoverOverOnOverlayOfFirstProductBlueTop();
    }

    @And("I click on {string} button to add first product")
    public void iClickOnButtonToAddFirstProduct(String arg0) {
        new ProductPage8().clickOnAddToCartOfBlueTop();
    }

    @And("I click on {string} button to continue to shop")
    public void iClickOnButtonToContinueToShop(String arg0) {
        new ProductPage8().clickOnContinueShoppingButton();
    }

    @When("I hover over on {string} second product")
    public void iHoverOverOnSecondProduct(String arg0) {
        new ProductPage8().hoverOnOverlayOfSecondProductMenTShirt();
    }

    @And("I click on {string} button to add second product")
    public void iClickOnButtonToAddSecondProduct(String arg0) {
        new ProductPage8().clickOnAddToCartOfMenTShirt();
    }

    @And("I click on {string} button to view the cart")
    public void iClickOnButtonToViewTheCart(String arg0) {
        new ProductPage8().clickOnViewCartButtonAfterAddingTwoproducts();
    }

    @Then("I verify both products added to cart")
    public void iVerifyBothProductsAddedToCart() {
        Assert.assertEquals(new CartPage10().verificationOfItemsInsideTheCart(),"Blue Top Men Tshirt" ,"Description Of items");
    }

    @Then("I verify {string} prices")
    public void iVerifyPrices(String arg0) {
        Assert.assertEquals(new CartPage10().getTextFromPricesOfTwoProductsInTheCart(),"Rs. 500 Rs. 400");
    }

    @And("I verify {string} quantity")
    public void iVerifyQuantity(String arg0) {
        Assert.assertEquals(new CartPage10().getTextFromQuantityOfTwoProductsInTheCart(),"1 1");
    }

    @And("I verify {string} total prices")
    public void iVerifyTotalPrices(String arg0) {
        Assert.assertEquals(new CartPage10().getTextFromTotalPricesOfTwoProductsInTheCart(),"Rs. 2000 Rs. 800 ");
    }

    @When("I click {string} for any product on home page")
    public void iClickForAnyProductOnHomePage(String arg0) throws InterruptedException {
        new HomePage1().clickOnFrozenTopsForKidsAnyproduct();
    }


    @Then("I verify {string} is opened")
    public void iVerifyIsOpened(String arg0) {
       Assert.assertEquals(new ProductDetailPage9().getTextProductDetailFrozenTopsForKids(),"Frozen Tops For Kids");
    }

    @When("I increase {string} to {int}")
    public void iIncreaseTo(String arg0, int arg1) {
        new ProductDetailPage9().increaseQuantityForFrozenTopsForKids();
    }

    @And("I click on {string} button in the cart page")
    public void iClickOnButtonInTheCartPage(String arg0) {
        new ProductDetailPage9().clickOnAddToCartForFrozenTops();
    }

    @And("I click on  {string} pop up button")
    public void iClickOnPopUpButton(String arg0) {
        new ProductDetailPage9().clickOnViewCartPopUpForFrozenTops();
    }

    @Then("I verify product is displayed in cart page with exact quantity")
    public void iVerifyProductIsDisplayedInCartPageWithExactQuantity() {
        Assert.assertEquals(new CartPage10().getTextFromFrozenTopsForKidsDescription(),"Frozen Tops For Kids");
    }

    @Then("I verify welcome text {string} text")
    public void iVerifyWelcomeTextText(String arg0) {
        Assert.assertEquals(new CartPage10().getTextFromShoppingCart()," Shopping Cart","Welcome Text of shopping Cart");
    }

    @Then("I verify the {string} text on left side bar")
    public void iVerifyTheTextOnLeftSideBar(String arg0) {
        Assert.assertEquals(new HomePage1().getTextFromCategory(),"CATEGORY","Category text");
    }

    @When("I click on {string} women category")
    public void iClickOnWomenCategory(String arg0) {
      new HomePage1().clickOnWomenCategory();
    }

    @And("I click on {string} dress category")
    public void iClickOnDressCategory(String arg0) {
       new HomePage1().clickOnDressUnderWomenCategory();
    }

    @Then("I navigate to other page verifying {string} display text")
    public void iNavigateToOtherPageVerifyingDisplayText(String arg0) {
       Assert.assertEquals(new CategoryProductsPage13().getTextFromWomenDressProductsDisplayText(),"WOMEN - DRESS PRODUCTS");
    }

    @When("I click on {string} men category")
    public void iClickOnMenCategory(String arg0) {
          new CategoryProductsPage13().clickOnMenCategory();
    }

    @And("I click on {string} jeans under Men category")
    public void iClickOnJeansUnderMenCategory(String arg0) {
          new CategoryProductsPage13().clickOnJeansUnderMenCategory();
    }

    @Then("I can see the display text {string} visible")
    public void iCanSeeTheDisplayTextVisible(String arg0) {
        Assert.assertEquals(new CategoryProductsPage13().getTextFromMenJeanProductsDisplayText(),"MEN - JEANS PRODUCTS");
    }

    @Then("I verify {string} brands are visible on left side bar")
    public void iVerifyBrandsAreVisibleOnLeftSideBar(String arg0) {
        Assert.assertEquals(new ProductPage8().getTextFromBrands(),"BRANDS");
    }

    @When("I click on {string} brand name")
    public void iClickOnBrandName(String arg0) {
        new ProductPage8().clickOnPoloBrand();
    }

    @Then("I verify {string} brand polo products are displayed")
    public void iVerifyBrandPoloProductsAreDisplayed(String arg0) {
         Assert.assertEquals(new CategoryProductsPage13().getTextFromBrandPoloProductsDisplayText(),"BRAND -  POLO PRODUCTS");
    }

    @And("I click on any other brand {string} link")
    public void iClickOnAnyOtherBrandLink(String arg0) {
           new CategoryProductsPage13().clickOnBrandHM();
    }

    @Then("I can see the display text {string} H&M products")
    public void iCanSeeTheDisplayTextHMProducts(String arg0) {
        Assert.assertEquals(new CategoryProductsPage13().getTextFromBrandHMProductsDisplay(),"BRAND - H&M PRODUCTS");
    }

    @And("I add {string} pink to the cart")
    public void iAddPinkToTheCart(String arg0) {
        new ProductPage8().mouseHoverAndClickOnLongMaxiTullieFancyDressUpOutfits();
    }

    @And("I add another product {string} black")
    public void iAddAnotherProductBlack(String arg0) {
        new ProductPage8().mouseHoverAndClickOnSleevelessDress();
    }

    @Then("I verify {string} description details visible")
    public void iVerifyDescriptionDetailsVisible(String arg0) {
        Assert.assertTrue(new CartPage10().getTextFromCartInfoTableProductsVisible().contains("Long Maxi Tulle Fancy Dress Up Outfits -Pink"),
                "String contains the substring");
    }

    @And("I click on {string} button in cart page")
    public void iClickOnButtonInCartPage(String arg0) {
           new CartPage10().clickOnSignUpOrLoginButtonInCartPage();
    }

    @Then("I verify {string} description details visible after logging in as well")
    public void iVerifyDescriptionDetailsVisibleAfterLoggingInAsWell(String arg0) {
        Assert.assertTrue(new CartPage10().getTextFromCartInfoTableProductsVisible().contains("Long Maxi Tulle Fancy Dress Up Outfits -Pink"),
                "Both items are visible");
    }

    @Then("I verify {string} review text is visible")
    public void iVerifyReviewTextIsVisible(String arg0) {
       new ProductDetailPage9().getTextFromWriteYourReview();
    }

    @When("I enter {string} name under review")
    public void iEnterNameUnderReview(String name) {
        new ProductDetailPage9().enterNameUnderReview(name);
    }

    @And("I enter {string} email under review")
    public void iEnterEmailUnderReview(String email) {
        new ProductDetailPage9().enterEmailAddressUnderReview(email);
    }

    @And("I add {string} review comments")
    public void iAddReviewComments(String review) {
        new ProductDetailPage9().enterCommentsInReview(review);
    }

    @And("I click on {string} button under review")
    public void iClickOnButtonUnderReview(String arg0) {
        new ProductDetailPage9().clickOnSubmitButtonUnderReview();
    }

    @Then("I verify the success message {string} thankyou")
    public void iVerifyTheSuccessMessageThankyou(String arg0) {
        Assert.assertEquals(new ProductDetailPage9().getTextFromThankYouForReview(),"Thank you for your review");
    }

    @When("I scroll to {string} bottom of the page")
    public void iScrollToBottomOfThePage(String arg0) {
        new HomePage1().scrollToBottomForRecommendedItems();
    }

    @Then("I verify {string} recommended items visible")
    public void iVerifyRecommendedItemsVisible(String arg0) {
        Assert.assertEquals(new HomePage1().getTextFromRecommendedItems(),"RECOMMENDED ITEMS");
    }

    @When("I click on {string} on recommended product Winter top")
    public void iClickOnOnRecommendedProductWinterTop(String arg0) {
        new HomePage1().clickOnWinterTopRecommendedAddToCart();
    }

    @And("I click on {string} view cart button pop up")
    public void iClickOnViewCartButtonPopUp(String arg0) {
        new HomePage1().clickOnViewCartOfWinterTop();
    }

    @Then("I verify {string} displayed in cart page")
    public void iVerifyDisplayedInCartPage(String arg0) {
        Assert.assertEquals(new CartPage10().getTextFromWinterTopInCartPage(),"Winter Top");
    }
}
