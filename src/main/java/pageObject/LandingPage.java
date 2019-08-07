package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	public WebDriver driver;
	By UserName=By.id("email");
	


	public LandingPage(WebDriver driver) {
		this.driver=driver;
	}



	public WebElement getUserName() {
		
		return driver.findElement(UserName);
	}

}
