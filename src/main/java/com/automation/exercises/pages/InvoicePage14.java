package com.automation.exercises.pages;

import com.automation.exercises.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class InvoicePage14 extends Utility
{
    private static final Logger log = LogManager.getLogger(InvoicePage14  .class.getName());

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Download Invoice']")
    WebElement downloadInvoice;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Continue']")
    WebElement continueAfterDownloadingInvoice;




    public void clickOnDownloadInvoice()
    {
        clickOnElement(downloadInvoice);
    }
    public void clickOnContinueAfterDownloadingInvoice()
    {
        clickOnElement(continueAfterDownloadingInvoice);
    }













}
