package com.automation.exercises.pages;

import com.automation.exercises.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class ContactUsPage6 extends Utility
{
    private static final Logger log = LogManager.getLogger(ContactUsPage6.class.getName());

    //Scenario 6
    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Get In Touch')]")
    WebElement getInTouchText;

    //Scenario 6
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Name']")
    WebElement nameTextFieldInGetInTouch;

    //Scenario 6
    @CacheLookup
    @FindBy(xpath = "//input[@type='email' and @name='email']")
    WebElement emailTextFieldInGetInTouch;

    //Scenario 6
    @CacheLookup
    @FindBy(xpath = "//input[@name='subject']")
    WebElement subjectTextFieldInGetInTouch;

    //Scenario 6
    @CacheLookup
    @FindBy(xpath = "//textarea[@id='message']")
    WebElement yourMessageHereTextAreaFieldInGetInTouch;

    //Scenario 6
    @CacheLookup
    @FindBy(xpath = "//input[@name='upload_file']")
    WebElement chooseFileInGetInTouch;

    //Scenario 6
    @CacheLookup
    @FindBy(xpath = "//input[@name='submit']")                                     //input[@type='submit']
    WebElement submitButtonInGetInTouch;




    //Methods
    //Scenario 6
    public void verifyGetInTouchText()
    {
        Assert.assertEquals(getInTouchText.getText(),"GET IN TOUCH" ,"Title text center Get In Touch ");
    }
    //Scenario 6
    public void enterNameUnderGetInTouch()
    {
       sendTextToElement(nameTextFieldInGetInTouch,"Anamica");
    }
    //Scenario 6
    public void enterEmailUnderGetInTouch()
    {
        sendTextToElement(emailTextFieldInGetInTouch,"anamica4@gmail.com");
    }
    //Scenario 6
    public void enterSubjectUnderGetInTouch()
    {
        sendTextToElement(subjectTextFieldInGetInTouch,"Regarding damage");
    }
    //Scenario 6
    public void enterYourMessageHereTextAreaFieldInGetInTouch()
    {
        sendTextToElement(yourMessageHereTextAreaFieldInGetInTouch,"Wondering whether could I get new product in exchange");
    }
    //Scenario 6
    public void fileUploadInChooseFile()
    {
       sendTextToElement(chooseFileInGetInTouch,"C:\\Users\\madha\\OneDrive\\Desktop\\Hari Prime\\Jenkins URL.txt");
    }
    //Scenario 6
    public void clickOnSubmitButtonInGetInTouch()
    {
        waitUntilVisibilityOfElementLocated(submitButtonInGetInTouch,2);
        clickOnElement(submitButtonInGetInTouch);
    }
    //Scenario 6
    public void acceptAlert() {
        driver.switchTo().alert().accept();
    }          //For clicking on 'OK' button


}

