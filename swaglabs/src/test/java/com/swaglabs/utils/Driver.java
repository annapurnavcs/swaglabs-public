package com.swaglabs.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;

/**
 * Driver class to initialize and close the browser
 * 
 * @author Annapurna Badiger
 */
public class Driver {
    private static WebDriver driver;

    private Driver() {
    }

    public static void initializeDriver() {
        if (driver == null) {
            driver = getDriver();
        }
    }

    public static WebDriver getDriver() {
        if (driver == null) {
            String browserType = ConfigReader.getProperty("browser.type").toLowerCase();
            
            switch (browserType) {
                case "firefox":
                    System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/src/test/resources/drivers/geckodriver");
                    driver = new FirefoxDriver();
                    break;
                case "edge":
                    System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") + "/src/test/resources/drivers/msedgedriver");
                    driver = new EdgeDriver();
                    break;
                default: // chrome
                    System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver");
                    driver = new ChromeDriver();
            }
            
            driver.manage().window().maximize();
        }
        return driver;
    }

    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
} 