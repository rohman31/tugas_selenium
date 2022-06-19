package com.juaracoding.tugasselenium.main;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

import com.juaracoding.tugasselenium.driver.DriverSingelton;
import com.juaracoding.tugasselenium.pages.Registered;
import com.juaracoding.tugasselenium.pages.Login;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = DriverSingelton.getIntance().getDriver();
		driver.get("http://automationpractice.com/");
		
		
		Registered daftar = new Registered();
//		daftar.regis();
//		daftar.personalRegister();
//		daftar.addressRegister();
//		daftar.goToMenuForms();
		
		Login masuk = new Login();
		masuk.login();
		masuk.personalAkun();
//		masuk.logout();
		

//		try {
//			Thread.sleep(10000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		driver.quit();
	}

}
