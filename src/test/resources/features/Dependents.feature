#Author: Abdulaziz E
Feature: Adding Two Dependents With Personal Details

  Background: 
    Given I enter a valid username and password to navigate to HRM main page

  @aziz
  Scenario Outline: Navigate to Personal Details
    Given I navigate to dashboard
    When I click on PIM, then Employee List from left side menu
    And I select user from Employee List
    And I navigate to Employee Details page, and click on More to display drop-down box
    And I select dependents
    Then I click on Add Dependent
    When I enter dependent first name "<FirstName>" and last name "<LastName>"
    And I select relationship child from dropdown box
    And I click on calendar
    And I select Date of Birth "<BirthDate>"
    Then I click Save
    And I validate dependents added successfully

    Examples: 
      | FirstName | LastName | Relationship | BirthDate  |
      | Corazon   | Aquino   | Child        | 2007-05-09 |
      | Filippo   | Inzaghi  | Child        | 2010-01-07 |
