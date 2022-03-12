package com.automationpractice.utility;

import com.automationpractice.managedrivers.All_Drivers_Class;
import net.bytebuddy.utility.RandomString;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Util_Class extends All_Drivers_Class {

    /*Util Class extends to All_Drivers_Class for the driver to finding locators
     *All common methods are fixed in the utility Class.*/

    JavascriptExecutor js = (JavascriptExecutor) driver;

    /**
     * This method will generate random string
     */
    public static String getRandomString(int length) {
        StringBuilder sb = new StringBuilder();
        String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        for (int i = 0; i < length; i++) {
            int index = (int) (Math.random() * characters.length());
            sb.append(characters.charAt(index));
        }
        return sb.toString();
    }

    /**
     * This method will click on element
     */

    public void clickOnElement(WebElement element) {
        element.click();
    }

    /**
     * This method will get text from element
     */

    public String getTextFromElement(WebElement element) {
        return element.getText();
    }

    /**
     * This method will send text on element
     */

    public void sendTextToElement(WebElement element, String str) {
        element.sendKeys(str);
    }


//*************************** Select Class Methods ***************************************//

    /**
     * This method will select the option by visible text
     */

    public void selectByVisibleTextFromDropDown(WebElement element, String text) {
        new Select(element).selectByVisibleText(text);
    }

//*************************** Action Methods ***************************************//

    /**
     * This method will use to hover mouse on element
     */

    public void mouseHoverToElement(WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
    }

    /**
     * This method will use to hover mouse on element and click
     */

    public void mouseHoverToElementAndClick(WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().perform();
    }

    public String randomString(){
        String randString;
        RandomString rnd = new RandomString(10);
        return randString= rnd.nextString();
    }
    public void verifyElements(String displayMessage, String expectedMessage,WebElement element ) {
        String actualMessage = getTextFromElement(element);
        Assert.assertEquals(displayMessage, expectedMessage,actualMessage);
    }


    //************************** ScreenShot Methods *********************************************//

    /**
     * This method will take screenshot
     */
    public static void takeScreenShot() {
        String filePath = System.getProperty("user.dir") + "/src/main/java/com/automationpractice/screenshots/";
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File scr1 = screenshot.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(scr1, new File(filePath + getRandomString(10) + ".jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

      public static String getScreenshot(WebDriver driver, String screenshotName) {
        String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);

        // After execution, you could see a folder "FailedTestsScreenshots" under screenshot folder
        String destination = System.getProperty("user.dir") + "/src/main/java/com/automationpractice/screenshots/" + screenshotName + dateName + ".png";
        File finalDestination = new File(destination);
        try {
            FileUtils.copyFile(source, finalDestination);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return destination;
    }



    //Performing a sleep in the browser under test
    public void jvJavaScriptExecutorExecuteASyncScriptPerformingSleep()
    {
        long start = System.currentTimeMillis();
        js.executeAsyncScript(
                "window.setTimeout(arguments[arguments.length - 1], 500);");
        System.out.println(
                "Elapsed time: " + (System.currentTimeMillis() - start));
    }

}
