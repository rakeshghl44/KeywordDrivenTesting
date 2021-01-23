package com.dqp.testcases;

import org.testng.annotations.Test;

import com.dqp.base.TestBase;
import com.dqp.pages.CreateMeasureAndJobPage;
import com.dqp.pages.HomePage;
import com.dqp.pages.LoginPage;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterMethod;

public class CreateMeasureAndJobTestPage extends TestBase{
	
	LoginPage loginpage;
	HomePage homepage;
	CreateMeasureAndJobPage createMeasureAndJobPage; 
	
	public CreateMeasureAndJobTestPage() {
		super();
	}
	    
  @BeforeMethod
  public void setup() throws InterruptedException {
		initialization();
		
	loginpage = new LoginPage();
	homepage = new LoginPage().login(prop.getProperty("username"), prop.getProperty("password"));
	Thread.sleep(5000);
	createMeasureAndJobPage = new CreateMeasureAndJobPage();
	
	}
  
  @Test (priority = 0 , enabled = false)
  public void verifyMeasureTab() throws InterruptedException {
	  
	  
	  Thread.sleep(10000);
	  createMeasureAndJobPage.validateMeasureTab();
	  	Thread.sleep(10000);
  }
  
	 @Test(priority = 1, enabled = false) 
	 public void verifyCreateMeasure() throws InterruptedException { 
		 
		 Thread.sleep(6000);
		 verifyMeasureTab();
		 
		 Thread.sleep(7000);
	 
		 createMeasureAndJobPage.validateCreateMeasure(); 
		 
		 Thread.sleep(8000);
		 
	 }
	 @Test(priority = 2, enabled = false) 
	 public void verifyMesureType() throws InterruptedException { 
		 
		 verifyMeasureTab();
	 
		 verifyCreateMeasure(); 
		 
		 Thread.sleep(2000);
		 
		 createMeasureAndJobPage.validateMesureType();
		 
	 }
	 
	 @Test(priority = 0) 
	 public void verifyMesureData() throws InterruptedException { 
		 
		 
		 Thread.sleep(10000);
		 
		 createMeasureAndJobPage.validateMeasureTab();  Thread.sleep(7000);
	 
		 createMeasureAndJobPage.validateCreateMeasure();  Thread.sleep(5000);
		 
		 Thread.sleep(4000);
		 		 
		 createMeasureAndJobPage.validateMesureType();
		 Thread.sleep(6000);
		 createMeasureAndJobPage.validateMesureName(); Thread.sleep(5000);
		 createMeasureAndJobPage.validateOrganization(); Thread.sleep(5000);
		 createMeasureAndJobPage.validateNextButton(); Thread.sleep(5000);
		 createMeasureAndJobPage.validateDatasource(); Thread.sleep(5000);
		 createMeasureAndJobPage.validateSelectsource(); Thread.sleep(5000);
		 createMeasureAndJobPage.validateDatabase(); Thread.sleep(5000);
		 createMeasureAndJobPage.validateSelectdatabase(); Thread.sleep(5000);
		 createMeasureAndJobPage.validateTabel(); Thread.sleep(5000);
		 createMeasureAndJobPage.validateSelecttable(); Thread.sleep(5000);
		 
		 JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,600)", "");

		 createMeasureAndJobPage.validateaddRuleButton(); Thread.sleep(5000);
		 createMeasureAndJobPage.validateSelectcolumn(); Thread.sleep(5000);
		 createMeasureAndJobPage.validateSelectcolumnvalue(); Thread.sleep(5000);
		 createMeasureAndJobPage.validateSourcenextbutton(); Thread.sleep(5000);
		 createMeasureAndJobPage.validateSubmitButton(); Thread.sleep(5000);
		 createMeasureAndJobPage.validateSuccessfulPopup(); Thread.sleep(5000);
		 
		 createMeasureAndJobPage.validateCronExpression(); Thread.sleep(5000);
		 createMeasureAndJobPage.validateSelectCronExpression(); Thread.sleep(5000);
		 createMeasureAndJobPage.validateEnterCustomCronExp(); Thread.sleep(5000);
		 createMeasureAndJobPage.validateBeginValue(); Thread.sleep(5000);
		 createMeasureAndJobPage.validateEndValue(); Thread.sleep(5000);
		 createMeasureAndJobPage.validateJobSubmitButton(); Thread.sleep(5000);
		 createMeasureAndJobPage.validateSuccessfulJobPopUp(); Thread.sleep(5000);		 
		 
	 }
	 	 
		
  @AfterMethod
  public void closeBrowser() {
	  driver.quit();
  }

}
