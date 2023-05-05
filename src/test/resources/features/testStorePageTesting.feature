Feature: Exercises on TestStore page
  Scenario: The user access the TestStore page from Menu
    Given I access the https://www.automationtesting.co.uk page
    When I click the menu button
    Then I click to the testStore page
    And I verify that the testStore page is opened correctly

  Scenario: The user select the first item from store page
    Given I access the https://www.automationtesting.co.uk page
    When I click the menu button
    Then I click to the testStore page
    And I select the first item from testStore page with products
    And I have added into my cart the first item from testStore page
    Then I verify the successfully added to Cart message for the first item
