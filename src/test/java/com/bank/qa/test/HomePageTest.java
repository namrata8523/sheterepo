package com.bank.qa.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.bank.Framework_base.TestBase;
import com.bank.qa.pages.BankManager_Home_page;
import com.bank.qa.pages.Customer_Home_page;
import com.bank.qa.pages.HomePage;

public class HomePageTest extends TestBase{
	HomePage homepage;
	Customer_Home_page cust_homepage;
	BankManager_Home_page bankmanager_homepage;
	public HomePageTest()
	{
		super();
	}
	@BeforeMethod
	public void setup()
	{
		initialization();
		// create object of login base class 
		 homepage=new HomePage();
	}
	
	@Test(priority=1)
	public void homepagetital_Test()
	{
	String title= homepage.validatehomeTitle();
	Assert.assertEquals(title, "XYZ Bank","Home page Title not match");
	}
	@Test(priority=2)
	public void Cust_loginTest()
	{
		cust_homepage=homepage.cust_Login_function();
	}
	@Test(priority=4)
	public void BankManager_loginTest()
	{
		bankmanager_homepage=homepage.bankManager_Login_function();
	}
	
	@Test(priority=3)
	public void home_button_vibilityTest()
	{
		boolean flag=homepage.HomeButton_visibility();
		Assert.assertTrue(flag);
		
	}
	
	@AfterMethod
	public void BrowserClose()
	{
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	

}
