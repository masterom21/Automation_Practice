package com.automationpractice.cucumber.stepdefinationfiles;

import com.automationpractice.web_pages.CasualDress;
import com.automationpractice.web_pages.HomePage;
import com.automationpractice.web_pages.ProductOrderPage;
import com.automationpractice.web_pages.ShoppingCartPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

/**
 * By Bhoomi
 **/
public class ShoppingCartStepdefs {
    @Given("^I am in home page$")
    public void iAmInHomePage() {
        System.out.println("I am on Home Page");
    }

    @When("^I mouse hover on \"([^\"]*)\"$")
    public void iMouseHoverOn(String menu) throws InterruptedException {
       new HomePage().mouseHoverOnTopCategory(menu);
    }

    @And("^I click on \"([^\"]*)\"$")
    public void iClickOn(String dresses) throws InterruptedException {
        new HomePage().clickOnCasualDresses(dresses);

    }

    @And("^I mouse hover on Dress$")
    public void iMouseHoverOnDress() {
        new  CasualDress().mouseHoverONDress();

    }

    @And("^I click on Add to cart$")
    public void iClickOnAddToCart() throws InterruptedException {
        new CasualDress().clickOnCart();
    }

    @And("^I close window$")
    public void iCloseWindow() {
        new CasualDress().closeWindow();

    }
    @And("^I Mouse Hover on cart$")
    public void iMouseHoverOnCart() {
        new CasualDress().setMouseHoverCart();
    }

    @And("^I click on cross button$")
    public void iClickOnCrossButton() {
        new CasualDress().clickOnCloseBtn();
    }

    @Then("^I should see message \"([^\"]*)\"$")
    public void iShouldSeeMessage(String expected) throws InterruptedException {
          Thread.sleep(2000);
        String expectedMessage = expected;
        String actualMessage = new ProductOrderPage().verifyDeleteMessageIsDisplayed();
              Assert.assertEquals("Message not displayed",expectedMessage,actualMessage);
    }

    @Then("^I able to select price range$")
    public void iAbleToSelectPriceRange() throws InterruptedException {
        new ShoppingCartPage().sliderAction();

    }
}
