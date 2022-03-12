package com.automationpractice.web_pages;

import com.automationpractice.utility.Util_Class;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductOrderPage extends Util_Class {

    public ProductOrderPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//p[@class='alert alert-warning']")
    //@FindBy(xpath = "//p[contains(text(),'Your shopping cart is empty.')]")
    WebElement deleteMsg;

    @FindBy(xpath = "//b[normalize-space()='Cart']")
    WebElement cartButton;


    public String verifyDeleteMessageIsDisplayed() {
        clickOnElement(cartButton);
        return deleteMsg.getText();
    }

}
