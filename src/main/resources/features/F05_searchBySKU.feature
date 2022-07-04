@regression
Feature: user login search by SKU for to find a product
  Scenario: user using search input for find product by SKU
    When user write product name ' M8_HTC_5L' in search input
    And  user click the search button to find ele
    Then user find the product he looks for it 'M8_HTC_5L'
