Feature: Automation Practice Test
  As a user i want to verify the shopping cart.
  Background:
    Given I am in home page

    Scenario: User able to add product in to cart successfully.
      When I mouse hover on "WOMEN"
      And I click on "CASUAL DRESSES"
      And  I mouse hover on Dress
      Then  I click on Add to cart


  Scenario: Verify  if user able to remove dress from shopping basket successfully.

    When I mouse hover on "WOMEN"
    And I click on "CASUAL DRESSES"
    And  I mouse hover on Dress
    And I click on Add to cart
    And I close window
    And I Mouse Hover on cart
    And I click on cross button
   Then I should see message "Your shopping cart is empty."


  Scenario: Verify User able to search summer dress with in the price range.
    When I mouse hover on "WOMEN"
    And I click on "SUMMER DRESSES"
    Then I able to select price range
