package com.dqp.testcases;

import org.testng.annotations.Test;

import com.dqp.base.TestBase;
import com.dqp.pages.CreateJobPage;
import com.dqp.pages.HomePage;
import com.dqp.pages.LoginPage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class CreateJobsTestPage extends TestBase{
	
	LoginPage loginpage;
	HomePage homepage;
	CreateJobPage createjobpage; 
	
	public CreateJobsTestPage() {
		super();
	}
	    
  @BeforeMethod
  public void setup() throws InterruptedException {
		initialization();
		
	loginpage = new LoginPage();
	homepage = new LoginPage().login(prop.getProperty("username"), prop.getProperty("password"));
	Thread.sleep(5000);
	createjobpage = new CreateJobPage();
	
	}
  
  @Test (priority = 0 , enabled = false)
  public void verifyJobsTab() throws InterruptedException {	  
	  
	  Thread.sleep(10000);
	  createjobpage.validateJobsTab();
	  	Thread.sleep(10000);
  }
 
	 @Test(priority = 1, enabled = false) 
	 public void verifyCreateJobs() throws InterruptedException { 
		 
		 Thread.sleep(6000);
		 verifyJobsTab();
		 
		 Thread.sleep(7000);
	 
		 createjobpage.validateCreateJobs(); 
		 
		 Thread.sleep(8000);		 
	 }
	 
	 @Test(priority = 2, enabled = false) 
	 public void verifyMesureType() throws InterruptedException { 
		 
		 verifyJobsTab();
	 
		 verifyCreateJobs(); 
		 
		 Thread.sleep(2000);
		 
		// createmeasurepage.validateMesureType();
		 
	 }
	 
	 @Test(priority = 0) 
	 public void verifyJobData() throws InterruptedException { 
		 
		 Thread.sleep(10000);
		 
		 createjobpage.validateJobsTab();  Thread.sleep(9000);
	 
		 createjobpage.validateCreateJobs();  Thread.sleep(7000);
		 
		 createjobpage.validateMesureName();
		 Thread.sleep(6000);
		 createjobpage.validateSelectMesureName(); Thread.sleep(5000);
		 createjobpage.validateCronExpression(); Thread.sleep(5000);
		 createjobpage.validateSelectCronExpression(); Thread.sleep(5000);
		 createjobpage.validateEnterCustomCronExp(); Thread.sleep(5000);
		 createjobpage.validateBeginValue(); Thread.sleep(5000);
		 createjobpage.validateEndValue(); Thread.sleep(5000);
		 createjobpage.validateSubmitButton(); Thread.sleep(5000);
		 createjobpage.validateSuccessfulPopUp(); Thread.sleep(5000);		 
				 
	 }	 	 
		
  @AfterMethod
  public void closeBrowser() {
	  driver.quit();
  }

}
