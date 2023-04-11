#Feature: Web login
#
#  Scenario Outline: User should be able to login with valid credentials
#    Given the user is a <user>
#    When the user enters valid <credentials>
#    And hits submit
#    Then the user should be logged in successfully
#
#    Examples:
#      | user | credentials |
#      | test | pass        |
#
#  Scenario Outline: Login fail - possible combinations
#    Given user is on Application landing page
#    When user clicks on Sign in button
#    Then user is displayed login screen
#    When user enters "<UserName>" in username field
#    And user enters "<Password>" in password field
#    And clicks Sign in button
#    Then user gets login failed error message
#
#    Examples:
#      | UserName          | Password          |
#      | incorrectusername | 123456            |
#      | incorectpassword  | incorectpassword  |
#      | topblabla         | incorrectpassword |


