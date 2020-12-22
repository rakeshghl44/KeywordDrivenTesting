package dqp.qa.testcases;

import org.testng.annotations.Test;

import dqp.qa.base.TestBase;
import dqp.qa.pages.CreateMeasurePage;
import dqp.qa.pages.HomePage;
import dqp.qa.pages.LoginPage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class HomeTestPage extends TestBase{
	
	LoginPage loginpage;
	HomePage homepage;
	CreateMeasurePage createmeasurepage;	
	
	public HomeTestPage() {
		super();
	}
	    
  @BeforeMethod
  public void setup() throws InterruptedException {
		initialization();
		
	loginpage = new LoginPage();
	homepage = new LoginPage().login(prop.getProperty("username"), prop.getProperty("password"));
	Thread.sleep(5000);
	
	}
  
  @Test (priority = 0)
  public void verifyMeasureTab() throws InterruptedException {
	  
	  	homepage.validateMeasureTab();
	  	Thread.sleep(2000);
  }
  
	 @Test(priority = 1) 
	 public void verifyCreateMeasure() throws InterruptedException { 
		 
		 verifyMeasureTab();
	 
		 homepage.validateCreateMeasure(); 
		 
		 Thread.sleep(1000);
		 
	 }
	 @Test(priority = 2) 
	 public void verifyMesureType() throws InterruptedException { 
		 
		 verifyMeasureTab();
	 
		 verifyCreateMeasure(); 
		 
		 Thread.sleep(2000);
		 
		 homepage.validateMesureType();
		 
	 }
		
  @AfterMethod
  public void closeBrowser() {
	  driver.quit();
  }

}
