Feature: Login Page
  Scenario Outline: Verify error message for invalid login
    Given user goes to login page
    When user login with username "<username>" and password "<password>"
    Then verifies the error message "<errorMessage>"

    Examples:
      | username       | password       | errorMessage                        |
      | invalid_user1  | invalid_pass1  | Epic sadface: Username and password do not match any user in this service |
      | invalid_user2  | invalid_pass2  | Epic sadface: Username and password do not match any user in this service |
      | invalid_user3  | invalid_pass3  | Epic sadface: Username and password do not match any user in this service |
      | invalid_user4  | invalid_pass4  | Epic sadface: Username and password do not match any user in this service |