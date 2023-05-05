@test6
Feature: The DropDown page testing

  Scenario: The user access the dropDown page from Menu
    Given the user access the https://www.automationtesting.co.uk page
    When the user clicked on the menu button
    Then the user can choose one of the option from dropdown list
    And I verify the selected option is displayed


