package com.demo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GooglePage {
	
	private WebDriver driver;
	
	public GooglePage(WebDriver driver){
		this.driver = driver;
	}

	public void search(String text) {
		driver.findElement(By.cssSelector("[name='q']")).sendKeys(text);
		driver.findElement(By.xpath("(//*[@name='btnK'])[2]")).click();
	}
	
	public void clickOnSearhResult(String searchLink) {
		driver.findElement(By.xpath("//a[contains(@href, '"+searchLink+"')]")).click();	
	}
}
