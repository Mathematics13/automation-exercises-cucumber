package com.automation.exercises.steps;

import com.automation.exercises.pages.AccountCreatedPage4;
import com.automation.exercises.pages.HomePage1;
import com.automation.exercises.pages.NewUserSignUpOrLoginPage2;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginSteps {

    @Given("I am on homepage")
    public void iAmOnHomepage()
    {
    }

    @Then("I verify homepage Url")
    public void iVerifyHomepageUrl() {
        new HomePage1().verifyHomePage();
    }

    @When("I click on {string} on top right")
    public void iClickOnOnTopRight(String arg0) {
        new HomePage1().clickOnSignUpOrLoginButton();
    }


    @And("I click on {string} button")
    public void iClickOnButton(String arg0) {
        new NewUserSignUpOrLoginPage2().clickOnLoginButtonInLoginToYourAccount();
    }

    @Then("I should be able to see the {string}")
    public void iShouldBeAbleToSeeThe(String arg0) {
     Assert.assertEquals(new NewUserSignUpOrLoginPage2().verifyEmailOrPasswordIncorrectText(),"Your email or password is incorrect!","Error Message");
    }

    @When("I click on {string} button to logOut")
    public void iClickOnButtonToLogOut(String arg0) {
        new AccountCreatedPage4().clickOnlogOutButton();
    }

    @Then("I should be able to navigate back to {string}")
    public void iShouldBeAbleToNavigateBackTo(String arg0) {

    }

    @When("I enter {string} in the email address text field")
    public void iEnterInTheEmailAddressTextField(String arg0) {
        new NewUserSignUpOrLoginPage2().enterCorrectEmailAddressInLoginToYourAccount();
    }

    @And("I enter {string} in the password text field")
    public void iEnterInThePasswordTextField(String arg0) {
        new NewUserSignUpOrLoginPage2().enterCorrectPasswordInLoginToYourAccount();
    }


    @Then("I verify {string} login text")
    public void iVerifyLoginText(String expectedMessage) {
        Assert.assertEquals(new NewUserSignUpOrLoginPage2().getTextFromLoginPage(),expectedMessage,"Message");
    }

    @And("I  can verify {string} Url")
    public void iCanVerifyUrl(String arg0) {
        new NewUserSignUpOrLoginPage2().getTextFromLoginPage();
    }

    @When("I enter {string} incorrect  in the email address text field")
    public void iEnterIncorrectInTheEmailAddressTextField(String arg0) {
        new NewUserSignUpOrLoginPage2().enterInCorrectEmailAddressInLoginToYourAccount();
    }

    @And("I enter {string} incorrect in the password text field")
    public void iEnterIncorrectInThePasswordTextField(String arg0) {
        new NewUserSignUpOrLoginPage2().enterInCorrectPasswordInLoginToYourAccount();
    }

    @Then("I verify {string} logged in as username is visible")
    public void iVerifyLoggedInAsUsernameIsVisible(String arg0) {
        Assert.assertEquals(new AccountCreatedPage4().verifyLoggedInAsUserName(),"Logged in as final123","Logged in as username message");
    }
}

