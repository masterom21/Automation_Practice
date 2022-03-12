package com.automationpractice.web_pages;

import com.automationpractice.utility.Util_Class;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class AuthenticationPage extends Util_Class {

    public AuthenticationPage() {
        PageFactory.initElements(driver, this);
    }


    @FindBy(id = "email_create")
    WebElement emailAddressField;

    @FindBy(xpath = "//span[normalize-space()='Create an account']")
    WebElement createAnAccount;

    public void enterRandomEmailInTheEmailAddressField() {
        sendTextToElement(emailAddressField, randomString() + "@gmail.com");

    }

    public void clickOnCreateAnAccountTab() {
        clickOnElement(createAnAccount);

    }
}
