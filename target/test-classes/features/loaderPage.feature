@test3
Feature: Exercises on Loader page

  Scenario: Tests for "Click me" button on the loader page
    Given I access the https://www.automationtesting.co.uk page
    When I click the menu button
    And I select the loader option from menu
    Then I click the "Click me" button
    And I verify that the confirmation for loading completed appeared