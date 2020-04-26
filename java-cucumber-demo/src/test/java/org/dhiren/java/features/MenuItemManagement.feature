Feature: Menu Management

  Background: : Add a menu item
    Given I have a menu item name "Fish Biryani" and price 200
    When I add that menu item
    Then Menu item with name "Fish Biryani" should be added

  @RegularTest @FinalTest @IndividualTest
  Scenario: Add 1st menu item
    Given I have a menu item name "Chicken Biryani" and price 300
    When I add that menu item
    Then Menu item with name "Chicken Biryani" should be added

  @RegularTest @FinalTest @IndividualTest
  Scenario: Add 2nd menu item
    Given I have a menu item name "Mutton Biryani" and price 300
    When I add that menu item
    Then Menu item with name "Mutton Biryani" should be added

  @RegularTest @FinalTest @IndividualTest
  Scenario: Add 3rd menu item
    Given I have a menu item name "Fish Biryani" and price 300
    When I add that menu item
    Then It should give an error message like "Duplicate Item"

  @RegularTest @ExistenceTest
  Scenario: Check both items are present
    Then Menu item with name "Mutton Biryani" and "Chicken Biryani" both exists

  @RegularTest @FinalTest
  Scenario: Calculate total price
    Then All Menu items should cost total price 2150

  @BuildTest
  Scenario: Calculate total price and existence
    Given I have a menu items "Fish Biryani" and "chicken Biryani" and price $300 and $400
    When I add those items
    Then All Menu items should cost total price 700
