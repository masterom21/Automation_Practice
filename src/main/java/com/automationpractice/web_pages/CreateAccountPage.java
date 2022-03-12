package com.automationpractice.web_pages;

import com.automationpractice.utility.Util_Class;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.junit.Assert;


public class CreateAccountPage extends Util_Class {

    public CreateAccountPage() {
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//input[@id='customer_firstname']")
    WebElement firstNameLink;

    @FindBy(xpath = "//input[@id='customer_lastname']")
    WebElement lastNameLink;

    @FindBy(xpath = "//input[@id='passwd']")
    WebElement passwordLink;

    @FindBy(xpath = "//input[@id='address1']")
    WebElement addressLink;

    @FindBy(xpath = "//input[@id='city']")
    WebElement cityLink;

    @FindBy(xpath = "//select[@id='id_state']")
    WebElement stateLink;

    @FindBy(xpath = "//input[@id='postcode']")
    WebElement zipPostalLink;
    @FindBy(id = "id_country")
    WebElement countryLink;


    @FindBy(xpath = "//input[@id='phone_mobile']")
    WebElement mobilePhoneLink;
    @FindBy(xpath = "//button[@id='submitAccount']")
    WebElement registerLink;
    @FindBy(css = "div[class='alert alert-danger'] p")
    WebElement errorMessage;
    @FindBy(xpath = "//h1[contains(text(),'My account')]")
    WebElement myAccountTextLink;
    @FindBy(css = "a[title='View my customer account'] span")
    WebElement accountNameVerification;

    public void fillMandatoryFields(String name, String surname, String password, String address, String city,
                                    String state, String postcode, String country,String mobileNumber) {

        sendTextToElement(firstNameLink, name);

        sendTextToElement(lastNameLink, surname);

        sendTextToElement(passwordLink, password);

        sendTextToElement(addressLink, address);

        sendTextToElement(cityLink, city);

        selectByVisibleTextFromDropDown(stateLink,state);

        sendTextToElement(zipPostalLink, postcode);
        sendTextToElement(countryLink,country);

        sendTextToElement(mobilePhoneLink, mobileNumber);

    }

    public void clickOnRegister() {
        clickOnElement(registerLink);
    }

    public void verifyMyAccountText(String message) {

        verifyElements("Message is not displayed correctly", message, myAccountTextLink);
    }

    public void verifyErrorMessage(String error) {
        Assert.assertTrue(errorMessage.getText().contains(error));
    }

    public void verifyUserCanSeeAccountNameOnTopRight(String expectedName) {
        verifyElements("Incorrect Account", expectedName, accountNameVerification);
    }
}
