package com.bank.qa.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.bank.Framework_base.TestBase;
import com.bank.qa.pages.Customer_Home_page;
import com.bank.qa.pages.HomePage;
import com.bank.qa.pages.Individual_Customer_login;
import com.bank.qa.pages.Transaction_DetailPage;
import com.bank.qa.utilities.Test_Util;

public class Individual_Cust_Deposite_Test extends TestBase{
	HomePage homepage;
	
	Customer_Home_page custHP;
	Individual_Customer_login indselect;
	Transaction_DetailPage tranpg;

public String sheetName="Custtransaction_data";
	public Individual_Cust_Deposite_Test()
	{
		super();
		}
	@BeforeMethod
	public void setup() throws InterruptedException 
	{
		initialization();
		// create object of login base class 
		 homepage=new HomePage();
		 custHP=homepage.cust_Login_function();
		indselect =custHP.customer_name_selection();
	
	}
	
	@Test(priority=3)
	public void deposit_money_to_accTest()throws InterruptedException
	{   indselect.depositmoney("amt");
	
	}
	@Test(priority=4)
	public void withdraw_money_to_accTest()throws InterruptedException
	{
		
		indselect.withdrawmoney(prop.getProperty("w_amt"));
	}
	@Test(priority=2)
	public void username_Test()
	{
		Assert.assertTrue(indselect.verifyCorrectUserName());
	}
	@Test(priority=1)
	public void verify_individualTitle_Test()
	{
		String Indpg_title=indselect.verifyindividualpage_Title();
		Assert.assertEquals(Indpg_title, "XYZ Bank", "Individual Title page is not match");
	}
	@Test(priority=5)
	public void transaction_Test()
	{
		tranpg=indselect.transaction();
	}
	@DataProvider
	public Object[][] getcustbankTestData()
	{
		Object data[][]=Test_Util.getTestData(sheetName);
		return data;
	}
	@AfterMethod
	public void BrowserClose()
	{
		driver.quit();
	}

}
