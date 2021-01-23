package com.dqp.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dqp.base.TestBase;

public class CreateMeasureAndJobPage extends TestBase{
	
	LoginPage loginpage;
	
	@FindBy(xpath = "//span[@class='h3 font-weight-bold']")
	WebElement dqplogo;
	
	@FindBy(xpath = "//a[contains(text(),'Measures')]")
	WebElement measureTab;
	
	@FindBy(xpath = "//span[contains(text(),'Create')]")
	WebElement createbutton;
	
	@FindBy(xpath = "//h4[contains(text(),'COMPLETENESS')]")
	WebElement selectmeasure;
	
	@FindBy(name = "prName")
	WebElement measurename;
	
	@FindBy(name = "org")
	WebElement organization;

	@FindBy(xpath = "//button[@class='btn btn-enq-base']")
	WebElement nextbutton;

	@FindBy(xpath = "//html/body/app-root/app-home/mat-sidenav-container/mat-sidenav-content/div/div[2]/"
			+ "app-measure/app-completeness/div/div/app-datasource-selector/div/div[2]/nz-select/div/div/div[1]")
	WebElement datasource;

	@FindBy(xpath = "//li[contains(text(),'DEV-MYSQL')]")
	WebElement selectsource;

	@FindBy(xpath = "html/body/app-root/app-home/mat-sidenav-container/mat-sidenav-content/div/div[2]/app-measure/"
			+ "app-completeness/div/div/app-datasource-selector/div/div[3]/nz-select/div/div/div[1]")
	WebElement database;

	@FindBy(xpath = "//li[contains(text(),'Spark_Test')]")
	WebElement selectdatabase;

	@FindBy(xpath = "/html/body/app-root/app-home/mat-sidenav-container/mat-sidenav-content/div/div[2]/app-measure/"
			+ "app-completeness/div/div/app-datasource-selector/div/div[4]/nz-select/div/div/div[1]")
	WebElement tabel;

	@FindBy(xpath = "//li[contains(text(),' lte_msisdn_leakage_daily_part_day')]")
	WebElement selecttable;
	
	@FindBy(xpath = "//button[contains(text(),'Add Rule')]")
	WebElement addRuleButton;
	
	@FindBy(xpath = "//div[@class='ng-select-container']")
	WebElement selectcolumn;
	

	@FindBy(xpath = "//input[@id='item-6']")
	WebElement selectcolumnvalue;
	
	@FindBy(xpath = "//button[contains(text(),'Next')]")
	WebElement sourcenextbutton;
	
	@FindBy(xpath = "//button[contains(text(),'Submit')]")
	WebElement submitbutton;
	
	@FindBy(xpath = "//button[contains(text(),'Yes')]")
	WebElement successfulPopup;
	
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
	WebElement submitjob;
	

	@FindBy(xpath = "//button[contains(text(),'OK')]")  //OK button
	WebElement successfulJobPopup;
	
	
	
	
	public CreateMeasureAndJobPage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean validateDQPLogo() {
		return dqplogo.isDisplayed();
	}	
	public void validateMeasureTab() throws InterruptedException {
		measureTab.click();
		Thread.sleep(10000);
	}	
	
	public void validateCreateMeasure() throws InterruptedException {
		createbutton.click(); 
		Thread.sleep(2000); }
	
	public void validateMesureType() throws InterruptedException {
		selectmeasure.click(); 
		Thread.sleep(2000); }
	
	public void validateMesureName() throws InterruptedException {
		measurename.sendKeys("testing_991"); 
		Thread.sleep(4000); }
	
	public void validateOrganization() throws InterruptedException {
		organization.sendKeys("testing_991");
		Thread.sleep(4000); }
	
	public void validateNextButton() throws InterruptedException {
		nextbutton.click(); 
		Thread.sleep(2000); }
	
	public void validateDatasource() throws InterruptedException {
		datasource.click(); 
		Thread.sleep(2000); }

	public void validateSelectsource() throws InterruptedException {
		selectsource.click(); 
		Thread.sleep(2000); }

	public void validateDatabase() throws InterruptedException {
		database.click(); 
		Thread.sleep(2000); }

	public void validateSelectdatabase() throws InterruptedException {
		selectdatabase.click(); 
		Thread.sleep(2000); }

	public void validateTabel() throws InterruptedException {
		tabel.click(); 
		Thread.sleep(2000); }

	public void validateSelecttable() throws InterruptedException {
		selecttable.click(); 
		Thread.sleep(2000); }

	public void validateaddRuleButton() throws InterruptedException {
		addRuleButton.click(); 
		Thread.sleep(2000); }

	public void validateSelectcolumn() throws InterruptedException {
		selectcolumn.click(); 
		Thread.sleep(2000); }
	
	public void validateSelectcolumnvalue() throws InterruptedException {
		selectcolumnvalue.click(); 
		Thread.sleep(2000); }

	public void validateSourcenextbutton() throws InterruptedException {
		sourcenextbutton.click(); 
		Thread.sleep(2000); }

	public void validateSubmitButton() throws InterruptedException {
		submitbutton.click(); 
		Thread.sleep(2000); }

	public void validateSuccessfulPopup() throws InterruptedException {
		successfulPopup.click(); 
		Thread.sleep(2000); }
	
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

	public void validateJobSubmitButton() throws InterruptedException {
		submitjob.click(); 
		Thread.sleep(2000); }

	public void validateSuccessfulJobPopUp() throws InterruptedException {
		successfulJobPopup.click(); 
		Thread.sleep(2000); }	
	
	
	

}
