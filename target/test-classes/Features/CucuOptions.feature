Feature: Verifying Adactin login details

  Scenario Outline: Verifying adactin login details with valid credentials
    Given User is on the adactin page
    When User should login with mandatory fields "<userName>" and "<passWord>"
    Then User should verify after login success msg

    Examples: 
      | userName           | passWord  |
      | DineshShanmugam123 | Dinesh123 |
