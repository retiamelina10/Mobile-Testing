@Login
Feature: LoginPage
  As a user
  I want to login
  So I can buy item

  Scenario Outline: Login page
    Given I click login icon
    When I input email "<email>" and password "<password>"
    And I click login button
    Then I will get result "<result>"
    Examples:
    |email|password|result|
    |retiamelina@gmail.com|Retiaah10|go to home page|
    |retiamelina@gmail.com|         |error password |
    |                     |Retiaah10|error email    |
    |mretia@gmail.com     |Retiaah10|error message  |
    |retiamelina@gmail.com|tyqwdfh  |error message  |
    |mretia@gmail.com     |tyqwdfh  |error message  |
    |                     |         |error email    |

