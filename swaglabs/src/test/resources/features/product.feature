@all
Feature: Product Management
  As a user
  I want to manage products
  So that I can make purchases

  Background:
    Given I am on the login page
    And I enter credentials
    When I click the login button
    Then I am logged in to the application

  @highestproduct
  Scenario: Find and add highest priced product
    When I select the highest price item
    And I add the selected product to cart
    Then I click on the shopping cart
    And I should see the product in the cart