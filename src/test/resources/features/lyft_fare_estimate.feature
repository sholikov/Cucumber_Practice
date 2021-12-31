@lyft
Feature: Searching Lyft fare details

  As a rider, I should be able to enter pick up and drop off locations so that
  I can see the estimated fare

  Scenario: Fare estimate using City
    Given User is on lyft fare estimate page
    When User enters "Mclean, VA , USA" to pickup address
    And User enters "Woodbridge, VA, USA " to drop-off address
    And User clicks on get estimate button
    Then User should see estimated prices

  Scenario: Fare estimate using empty should show error
    Given User is on lyft fare estimate page
    When User enters "" to pickup address
    And User enters "" to drop-off address
    And User clicks on get estimate button
    Then User should see error message