package com.automation.exercises.steps;

import com.automation.exercises.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class CheckOutSteps {
    @And("I hover over first product Blue Top")
    public void iHoverOverFirstProductBlueTop() {
        new ProductPage8().hoverOverFirstProductBlueTop();
    }

    @When("I add first product {string} to the cart")
    public void iAddFirstProductToTheCart(String arg0) {
        new HomePage1().clickOnAddToCartOfBlueTop();
    }

    @And("I click on {string} to view items added in the cart")
    public void iClickOnToViewItemsAddedInTheCart(String arg0) {
        new HomePage1().clickOnViewCartAfterAdding();
    }

    @Then("I verify {string} displayed with descriptions")
    public void iVerifyDisplayedWithDescriptions(String arg0) {
           new CartPage10().verificationOfItemsInsideTheCart();
           new CartPage10().getTextFromPricesOfTwoProductsInTheCart();
           new CartPage10().getTextFromQuantityOfTwoProductsInTheCart();
           new CartPage10().getTextFromTotalPricesOfTwoProductsInTheCart();
    }

    @When("I click on {string} to checkout")
    public void iClickOnToCheckout(String arg0) {
        new CartPage10().clickOnProceedToCheckOutButton();
    }

    @And("I click on {string} button in proceed to checkout")
    public void iClickOnButtonInProceedToCheckout(String arg0) {
        new CartPage10().clickOnRegisterOrLoginInProceedToCheckOut();
    }

    @Then("I verify  {string} new user sign up text  is visible")
    public void iVerifyNewUserSignUpTextIsVisible(String arg0) {
        Assert.assertEquals(new NewUserSignUpOrLoginPage2().verifyNewUserSignUpText(),"New User Signup!");
    }

    @When("I enter {string} name into name text field")
    public void iEnterNameIntoNameTextField(String arg0) {
        new NewUserSignUpOrLoginPage2().enterTheNameTextField();
    }

    @And("I enter {string} email into email text field")
    public void iEnterEmailIntoEmailTextField(String arg0) {
        new NewUserSignUpOrLoginPage2().enterTheEmailAddressTextField();
    }

    @And("I click on {string} signup button in the SigUp page")
    public void iClickOnSignupButtonInTheSigUpPage(String arg0) {
        new NewUserSignUpOrLoginPage2().clickOnSignUpButton();
    }

    @Then("I verify {string} enter account information top text is visible")
    public void iVerifyEnterAccountInformationTopTextIsVisible(String arg0) {
        new RegisterPage3().verifyAccountInformationText();
    }

    @And("I click on  radio button {string} to select MR")
    public void iClickOnRadioButtonToSelectMR(String arg0) {
        new RegisterPage3().clickOnTitleMrRadioButton();
    }

    @And("I enter {string}  password in the password text box")
    public void iEnterPasswordInThePasswordTextBox(String arg0) {
        new RegisterPage3().enterPasswordInRegPage();
    }

    @And("I select {string},{string} and {string} in day ,month and year Date of Birth")
    public void iSelectAndInDayMonthAndYearDateOfBirth(String arg0, String arg1, String arg2) {
        new RegisterPage3().selectDayFromDropDown();
        new RegisterPage3().selecMonthFromDropDown();
        new RegisterPage3().selectYearFromDropDown();
    }

    @And("I select  the checkbox {string} to tick for newsletter")
    public void iSelectTheCheckboxToTickForNewsletter(String arg0) {
        new RegisterPage3().clickOnNewsLetterCheckBox();
    }

    @And("I select the checkbox {string} to avail for offers")
    public void iSelectTheCheckboxToAvailForOffers(String arg0) {
        new RegisterPage3().clickOnReceiveSpecialOffersFromOurPartnersCheckBox();
    }

    @And("I enter {string} name in the first name text field")
    public void iEnterNameInTheFirstNameTextField(String arg0) {
        new RegisterPage3().enterFirstNameUnderAddressInformation();
    }

    @And("I enter {string} name in the last  name text field")
    public void iEnterNameInTheLastNameTextField(String arg0) {
        new RegisterPage3().enterLastNameUnderAddressInformation();
    }

    @And("I enter {string}  TCS in the Company name text field")
    public void iEnterTCSInTheCompanyNameTextField(String arg0) {
        new RegisterPage3().enterCompanyNameUnderAddressInformation();
    }

    @And("I enter {string} address in the address bar")
    public void iEnterAddressInTheAddressBar(String arg0) {
        new RegisterPage3().enterAddress1TextBoxOfCompanyNameUnderAddressInformation();
    }

    @And("I enter {string} address{int} in the address{int} bar")
    public void iEnterAddressInTheAddressBar(String arg0, int arg1, int arg2) {
        new RegisterPage3().enterAddress2TextBoxOfCompanyNameUnderAddressInformation();
    }

    @And("I select {string} India in the country text field")
    public void iSelectIndiaInTheCountryTextField(String arg0) {
        new RegisterPage3().selectCountryByDrorDown();
    }

    @And("I enter {string} state in the state text field")
    public void iEnterStateInTheStateTextField(String arg0) {
        new RegisterPage3().enterTheStateNameInTheTextField();
    }

    @And("I enter {string} chennai in the city text field")
    public void iEnterChennaiInTheCityTextField(String arg0) {
        new RegisterPage3().enterTheCityNameInTheTextField();
    }

    @And("I enter {string} code in the zipcode text field")
    public void iEnterCodeInTheZipcodeTextField(String arg0) {
        new RegisterPage3().enterTheZipCodeInTheTextField();
    }

    @And("I enter {string}  mobile number in the mobile number  text field")
    public void iEnterMobileNumberInTheMobileNumberTextField(String arg0) {
        new RegisterPage3().enterTheMobileNumberInTheTextField();
    }

    @And("I click on {string} to create after filling all details")
    public void iClickOnToCreateAfterFillingAllDetails(String arg0) {
        new RegisterPage3().clickOnCreateAccountButton();
    }

    @Then("I verify  {string} verifying account creation is visible")
    public void iVerifyVerifyingAccountCreationIsVisible(String arg0) {
        Assert.assertEquals(new AccountCreatedPage4().verifyAccountCreated(),"ACCOUNT CREATED!");
    }

    @When("I click on {string} button of account creation in account created page")
    public void iClickOnButtonOfAccountCreationInAccountCreatedPage(String arg0) throws InterruptedException {
        new AccountCreatedPage4().clickOnContinueButton();
    }

    @Then("I verify {string} at the top right corner is visible")
    public void iVerifyAtTheTopRightCornerIsVisible(String arg0) {
        Assert.assertEquals(new AccountCreatedPage4().verifyLoggedInAsUserName(),"Logged in as mathrobot");
    }

    @And("I click on {string} cart button in the homepage")
    public void iClickOnCartButtonInTheHomepage(String arg0) {
        new HomePage1().clickOnCartTopMenuTab();
    }

    @Then("I verify {string} address")
    public void iVerifyAddress(String arg0) {
        Assert.assertEquals(new CheckOutPage11().getTextFromAddressDetails(),"Address Details");
    }

    @Then("I verify {string} review order")
    public void iVerifyReviewOrder(String arg0) {
        Assert.assertEquals(new CheckOutPage11().getTextFromReviewYourOrder(),"Review Your Order");
    }

    @And("I enter description {string} in comment text area")
    public void iEnterDescriptionInCommentTextArea(String arg0) {
        new CheckOutPage11().enterDescriptionInCommentTextArea();
    }

    @And("I click on {string} to place the order")
    public void iClickOnToPlaceTheOrder(String arg0) {
        new CheckOutPage11().clickOnPlaceOrder();
    }

    @When("I enter payment details {string} name")
    public void iEnterPaymentDetailsName(String arg0) {
        new PaymentPage12().enterNameOnCard();
    }

    @And("I enter {string} card number")
    public void iEnterCardNumber(String arg0) {
        new PaymentPage12().enterCardNumber();
    }

    @And("I enter {string} cvc number")
    public void iEnterCvcNumber(String arg0) {
        new PaymentPage12().enterCvcNumber();
    }

    @And("I enter {string} expiry date")
    public void iEnterExpiryDate(String monthExpiry) {
        new PaymentPage12().enterMonth(monthExpiry);
        new PaymentPage12().enterYear();
    }

    @And("I click on {string} to pay and confirm button")
    public void iClickOnToPayAndConfirmButton(String arg0) {
        new PaymentPage12().clickOnPayAndConfirmOrder();
    }

    @Then("I verify success message {string} Congratulations! Your order has been confirmed!")
    public void iVerifySuccessMessageCongratulationsYourOrderHasBeenConfirmed(String arg0) {
        Assert.assertEquals(new HomePage1().getTextFromCongratulationsOrderPlacedText(),"Congratulations! Your order has been confirmed!" );
    }

    @When("I click on  {string} button in the home page for deletion")
    public void iClickOnButtonInTheHomePageForDeletion(String arg0) {
        new HomePage1().clickOnDeleteAccountButtonLink();
    }

    @Then("I verify that {string} is visible for deletion")
    public void iVerifyThatIsVisibleForDeletion(String arg0) {
        Assert.assertEquals(new AccountDeletionPage5().verifyAccountDeletedText(),"ACCOUNT DELETED!","Account Deleted Message");
    }

    @And("I click on {string} button after successful  deletion")
    public void iClickOnButtonAfterSuccessfulDeletion(String arg0) {
        new AccountDeletionPage5().clickOnContinueButtonInAccountDeletedPage();
    }


    @And("I hover over on {string} sleeveless dress")
    public void iHoverOverOnSleevelessDress(String arg0) {
        new ProductPage8().mouseHoverOnOverlayOfAddingProductToCartSleevelessDress();

    }

    @And("I click on {string} add to cart button of sleeveless dress")
    public void iClickOnAddToCartButtonOfSleevelessDress(String arg0) {
        new ProductPage8().clickOnAddingProductToCartSleevelessDress();
    }

    @And("I click on {string} button window pop up")
    public void iClickOnButtonWindowPopUp(String arg0) {
        new ProductPage8().clickOnViewCartButtonAfterAddingTwoproducts();
    }

    @Then("I verify {string} welcome text")
    public void iVerifyWelcomeText(String arg0) {
        new CartPage10().getTextFromShoppingCart();
    }

    @When("I click on {string} cross button corresponding to particular product to delete")
    public void iClickOnCrossButtonCorrespondingToParticularProductToDelete(String arg0) {
        new CartPage10().clickOnCrossButtonOfAParticularProduct();
    }

    @Then("I should be able to see the text {string} cart empty  message")
    public void iShouldBeAbleToSeeTheTextCartEmptyMessage(String arg0) {
        new CartPage10().getTextFromCartIsEmpty();
    }

    @And("I add {string} madame top to the cart")
    public void iAddMadameTopToTheCart(String arg0) {
        new HomePage1().mouseHoverOnMadameTopForWomenAddToCart();
    }

    @And("I click on {string} button to view the product added")
    public void iClickOnButtonToViewTheProductAdded(String arg0) {
           new HomePage1().clickOnViewCartAfterAdding();
    }

    @Then("I verify {string} displayed in cart is visible")
    public void iVerifyDisplayedInCartIsVisible(String arg0) {
        Assert.assertEquals(new CartPage10().getTextFromMadameTopForWomen(), "Madame Top For Women");
    }

    @Then("I verify {string} delivery address")
    public void iVerifyDeliveryAddress(String arg0) {
         Assert.assertEquals(new CheckOutPage11().getTextFromYourDeliveryAddress(),
                 "Mrs. Malar Kodi CTS 28,Guntur Tirupati Street Tirupati Andhra Pradesh  620009 India 9199765 32451" );
    }

    @Then("I verify {string} billing address")
    public void iVerifyBillingAddress(String arg0) {
        Assert.assertEquals(new CheckOutPage11().getTextFromYourBillingAddress(),
                "Mrs. Malar Kodi CTS 28,Guntur Tirupati Street Tirupati Andhra Pradesh  620009 India 9199765 32451");
    }

    @When("I enter new name {string} into name text field")
    public void iEnterNewNameIntoNameTextField(String myName) {
        new NewUserSignUpOrLoginPage2().enterNewNameToSignUp(myName);

    }

    @And("I enter new email {string} into email text field")
    public void iEnterNewEmailIntoEmailTextField(String myEmail) {
        new NewUserSignUpOrLoginPage2().enterNewEmailToSignUp(myEmail);
    }

    @When("I click on {string} button to download")
    public void iClickOnButtonToDownload(String arg0) {
          new InvoicePage14().clickOnDownloadInvoice();
    }

    @And("I click on {string} button to continue after invoice downloading")
    public void iClickOnButtonToContinueAfterInvoiceDownloading(String arg0) {
        new InvoicePage14().clickOnContinueAfterDownloadingInvoice();
    }
}
