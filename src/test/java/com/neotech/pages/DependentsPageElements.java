package com.neotech.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.utils.CommonMethods;

public class DependentsPageElements extends CommonMethods {
	
	@FindBy(id = "txtUsername")
	public WebElement username;
	
	@FindBy(xpath="//li[@class='page-title']")
	public WebElement DashBoard;
	
	@FindBy(xpath="//*[@id=\"menu_pim_viewPimModule\"]/a/span[2]")
	public WebElement PIMPlus;
	
	@FindBy(xpath="//span[normalize-space()='Employee List']")
	public WebElement EmployeeList;
	
	//@FindBy(xpath="//*[@id='employeeListTable']/tbody/tr[1]/td[3]")
	//public WebElement SelectEmp;
	
	@FindBy(xpath="//table[@id='employeeListTable']/tbody//td[2]")
	public List<WebElement> SelectEmp;
	
	@FindBy(xpath="//*[@id='top-menu-trigger']/i")
	public WebElement TopMenu;
	
	@FindBy(xpath="//span[@translate='Dependents']")
	public WebElement Dependents;
	
	@FindBy(xpath="//a[@ng-click='dependents.addDependent()']//i[@class='material-icons'][normalize-space()='add']")
	public WebElement AddDependent;
	
	@FindBy(xpath="//div[@class='modal-content']")
	public WebElement AddDependentFrame;
	
	@FindBy(xpath="//input[@id='name']")
	public WebElement DependentFullName;
	
	@FindBy (xpath= "//label[@for='relationship_type']/parent::div/div/button")
	public WebElement RelationshipSelect;
	
	@FindBy(xpath="//a[@id='bs-select-1-1']")
	public WebElement ChildSelect;
	
	@FindBy(xpath="//input[@id='date_of_birth']/following-sibling::div/div/button")
	public WebElement Calendar;
	
	@FindBy(xpath="//select[@class='picker__select--year selectpicker initialized']/following-sibling::button")
	public WebElement YearButton;
	
	@FindBy(id = "//div[@class='dropdown bootstrap-select picker__select--year show']//li")
	public List<WebElement> yearOptions;
	
	@FindBy(xpath="//div[@class='dropdown bootstrap-select picker__select--month']//button")
	public WebElement MonthButton;
	
	@FindBy(xpath= "//div[@class='dropdown bootstrap-select picker__select--month show']//li")
	public List<WebElement> MonthOptions;
	
	@FindBy(xpath = "//label[@for='date_of_birth']/following-sibling::div//td")
	public List<WebElement> DayOptions;
	
	@FindBy(xpath="//input[@id='date_of_birth']")
	public WebElement BirthDate;
	
	@FindBy(xpath="//button[@id='modal-save-button']")
	public WebElement Save;
	
	@FindBy(xpath="div.toast-message")
	public WebElement DependentsAddedSuccessfully;
	
	
	public DependentsPageElements() {
		
		PageFactory.initElements(driver, this);
	}

}
