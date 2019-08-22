package stepDefination;

import org.openqa.selenium.WebDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import util.driverutil;

public class PlaceOrder {
	
	WebDriver driver;	
	PageObject po = new PageObject(this.driver);
	
	@Given("^Browser and Application$")
	public void browser_and_Application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	
		driver = driverutil.getDriver("chrome");
		driver.manage().window().maximize();
		driver.get("https:demowebshop.tricentis.com/");
		
		throw new PendingException();
	}

	@When("^sign in with login credentials$")
	public void sign_in_with_login_credentials() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   	
		po.signin.click();
		Thread.sleep(1000);
		po.username.sendKeys("piyush@kabra.com");
		Thread.sleep(1000);
		po.password.sendKeys("123456789");
		Thread.sleep(1000);
		po.Login.click();
		Thread.sleep(1000);
		
		throw new PendingException();
	}

	@When("^placing order$")
	public void placing_order() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^check out the product$")
	public void check_out_the_product() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^shipping & payments$")
	public void shipping_payments() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^Confirm order$")
	public void confirm_order() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

}
