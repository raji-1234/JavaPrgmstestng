Feature: This feature will be used to automate PizzaHut Website

  Scenario: This scenario will be used to Place the Order
    Given I have launched the application
    When I enter the location as "Pune"
    And I select the very first suggestion from the list
    Then I should land on the Deals page with page url "https://www.pizzahut.co.in/order/deals/"
    And I select the tab as "Pizzas"
    And I add "Kadhai Paneer" to the basket
    And I note down the price displayed on the screen
    Then I should see the pizza "Personal Kadhai Paneer" is added to the cart
    And price is also displayed correctly
    And I click on the Checkout button
    Then I should be landed on the secured checkout page with url " https://www.pizzahut.co.in/order/checkout/"
    And I enter the First Name "Rajesh"
    And I enter the Mobile  "99999999999"
    And I enter the email "Rajesh@yopmail.com"

  Scenario Outline: This scenario will be used to Place the Order
    Given I have launched the application
    When I enter the location as "Pune"
    And I select the very first suggestion from the list
    Then I should land on the Deals page with page url "https://www.pizzahut.co.in/order/deals/"
    And I select the tab as "<PizzaName>"
    And I add "<PizzaName>" to the basket
    And I note down the price displayed on the screen
    Then I should see the pizza "<PizzaName>" is added to the cart
    And price is also displayed correctly
    And I click on the Checkout button
    Then I should be landed on the secured checkout page with url " https://www.pizzahut.co.in/order/checkout/"
    And I enter the First Name "Rajesh"
    And I enter the Mobile  "99999999999"
    And I enter the email "Rajesh@yopmail.com"

    Examples: 
      | PizzaName          |
      | Kadhai Paneer      |
      | Royal Spice Paneer |
