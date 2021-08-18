package com.demo.steps;

import org.openqa.selenium.support.PageFactory;

import com.demo.pages.ContactUsPage;
import com.demo.pages.GooglePage;
import com.demo.pages.HomePage;
import com.demo.utils.Configuration;
import com.demo.utils.WebDriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
	
	GooglePage googlePage = PageFactory.initElements(WebDriverFactory.getDriver(), GooglePage.class);
	HomePage homePage = PageFactory.initElements(WebDriverFactory.getDriver(), HomePage.class);
	ContactUsPage contactUsPage = PageFactory.initElements(WebDriverFactory.getDriver(), ContactUsPage.class);
	

	@Given("I am on google home page")
	public void i_am_on_google_home_page() throws Exception {
		WebDriverFactory.getDriver().navigate().to(Configuration.getConfig("URL"));
	}

	@When("I search {string} in google")
	public void i_search_in_google(String text) {		
		googlePage.search(text);

	}

	@When("I click on {string} in search result")
	public void i_click_on_in_search_result(String searchWebSite) {
		googlePage.clickOnSearhResult(searchWebSite);
	}

	@When("I navigate to SecurePay contact us page")
	public void i_navigate_to_secure_pay_contact_us_page() {
		homePage.clickOnContactUs();
	}

	@Then("I verify contact us page loaded")
	public void i_verify_contact_us_page_loaded() {
		contactUsPage.verifyContactUsPage();
	}

	@When("I fill contact us form fields")
	public void i_fill_contact_us_form_fields() {
		contactUsPage.fillContactUsForm();
	}

}
