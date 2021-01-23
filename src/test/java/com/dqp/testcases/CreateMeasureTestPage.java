package com.dqp.testcases;

import org.testng.annotations.Test;

import com.dqp.base.TestBase;
import com.dqp.pages.CreateMeasurePage;
import com.dqp.pages.HomePage;
import com.dqp.pages.LoginPage;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterMethod;

public class CreateMeasureTestPage extends TestBase{
	
	LoginPage loginpage;
	HomePage homepage;
	CreateMeasurePage createmeasurepage; 
	
	public CreateMeasureTestPage() {
		super();
	}
	    
  @BeforeMethod
  public void setup() throws InterruptedException {
		initialization();
		
	loginpage = new LoginPage();
	homepage = new LoginPage().login(prop.getProperty("username"), prop.getProperty("password"));
	Thread.sleep(5000);
	createmeasurepage = new CreateMeasurePage();
	
	}
  
  @Test (priority = 0 , enabled = false)
  public void verifyMeasureTab() throws InterruptedException {
	  
	  
	  Thread.sleep(10000);
	  createmeasurepage.validateMeasureTab();
	  	Thread.sleep(10000);
  }
  
	 @Test(priority = 1, enabled = false) 
	 public void verifyCreateMeasure() throws InterruptedException { 
		 
		 Thread.sleep(6000);
		 verifyMeasureTab();
		 
		 Thread.sleep(7000);
	 
		 createmeasurepage.validateCreateMeasure(); 
		 
		 Thread.sleep(8000);
		 
	 }
	 @Test(priority = 2, enabled = false) 
	 public void verifyMesureType() throws InterruptedException { 
		 
		 verifyMeasureTab();
	 
		 verifyCreateMeasure(); 
		 
		 Thread.sleep(2000);
		 
		 createmeasurepage.validateMesureType();
		 
	 }
	 
	 @Test(priority = 0) 
	 public void verifyMesureData() throws InterruptedException { 
		 
		 
		 Thread.sleep(15000);
		 
		 createmeasurepage.validateMeasureTab();  Thread.sleep(7000);
	 
		 createmeasurepage.validateCreateMeasure();  Thread.sleep(5000);
		 
		 Thread.sleep(4000);
		 		 
		 createmeasurepage.validateMesureType();
		 Thread.sleep(6000);
		 createmeasurepage.validateMesureName(); Thread.sleep(5000);
		 createmeasurepage.validateOrganization(); Thread.sleep(5000);
		 createmeasurepage.validateNextButton(); Thread.sleep(5000);
		 createmeasurepage.validateDatasource(); Thread.sleep(5000);
		 createmeasurepage.validateSelectsource(); Thread.sleep(5000);
		 createmeasurepage.validateDatabase(); Thread.sleep(5000);
		 createmeasurepage.validateSelectdatabase(); Thread.sleep(5000);
		 createmeasurepage.validateTabel(); Thread.sleep(5000);
		 createmeasurepage.validateSelecttable(); Thread.sleep(5000);
		 
		 JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,600)", "");

		 createmeasurepage.validateaddRuleButton(); Thread.sleep(5000);
		 createmeasurepage.validateSelectcolumn(); Thread.sleep(5000);
		 createmeasurepage.validateSelectcolumnvalue(); Thread.sleep(5000);
		 createmeasurepage.validateSourcenextbutton(); Thread.sleep(5000);
		 createmeasurepage.validateSubmitButton(); Thread.sleep(5000);
		 createmeasurepage.validateSuccessfulPopup(); Thread.sleep(5000);
		 		 
	 }
	 	 
		
  @AfterMethod
  public void closeBrowser() {
	  driver.quit();
  }

}
