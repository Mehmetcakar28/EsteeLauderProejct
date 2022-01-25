package com.esteeLauder.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {

    private Driver(){}
    private static WebDriver driver;
    public static WebDriver getDriver(){

        if(driver == null) {
                switch (com.esteeLauder.utils.ConfigurationsReader.getProperty("browser")) {

                    case "chrome":
                        WebDriverManager.chromedriver().setup();
                        driver= new ChromeDriver();
                        break;
                    case "firefox":
                        WebDriverManager.firefoxdriver().setup();
                        driver=new FirefoxDriver();
                        break;
                    case "edge":
                        WebDriverManager.edgedriver().setup();
                        driver=new EdgeDriver();
                        break;
                    default:
                        System.out.println("The Driver is NOT Found");
                }
            }
        return driver;
    }


    public static void closeDriver(){
        if(driver!= null){
            driver.close();
        }
    }

    public static void quitDriver() {
        if(driver!=null) {
            driver.quit();
        }
    }
}
