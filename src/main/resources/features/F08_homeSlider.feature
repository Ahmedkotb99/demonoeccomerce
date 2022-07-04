@regression
Feature: user can change the slider and open in home page
  Scenario: user click first slider
    When user Click the first_slider
    Then user open the product which it clickable

  Scenario: user click second slider
    When user Click the second_slider
    Then user open the product 2 which it clickable
