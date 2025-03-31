package com.swaglabs.constants;

import org.openqa.selenium.By;

/**
 * This class contains all the constants for the Product Listing page
 * @author Annapurna Badiger
 */
public interface ProductListingPageConstants {
    // Product page selectors
    public static final By INVENTORY_ITEM_BY = By.cssSelector("[data-test='inventory-item']");
    public static final By ITEM_PRICE_BY = By.cssSelector("[data-test='inventory-item-price']");
    public static final By ADD_TO_CART_BUTTON_BY = By.cssSelector("button[data-test^='add-to-cart']");
    public static final By SHOPPING_CART_BADGE_BY = By.cssSelector("[data-test='shopping-cart-badge']");
    public static final By SHOPPING_CART_LINK_BY = By.cssSelector("[data-test='shopping-cart-link']");
    public static final By PRODUCT_TITLE_BY = By.cssSelector("[data-test='title']");
    public static final By SORT_CONTAINER_BY = By.cssSelector("[data-test='product-sort-container']");
    public static final By ITEM_NAME_BY = By.cssSelector("[data-test='inventory-item-name']");
    public static final By ITEM_DESC_BY = By.cssSelector("[data-test='inventory-item-desc']");

    // Cart page selectors
    public static final By CART_TITLE_BY = By.cssSelector("[data-test='title']");
    public static final By CART_ITEMS_BY = By.xpath("//div[@class='cart_item']");
    public static final By CHECKOUT_BUTTON_BY = By.cssSelector("[data-test='checkout']");
    public static final By CONTINUE_SHOPPING_BUTTON_BY = By
            .cssSelector("[data-test='continue-shopping']");
    public static final By REMOVE_BUTTON_BY = By.cssSelector("[data-test='remove']");

} 