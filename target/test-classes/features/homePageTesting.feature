@test4
Feature: Exercises

  Scenario: Exercise 1
    Given I access the https://www.automationtesting.co.uk page
    When I click the menu button
    And I click the home page link
    Given I access the https://www.automationtesting.co.uk page
    Then I access the "Selenium Webdriver & Java" link
    And I verify that I am redirected to the examples page

  Scenario: Exercise 2
    Given I access the https://www.automationtesting.co.uk page
    When I click the menu button
    And I click the home page link
    Then I should be redirected to the Cucumber BDD with Selenium & Java examples
    And I verify that I am redirected to the Cucumber BDD with Selenium&Java examples page

  Scenario: Exercise 3
    Given I access the https://www.automationtesting.co.uk page
    When I click the menu button
    And I click the home page link
    Then I should be redirected to the Selectors/Locator course page
    And I verify that I am redirected to the Mastering Selectors/Locators page




