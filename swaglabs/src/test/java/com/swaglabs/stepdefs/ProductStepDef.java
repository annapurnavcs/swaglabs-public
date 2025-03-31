package com.swaglabs.stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * This Class contains the steps for Product related operations
 * 
 * @author Annapurna Badiger
 */
public class ProductStepDef extends BaseStepDef {

    @Given("I am on the products page")
    public void onProductsPage() {
        productListingPage.verifyProductListingPageDisplayed();
    }

    @When("I select the highest price item")
    public void select_the_highest_price_item() {
        productListingPage.selectHighestPriceItem();
    }

    @And("I add the selected product to cart")
    public void addSelectedProductToCart() {
        productListingPage.addSelectedProductToCart();
    }

    @Then("I click on the shopping cart")
    public void clickOnShoppingCart() {
        productListingPage.clickShoppingCart();
    }

    @And("I should see the product in the cart")
    public void productExistsInCart() {
        productListingPage.productExistsInCart();
    }
}