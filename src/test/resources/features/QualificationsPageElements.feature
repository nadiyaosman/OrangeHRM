@Qualifications
Feature: Edit Qualifications Details

  As an admin
  I should be able to edit qualifications details
  So that I can manage user qualifications effectively

  Scenario: Editing qualifications details
    Given I am logged in as an admin
    When I navigate to the Personal Details Page
    Then I should see the "More" Dropdown in the top right corner of the page

    When I expand the "More" Dropdown
    Then I should see the "Qualifications" option

    When I select the "Qualifications" option
    Then I should be navigated to the Qualifications page

    When I hover over the "+" sign
    Then I should see options to add Work Experience, Education, Skill, Language, and License

    When I click on "Work Experience"
    Then I should see the modal titled "Work Experience"

    When I fill in the following fields in the "Work Experience" modal:
     
