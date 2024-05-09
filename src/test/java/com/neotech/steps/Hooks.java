package com.neotech.steps;

import com.neotech.utils.CommonMethods;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends CommonMethods {

	@Before // will run before every scenario
	public void start() {

		setUp();
	}

	@After // will run after every scenario
	public void end(Scenario scenario) {

		
		byte[] picture;

		if (scenario.isFailed()) {
			// take a screenshot and store it in the given failed folder
			picture = takeScreenshot("failed/" + scenario.getName());
		} else {
			// take a screenshot and store it in the given passed folder
			picture = takeScreenshot("passed/" + scenario.getName());
		}

		scenario.attach(picture, "image/png", scenario.getName());

		tearDown();

	}

}
