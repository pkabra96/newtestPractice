
Feature: The one where the user change some of the data and place the order

  @tag5
  Scenario: Login with valid credentials
    Given Navigate to Home page
    When User enters Username and password
    Then user logged in successfully
    
  @data_driven
  Scenario: Place order successfully 
    Given Browser and application
    When sign in with login credentials
    And placing order
    And checkout the product
    Then shipment and payment
    And Confirm order