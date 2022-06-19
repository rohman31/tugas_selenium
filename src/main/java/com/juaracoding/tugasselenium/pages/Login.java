package com.juaracoding.tugasselenium.pages;

import javax.swing.Scrollable;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.juaracoding.tugasselenium.driver.DriverSingelton;

public class Login {
	
	private WebDriver driver;
	
	public Login() {
		this.driver = DriverSingelton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	//Locator
	
	@FindBy(css = "#header > div.nav > div > div > nav > div.header_user_info > a")
	private WebElement btnSignin;
	
	
	@FindBy(id = "email")
	private WebElement email;
	
	@FindBy(id = "passwd")
	private WebElement password;
	
	@FindBy(id = "SubmitLogin")
	private WebElement btnLogin;
	
	@FindBy(css = "#header > div.nav > div > div > nav > div:nth-child(2)")
	private WebElement btnLogout;
	
	@FindBy(css = "#center_column > div > div:nth-child(1) > ul > li:nth-child(4) > a")
	private WebElement btnPersonalAkun;
	
	
	public void login() {
		btnSignin.click();
		scroll(driver);
		email.sendKeys("tes1@gmail.com");
		password.sendKeys("123456");
		btnLogin.click();
		tunggu();
	}
	
	public void personalAkun() {
		scroll(driver);
		btnPersonalAkun.click();
		scroll(driver);
		
	}
	
	public void logout() {
		btnLogout.click();
	}
	
	public static void scroll(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("scrollBy(0,1000)");
	}
	
	public static void tunggu() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
		
	public void tutupBrowser() {
		driver.close();
	}
	
	
	
}
