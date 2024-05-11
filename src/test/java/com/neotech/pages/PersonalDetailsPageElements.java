package com.neotech.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.testbase.BaseClass;
import com.neotech.utils.CommonMethods;

public class PersonalDetailsPageElements extends CommonMethods {
	
	@FindBy(id = "txtUsername")
	public WebElement username;

	@FindBy(id = "txtPassword")
	public WebElement password;

	@FindBy(xpath = "//button")
	public WebElement loginBtn;

	@FindBy(id = "menu_pim_viewPimModule")
	public WebElement PIM;

	@FindBy(linkText = "Add Employee")
	public WebElement addEmployeePage;
	
	@FindBy(xpath = "//*[@id='first-name-box']")
	public WebElement firstNameBox;

	@FindBy(xpath = "//*[@id='middle-name-box']")
	public WebElement middleName;

	@FindBy(xpath = "//*[@id='last-name-box']")
	public WebElement lastNameBox;

	@FindBy(xpath = "//*[@id='employeeId']")
	public WebElement empId;

	@FindBy(xpath = "//select[@id='location']")
	public WebElement location;
	
	@FindBy(id = "hasLoginDetails")
	public WebElement loginDetailsToggle;
	
	@FindBy(id = "username")
	public WebElement userName;

	@FindBy(id = "password")
	public WebElement passWord;

	@FindBy(id = "confirmPassword")
	public WebElement confirmPassword;


	@FindBy(xpath = "//*[@id='modal-save-button']")
	public WebElement saveBtn;

	@FindBy(id = "menu_pim_viewEmployeeList")
	public WebElement employeeList;

	@FindBy(xpath = "//li[@id='menu_news_More']/a")
	public WebElement moreMenuItem;

	@FindBy(id = "employee_name_quick_filter_employee_list_value")
	public WebElement searchBox;

	@FindBy(id = "quick_search_icon")
	public WebElement searchIcon;

	@FindBy(xpath = "//div[@id='menu-content']/ul/li")
	public List<WebElement> menuList;

	@FindBy(id = "pim.navbar.employeeName")
	public WebElement fullName;

	@FindBy(id = "firstName")
	public WebElement firstName;

	@FindBy(id = "employeeId")
	public WebElement employeeId;

	@FindBy(id = "pimPersonalDetailsForm")
	public WebElement personalDetailsForm;

	@FindBy(id = "otherId")
	public WebElement otherId;

	@FindBy(id = "licenseNo")
	public WebElement drivingLicense;

	@FindBy(id = "nickName")
	public WebElement nickName;

	@FindBy(id = "militaryService")
	public WebElement militaryService;

	@FindBy(xpath = "//label[text()='Smoker']")
	public WebElement smokerBox;

	@FindBy(id = "emp_gender")
	public WebElement genderDD;

	@FindBy(xpath = "//div[@id='emp_gender_inputfileddiv']/div/input")
	public WebElement genderInput;

	@FindBy(xpath = "//div[@id='emp_gender_inputfileddiv']/div/ul/li")
	public List<WebElement> genderOptions;

	@FindBy(xpath = "//div[@id='nation_code_inputfileddiv']/div/input")
	public WebElement nationInput;

	@FindBy(xpath = "//div[@id='nation_code_inputfileddiv']/div/ul/li")
	public List<WebElement> nationOptions;

	@FindBy(xpath = "//input[@id='emp_dri_lice_exp_date']/following-sibling::span[1]//i")
	public WebElement licExpDate;

	@FindBy(xpath = "//input[@id='emp_dri_lice_exp_date']/following-sibling::span[1]//div[@class='select-wrapper picker__select--year']/input")
	public WebElement licExpYearInput;

	@FindBy(xpath = "//input[@id='emp_dri_lice_exp_date']/following-sibling::span[1]//div[@class='select-wrapper picker__select--year']/ul/li")
	public List<WebElement> licExpYearOptions;

	@FindBy(xpath = "//input[@id='emp_dri_lice_exp_date']/following-sibling::span[1]//div[@class='select-wrapper picker__select--month']/input")
	public WebElement licExpMonthInput;

	@FindBy(xpath = "//input[@id='emp_dri_lice_exp_date']/following-sibling::span[1]//div[@class='select-wrapper picker__select--month']/ul/li")
	public List<WebElement> licExpMonthOptions;

	@FindBy(xpath = "//input[@id='emp_dri_lice_exp_date']/following-sibling::span[1]//table/tbody/tr/td")
	public List<WebElement> licExpDays;

	@FindBy(xpath = "//form[@id='pimPersonalDetailsForm']//button[@type='submit']")
	public WebElement detailsSaveBtn;

	@FindBy(linkText = "Add Employee")
	public WebElement addEmployeeLink;
	
	
	public PersonalDetailsPageElements() {
		PageFactory.initElements(driver, this);
	}

}
