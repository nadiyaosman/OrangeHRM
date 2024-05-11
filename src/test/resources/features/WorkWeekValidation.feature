#Author : Can
Feature: Navigating Work Week details “More“ Dropdown and Select Work Week option

  Background: 
    Given I enter a valid username and  password to navigate HRM dashboard

  @regression
  Scenario: Navigate to Work Week Dropdown
    Given I navigated to Landing on user dashboard
    When I Click on “PIM” than “Employee List” from left panel
    And I select user from Employee list
    And I Lands on Employee Details and click on More to display drop-down
    And I select “Work Week” from dropdown menu
    And I able to navigate to “Work Week Page”
    And I able to Display to Work Week Page with the below headers
      | Day       |
      | Type      |
      | Shift In  |
      | Shift Out |
      | Lunch In  |
      | Lunch Out |
      | Duration  |
    And I Update Work Week ONLY from "09:00" to "18:00" with "14:00" Lunch in "15:00" Lunch out break
    Then Click on “Save” button and display success message
   
