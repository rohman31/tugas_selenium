package com.juaracoding.tugasselenium.driver;

import java.security.DrbgParameters.Instantiation;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class DriverSingelton {

	private static DriverSingelton instance = null;
	private static WebDriver driver;
	
	public DriverSingelton() {
		instantiate("chrome");
		
	}

	public WebDriver instantiate(String strategy) {
		DriverStrategy driverStrategy = DriverStrategyImplementator.chooseStrategy(strategy);
		driver = driverStrategy.setStrategy();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		return driver;
	}
	
	public static DriverSingelton getIntance() {
		if(instance == null) {
			instance = new DriverSingelton();
		}
		return instance;
	}
	
	public static WebDriver getDriver() {
		return driver;
		
	}
}
