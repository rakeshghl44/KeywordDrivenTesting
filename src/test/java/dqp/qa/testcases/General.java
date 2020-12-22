package dqp.qa.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class General {
	
	WebDriver driver;
	
	@Test
	public void generalSteps() throws InterruptedException {
		
		driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
		
		driver.get("http://192.168.9.11:25200/login"); Thread.sleep(6000);
		
		driver.findElement(By.name("username")).sendKeys("data_steward"); Thread.sleep(2000);
		
		driver.findElement(By.name("password")).sendKeys("cGFzc3dvcmQ="); Thread.sleep(2000);
		
		driver.findElement(By.id("login-btn")).click(); 
		
		Thread.sleep(15000);
		
		driver.findElement(By.xpath("//a[contains(text(),'Measures')]")).click(); Thread.sleep(6000);
		
		driver.findElement(By.xpath("//span[contains(text(),'Create')]")).click(); Thread.sleep(4000);
		
		driver.findElement(By.xpath("//h4[contains(text(),'COMPLETENESS')]")).click(); Thread.sleep(4000);
		
		driver.findElement(By.name("prName")).sendKeys("testing_991"); Thread.sleep(4000);
		
		driver.findElement(By.name("org")).sendKeys("testing_991"); Thread.sleep(4000);
		
		driver.findElement(By.xpath("//button[@class='btn btn-enq-base']")).click(); Thread.sleep(9000);
		
		driver.findElement(By.xpath("//html/body/app-root/app-home/mat-sidenav-container/mat-sidenav-content/div/div[2]/app-measure/app-completeness/div/div/"
				+ "app-datasource-selector/div/div[2]/nz-select/div/div/div[1]")).click(); Thread.sleep(8000);
		
		
		driver.findElement(By.xpath("//li[contains(text(),'DEV-MYSQL')]")).click(); Thread.sleep(10000);
		
		driver.findElement(By.xpath("html/body/app-root/app-home/mat-sidenav-container/mat-sidenav-content/div/div[2]/app-measure/app-completeness/div/div/"
				+ "app-datasource-selector/div/div[3]/nz-select/div/div/div[1]")).click(); Thread.sleep(10000);
		
		
		driver.findElement(By.xpath("//li[contains(text(),'Spark_Test')]")).click(); Thread.sleep(4000);
		
		driver.findElement(By.xpath("/html/body/app-root/app-home/mat-sidenav-container/mat-sidenav-content/div/div[2]/app-measure/app-completeness/div/div/"
				+ "app-datasource-selector/div/div[4]/nz-select/div/div/div[1]")).click(); Thread.sleep(10000);
		
		
		driver.findElement(By.xpath("//li[contains(text(),' lte_msisdn_leakage_daily_part_day')]")).click(); Thread.sleep(8000);
		
		driver.findElement(By.xpath("//button[contains(text(),'Add Rule')]")).click(); Thread.sleep(6000);
		
		driver.findElement(By.xpath("//div[@class='ng-select-container']")).click(); Thread.sleep(6000);
		
		driver.findElement(By.xpath("//input[@id='item-6']")).click(); Thread.sleep(6000);
		
		driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click(); Thread.sleep(10000);
		
		driver.findElement(By.xpath("//button[contains(text(),'Submit')]")).click(); Thread.sleep(10000);
		
		driver.findElement(By.xpath("//button[contains(text(),'No')]")).click(); Thread.sleep(10000);
		
		
		
		//driver.findElement(By.xpath("//button[@class='swal2-cancel swal2-styled']")).click(); Thread.sleep(4000);
		
		////button[@class='swal2-cancel swal2-styled']
			
		driver.quit();
	}

}
