@regression
Feature: guest user can add products to wishlist
  Scenario: success message is visible after add product to wishlist
    When user add product to wishlist
    Then wishlist notification success is visible

    Scenario: number of wishlist items in home page is increased
    When user add product to wishlist
    Then wishlist notification success is visible
      And user get the  number of wishlist items after adding product
      Then number of wishlist items increased

     Scenario:added products are displayed on wishlist page
     When user add product to wishlist
     Then wishlist notification success is visible
      And user get the  number of wishlist items after adding product
       And  user go to wishList page

