package dqp.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	static ChromeOptions options = new ChromeOptions();
	
	public TestBase(){
		try {
			prop = new Properties();
			
			FileInputStream fip = new FileInputStream("C:\\Users\\RakeshGohel\\eclipse-workspace\\DQP\\src\\main\\java\\dqp\\qa\\config\\config.properties");
			prop.load(fip);
			}
		catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		}catch(IOException ioe) {
			ioe.printStackTrace();
			}
	}
		public static void initialization() throws InterruptedException {
			options.addArguments("--disable-notifications");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			
			driver.get(prop.getProperty("url"));
			Thread.sleep(3000);
		}	
}
