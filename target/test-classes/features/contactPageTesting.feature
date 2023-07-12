@test1
Feature: The form page testing

  Scenario: Verify the fields from form page
    Given I access the https://www.automationtesting.co.uk page
    And I click on the 'Contact us from test' link from the menu list
    And I fill with all the information in the contact form  page
    Then I click the Submit button after all fields are completed
    And I verify that I am redirected to the confirmation message for submitted form