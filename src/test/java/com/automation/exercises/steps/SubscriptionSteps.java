package com.automation.exercises.steps;

import com.automation.exercises.pages.CartPage10;
import com.automation.exercises.pages.HomePage1;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class SubscriptionSteps {
    @When("I scroll down to {string} footer")
    public void iScrollDownToFooter(String arg0) throws InterruptedException {
        new HomePage1().scrollDownToSubscriptionFooter();
    }

    @Then("I verify {string} text at the footer")
    public void iVerifyTextAtTheFooter(String arg0) {
        Assert.assertEquals(new HomePage1().getTextFromSubscription(),"SUBSCRIPTION","Subscription Message");
    }

    @When("I enter {string} in the email textfield")
    public void iEnterInTheEmailTextfield(String arg0) {
         new HomePage1().enterEmailAddressUnderSubscription();
    }

    @And("I click on {string} button in subscription")
    public void iClickOnButtonInSubscription(String arg0) {
            new HomePage1().clickOnArrowButtonInSubscription();
    }

    @Then("I verify success message {string} in subscription")
    public void iVerifySuccessMessageInSubscription(String arg0) {
        Assert.assertEquals(new HomePage1().getTextFromSubscriptionSuccessMessage(),"You have been successfully subscribed!","Success Message");
    }

    @When("I click on {string} Cart button")
    public void iClickOnCartButton(String arg0) {
        new HomePage1().clickOnCartTopMenuTab();
    }

    @And("I scroll down to footer")
    public void iScrollDownToFooter() throws InterruptedException {
        new CartPage10().scrollDownToFooterSubscriptionInCart();
    }

    @Then("I verify text {string} SUBSCRIPTION")
    public void iVerifyTextSUBSCRIPTION(String arg0) {
          Assert.assertEquals(new CartPage10().getTextFromSubscriptionOfCartPage(),"SUBSCRIPTION");
    }

    @When("I enter {string} in email address field in cart page")
    public void iEnterInEmailAddressFieldInCartPage(String text) {
          new CartPage10().enterEmailAddressInSubscriptionOfCartPage(text);
    }

    @And("I click on arrow button")
    public void iClickOnArrowButton() {
         new CartPage10().clickOnArrowSubscriptionCartPage();
    }

    @Then("I verify {string} success message of Subscription under cart visible")
    public void iVerifySuccessMessageOfSubscriptionUnderCartVisible(String arg0) {
        Assert.assertEquals(new CartPage10().getSubscriptonSuccessMessageInCart(),"You have been successfully subscribed!");
    }

    @When("I click on arrow at bottom right side to move upward scroll up")
    public void iClickOnArrowAtBottomRightSideToMoveUpwardScrollUp() throws InterruptedException {
            new HomePage1().clickOnUpArrowButtonToScrollUp();
    }

    @Then("I verify {string} text is visible on screen")
    public void iVerifyTextIsVisibleOnScreen(String arg0) {
        Assert.assertEquals(new HomePage1().getTextFromFullFledgedPracticeWebsite(),"Full-Fledged practice website for Automation Engineers");
    }

    @When("I {string} scroll up page to top")
    public void iScrollUpPageToTop(String arg0) throws InterruptedException {
        new HomePage1().scrollUpToFullFledgedPracticeWebsite();
    }
}
