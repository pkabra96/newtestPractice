package stepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.AddtoCartPage;
import pages.PageObjects;
import pages.checkout;

public class FinalOrder {
	
		public static WebDriver driver;
		PageObjects po;
		AddtoCartPage ac;
		checkout co;
		
		@Given("^Navigate to Home page$")
		public void navigate_to_Home_page() throws Throwable {
		 System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("http://demowebshop.tricentis.com/login");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 
		}

		@When("^User enters Username and password$")
		public void user_enters_Username_and_password() throws Throwable {
			po = new PageObjects(driver);
			
			po.login.click();
			po.username.sendKeys("anushree@gmail.com");
			po.password.sendKeys("anushree123");
			po.loginbutton.click();
		}
					

		@Then("^user logged in successfully$")
		public void user_logged_in_successfully() throws Throwable {
		    System.out.println("user login successfully");
		  
		}
		
		@Given("^Browser and application$")
		 public void browser_and_application() throws Throwable {
		     // Write code here that turns the phrase above into concrete actions
			ac = new AddtoCartPage(driver);
			 System.out.println("1");
			
			 
			 ac.apparelshoes.click();
			 ac.casual.click();
			 ac.quantity.clear();
			 ac.quantity.sendKeys("10");
			 ac.addtocart.click();
			 ac.cart.click();
			 
			 
		 }

		 @When("^sign in with login credentials$")
		 public void sign_in_with_login_credentials() throws Throwable {
		     // Write code here that turns the phrase above into concrete actions
			 System.out.println("2");
			    co = new checkout(driver);
				co.termclick.click();
				co.checkout.click();
				co.continue1.click();
				co.continue2.click();
				co.continue3.click();
				co.continue4.click();
				co.continue5.click();
				co.confirm.click();
				co.logout.click();
				
		 }

		@When("^placing order$")
		 public void placing_order() throws Throwable {
		     // Write code here that turns the phrase above into concrete actions
			 System.out.println("3");
		 }

		 @When("^checkout the product$")
		 public void checkout_the_product() throws Throwable {
		     // Write code here that turns the phrase above into concrete actions
			 System.out.println("6");
		 }

		 @Then("^shipment and payment$")
		 public void shipment_and_payment() throws Throwable {
		     // Write code here that turns the phrase above into concrete actions
		     System.out.println("5");
		 }

		 @Then("^Confirm order$")
		 public void confirm_order() throws Throwable {
		     // Write code here that turns the phrase above into concrete actions
			 System.out.println("4");
		 }

	}

