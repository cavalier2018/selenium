package com.demo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.github.javafaker.Faker;

public class ContactUsPage {
	
	private WebDriver driver;
	
	public ContactUsPage(WebDriver driver){
		this.driver = driver;
	}
	
	public void verifyContactUsPage() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.name("firstName"))));
		String headerText = driver.findElement(By.xpath("//h1")).getText();
		Assert.assertEquals(headerText, "Contact our Sales Team");
	}

	public void fillContactUsForm() {
		Faker faker = new Faker();
		String firstName=faker.name().firstName();
		String lastName=faker.name().lastName();
		String phone = faker.phoneNumber().phoneNumber();
		String email = faker.internet().safeEmailAddress();
		
		driver.findElement(By.name("firstName")).sendKeys(firstName);
		driver.findElement(By.name("lastName")).sendKeys(lastName);
		driver.findElement(By.name("email")).sendKeys(email);
		driver.findElement(By.name("phone")).sendKeys(phone);
		driver.findElement(By.name("company")).sendKeys("securepay");
		driver.findElement(By.name("website")).sendKeys("https://www.securepay.com.au/");
		Select select = new Select(driver.findElement(By.name("amount")));
		select.selectByVisibleText("$100,000 to $250,000");
		driver.findElement(By.name("message")).sendKeys("This is testing purpose");
	}

}
