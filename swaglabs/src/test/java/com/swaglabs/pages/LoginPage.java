package com.swaglabs.pages;

import com.swaglabs.constants.LoginPageConstants;
import com.swaglabs.constants.ProductListingPageConstants;
import com.swaglabs.utils.ConfigReader;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import java.util.List;

/**
 * This class contains the methods for the Login page
 * 
 * @author Annapurna Badiger
 */
public class LoginPage extends BasePage {

    public void navigateToLoginPage() {
        action.navigateToUrl(ConfigReader.getProperty("base.url"));
    }

    public void enterUsername(String username) {
        action.sendKeys(LoginPageConstants.USERNAME_INPUT_BY, username);
    }

    public void enterPassword(String password) {
        action.sendKeys(LoginPageConstants.PASSWORD_INPUT_BY, password);
    }

    public void clickLoginButton() {
        action.clickButton(LoginPageConstants.LOGIN_BUTTON_BY);
    }

    public void verifyProductListingPageDisplayed() {
        List<WebElement> inventoryItems = action.findElements(ProductListingPageConstants.INVENTORY_ITEM_BY);
        Assert.assertTrue("Login successful: Products are displayed on the page", inventoryItems.size() > 0);
    }
}
