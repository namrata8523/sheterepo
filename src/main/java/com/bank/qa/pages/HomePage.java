package com.bank.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bank.Framework_base.TestBase;

public class HomePage extends TestBase {
	// Page Factory or object repository
	@FindBy(xpath="//button[text()='Customer Logi']")
	public WebElement custlogin; 
	@FindBy(xpath="//button[text()='Bank Manager Login']")
	public WebElement bankManagerlogin; 
	@FindBy(xpath="//button[text()='Home']")
	public WebElement home; 
	@FindBy(xpath="//strong[text()='XYZ Bank']")
	public WebElement logo;
	// Initializing the page object
	public HomePage() 
	{
		PageFactory.initElements(driver, this);
	}
	
	// Actions
	public String validatehomeTitle() 
	{
		return driver.getTitle();
	}
	public Customer_Home_page cust_Login_function()
	{
		custlogin.click();
		return new Customer_Home_page();
	}
	
	public BankManager_Home_page bankManager_Login_function()
	{
		bankManagerlogin.click();
		return new BankManager_Home_page();
	}
	public boolean HomeButton_visibility()
	{
		return home.isDisplayed();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
