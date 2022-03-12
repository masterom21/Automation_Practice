package com.automationpractice.web_pages;


import com.automationpractice.utility.Util_Class;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage extends Util_Class {

    public SignInPage(){
        PageFactory.initElements(driver,this);
    }

@FindBy(xpath = "//a[normalize-space()='Sign in']")
    WebElement signInButton;


    public void clickOnSignInLink(){
        clickOnElement(signInButton);
    }

}
