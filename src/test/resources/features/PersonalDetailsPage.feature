Feature: Add Employee with Personal Details

  Background: 
    Given user is logged in with valid credentials username "<username>" and password "<password>" and loginBtn "<loginBtn>"
    And user navigates to PIM page, and clicks on add employee page

  @PersonalDetails
  Scenario Outline: Add and Modify Employee Details
    When user enters employee firstName "<firstName>" and lastName "<lastName>" and employeeId "<No>"
    And user selects a location from dropdown
    And user clisks save button
    Then I am able to add Employee personal Details "<DriverLicense>", "<ExpirationDate>",  "<OtherId>", "<NickName>", "<MilitaryService>", "<Smoker>", "<Gender>", "<Nationality>"
    And I click on Personal Details Save

    Examples: 
      | firstName | lastName | DriverLicense | ExpirationDate | OtherId | NickName | MilitaryService | Smoker | Gender | Nationality |
      | Zarina    | Dustova  | Z09098844     | 2024-09-09     | NO      | Zarra    | T1920           | NO     | Female | American    |

  @ExcelData
  Scenario: Add employee from excel
    When user enters employee data from "Employee" Excel sheet and saves the emplyee
 
 