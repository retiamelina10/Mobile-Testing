@Logout
Feature: Logout
  As a user
  I want to logout
  So I can login again

  Scenario: Logout
    Given I have Logged in
    When I click logout icon
    Then I success logout
