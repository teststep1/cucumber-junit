Feature: Login

  @temp
  Scenario: Login with valid user
    Given I am on the login page
    When I fill in Username with "standard_user" value
    And I fill in password with "secret_sauce" value
    And I click on login button
