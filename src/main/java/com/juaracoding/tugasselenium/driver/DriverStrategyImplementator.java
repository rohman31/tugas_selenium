package com.juaracoding.tugasselenium.driver;

public class DriverStrategyImplementator {

	public static DriverStrategy chooseStrategy(String strategy) {
		// TODO Auto-generated method stub
		
		switch (strategy) {
		case "chrome":
			return new Chrome();

		case "firefox":
			return new Firefox();
		default:
			return null;
		}

	}

}
