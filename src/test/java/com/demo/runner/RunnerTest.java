package com.demo.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(		
		features = "src/test/resources/features",	
		glue = { "com.demo.steps" }, 
		plugin = { "pretty",
				"html:target/cucumber-Report.html", "json:target/report.json" },
		tags="@Smoke")
public class RunnerTest {
	

}
