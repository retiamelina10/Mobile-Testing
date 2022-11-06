@Register
Feature: Register
  As a User
  I want to register
  So I can login

  Scenario Outline: Register
    Given I am on home page
    And I click login icon
    And I click register
    And clear field name, email, and password
    When I input name "<name>" email "<email>" and password "<password>"
    And I click register button
    Then I get result "<result>"
    Examples:
    |name|email|password|result|
    |retiamelina|retiamelina@gmail.com|retiaah10|go to home page|
    |retiamelina|retiamelina@gmail.com|         |error message password |
    |retiamelina|                     |retiaah10|error message email |
    |           |retiamelina@gmail.com|retiaah10|error message name |
    |retiamelina|                     |         |error message password  |
    |           |retiamelina@gmail.com|         |error Message name  |
    |           |                     |retiaah10|error message name  |
    |           |                     |         |error message |