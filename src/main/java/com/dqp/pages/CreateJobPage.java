package com.dqp.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dqp.base.TestBase;

public class CreateJobPage extends TestBase{
	
	LoginPage loginpage;
	WebElement webElement;
	
	
	@FindBy(xpath = "//span[@class='h3 font-weight-bold']")
	WebElement dqplogo;
	
	@FindBy(xpath = "//a[contains(text(),'Jobs')]")  //Jobs tab
	WebElement jobsTab;
	
	@FindBy(xpath = "//span[contains(text(),'Create')]")  //create button
	WebElement createbutton;
	
	@FindBy(name = "job_name")  //No required 
	WebElement jobname;			
	
	@FindBy(xpath = "/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/app-create-job[1]/div[1]/div[2]/form[1]"
			+ "/div[2]/ng-select[1]/div[1]/span[1]\r\n")   //measure name drop-down
	WebElement measurename;

	@FindBy(xpath = "//span[contains(text(),'testing-measure')]")  // select measure name
	WebElement selectmeasurename;

	@FindBy(xpath = "//select[@name='cron_expression']")   //cron expression drop-down
	WebElement cronexpression;

	@FindBy(xpath = "//option[contains(text(),'Custom Cron Expression')]") //select cron expression
	WebElement selectcronexpression;

	@FindBy(name = "cron_expression_custom")  //select custom expresion
	WebElement entercustomcronexp;

	@FindBy(xpath = "//input[@min=\"-Infinity\"]")  //begin value
	WebElement beginvalue;
	
	@FindBy(xpath = "//input[@max=\"Infinity\"]")  //end value
	WebElement endvalue;
	
	@FindBy(xpath = "//button[contains(text(),'Submit')]")  //submit button
	WebElement submitbutton;
	

	@FindBy(xpath = "//button[contains(text(),'OK')]")  //OK button
	WebElement successfulPopup;
	
	
	public CreateJobPage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean validateDQPLogo() {
		return dqplogo.isDisplayed();
	}	
	public void validateJobsTab() throws InterruptedException {
		jobsTab.click();
		Thread.sleep(10000);
	}	
	
	public void validateCreateJobs() throws InterruptedException {
		createbutton.click(); 
		Thread.sleep(2000); }
	
	public void validateMesureName() throws InterruptedException {
		measurename.click(); 
		Thread.sleep(2000); }
	
	public void validateSelectMesureName() throws InterruptedException {
		selectmeasurename.click(); 
		Thread.sleep(4000); }
	
	public void validateCronExpression() throws InterruptedException {
		cronexpression.click();
		Thread.sleep(4000); }
	
	public void validateSelectCronExpression() throws InterruptedException {
		selectcronexpression.click(); 
		Thread.sleep(2000); }
	
	public void validateEnterCustomCronExp() throws InterruptedException {
		entercustomcronexp.clear();
		Thread.sleep(4000);
		entercustomcronexp.sendKeys("0 */1 * ? * *"); 
		Thread.sleep(2000); 
		entercustomcronexp.sendKeys(Keys.TAB);}

	public void validateBeginValue() throws InterruptedException {
		
		
		Thread.sleep(4000);
		beginvalue.sendKeys(Keys.DELETE);
		Thread.sleep(4000);
		beginvalue.sendKeys("-200"); 
		Thread.sleep(2000); 
		beginvalue.sendKeys(Keys.TAB); }

	public void validateEndValue() throws InterruptedException {
		
		endvalue.sendKeys(Keys.DELETE);
		Thread.sleep(4000);
		endvalue.sendKeys("100");
		Thread.sleep(6000); 
		endvalue.sendKeys(Keys.TAB);}

	public void validateSubmitButton() throws InterruptedException {
		submitbutton.click(); 
		Thread.sleep(2000); }

	public void validateSuccessfulPopUp() throws InterruptedException {
		successfulPopup.click(); 
		Thread.sleep(2000); }	

}
