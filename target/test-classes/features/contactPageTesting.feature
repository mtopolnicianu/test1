@test1
Feature: Exercises

  Scenario: Verify the fields form
    Given I access the https://www.automationtesting.co.uk page
    And I click on the 'Contact us from test' link from the menu list
    And I fill with all the information in the contact form  page
    Then I click Submit the form