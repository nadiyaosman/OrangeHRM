package com.neotech.pages;

import org.openqa.selenium.support.PageFactory;

import com.neotech.utils.CommonMethods;

public class ReportToPageElements extends CommonMethods{
	
	
	
	public ReportToPageElements() {
		
		PageFactory.initElements(driver, this);
	}

}
