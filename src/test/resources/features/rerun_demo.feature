@rerun
Feature: Rerunning failed scenarios

  Scenario: one
    Given User adds two numbers
    Then Result should be as expected

  Scenario: two
    Given User adds three numbers
    Then Result should be sum of three numbers

  Scenario: three
    Given User divides two numbers two numbers
    Then Result should be division results

  Scenario: four
    Given User multiplies two numbers
    Then Result should be multiplication results