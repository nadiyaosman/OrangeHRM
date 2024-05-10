#Author: Kacie
@login
Feature: Login to HRM

  
  Scenario: Valid Login
    
    #Given I navigated to the HRM website
    When I enter a valid username
    And I enter a valid password
    And I click the login button
    Then I validate I am logged in
    #And I will quit the browser

  
  Scenario: Invalid Login
    
    When I enter a valid username
    And I enter an invalid password
    And I click the login button
    Then I validate invalid credentials


  Scenario: Blank Password
    
    When I enter a valid username
    And I click the login button
    Then I validate password error
