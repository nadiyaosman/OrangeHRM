package com.neotech.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;
import com.neotech.utils.ExcelUtility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PersonalDetailsPage extends CommonMethods {

	@Given("user is logged in with valid credentials username {string} and password {string} and loginBtn {string}")
	public void user_is_logged_in_with_valid_credentials_username_and_password_and_login_btn(String username,
			String password, String loginBtn) {

		sendText(personalDetailsPage.username, ConfigsReader.getProperty("username"));
		sendText(personalDetailsPage.password, ConfigsReader.getProperty("password"));
		click(personalDetailsPage.loginBtn);

	}

	@When("user navigates to PIM page, and clicks on add employee page")
	public void user_navigates_to_pim_page_and_clicks_on_add_employee_page() {
		click(personalDetailsPage.PIM);
		click(personalDetailsPage.addEmployeePage);

	}

	@When("user enters employee firstName {string} and lastName {string} and employeeId {string}")
	public void user_enters_employee_first_name_and_last_name_and_employee_id(String firstName, String lastName,
			String employeeId) {
		waitForClickability(personalDetailsPage.firstNameBox);
		sendText(personalDetailsPage.firstNameBox, firstName);
		sendText(personalDetailsPage.lastNameBox, lastName);
		sendText(personalDetailsPage.employeeId, employeeId);

	}

	@When("user selects a location from dropdown")
	public void user_selects_a_location_from_dropdown() {
		selectDropdown(personalDetailsPage.location, "Australian Regional HQ");
	}

	@When("user clisks save button")
	public void user_clisks_save_button() {
		click(personalDetailsPage.saveBtn);
		wait(1);
	}

	@Then("I am able to add Employee personal Details {string}, {string},  {string}, {string}, {string}, {string}, {string}, {string}")
	public void i_am_able_to_add_employee_personal_details(String driverLicense, String expirationDate, String otherId,
			String nickName, String militaryService, String smoker, String gender, String nationality) {

		waitForVisibility(personalDetailsPage.personalDetailsForm);
		sendText(personalDetailsPage.otherId, otherId);
		sendText(personalDetailsPage.nickName, nickName);
		sendText(personalDetailsPage.militaryService, militaryService);
		sendText(personalDetailsPage.drivingLicense, driverLicense);

		if (smoker.equals("Yes")) {
			click(personalDetailsPage.smokerBox);
		}

		click(personalDetailsPage.genderInput);
		List<WebElement> genderOptions = personalDetailsPage.genderOptions;
		clickOnElement(genderOptions, gender);

		click(personalDetailsPage.nationInput);
		clickOnElement(personalDetailsPage.nationOptions, nationality);

		click(personalDetailsPage.licExpDate);

		String[] dateParts = expirationDate.split("-");

		click(personalDetailsPage.licExpYearInput);
		clickOnElement(personalDetailsPage.licExpYearOptions, dateParts[0]);

		int month = Integer.parseInt(dateParts[1]);
		click(personalDetailsPage.licExpMonthInput);
		click(personalDetailsPage.licExpMonthOptions.get(month - 1));

		int day = Integer.parseInt(dateParts[2]);
		selectCalendarDate(personalDetailsPage.licExpDays, day + "");

		wait(2);
	}

	public void clickOnElement(List<WebElement> list, String value) {
		wait(1);
		for (WebElement option : list) {
			if (option.getText().equals(value)) {
				click(option);
				break;
			}
		}
	}

	@Then("I click on Personal Details Save")
	public void i_click_on_personal_details_save() {

		jsClick(personalDetailsPage.detailsSaveBtn);
	}

	@When("user enters employee data from {string} Excel sheet and saves the emplyee")
	public void user_enters_employee_data_from_excel_sheet_and_saves_the_emplyee(String Employee) {
		String path = System.getProperty("user.dir") + "/src/test/resources/testdata/Excel.xlsx";

		waitForClickability(personalDetailsPage.firstNameBox);
		List<Map<String, String>> exList = ExcelUtility.excelIntoListOfMaps(path, "Employee");
		for (Map<String, String> employee : exList) {

			String firstName = employee.get("FirstName");
			String lastName = employee.get("LastName");
			String location = employee.get("Location");
			String username = employee.get("Username");
			String password = employee.get("Password");

			sendText(personalDetailsPage.firstNameBox, firstName);
			sendText(personalDetailsPage.lastNameBox, lastName);
			selectDropdown(personalDetailsPage.location, location);

			jsClick(personalDetailsPage.loginDetailsToggle);

			sendText(personalDetailsPage.userName, username);
			sendText(personalDetailsPage.passWord, password); 
			sendText(personalDetailsPage.confirmPassword, password);
			wait(2);
			click(personalDetailsPage.saveBtn);
			
			waitForVisibility(personalDetailsPage.personalDetailsForm);

			String expected = firstName + " " + lastName;
			String actual = personalDetailsPage.fullName.getText(); 
			Assert.assertEquals("Employee NOT added!", expected, actual);
			
           wait(8);
			click(personalDetailsPage.addEmployeeLink);

		}

	}
}
