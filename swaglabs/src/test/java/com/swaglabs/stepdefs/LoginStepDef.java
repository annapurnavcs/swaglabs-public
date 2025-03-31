package com.swaglabs.stepdefs;

import com.swaglabs.utils.ConfigReader;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * This Class contains the steps for Login into the application
 * 
 * @author Annapurna Badiger
 */
public class LoginStepDef extends BaseStepDef {

    @Given("I am on the login page")
    public void navigateToLoginPage() {
        loginPage.navigateToLoginPage();
    }

    @And("I enter credentials")
    public void enterCredentials() {
        loginPage.enterUsername(ConfigReader.getProperty("username"));
        loginPage.enterPassword(ConfigReader.getProperty("password"));
    }

    @When("I click the login button")
    public void clickLoginButton() {
        loginPage.clickLoginButton();
    }

    @Then("I am logged in to the application")
    public void verifySuccessfulLogin() {
        loginPage.verifyProductListingPageDisplayed();
    }
}