package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import util.driverutil;



public class LoginTest {

	WebDriver driver;

	@Given("^Navigate to home page$")
	public void navigate_to_home_page() throws Throwable {

		driver = driverutil.getDriver("chrome");
		driver.manage().window().maximize();
		driver.get("https:demowebshop.tricentis.com/");

	}

	@When("^user enters username and password$")
	public void user_enters_username_and_password() throws Throwable {

//		driver.findElement(By.linkText("Log in")).click();
//		Thread.sleep(1000);
//
//		driver.findElement(By.id("Email")).sendKeys("piyush@kabra.com");
//		Thread.sleep(1000);
//
//		driver.findElement(By.id("Password")).sendKeys("123456789");
//		Thread.sleep(1000);
//
//		driver.findElement(By.xpath("//input[@value='Log in']")).click();
//		Thread.sleep(1000);
		
		Thread.sleep(1000);
		PageObject po = new PageObject(this.driver);
		
		po.signin.click();
		Thread.sleep(1000);
		po.username.sendKeys("piyush@kabra.com");
		Thread.sleep(1000);
		po.password.sendKeys("123456789");
		Thread.sleep(1000);
		po.Login.click();
		Thread.sleep(1000);

	}

	@Then("^user logged in successfully$")
	public void user_logged_in_successfully() throws Throwable {

		Assert.assertEquals(driver.findElement(By.linkText("piyush@kabra.com")).getText(), "piyush@kabra.com");
		Thread.sleep(1000);

	}

}
