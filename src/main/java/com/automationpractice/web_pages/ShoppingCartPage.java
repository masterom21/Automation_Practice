package com.automationpractice.web_pages;


import com.automationpractice.utility.Util_Class;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage extends Util_Class {


    public ShoppingCartPage() {
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = " //div[@id='layered_price_slider']")
    WebElement leftSlider;
    @FindBy(xpath = "//div[@id='left_column']//a[2]")
    WebElement rightSlider;
    @FindBy(xpath = "//div[@id='layered_price_slider']")
    WebElement sliderWidth;

    public void sliderAction() throws InterruptedException {
        Actions actions = new Actions(driver);
        // WebElement slider = rightSlider;
        jvJavaScriptExecutorExecuteASyncScriptPerformingSleep();
        int width =  sliderWidth.getSize().width;
        int halfWidth = (width/4)*3;
        actions.dragAndDropBy(rightSlider,0-halfWidth,0).build().perform();
        jvJavaScriptExecutorExecuteASyncScriptPerformingSleep();

    }


}
