Feature: Data Table

  @BillGenerationSingleTest
  Scenario: Bill Amount Generation
    Given I placed order for following items
          |Cucumber Sandwich|2|20|
    When I generate the bill
    Then A bill for $40 should be generated

  @BillGenerationMultipleTest
  Scenario: Bill Amount Generation
    Given I placed order for following items
      |Cucumber Sandwich|2|20|
      |Chicken Biryani |1 |220|
    When I generate the bill
    Then A bill for $40 should be generated