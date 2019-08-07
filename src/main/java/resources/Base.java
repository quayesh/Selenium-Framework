package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;

public class Base {
	public WebDriver driver;
	
	public WebDriver initializeDriver() throws IOException {
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("/Users/abmquayesh/eclipse-workspace/SeleniumFramwork/src/main/java/resources/data.properties");
		prop.load(fis);
		String browserName=prop.getProperty("browser");
		
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "/Users/abmquayesh/Downloads/chromedriver");
			driver=new ChromeDriver();
		}
		else if(browserName.equals("fireFox")) {
			System.setProperty("webdriver.gecko.driver", "/Users/abmquayesh/Downloads/geckodriver");
			 driver=new FirefoxDriver();
			
		}
		else if(browserName.equals("IE")) {
			System.setProperty("webdriver.ie.driver", "/Users/abmquayesh/Downloads/chromedriver");
			 driver=new InternetExplorerDriver();
		}
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		return driver;
		
	}
	

}
