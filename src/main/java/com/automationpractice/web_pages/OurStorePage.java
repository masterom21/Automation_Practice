package com.automationpractice.web_pages;

import com.automationpractice.utility.Util_Class;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


public class OurStorePage extends Util_Class {

    public OurStorePage() {
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = " //ul[@class='toggle-footer']//li//a")
    List<WebElement> ourStore;

    @FindBy(xpath = "//button[normalize-space()='OK']")
    WebElement OkBtn;


    @FindBy(id = "map")//store image
    WebElement mapLook;
    @CacheLookup
    @FindBy(xpath = "//button[@title='Zoom out']")
    WebElement zoomOut;




    public void selectOurStore(String pages) throws InterruptedException {
        for (WebElement information : ourStore) {
            System.out.println(information);
            if (information.getText().equalsIgnoreCase(pages)) {
                clickOnElement(information);
                Thread.sleep(2000);
                break;
            }
        }

    }

    public void clickOnOk() {
        clickOnElement(OkBtn);
    }

    public void setZoomOut() {

        clickOnElement(zoomOut);
    }

}