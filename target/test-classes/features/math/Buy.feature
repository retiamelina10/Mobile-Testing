@Buy
Feature: Buy item
  As a user
  I want to buy item
  So I can added item to cart

  Scenario: Buy item PS5
  Given I have Logged in
  When I click buy item PS5
  Then Item successfully added to cart

  Scenario: Buy item PS2
    Given I have Logged in
    When I click buy item PS2
    Then Item successfully added to cart

