package com.initBankingV1.testCases;



import org.testng.Assert;
import org.testng.annotations.Test;

import com.interBankingV1.pageObject.LoginPage;

public class TC_loginTest001 extends BaseClass
{
	
	@Test
	public void loginTest()
	{
		
		LoginPage lp=new LoginPage(driver);
		driver.get(baseurl);
		driver.manage().window().maximize();
		
		lp.setUserName(UserName);
		lp.setPassword(Password);
		
		
		lp.clickSubmit();
		
		if (driver.getTitle().equals("Guru99 Bank Manager HomePage")) 
		{
			Assert.assertTrue(true);
			
		}
		else
		{
			Assert.assertTrue(false);
		}
			
		
	}

}
