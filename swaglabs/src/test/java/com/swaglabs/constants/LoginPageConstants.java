package com.swaglabs.constants;

import org.openqa.selenium.By;

/**
 * Constants class containing all selectors and locators for the Login page
 * 
 * @author Annapurna Badiger
 */
public interface LoginPageConstants {
    public static final By USERNAME_INPUT_BY = By.cssSelector("[data-test='username']");
    public static final By PASSWORD_INPUT_BY = By.cssSelector("[data-test='password']");
    public static final By LOGIN_BUTTON_BY = By.cssSelector("[data-test='login-button']");
    public static final By ERROR_MESSAGE_BY = By.cssSelector("[data-test='error']");

} 