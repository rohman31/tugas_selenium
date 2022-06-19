package com.juaracoding.tugasselenium.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.juaracoding.tugasselenium.driver.DriverSingelton;

public class Registered {
	
	private WebDriver driver;
	
	public Registered() {
		this.driver = DriverSingelton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "#header > div.nav > div > div > nav > div.header_user_info > a")
	private WebElement btnSignin;
	
	@FindBy(id = "SubmitCreate")
	private WebElement btnRegister;
	
	@FindBy(id = "email_create")
	private WebElement emailCreate;
	
	@FindBy(id = "id_gender1")
	private WebElement title;
	
	@FindBy(id = "customer_firstname")
	private WebElement firstName;
	
	@FindBy(id = "customer_lastname")
	private WebElement lastName;
	
	@FindBy(id = "email")
	private WebElement email;
	
	@FindBy(id = "passwd")
	private WebElement password;
	
	@FindBy(id = "days")
	private WebElement day;
	
	@FindBy(id = "months")
	private WebElement month;
	
	@FindBy(id = "years")
	private WebElement year;
	
	@FindBy(id = "newsletter")
	private WebElement news;
	
	@FindBy(id = "optin")
	private WebElement option;
	
	@FindBy(id = "firstname")
	private WebElement ftnAddress;
	
	@FindBy(id = "lastname")
	private WebElement lsnAddress;
	
	@FindBy(id = "company")
	private WebElement company;
	
	@FindBy(id = "address1")
	private WebElement address;
	
	@FindBy(id = "address2")
	private WebElement address2;
	
	@FindBy(id = "city")
	private WebElement kota;
	
	@FindBy(id = "id_state")
	private WebElement provinsi;
	
	@FindBy(id = "postcode")
	private WebElement kodepos;
	
	@FindBy(id = "other")
	private WebElement lain;
	
	@FindBy(id = "phone")
	private WebElement noTlp;
	
	@FindBy(id = "phone_mobile")
	private WebElement noHp;
	
	@FindBy(id = "alias")
	private WebElement alias;
	
	@FindBy(id = "submitAccount")
	private WebElement btnSubmitAkun;
	
	@FindBy(css = "#header_logo > a")
	private WebElement btnHome;
	
	@FindBy(css = "#header > div.nav > div > div > nav > div:nth-child(2)")
	private WebElement btnLogout;
	
	public void regis() {
		btnSignin.click();
		emailCreate.sendKeys("tes1@gmail.com");
		btnRegister.click();
	}
	
	public static Select select(WebElement param) {
		Select tekan = new Select(param);
		return tekan;
	}
	
	public void personalRegister() {
		WebDriverWait wait = new WebDriverWait(driver, 1000);
		wait.until(ExpectedConditions.elementToBeClickable(option));
		
		title.click();
		firstName.sendKeys("Selenium");
		lastName.sendKeys("Test");
		email.clear();
		email.sendKeys("tes2@gmail.com");
		password.sendKeys("123456");
		select(day).selectByValue("28");
		select(month).selectByValue("10");
		select(year).selectByValue("1994");
		news.click();
		option.click();
		tunggu();
		
	}
	
	public void addressRegister() {
		
		address.sendKeys("Jl. Simandara No 12");
		address2.sendKeys("Jl. Ikan Piranha No 20");
		kota.sendKeys("Malang");
		select(provinsi).selectByVisibleText("New York");
		kodepos.sendKeys("66125");
		lain.sendKeys("Lain-lain");
		noTlp.sendKeys("0341434445");
		noHp.sendKeys("0812345678");
		alias.sendKeys("Isi dengan Alias");
		btnLogout.click();
		tunggu();
		
	}
	
	public void goToMenuForms() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(btnHome));
		scroll(driver);
		btnHome.click();
		
	}

	
	public static void tunggu() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public static void scroll(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("scrollBy(0,1000)");
	}
	
	public void closeBrow() {
//		driver.close();
		driver.quit();
	}

}
