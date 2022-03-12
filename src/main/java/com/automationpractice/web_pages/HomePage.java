package com.automationpractice.web_pages;

import com.automationpractice.utility.Util_Class;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


public class HomePage extends Util_Class {


    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li//a")
    List<WebElement> topCategory;

    @FindBy(xpath = "(//ul)[4]//li//a")
    List<WebElement> subCategory;

    //for Sign in and Contact us WebElement
    @FindBy(xpath = "//div[@class='row']//nav//div//a")
    List<WebElement> signIn;


    public void mouseHoverOnTopCategory(String menu) throws InterruptedException {
        for (WebElement title : topCategory) {
            System.out.println(title);
            if (title.getText().equalsIgnoreCase(menu)) {
                mouseHoverToElement(title);
                //Thread.sleep(2000);

                break;
            }
        }
    }

    public void clickOnCasualDresses(String dresses) throws InterruptedException {
        for (WebElement casual : subCategory) {
            System.out.println(casual);
            if (casual.getText().equalsIgnoreCase(dresses)) {
                mouseHoverToElementAndClick(casual);
               // Thread.sleep(2000);
                break;
            }
        }

    }
    public void clickOnSignInLink(String Sign){
        for(WebElement s : signIn){
            System.out.println(s);
            if(s.getText().equalsIgnoreCase(Sign)){
                clickOnElement(s);
                break;
            }
        }

    }


}
