Feature: Exercises on TestStore page
  Scenario: The user access the TestStore page from Menu
    Given I access the https://www.automationtesting.co.uk page
    When I click the menu button
    Then I click to the testStore page
    And I verify that the testStore page is it opened correctly

  Scenario: The user select a t-shirt from popular products from store page
    Given I access the https://www.automationtesting.co.uk page
    When I click the menu button
    Then I click to the testStore page
    And I select the hummingbird T-Shirt
    And I have added into my cart the t-shirt
    Then I verify the total product
