package com.dqp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.dqp.base.TestBase;

public class LoginPage extends TestBase {

	// page factory

	@FindBy(name = "username")
	WebElement uname;

	@FindBy(name = "password")
	WebElement pwd;

	@FindBy(id = "login-btn")
	WebElement loginbtn;

	@FindBy(xpath = "/html/head/title")
	WebElement pageTitle;
	 
	@FindBy(xpath = "//div[3]/button[1]") 
	WebElement profileClick;	 

	@FindBy(xpath = "//a[contains(text(),'Logout')]")
	WebElement logOut;

	WebDriverWait wait = new WebDriverWait(driver, 15);

	// Intialize pagefacotry

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	// Actions

	public void validateLoginPageTitle() {
		driver.getCurrentUrl();
	}

	/*
	 * public boolean validateSfdcLogo() { return pageTitle.isDisplayed(); }
	 */

	
	 public void validateProfileLink() throws InterruptedException {
	 
	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[3]/button[1]")));
	 
	 profileClick.click(); }
	
	public void validateLogOut() {
		logOut.click();
	}

	public HomePage login(String un, String pw) throws InterruptedException {
		uname.sendKeys(un);
		Thread.sleep(3000);
		pwd.sendKeys(pw);
		Thread.sleep(3000);

		loginbtn.click();

		return new HomePage();
	}

}
