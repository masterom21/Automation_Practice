package com.automationpractice.web_pages;

import com.automationpractice.utility.Util_Class;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class CasualDress extends Util_Class {

    public CasualDress() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//img[@title='Printed Dress']")
    WebElement mouseHover;
    @FindBy(xpath = "//a[@title='Add to cart']//span")
    WebElement cartBtn;
    @FindBy(xpath = "//span[@title='Close window']")
    WebElement closeBtn;
    @FindBy(xpath = "//span[@class='ajax_cart_product_txt unvisible']")
    WebElement mouseHoverCart;
    @FindBy(xpath = "//a[@class='ajax_cart_block_remove_link']")
    WebElement delete;


    public void mouseHoverONDress() {
        mouseHoverToElement(mouseHover);

    }
    public void clickOnCart() throws InterruptedException {

        Thread.sleep(2000);
        clickOnElement(cartBtn);
    }

    public void closeWindow() {
        clickOnElement(closeBtn);
    }

    public void setMouseHoverCart() {
        mouseHoverToElement(mouseHoverCart);
    }

    public void clickOnCloseBtn() {
        clickOnElement(delete);
    }

}
