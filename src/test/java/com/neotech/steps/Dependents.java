package com.neotech.steps;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Dependents extends CommonMethods {

	@Given("I enter a valid username and password to navigate to HRM main page")
	public void i_enter_a_valid_username_and_password_to_navigate_to_hrm_main_page() {

		sendText(loginPage.username, ConfigsReader.getProperty("username"));
		sendText(loginPage.password, ConfigsReader.getProperty("password"));
		click(loginPage.loginBtn);
	}

	@Given("I navigate to dashboard")
	public void i_navigate_to_dashboard() {

		waitForVisibility(dependentsPage.DashBoard);

		if (dependentsPage.DashBoard.isDisplayed()) {
			System.out.println("User Dashboard is fully displayed");
		}
		wait(3);
	}

	@When("I click on PIM, then Employee List from left side menu")
	public void i_click_on_pim_then_employee_list_from_left_panel() {
		click(dependentsPage.PIMPlus);
		wait(1);

		if (dependentsPage.EmployeeList.isDisplayed()) {
			click(dependentsPage.EmployeeList);
		}
	}

	@When("I select user from Employee List")
	public void i_select_user_from_employee_list() {
		wait(1);
		List<WebElement> SelectEmp=dependentsPage.SelectEmp;
		clickOnElement(SelectEmp, "0044");
	}

	@When("I navigate to Employee Details page, and click on More to display drop-down box")
	public void i_land_on_employee_details_and_click_on_more_to_display_drop_down() {

		if (dependentsPage.EmployeeList.isDisplayed()) {
			System.out.println("Employee Details is Displayed");

		}

		wait(1);

	}

	@When("I select dependents")
	public void i_select_dependents() {

		click(dependentsPage.TopMenu);
		click(dependentsPage.Dependents);
		wait(1);

	}

	@Then("I click on Add Dependent")
	public void i_click_on_add_dependent() {

		click(dependentsPage.AddDependent);
		wait(2);
		
	}

	@When("I enter dependent first name {string} and last name {string}")
	public void i_enter_dependent_first_name_and_last_name(String FirstName, String LastName) {
		
		sendText(dependentsPage.DependentFullName, FirstName + " " + LastName);
		wait(2);
						
	}
	@When("I select relationship child from dropdown box")
	public void i_select_relationship_child_from_dropdown_box() {
		
		click(dependentsPage.RelationshipSelect);
		click(dependentsPage.ChildSelect);
		  
	}
	@When("I click on calendar")
	public void i_click_on_calendar() {
	
		click(dependentsPage.Calendar);
	   
		
	}
	@Then("I select Date of Birth {string}")
	public void i_select_date_of_birth(String BirthDate) {
		
		String [] arr = BirthDate.split("-");
		String year = arr[0];
		int month = Integer.parseInt(arr[1]);
		int day = Integer.parseInt(arr[2]);
		
		wait(1);
		click(dependentsPage.YearButton);
		
		clickOnElement(dependentsPage.yearOptions,year);
		click(dependentsPage.MonthButton);
		click(dependentsPage.MonthOptions.get(month-1));

		selectCalendarDate(dependentsPage.DayOptions, day + " ");
		
		wait(3);
		
	}	
	@Then("I click Save")
	public void i_click_save() {
	 
		click(dependentsPage.Save);
		wait(3);
	}
	@Then("I validate dependents added successfully")
	public void i_validate_dependents_added_successfully() {
	    
		String actualText =driver.findElement(By.xpath("//*[@class='toast-message']")).getText();
		String expectedText = "Successfully Saved";
		Assert.assertEquals(actualText, expectedText);
		System.out.println(actualText + "Successfully Saved");
		
	}	
	
	}


