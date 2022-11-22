package com.example.Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

    private  static WebDriver driver;

    public static WebDriver getDriver(){
        if(driver==null){
            System.setProperty("webdriver.chrome.driver","C:\\Users\\reisu\\Desktop\\tester\\yemekhanem\\drivers\\chromedriver.exe");
            driver = new ChromeDriver();
        }
        return driver;
    }

    public static void closeDriver(){
        if(driver!=null){
            driver.quit();
            driver=null;
        }
    }
}
