package com.neotech.pages;

import org.openqa.selenium.support.PageFactory;

import com.neotech.utils.CommonMethods;

public class EmployeeListPageElements extends CommonMethods {
	
	
	
	public EmployeeListPageElements() {
		
		PageFactory.initElements(driver, this);
	}

}
