@regression
Feature: user login search by name for to find a product
  Scenario: user using search input for find product
    When user write product name 'Nikon D5500 DSLR' in search input
    And  user click the search button
    Then user find the product he looks for it 'Nikon D5500 DSLR'