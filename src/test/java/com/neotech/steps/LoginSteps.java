package com.neotech.steps;

import org.openqa.selenium.By;

import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps extends CommonMethods {

	@Given("I navigated to the HRM website")
	public void i_navigated_to_the_hrm_website() {
		setUp();
	}

	@When("I enter a valid username")
	public void i_enter_a_valid_username() {
		sendText(loginPage.username, ConfigsReader.getProperty("username"));
	}

	@When("I enter a valid password")
	public void i_enter_a_valid_password() {
		sendText(loginPage.password, ConfigsReader.getProperty("password"));
	}

	@When("I click the login button")
	public void i_click_the_login_button() {
		click(loginPage.loginBtn);
	}

	@Then("I validate I am logged in")
	public void i_validate_i_am_logged_in() {
		// if
		// need dashboard element for user
		String actual = driver.findElement(By.id("account-name")).getText();
		String expected = "Jacqueline White";

		if (actual.equals(expected)) {
			System.out.println("Jacqueline White is successfully logged in");
		} else {
			System.out.println("Login unsuccessful");
		}

	}

	@Then("I will quit the browser")
	public void i_will_quit_the_browser() {
		tearDown();
	}

	@When("I enter an invalid password")
	public void i_enter_an_invalid_password() {
		sendText(loginPage.password, "wrongPass23");
	}

	@Then("I validate invalid credentials")
	public void i_validate_invalid_credentials() {
		// wait
		String actual = loginPage.invalidCredMsg.getText();
		String expected = "Invalid Credentials";
		if (actual.equals(expected)) {
			System.out.println("Successfully displaying invalid credentials method");
		} else {
			System.out.println("Test failed- not displaying invalid credentials.");
		}
	}

	@Then("I validate password error")
	public void i_validate_password_error() {
		String actual = loginPage.passError.getText();
		String expected = "Password cannot be empty";
		if (actual.equals(expected)) {
			System.out.println("Successfully displaying password error");
		} else {
			System.out.println("Test failed-not displaying password error");
		}
	}

}
