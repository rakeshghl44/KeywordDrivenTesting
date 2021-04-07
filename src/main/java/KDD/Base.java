package KDD;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Base {
	
	public WebDriver driver;
	public Properties prop;
	
	public WebDriver init_driver(String browserName) throws InterruptedException{
		if(browserName.equals("chrome")){
			
				driver = new ChromeDriver();
				
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				
				//driver.get(prop.getProperty("googleurl"));
				Thread.sleep(3000);
			
		} else if(browserName.equals("firefox")){
			driver = new FirefoxDriver();
		}
		return driver;
	}
	
			
	public Properties init_properties(){
		prop = new Properties();
		try {
			FileInputStream ip = new FileInputStream("C:\\Users\\RakeshGohel\\eclipse-workspace\\Pay Bright\\src\\main\\java\\KDD\\config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return prop;
	}
	

}
