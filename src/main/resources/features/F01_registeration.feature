@regression
Feature: user must register to have an account in the website
  Scenario: user register with valid data
    When user click the Register link
    When user enter gender
    And user enter firstname and lastname
    And user enter date of birth
    And user enter email
    And user enter company name
    And user enter password and Reenter Password
    Then user click register button
    And user have a welcome message with color
#    Scenario: user register with invalid data
#     Scenario: user register with already registered email
