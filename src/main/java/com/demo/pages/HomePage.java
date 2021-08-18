package com.demo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	private WebDriver driver;
	
	public HomePage(WebDriver driver){
		this.driver = driver;
	}
	
	public void clickOnContactUs() {
		driver.findElement(By.xpath("//a[@id='icon-chevron-right']/span[text()='Contact us']")).click();		
	}

}
