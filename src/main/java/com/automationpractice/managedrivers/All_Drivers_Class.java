package com.automationpractice.managedrivers;


import com.automationpractice.propertyreader.Property_Reader_Class;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;


public class All_Drivers_Class {


    public static WebDriver driver;
    public String baseUrl = Property_Reader_Class.getInstance().getProperty("baseUrl");
   public  String waitSeconds =  Property_Reader_Class.getInstance().getProperty("implicitlyWait");
   public long secondsInLong = Long.parseLong(waitSeconds);

    public All_Drivers_Class() {
        PageFactory.initElements(driver, this);
    }

    public void selectBrowser(String browser) {
        if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
                       driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("ie")) {
            WebDriverManager.iedriver().setup();
            driver = new InternetExplorerDriver();
        } else {
            System.out.println("Wrong browser name");
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(secondsInLong));
        driver.get(baseUrl);
    }

    public void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }
}
