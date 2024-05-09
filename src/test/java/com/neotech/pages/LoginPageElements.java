package com.neotech.pages;

import org.openqa.selenium.support.PageFactory;

import com.neotech.utils.CommonMethods;

public class LoginPageElements extends CommonMethods {
	
	
	
	public LoginPageElements() {
		
		PageFactory.initElements(driver, this);
	}

}
