package com.automation.exercises.pages;

import com.automation.exercises.propertyreader.PropertyReader;
import com.automation.exercises.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewUserSignUpOrLoginPage2 extends Utility
{
    private static final Logger log = LogManager.getLogger(NewUserSignUpOrLoginPage2.class.getName());

    //Scenario 1
    @CacheLookup
    @FindBy(xpath="//h2[normalize-space()='New User Signup!']")
    WebElement newUserSignUpText;

    //Scenario 1
    @CacheLookup
    @FindBy(xpath="//input[@placeholder='Name']")                                       //input[@type='text']
    WebElement name;

    //Scenario 1
    @CacheLookup
    @FindBy(xpath="(//input[@type='email'])[2]")
    WebElement emailAddressForSignUp;

    //Scenario 1
    @CacheLookup
    @FindBy(xpath="(//button[@type='submit'])[2]")
    WebElement signUpButton;

    //Scenario 2,4
    @CacheLookup
    @FindBy(xpath="//input[@data-qa='login-email']")
    WebElement emailAddressInLoginToYourAccount;

    //Scenario 2,4
    @CacheLookup
    @FindBy(xpath="//input[@name='password']")
    WebElement passwordInLoginToYourAccount;

    //Scenario 2,3,4
    @CacheLookup
    @FindBy(xpath="//h2[contains(text(),'Login to your account')]")
    WebElement loginToYourAccountText;


    //Scenario 2,3,4
    @CacheLookup
    @FindBy(xpath="//button[contains(text(),'Login')]")
    WebElement loginButtonInLoginToYourAccount;

    //Scenario 3
    @CacheLookup
    @FindBy(xpath="//p[contains(text(),'Your email or password is incorrect!')]")
    WebElement emailOrPasswordIncorrectText;

    //Scenario 5
    @CacheLookup
    @FindBy(xpath="//p[contains(text(),'Email Address already exist!')]")
    WebElement emailAddressAlreadyExistText;


     //METHODS
    //Scenario 1,2,4,5
    public void verifyNewUserSignUpOrLoginPageUrl()
    {
        String actualUrl = driver.getCurrentUrl();                                                 //actual what we see
        String expectedUrl = PropertyReader.getInstance().getProperty("https://automationexercise.com/login");
        log.info("Verifying New User SignUp Or LoginPage Url");                             //This info will be present in log.out under logs
       // Assert.assertEquals(expectedUrl,actualUrl);
        log.info("After user clicks on log out button, navigates to login page back again");
    }
    //Scenario 5
    public String verifyNewUserSignUpText()
    {
        Assert.assertEquals(newUserSignUpText.getText(),"New User Signup!","Visible New User Sign Up text");
        return getTextFromElement(newUserSignUpText);
    }
    //Scenario 1

    public void enterTheNameTextField()
    {                                                                                                          //try {
            sendTextToElement(name, "kilimajaroaish");
                                                                                                //catch(NoSuchElementException n1){}
                                                                                               // System.out.println("Catch handles the exception");
            log.info("Passing the name in the name text field");
        }
        public void enterNewNameToSignUp(String myName)
        {
            sendTextToElement(name,myName);
        }
        public void enterNewEmailToSignUp(String myEmail)
        {
        sendTextToElement(emailAddressForSignUp,myEmail);
        }

    //Scenario 1
    public void enterTheEmailAddressTextField()
    {
        sendTextToElement(emailAddressForSignUp, "kili4@gmail.com");
        log.info("Passing the email address in the email text field");
    }
    //Scenario 5
    public void enterTheNameAlreadyRegistered()
    {
        sendTextToElement(name, "Anamica");
        log.info("Passing the name in the name text field");
    }
    //Scenario 5
    public void enterTheEmailAddressAlreadyRegistered()
    {
        sendTextToElement(emailAddressForSignUp, "anamica4345@gmail.com");
        log.info("Passing the email address in the email text field");
    }
    //Scenario 1,5
    @Test(timeOut = 2000)
    public void clickOnSignUpButton()
    {
       clickOnElement(signUpButton);
       log.info("Click on the SignUp Button and navigating to Register Page ");
    }
    //Scenario 2,4
    public void enterCorrectEmailAddressInLoginToYourAccount()
    {
        sendTextToElement(emailAddressInLoginToYourAccount,"final123@gmail.com");
    }
    //Scenario 2,4
    public void enterCorrectPasswordInLoginToYourAccount()
    {
        sendTextToElement(passwordInLoginToYourAccount,"finalpwd123");
    }
    //Scenario 3
    public void enterInCorrectEmailAddressInLoginToYourAccount()
    {
        sendTextToElement(emailAddressInLoginToYourAccount,"dummy456@gmail.com");
    }
    //Scenario 3
    public void enterInCorrectPasswordInLoginToYourAccount()
    {
        sendTextToElement(passwordInLoginToYourAccount,"dummy456");
    }
    //Scenario 2,3,4
    public void clickOnLoginButtonInLoginToYourAccount()
    {
        clickOnElement(loginButtonInLoginToYourAccount);
    }
    //Scenario 3
    public String verifyEmailOrPasswordIncorrectText()
    {
        Assert.assertEquals(emailOrPasswordIncorrectText.getText(),"Your email or password is incorrect!" ,"Error Message");
        return getTextFromElement(emailOrPasswordIncorrectText);
    }
    //Scenario 2,3,4
    //Verify 'Login to your account' is visible
    public String getTextFromLoginPage()
    {
        return getTextFromElement(loginToYourAccountText);

    }
    public void verifyEmailAddressAlreadyExistText()
    {
        Assert.assertEquals(emailAddressAlreadyExistText.getText(),"Email Address already exist!","Email address exist visibility text");
    }

}
