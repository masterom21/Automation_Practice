package com.automationpractice.cucumber.stepdefinationfiles;

import com.automationpractice.web_pages.AuthenticationPage;
import com.automationpractice.web_pages.CreateAccountPage;
import com.automationpractice.web_pages.SignInPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;


public class AccountStepdefs {

    @When("^User clicks on the sign in button from the homepage$")
    public void userClicksOnTheSignInButtonFromTheHomepage() {
        new SignInPage().clickOnSignInLink();

    }

    @And("^enters an email in the email address field$")
    public void entersAnEmailInTheEmailAddressField() {
        new AuthenticationPage().enterRandomEmailInTheEmailAddressField();

    }

    @And("^clicks on create an account tab$")
    public void clicksOnCreateAnAccountTab() {
        new AuthenticationPage().clickOnCreateAnAccountTab();
    }

    @And("^fill all mandatory fields$")
    public void fillAllMandatoryFields(DataTable dataTable) {
        List<List<String>> userDetails = dataTable.asLists(String.class);
        for (List<String>e :userDetails){
            new CreateAccountPage().fillMandatoryFields(e.get(0),e.get(1),e.get(2),e.get(3),e.get(4),e.get(5),e.get(6),e.get(7),e.get(8));
        }
    }

    @And("^click on register$")
    public void clickOnRegister() {
        new CreateAccountPage().clickOnRegister();
    }

    @And("^verify my account text \"([^\"]*)\"$")
    public void verifyMyAccountText(String text)  {
new CreateAccountPage().verifyMyAccountText(text);
    }

    @Then("^verify user can see his name on top right \"([^\"]*)\"$")
    public void verifyUserCanSeeHisNameOnTopRight(String name)  {
        new CreateAccountPage().verifyUserCanSeeAccountNameOnTopRight(name);

    }
    @And("^verify that invalid information will give an error message \"([^\"]*)\"$")
    public void verifyThatInvalidInformationWillGiveAnErrorMessage(String message) {
        new CreateAccountPage().verifyErrorMessage(message);

    }
}
