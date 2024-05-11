package com.neotech.steps;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WorkWeek extends CommonMethods {

	@Given("I enter a valid username and  password to navigate HRM dashboard")
	public void i_enter_a_valid_and_to_navigate_hrm_dashboard() {
		
		sendText(loginPage.username, ConfigsReader.getProperty("username"));
		sendText(loginPage.password, ConfigsReader.getProperty("password"));
		click(loginPage.loginBtn);
		wait(1);
	}

	@Given("I navigated to Landing on user dashboard")
	public void i_navigated_to_landing_on_user_dashboard() {
		waitForVisibility(workWeekPage.DashBoard);

		if (workWeekPage.DashBoard.isDisplayed()) {
			System.out.println("Landed on User Dashboard");
		}
		wait(3);
	}

	@When("I Click on “PIM” than “Employee List” from left panel")
	public void i_click_on_pim_than_employee_list_from_left_panel() {
		click(workWeekPage.PIMPlus);
		wait(1);

		if (workWeekPage.EmployeeList.isDisplayed()) {
			click(workWeekPage.EmployeeList);
		}
	}

	@When("I select user from Employee list")
	public void i_select_user_from_employee_list() {
		wait(2);
		click(workWeekPage.SelectEmp);
	}

	@When("I Lands on Employee Details and click on More to display drop-down")
	public void i_lands_on_employee_details_and_click_on_more_to_display_drop_down() {

		if (workWeekPage.EmployeeDetails.isDisplayed()) {
			System.out.println("Employee Details is Displayed");

		}

		wait(1);

	}

	@When("I select “Work Week” from dropdown menu")
	public void i_select_work_week_from_dropdown_menu() {
		click(workWeekPage.TopMenu);
		click(workWeekPage.WorkWeek);
		wait(1);
	}

	@When("I able to navigate to “Work Week Page”")
	public void i_able_to_navigate_to_work_week_page() {
		if(workWeekPage.WorkWeekTitle.isDisplayed()) {
			System.out.println("Work Week Table is Displayed");
		}
	}

	@When("I able to Display to Work Week Page with the below headers")
	public void i_able_to_display_to_work_week_page_with_the_below_headers(DataTable dataTable) {
		
		List<String> expectedList = dataTable.asList();
		List<String> actualList = new ArrayList();
		
		for(WebElement el : workWeekPage.WorkWeekHeaders) {
			actualList.add(el.getText());
		}
		
		System.out.println("Actual List: " + actualList);
		
		Assert.assertEquals(expectedList,actualList);
	}

	@When("I Update Work Week ONLY from {string} to {string} with {string} Lunch in {string} Lunch out break")
	public void i_update_work_week_only_from_to_with_lunch_in_lunch_out_break(String shiftIn, String shiftOut, String LunchIn, String LunchOut) {
	    sendText(workWeekPage.ShiftIn,shiftIn);
	    sendText(workWeekPage.ShiftOut,shiftOut);
	    sendText(workWeekPage.LunchIn,LunchIn);
	    sendText(workWeekPage.LunchOut,LunchOut);
	    
	    if(workWeekPage.durationTime.getText().equalsIgnoreCase("8.000")) {
	    	System.out.println("Time Sheet submission successs with 1 hour lunch break");
	    }
	}

	@Then("Click on “Save” button and display success message")
	public void click_on_save_button_and_display_success_message() {
		click(workWeekPage.SaveButton);
		if(workWeekPage.SaveMessage.isDisplayed()) {
			System.out.println("Save Message Displayed Successfully");
		}
	}

	

}
