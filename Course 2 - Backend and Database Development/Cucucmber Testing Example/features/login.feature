Feature: Login Functionality 

Scenario: Successful login with valid credentials
    Given I navigate to the login page 
    When I enter valid username and password
    And I click on the login button for success
    Then I should be redirected to the home page

Scenario: Unsuccessful login with invalid credentials
    Given I navigate to the login page
    When I enter invalid username and password
    And I click on the login button for failure
    Then I should see an error message indicating invalid credentials

