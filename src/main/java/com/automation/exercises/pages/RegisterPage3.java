package com.automation.exercises.pages;

import com.automation.exercises.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class RegisterPage3 extends Utility
{
    private static final Logger log = LogManager.getLogger(RegisterPage3.class.getName());

    //Scenario 1
    @CacheLookup
    @FindBy(xpath = "//b[contains(text(),'Enter Account Information')]")
    WebElement enterAccountInformationText;

    @CacheLookup
    @FindBy(xpath = "//input[@id='id_gender1']")
    WebElement titleMrRadioButton;

    @CacheLookup
    @FindBy(xpath = "//input[@id='name']")
    WebElement nameInRegPage;

    @CacheLookup
    @FindBy(xpath = "//input[@id='email']")
    WebElement emailInRegPage;
    @CacheLookup
    @FindBy(xpath = "//input[@id='password']")
    WebElement passwordInRegPage;

    @CacheLookup
    @FindBy(id = "days")
    WebElement dayDropDownInDOB;
    @CacheLookup
    @FindBy(id = "months")
    WebElement monthDropDownInDOB;
    @CacheLookup
    @FindBy(id = "years")
    WebElement yearDropDownInDOB;
    @CacheLookup
    @FindBy(xpath = "//input[@id='newsletter']")
    WebElement newsletterCheckBox;
    @CacheLookup
    @FindBy(xpath = "//input[@id='optin']")
    WebElement receiveSpecialOffersFromOurPartnersCheckBox;

    @CacheLookup
    @FindBy(xpath = "//input[@id='first_name']")
    WebElement firstNameUnderAddressInformation;
    @CacheLookup
    @FindBy(xpath = "//input[@id='last_name']")
    WebElement lastNameUnderAddressInformation;
    @CacheLookup
    @FindBy(xpath = "//input[@id='company']")
    WebElement companyUnderAddressInformation;
    @CacheLookup
    @FindBy(xpath = "//input[@id='address1']")
    WebElement address1TextBoxOfCompanyUnderAddressInformation;
    @CacheLookup
    @FindBy(xpath = "//input[@id='address2']")
    WebElement address2TextBoxOfCompanyUnderAddressInformation;
    @CacheLookup
    @FindBy(id = "country")
    WebElement countryDropDown;
    @CacheLookup
    @FindBy(xpath = "//input[@id='state']")
    WebElement state;
    @CacheLookup
    @FindBy(xpath = "//input[@id='city']")
    WebElement city;
    @CacheLookup
    @FindBy(xpath = "//input[@id='zipcode']")
    WebElement zipCode;
    @CacheLookup
    @FindBy(xpath = "//input[@id='mobile_number']")
    WebElement mobileNumber;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Create Account')]")
    WebElement createAccountButton;

     //Methods
    //Scenario 1
    public void verifyAccountInformationText()
    {
        Assert.assertEquals(enterAccountInformationText.getText(),"ENTER ACCOUNT INFORMATION","Registration Page Title");
        log.info("Verifying the account information after logging in");
    }
    public void clickOnTitleMrRadioButton()
    {
        clickOnElement(titleMrRadioButton);
        log.info("Click on the Title Mr.radio button");
    }
    public void enterNameInRegPage()
    {
        sendTextToElement(nameInRegPage,"anamicaMohan");
    }
    public void enterEmailInRegPage()
    {
        sendTextToElement(emailInRegPage,"anamicamohan4@gmail.com");
    }
    public void enterPasswordInRegPage()
    {
        sendTextToElement(passwordInRegPage ,"math4321");
    }                                                                                        //Login details : email mktst4@gmail.com     pwd "mathrag4"
    public void selectDayFromDropDown()
    {
      selectByValueFromDropDown(dayDropDownInDOB, "13");
    }
    public void selecMonthFromDropDown()
    {
        selectByVisibleTextFromDropDown(monthDropDownInDOB,"November");
    }
    public void selectYearFromDropDown()
    {
       selectByIndexFromDropDown(yearDropDownInDOB,21);                                     //for year 2000
    }
    public void clickOnNewsLetterCheckBox()
    {
        clickOnElement(newsletterCheckBox);
    }
    public void clickOnReceiveSpecialOffersFromOurPartnersCheckBox()
    {
        clickOnElement(receiveSpecialOffersFromOurPartnersCheckBox);
    }
    public void enterFirstNameUnderAddressInformation()
    {
        sendTextToElement(firstNameUnderAddressInformation, "Manish");
    }
    public void enterLastNameUnderAddressInformation()
    {
        sendTextToElement(lastNameUnderAddressInformation, "Tiwari");
    }
    public void enterCompanyNameUnderAddressInformation()
    {
        sendTextToElement(companyUnderAddressInformation, "Grotech Minds");
    }
    public void enterAddress1TextBoxOfCompanyNameUnderAddressInformation()
    {
        sendTextToElement(address1TextBoxOfCompanyUnderAddressInformation, "123 Bombay Street");
    }
    public void enterAddress2TextBoxOfCompanyNameUnderAddressInformation()
    {
        sendTextToElement(address2TextBoxOfCompanyUnderAddressInformation, "Inch Park");
    }
    public void selectCountryByDrorDown()
    {
        selectByVisibleTextFromDropDown(countryDropDown,"India");
    }
    public void enterTheStateNameInTheTextField()
    {
        sendTextToElement(state,"Karnataka");
    }
    public void enterTheCityNameInTheTextField()
    {
        sendTextToElement(city,"Bangalore");
    }
    public void enterTheZipCodeInTheTextField()
    {
        sendTextToElement(zipCode,"620006");
    }
    public void enterTheMobileNumberInTheTextField()
    {
        sendTextToElement(mobileNumber,"09835254965");
    }
    public void clickOnCreateAccountButton()
    {
        clickOnElement(createAccountButton);
        log.info("Click on Create Account and user created account successfully");
    }

}

//Login details : email final123@gmail.com     pwd "finalpwd123"
