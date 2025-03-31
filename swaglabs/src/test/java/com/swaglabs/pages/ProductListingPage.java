package com.swaglabs.pages;

import java.util.List;

import org.openqa.selenium.WebElement;

import com.swaglabs.constants.ProductListingPageConstants;
/**
 * This class contains the methods for the Product Listing Page
 * 
 * @author Annapurna Badiger
 */
public class ProductListingPage extends BasePage {

    private WebElement highestPriceItem;

    private String highestPriceProductName;

    public void verifyProductListingPageDisplayed() {
        action.waitForElement(ProductListingPageConstants.PRODUCT_TITLE_BY);
    }

    public void selectHighestPriceItem() {
        List<WebElement> items = action.findElements(ProductListingPageConstants.INVENTORY_ITEM_BY);
        double highestPrice = 0.0;

        for (WebElement item : items) {
            String priceText = action.getElementText(item, ProductListingPageConstants.ITEM_PRICE_BY);
            double price = Double.parseDouble(priceText.replace("$", ""));

            if (price > highestPrice) {
                highestPrice = price;
                highestPriceItem = item;
                highestPriceProductName = action.getElementText(item, ProductListingPageConstants.ITEM_NAME_BY);
            }
        }
    }

    public void addSelectedProductToCart() {
        try {
            // Wait for the product listing page to be fully loaded
            action.waitForElement(ProductListingPageConstants.PRODUCT_TITLE_BY);
            action.waitForElement(ProductListingPageConstants.INVENTORY_ITEM_BY);
            
            if (highestPriceItem != null) {
                // Wait for the add to cart button to be clickable
                WebElement addToCartButton = highestPriceItem.findElement(ProductListingPageConstants.ADD_TO_CART_BUTTON_BY);
                action.waitForElementToBeClickable(addToCartButton);
                addToCartButton.click();
                
                // Wait for the shopping cart badge to appear
                action.waitForElement(ProductListingPageConstants.SHOPPING_CART_BADGE_BY);
            } else {
                throw new RuntimeException("No product selected to add to cart");
            }
        } catch (Exception e) {
            throw new RuntimeException("Failed to add product to cart: " + e.getMessage());
        }
    }

    public void clickShoppingCart() {
        try {
            // Wait for the shopping cart link to be clickable
            action.waitForElementToBeClickable(ProductListingPageConstants.SHOPPING_CART_LINK_BY);
            action.click(ProductListingPageConstants.SHOPPING_CART_LINK_BY);
            // Wait for the cart page to load by checking for the cart title
            action.wait(2000);
            action.waitForElement(ProductListingPageConstants.CART_TITLE_BY);
            // Now wait for cart items to be present
            action.waitForElement(ProductListingPageConstants.CART_ITEMS_BY);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void productExistsInCart() {
        boolean found = false;
        List<WebElement> cartItems = action.findElements(ProductListingPageConstants.CART_ITEMS_BY);
        for (WebElement item : cartItems) {
            if (item.findElement(ProductListingPageConstants.ITEM_NAME_BY).getText().equals(highestPriceProductName)) {
                found = true;
            }
        }
        assert found : "Product not found in cart";
        System.out.println("Verified product in cart: " + highestPriceProductName);
    }
}
