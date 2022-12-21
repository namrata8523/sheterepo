package com.bank.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.bank.Framework_base.TestBase;

public class Customer_Home_page extends TestBase {

	@FindBy(id="userSelect")
	public WebElement userselect;
	
	@FindBy(xpath="//button[text()='Login']")
	public WebElement login_button ;
	// Initializing the page object
		public Customer_Home_page() 
		{
			PageFactory.initElements(driver, this);
		}
		public Individual_Customer_login customer_name_selection() throws InterruptedException
		{   
			
			userselect.click();
			Select sele=new Select(userselect);
			Thread.sleep(3000);
			sele.selectByIndex(2);
			login_button.click();
			Thread.sleep(5000);
			return new Individual_Customer_login();
			}
}













