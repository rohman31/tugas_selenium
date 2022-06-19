package com.juaracoding.tugasselenium.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox implements DriverStrategy{

	public WebDriver setStrategy() {
	System.setProperty("webdriver.chrome.driver", "/Users/rohman/Documents/geckodriver");
	WebDriver driver = new FirefoxDriver();
	return driver;
	
		
	}
}
