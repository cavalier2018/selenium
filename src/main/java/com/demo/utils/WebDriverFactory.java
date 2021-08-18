package com.demo.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverFactory {
	

	private static ThreadLocal<WebDriver> webdriver = new ThreadLocal<WebDriver>();
	
	public static void setupDriver() {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	
		webdriver.set(driver);
		webdriver.get().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		webdriver.get().manage().window().maximize();
	}
	
	public static WebDriver getDriver() {
		return webdriver.get();
	}
}
