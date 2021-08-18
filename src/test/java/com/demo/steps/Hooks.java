package com.demo.steps;

import com.demo.utils.WebDriverFactory;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class Hooks {

	@Before
	public void setup() {
		WebDriverFactory.setupDriver();

	}

	@After
	public void tearDown() {
		WebDriverFactory.getDriver().close();
	}

	@BeforeStep
	public void beforeStep() {
		System.out.println("Before step executed");
	}

	@AfterStep
	public void afterStep() {
		System.out.println("After Step executed");
	}
}
