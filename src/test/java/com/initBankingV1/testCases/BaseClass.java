package com.initBankingV1.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {

	public String baseurl = "https://demo.guru99.com/V4/";
	public String UserName = "mngr528770";
	public String Password = "AvUgetY";
	public   WebDriver driver;

	@BeforeClass
	public void setUp() 
	{
		System.setProperty("webdriver.edge.driver","C:\\Users\\Admin\\eclipse-workspace\\wedrive.test\\Drivers\\msedgedriver.exe");
		driver =new EdgeDriver();
	}
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}

}
