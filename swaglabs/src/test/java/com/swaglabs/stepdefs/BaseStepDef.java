package com.swaglabs.stepdefs;

import com.swaglabs.pages.LoginPage;
import com.swaglabs.pages.ProductListingPage;

/**
 * Base class for all step definitions containing common properties and methods
 */
public class BaseStepDef {
    protected LoginPage loginPage = new LoginPage();
    protected ProductListingPage productListingPage = new ProductListingPage();
}