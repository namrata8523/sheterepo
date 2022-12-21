package com.bank.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;

import com.bank.Framework_base.TestBase;

public class Individual_Customer_login extends TestBase{
public String sheetName="Custtransaction_data";
	@FindBy(xpath="//span[text()='Harry Potter']")
	public WebElement harry;
	@FindBy(name="accountSelect")
	public WebElement accselet;
	@FindBy(xpath="/html/body/div/div/div[2]/div/div[3]/button[2]")
	public WebElement depositmoney;
	@FindBy(xpath="//input[@placeholder='amount']")
	public WebElement enteramt;
	@FindBy(xpath="//input[@placeholder='amount']")
	public WebElement submitbut;
	@FindBy(xpath="/html/body/div/div/div[2]/div/div[3]/button[3]")
	public WebElement withdrawmoney;
	@FindBy(xpath="/html/body/div/div/div[2]/div/div[4]/div/form/button")
	public WebElement withsubmit;
	@FindBy(xpath="/html/body/div/div/div[2]/div/div[3]/button[1]\r\n" + 
			"	")
	public WebElement transaction;
	
	public Individual_Customer_login () 
	{
		PageFactory.initElements(driver, this);
	}
	public String verifyindividualpage_Title()
	{
		return driver.getTitle();
	}
	public boolean verifyCorrectUserName()
	{
		return harry.isDisplayed();
	}
	
	public void depositmoney(String amt) throws InterruptedException
	{
		accselet.click();
		Select sele=new Select(accselet);
		Thread.sleep(3000);
		sele.selectByIndex(1);
		depositmoney.click();
		Thread.sleep(5000);
		enteramt.sendKeys(amt);
		submitbut.click();
	}
	public void withdrawmoney(String w_amt) throws InterruptedException
	{
		accselet.click();
		Select sele=new Select(accselet);
		Thread.sleep(3000);
		sele.selectByIndex(1);
		withdrawmoney.click();
		Thread.sleep(5000);
		enteramt.sendKeys(w_amt);
		withsubmit.click();
	}
	
	public Transaction_DetailPage transaction()
	{
		transaction.click();
		return new Transaction_DetailPage();
	}
	@DataProvider
	public void getTestdata(String sheetname)
	{
		
	}
}
