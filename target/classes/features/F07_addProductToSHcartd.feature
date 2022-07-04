@regression
Feature: user login can add product to shopping card
  Background: user login website
#    Given user go to login url
#    When user login with valid email and password
#    Then user click on the login button

    Scenario: logged user  click on the wishList element "Build your own computer"
    When user click add First product"HTC One M8 Android L 5.0 Lollipop"
    Then user add item open page for the item and found details

    Scenario: logged user  click on the wishList element "Apple MacBook Pro 13-inch"
    When user click add second product "Apple MacBook Pro 13-inch"
    Then user add item open page for the item and found details"Apple MacBook Pro 13-inch"url page
#    Then the item  selected successfully
