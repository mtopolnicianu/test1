
Feature: Buttons scenarios

  Scenario: Tests on the First Buttons link page
    Given I access the https://www.automationtesting.co.uk page
    When I choose the Buttons link from the menu list
    Then I click on the first button from button page
    And I verify that the confirmation message for button one appeared

  Scenario: Tests on the Second Buttons link page
    Given I access the https://www.automationtesting.co.uk page
    When I choose the Buttons link from the menu list
    Then I click on the "Button Two" from button page
    And I verify that the confirmation message for button two appeared
  @test
  Scenario: Tests on the Third Buttons link page
    Given I access the https://www.automationtesting.co.uk page
    When I choose the Buttons link from the menu list
    Then I click on the Button Three from button page
    And I verify that the confirmation message appeared


