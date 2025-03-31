package com.swaglabs.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

/**
 * Utility class for common Selenium WebDriver actions
 */
public class Action {
    private final WebDriver driver;
    private final WebDriverWait wait;

    public Action(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void navigateToUrl(String url) {
        driver.get(url);
    }

    public List<WebElement> findElements(By by) {
        return driver.findElements(by);
    }

    public WebElement findElement(By by) {
        return driver.findElement(by);
    }

    public WebElement waitForElement(By by) {
        return wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public WebElement waitForClickable(By by) {
        return wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    public void click(By by) {
        WebElement element = waitForClickable(by);
        element.click();
    }

    public void sendKeys(By by, String text) {
        WebElement element = waitForElement(by);
        element.clear();
        element.sendKeys(text);
    }

    public String getText(By by) {
        WebElement element = waitForElement(by);
        return element.getText();
    }

    public void clickButton(By by) {
        WebElement loginButton = driver.findElement(by);
        loginButton.click();
    }

    public String getElementText(WebElement item, By by) {
        return item.findElement(by).getText();
    }

    public void clickButtonInsideWebElement(WebElement item, By by) {
        WebElement addToCartButton = item.findElement(by);
        addToCartButton.click();
    }

    public void waitForElementToBeClickable(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void waitForElementToBeClickable(By by) {
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }
}