@test2
Feature: Exercises on RadioButtons page

  Scenario: Click on the "One" radio button
    Given the user access the https://www.automationtesting.co.uk page
    When the user clicked on the menu button
    Then the user clicked on the "one" radio button from Radio Buttons list
    And I verify that the radio button one is selected after performing the action 'click'

  Scenario: Click on the "Two" radio button
    Given the user access the https://www.automationtesting.co.uk page
    When the user clicked on the menu button
    Then the user clicked on the "two" radio button from Radio Buttons list
    And I verify that the radio button two is selected after performing the action 'click'
