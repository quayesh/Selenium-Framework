package SeleniumFramwork.SeleniumFramwork;

import java.io.IOException;

import org.testng.annotations.Test;

import pageObject.LandingPage;
import resources.Base;

public class HomePage extends Base {
	@Test
	public void navigation() throws IOException {
		driver=initializeDriver();
		driver.get("https://www.facebook.com");
		LandingPage l=new LandingPage(driver);
		l.getUserName().sendKeys("imu");
		
		
		
	}

}
