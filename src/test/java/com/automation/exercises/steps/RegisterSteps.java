package com.automation.exercises.steps;

import com.automation.exercises.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterSteps {

    @When("I click on {string} button in HomePage")
    public void iClickOnButtonInHomePage(String arg0) {
      new HomePage1().clickOnSignUpOrLoginButton();
    }
    

    @Then("I verify  {string} text  is visible")
    public void iVerifyTextIsVisible(String arg0) {
        new NewUserSignUpOrLoginPage2().verifyNewUserSignUpText();
    }

    @When("I click on {string} button at the top right in the homepage")
    public void iClickOnButtonAtTheTopRightInTheHomepage(String arg0) {
        new HomePage1().clickOnContactUsButton();
    }

    @Then("I verify {string} display message")
    public void iVerifyDisplayMessage(String arg0) {
        new ContactUsPage6().verifyGetInTouchText();
    }

    @And("I enter {string} into name field")
    public void iEnterIntoNameField(String arg0) {
        new ContactUsPage6().enterNameUnderGetInTouch();
    }

    @And("I enter  {string} into email field")
    public void iEnterIntoEmailField(String arg0) {
        new ContactUsPage6().enterEmailUnderGetInTouch();
    }

    @And("I enter {string} into subject field")
    public void iEnterIntoSubjectField(String arg0) {
        new ContactUsPage6().enterSubjectUnderGetInTouch();
    }

    @And("I enter {string} into message field")
    public void iEnterIntoMessageField(String arg0) {
        new ContactUsPage6().enterYourMessageHereTextAreaFieldInGetInTouch();
    }

    @And("I upload {string}")
    public void iUpload(String arg0) {
        new ContactUsPage6().fileUploadInChooseFile();
    }

    @And("I click on {string} button in Contact Us page")
    public void iClickOnButtonInContactUsPage(String arg0) {
        new ContactUsPage6().clickOnSubmitButtonInGetInTouch();
    }

    @And("I click on {string} button after Submitting")
    public void iClickOnButtonAfterSubmitting(String arg0) {
        new ContactUsPage6().acceptAlert();
    }

    @Then("I verify success message {string}")
    public void iVerifySuccessMessage(String arg0) {
       new SuccessForContacting7().verifySuccessMessageForGettingInTouch();
    }

    @Then("I verify landing to homepage successfully")
    public void iVerifyLandingToHomepageSuccessfully() {
        new HomePage1().verifyHomePage();
    }

    @When("I click on {string} button in the  HomePage")
    public void iClickOnButtonInTheHomePage(String arg0) {
       new HomePage1().clickOnTestCasesButtonButton();
    }

    @Then("I can navigate to test cases page successfully")
    public void iCanNavigateToTestCasesPageSuccessfully() {
        new HomePage1().verifyTestCasesPageUrl();
    }

    @And("I can verify {string} page Url for test cases")
    public void iCanVerifyPageUrlForTestCases(String arg0) {
        new HomePage1().verifyTestCasesText();
    }

    @When("I enter {string} into name text field")
    public void iEnterIntoNameTextField(String arg0) {
        new NewUserSignUpOrLoginPage2().enterTheNameTextField();
    }

    @And("I enter {string} into email text field")
    public void iEnterIntoEmailTextField(String arg0) {
        new NewUserSignUpOrLoginPage2().enterTheEmailAddressTextField();
    }

    @And("I click on {string} button in the SigUp page")
    public void iClickOnButtonInTheSigUpPage(String arg0) {
        new NewUserSignUpOrLoginPage2().clickOnSignUpButton();
    }

    @And("I navigate to {string} page for entering details")
    public void iNavigateToPageForEnteringDetails(String arg0) {
        new RegisterPage3().verifyAccountInformationText();
    }

    @Then("I verify {string} top text is visible")
    public void iVerifyTopTextIsVisible(String arg0) {
        new RegisterPage3().verifyAccountInformationText();
    }

    @And("I click on  radio button {string}")
    public void iClickOnRadioButton(String arg0) {
        new RegisterPage3().clickOnTitleMrRadioButton();
    }

    @And("I enter {string} in the name text box")
    public void iEnterInTheNameTextBox(String arg0) {
        new RegisterPage3().enterNameInRegPage();
    }

    @And("I enter {string} in the email text box")
    public void iEnterInTheEmailTextBox(String arg0) {
        new RegisterPage3().enterEmailInRegPage();
    }

    @And("I enter {string}  in the password text box")
    public void iEnterInThePasswordTextBox(String arg0) {
        new RegisterPage3().enterPasswordInRegPage();
    }

    @And("I select {string},{string} and {string} in Date of Birth")
    public void iSelectAndInDateOfBirth(String arg0, String arg1, String arg2) {
        new RegisterPage3().selectDayFromDropDown();
        new RegisterPage3().selecMonthFromDropDown();
        new RegisterPage3().selectYearFromDropDown();
    }

    @And("I select  the checkbox {string} for newsletter")
    public void iSelectTheCheckboxForNewsletter(String arg0) {
        new RegisterPage3().clickOnNewsLetterCheckBox();
    }

    @And("I select the checkbox {string} for offers")
    public void iSelectTheCheckboxForOffers(String arg0) {
        new RegisterPage3().clickOnReceiveSpecialOffersFromOurPartnersCheckBox();
    }

    @And("I enter {string} in the first name text field")
    public void iEnterInTheFirstNameTextField(String arg0) {
        new RegisterPage3().enterFirstNameUnderAddressInformation();
    }

    @And("I enter {string} in the last  name text field")
    public void iEnterInTheLastNameTextField(String arg0) {
        new RegisterPage3().enterLastNameUnderAddressInformation();
    }

    @And("I enter {string} in the Company name text field")
    public void iEnterInTheCompanyNameTextField(String arg0) {
        new RegisterPage3().enterCompanyNameUnderAddressInformation();
    }

    @And("I enter {string} in the address bar")
    public void iEnterInTheAddressBar(String arg0) {
        new RegisterPage3().enterAddress1TextBoxOfCompanyNameUnderAddressInformation();
    }

    @And("I enter {string}in the address{int} bar")
    public void iEnterInTheAddressBar(String arg0, int arg1) {
        new RegisterPage3().enterAddress2TextBoxOfCompanyNameUnderAddressInformation();
    }

    @And("I select {string} in the country text field")
    public void iSelectInTheCountryTextField(String arg0) {
        new RegisterPage3().selectCountryByDrorDown();
    }

    @And("I enter {string}  in the state text field")
    public void iEnterInTheStateTextField(String arg0) {
        new RegisterPage3().enterTheStateNameInTheTextField();
    }

    @And("I enter {string}  in the city text field")
    public void iEnterInTheCityTextField(String arg0) {
        new RegisterPage3().enterTheCityNameInTheTextField();
    }

    @And("I enter {string}  in the zipcode text field")
    public void iEnterInTheZipcodeTextField(String arg0) {
        new RegisterPage3().enterTheZipCodeInTheTextField();
    }

    @And("I enter {string}  in the mobile number  text field")
    public void iEnterInTheMobileNumberTextField(String arg0) {
        new RegisterPage3().enterTheMobileNumberInTheTextField();
    }

    @And("I click on {string} after filling all details")
    public void iClickOnAfterFillingAllDetails(String arg0) {
        new RegisterPage3().clickOnCreateAccountButton();
    }

    @Then("I should navigate to {string} page  with Account Creation")
    public void iShouldNavigateToPageWithAccountCreation(String arg0) {
       new AccountCreatedPage4().verifyAccountCreated();
       new AccountCreatedPage4().verifyAccountCreatedUrl();
    }

    @And("I verify  {string} is visible")
    public void iVerifyIsVisible(String arg0) {
        new AccountCreatedPage4().verifyAccountCreated();
    }

    @Given("I am on Account created page")
    public void iAmOnAccountCreatedPage() {
        new AccountCreatedPage4().verifyAccountCreatedUrl();
    }

    @When("I click on {string} button in account created page")
    public void iClickOnButtonInAccountCreatedPage(String arg0) throws InterruptedException {
        new AccountCreatedPage4().clickOnContinueButton();
    }

    @Then("I verify {string} at the top right is visible")
    public void iVerifyAtTheTopRightIsVisible(String arg0) {
        new AccountCreatedPage4().verifyLoggedInAsUserName();
    }

    @When("I click on  {string} button for deletion")
    public void iClickOnButtonForDeletion(String arg0) {
        new HomePage1().clickOnDeleteAccountButtonLink();
    }

    @Then("I verify that {string} is visible for successful deletion")
    public void iVerifyThatIsVisibleForSuccessfulDeletion(String arg0) {
        new AccountDeletionPage5().verifyAccountDeletedText();
    }

    @And("I click on {string} button after deleting the account")
    public void iClickOnButtonAfterDeletingTheAccount(String arg0) {
        new AccountDeletionPage5().clickOnContinueButtonInAccountDeletedPage();
    }

    @When("I enter {string} into the text bar of name field")
    public void iEnterIntoTheTextBarOfNameField(String arg0) {
        new NewUserSignUpOrLoginPage2().enterTheNameAlreadyRegistered();
    }

    @And("I enter already registered {string}")
    public void iEnterAlreadyRegistered(String arg0) {
        new NewUserSignUpOrLoginPage2().enterTheEmailAddressAlreadyRegistered();
    }

    @And("I click on {string} button after entering name and incorrect email")
    public void iClickOnButtonAfterEnteringNameAndIncorrectEmail(String arg0) {
        new NewUserSignUpOrLoginPage2().clickOnSignUpButton();
    }

    @Then("I should be able to see error message {string}")
    public void iShouldBeAbleToSeeErrorMessage(String arg0) {
        new NewUserSignUpOrLoginPage2().verifyEmailAddressAlreadyExistText();
    }

    @And("I navigate to {string} page for signing in")
    public void iNavigateToPageForSigningIn(String arg0) {
        new NewUserSignUpOrLoginPage2().verifyNewUserSignUpText();
    }

    @Given("I am on {string} page after clicking the SignUp button")
    public void iAmOnPageAfterClickingTheSignUpButton(String arg0) {

    }

    @Given("I am on {string} page trying with existing email")
    public void iAmOnPageTryingWithExistingEmail(String arg0) {

    }
}
