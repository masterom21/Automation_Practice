package com.automationpractice.cucumber;

import com.automationpractice.propertyreader.Property_Reader_Class;
import com.automationpractice.utility.Util_Class;
import com.cucumber.listener.Reporter;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.io.IOException;


/**
 * By Bhoomi
 */
public class Hooks extends Util_Class {
    @Before
    public void setUp(){
       selectBrowser(Property_Reader_Class.getInstance().getProperty("browser"));

    }
    @After
    public void tearDown(Scenario scenario){
        if(scenario.isFailed()){
          String screenShotPath= Util_Class.getScreenshot(driver,scenario.getName().replace(" ","_"));
            try {
                Reporter.addScreenCaptureFromPath(screenShotPath);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        closeBrowser();
    }
}
