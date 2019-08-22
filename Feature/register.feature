Feature: OnlineShopping

  @tag2
  Scenario: Register successfully
    Given Launch Browser and Application
    When I sign in with login credentials
    When I am placing order
    And I check out the product
    Then I am doing shipping & payments
    And Confirming order
