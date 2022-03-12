package com.automationpractice.cucumber.stepdefinationfiles;

import com.automationpractice.web_pages.OurStorePage;
import com.automationpractice.utility.Util_Class;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.JavascriptExecutor;

import static com.automationpractice.managedrivers.All_Drivers_Class.driver;

/**
 * By Bhoomi
 **/
public class OurStoreStepdefs {
    @When("^I select On \"([^\"]*)\"$")
    public void iSelectOn(String store) throws InterruptedException {
        new OurStorePage().selectOurStore(store);
    }

    @And("^I click on OK button$")
    public void iClickOnOKButton() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,400)");
        new OurStorePage().clickOnOk();
    }

    @And("^I scroll on map$")
    public void iScrollOnMap() {

    }

    @And("^I click On zoomOut$")
    public void iClickOnZoomOut() {
        new OurStorePage().setZoomOut();
    }

    @Then("^I take screenshot$")
    public void iTakeScreenshot() {
        Util_Class.takeScreenShot();
    }
}
