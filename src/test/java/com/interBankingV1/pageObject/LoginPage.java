package com.interBankingV1.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.initBankingV1.testCases.BaseClass;



public class LoginPage extends BaseClass {
	//tring to commit and push
	
	
	public LoginPage(WebDriver driver)
	{
		
		PageFactory.initElements(driver,this);
		
	}
	@FindBy(xpath="/html/body/form/table/tbody/tr[1]/td[2]/input")
	WebElement UserId;
	
	@FindBy(name="password")
	WebElement textPassword;
	
	@FindBy(name="btnLogin")
	WebElement clickBtnLogin;
	
	
	public void setUserName(String User) 
	{
		UserId.sendKeys(User);
	}
	public void setPassword(String Pass) 
	{
		textPassword.sendKeys(Pass);
	}
	public void clickSubmit() 
	{
		clickBtnLogin.click(); 
	}

}
