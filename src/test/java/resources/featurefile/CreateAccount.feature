@smoke
Feature: Create Account Test

  As a user i should able to create account successful

  //@regression
  Scenario: As a user I want to create new account with valid credentials
    When User clicks on the sign in button from the homepage
    And enters an email in the email address field
    And clicks on create an account tab
    And fill all mandatory fields
      | Harry | Potter | abc12745 | 123 Abc Street | Dallas | Texas | 12345 |United States | 01234567890 |
    And click on register
    And verify my account text "MY ACCOUNT"
    Then verify user can see his name on top right "Harry Potter"

