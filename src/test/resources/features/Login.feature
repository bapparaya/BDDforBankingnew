Feature: User Login

  Scenario: Successful login with valid credentials
    Given the user is on the login page
    When the user enters valid username "bapparaya" and password "Bappa@123"
    And clicks the login button
    Then the user should be redirected to the homepage

  Scenario: Verify login with invalid credentials
    Given the user is on the login page
    When the user enters valid username "bapparaya" and password "Bappa"
    And clicks the login button
    Then login should fail and user should remain on the login page

  Scenario: Verify all ATM services are displayed
    Given the user is on the login page
    Then the following ATM services should be displayed:
      | Withdraw Funds  |
      | Transfer Funds  |
      | Check Balances  |
      | Make Deposits   |
