package com.paybright.testcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.paybright.base.TestBase;
import com.paybright.pages.HomePage;

public class payBrightTC extends TestBase{

	
	HomePage homepage;
	
	public payBrightTC() {
		super();
	}
	
	@BeforeMethod
	public void setup() throws InterruptedException {
		initialization();	
		
		homepage = new HomePage();
		
	}
	
	@Test (priority = 0)
	  public void VerifyTestCases() throws InterruptedException {	  
		  
		homepage.validateSearchValue();
		
		homepage.validateSearchButton();
		
		driver.get(prop.getProperty("paybrighturl"));
		Thread.sleep(3000);
		
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("shopdirectoryurl"));
		Thread.sleep(6000);
		
		homepage.clickSortByDropDown(); Thread.sleep(6000);
		
		homepage.selectValue(); Thread.sleep(3000);
		
		homepage.searchText(); Thread.sleep(3000);
		
		homepage.textValuePresentInSearch();Thread.sleep(3000);		
		
		
		
		
	  }
	
	@AfterMethod
	  public void closeBrowser() {
		  driver.quit();
	  }
	 
	
}
