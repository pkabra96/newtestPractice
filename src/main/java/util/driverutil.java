package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class driverutil {
	

	public static WebDriver getDriver(String browserName) {
	WebDriver driver;
	 
	 switch(browserName) {	 	
	 case"chrome":
		 System.setProperty("webdriver.chrome.driver", "src/test/resources/Driver/chromedriver.exe");
		 driver = new ChromeDriver();
		 break;
	 case"ie":
		System.setProperty("webdriver.ie.driver", "src/test/resources/drivers/IEDriverServer.exe");
		 driver = new InternetExplorerDriver();
		break;
	default:
			driver = null;
	 }
	 return driver;
	}
	
}
