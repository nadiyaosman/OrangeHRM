package com.neotech.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		//This is where feature files are stored
		features = "src/test/resources/features",
		
		
		//This is the package where we put our test steps for feature files 
		glue = "com.neotech.steps",
		
		
		//if dryRun is true and we run the TestRunner, it will show us unimplemented steps in the console
		//Then we can copy the unimplemented methods and paste them in steps	
		dryRun = true,
		
		monochrome = true,
		
		//We specify which group of scnearios we want to execute
		tags = "",
		
		
		plugin = {
				
				// This plugin generates a basic html file and saves it in the target folder
				"html:target/cucumber-default-report.html",
				
				//Generates a json file and store it in target folder
				"json:target/cucumber.json"		
		}	
		
)

public class TestRunner {

}
