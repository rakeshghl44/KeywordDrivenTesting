package dqp.qa.testcases;

import org.testng.annotations.Test;

import dqp.qa.base.TestBase;
import dqp.qa.pages.HomePage;
import dqp.qa.pages.LoginPage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class LoginTestPage extends TestBase{
	
	LoginPage loginpage;
	HomePage homepage;
	
	public LoginTestPage() {
		super();
	}
	
	@BeforeMethod
	  public void setup() throws InterruptedException {
		initialization();
		loginpage = new LoginPage();
	  }
	
		/*
		 * @Test(priority = 0,enabled = false) public void sfdcLogoTest() { boolean flag
		 * = loginpage.validateSfdcLogo(); Assert.assertTrue(flag); }
		 */
  
  @Test(priority = 1)
  public void loginTest() throws InterruptedException {
	  homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
  }
  
  @Test(priority = 2)
  public void profileLink() throws InterruptedException {
	  loginTest();
	  
	  loginpage.validateProfileLink();
	  Thread.sleep(4000);
  }
  
  @Test(priority = 3,enabled = true)
  public void logOut() throws InterruptedException {
	  profileLink();	  
	  loginpage.validateLogOut();
	  Thread.sleep(5000);
  }

  @AfterMethod
  public void closeBrowser() {
	  driver.quit();
  }
//Thread.sleep(3000);
}
