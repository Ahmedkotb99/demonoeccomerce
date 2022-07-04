@regression
Feature: user login in to the webSite
  #Background: user navigate to the login page

  Scenario: user login with valid Data
    Given user go to login url
     When user login with valid email and password
     Then user click on the login button
  #And user go to home page successfully

