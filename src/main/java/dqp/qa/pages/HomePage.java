package dqp.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dqp.qa.base.TestBase;

public class HomePage extends TestBase{
	
	LoginPage loginpage;
	
	@FindBy(xpath = "//span[@class='h3 font-weight-bold']")
	WebElement dqplogo;
	
	@FindBy(xpath = "//a[contains(text(),'Measures')]")
	WebElement measureTab;
	
	@FindBy(xpath = "//span[contains(text(),'Create')]")
	WebElement createbutton;
	
	@FindBy(xpath = "//h4[contains(text(),'COMPLETENESS')]")
	WebElement selectmeasure;
	
	public HomePage() {
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
		selectmeasure.click(); 
		Thread.sleep(2000); }
	
	

}
