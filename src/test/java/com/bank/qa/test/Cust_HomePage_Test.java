package com.bank.qa.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.bank.Framework_base.TestBase;
import com.bank.qa.pages.Customer_Home_page;
import com.bank.qa.pages.HomePage;
import com.bank.qa.pages.Individual_Customer_login;


public class Cust_HomePage_Test extends TestBase {
	HomePage homepage;
	Customer_Home_page custHP;
	Individual_Customer_login indselect;
	public Cust_HomePage_Test()
	{
		super();
		
	}
	@BeforeMethod
	public void setup()
	{
		initialization();
		// create object of login base class 
		 homepage=new HomePage();
		 custHP=homepage.cust_Login_function();
	}
	@Test
	public void select_individual_Cust_Test() throws InterruptedException
	{
		indselect=custHP.customer_name_selection();
	
	}
	@AfterMethod
	public void BrowserClose()
	{
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
