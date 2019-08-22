Feature: OnlineWebShopping

  @tag4
  Scenario: Register successfully
    Given Launch Browser and Application
    When sign in with login credentials

  @data
  Scenario: Change Quantity and Address
    When placing order
    And check out the product
    Then shipping & payments
    And Confirming order
