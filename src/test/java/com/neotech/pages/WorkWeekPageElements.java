package com.neotech.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.utils.CommonMethods;

public class WorkWeekPageElements extends CommonMethods {
	
	@FindBy(id = "txtUsername")
	public WebElement username;
	
	@FindBy(xpath="//li[@class='page-title']")
	public WebElement DashBoard;
	
	@FindBy(xpath="//*[@id='menu_pim_viewPimModule']/a/span[3]")
	public WebElement PIMPlus;
	
	@FindBy(xpath="//*[@id='menu_pim_viewEmployeeList']/span[2]")
	public WebElement EmployeeList;
	
	@FindBy(xpath="//*[@id='employeeListTable']/tbody/tr[1]/td[3]")
	public WebElement SelectEmp;
	
	@FindBy(xpath="//*[@id='personal_details_tab']")
	public WebElement EmployeeDetails;
	
	@FindBy(xpath="//*[@id='top-menu-trigger']/i")
	public WebElement TopMenu;
	
	@FindBy(xpath="//*[@id=\"top-menu-overflow\"]/li[6]/a")
	public WebElement WorkWeek;
	
	@FindBy(xpath="//*[@id=\"work_week_tab\"]/h4")
	public WebElement WorkWeekTitle;
	
	@FindBy(xpath="//*[@id=\"work-week-form\"]/table/tbody/tr[2]/th")
	public List <WebElement> WorkWeekHeaders;
	
	
	@FindBy(xpath="//*[@id=\"work-week-form\"]/table/tbody/tr[3]/td[3]/div/time-picker-work-week/div/input")
	public WebElement ShiftIn;
	
	@FindBy(xpath="//*[@id=\"work-week-form\"]/table/tbody/tr[3]/td[4]/div/time-picker-work-week/div/input")
	public WebElement ShiftOut;
	
	@FindBy(xpath="//*[@id=\"work-week-form\"]/table/tbody/tr[3]/td[5]/div/time-picker-work-week/div/input")
	public WebElement LunchIn;
	
	@FindBy(xpath="//*[@id=\"work-week-form\"]/table/tbody/tr[3]/td[6]/div/time-picker-work-week/div/input")
	public WebElement LunchOut;
	
	@FindBy(xpath="//*[@id=\"work-week-form\"]/table/tbody/tr[3]/td[7]/input")
	public WebElement durationTime;
	
	@FindBy(xpath="//*[@id=\"work-week-form\"]/div/a")
	public WebElement SaveButton;
	
	@FindBy(xpath="//*[@class='toast-message']")
	public WebElement SaveMessage;
	
	
	
	public WorkWeekPageElements() {
		
		PageFactory.initElements(driver, this);
	}

}
