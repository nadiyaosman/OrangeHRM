package com.neotech.utils;

public class Constants {

	//The path to the properties file
	public static final String CONFIGURATION_FILEPATH = System.getProperty("user.dir") + "/src/test/resources/configs/configuration.properties";

	
	public static final String REPORT_FILEPATH = System.getProperty("user.dir") + "/target/html-report/HRM.html";
	
	//The path to the file that screenshots are saved
	public static final String SCREENSHOT_FILEPATH = System.getProperty("user.dir") + "/screenshots/";
	
	
	public static final int IMPLICIT_WAIT_TIME = 10;

	public static final int EXPLICIT_WAIT_TIME = 30;

}
