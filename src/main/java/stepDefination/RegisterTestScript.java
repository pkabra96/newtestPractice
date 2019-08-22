package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import util.driverutil;

public class RegisterTestScript {

	WebDriver driver;

	@Given("^Launch Browser and Application$")
	public void Launch_Browser_and_Application() throws Throwable {

		driver = driverutil.getDriver("chrome");
		driver.manage().window().maximize();
		driver.get("https:demowebshop.tricentis.com/");

	}

	@When("^I sign in with login credentials$")
	public void i_sign_in_with_login_credentials() throws Throwable {

		driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("Email")).sendKeys("piyush@kabra.com");
		Thread.sleep(1000);

		driver.findElement(By.id("Password")).sendKeys("123456789");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Thread.sleep(1000);

	}

	@When("^I am placing order$")
	public void i_am_placing_order() throws Throwable {
		driver.findElement(By.linkText("Apparel & Shoes")).click();
		Thread.sleep(1000);

		driver.findElement(By.linkText("Casual Golf Belt")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("addtocart_40_EnteredQuantity")).clear();
		Thread.sleep(1000);

		driver.findElement(By.id("addtocart_40_EnteredQuantity")).sendKeys("10");
		Thread.sleep(1000);

		driver.findElement(By.id("add-to-cart-button-40")).click();
		Thread.sleep(1000);

	}

	@When("^I check out the product$")
	public void i_check_out_the_product() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"topcartlink\"]/a/span[1]")).click();
		Thread.sleep(1000);

		Assert.assertEquals(driver.findElement(By.linkText("Casual Golf Belt")).getText(), "Casual Golf Belt");
		Thread.sleep(1000);

//		  Assert.assertEquals(driver.findElement(By.xpath("//input[starts-with(@name,'itemquantity')]")).getAttribute("value"),"20");
		Thread.sleep(1000);

		driver.findElement(By.id("termsofservice")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("checkout")).click();
		Thread.sleep(1000);
	}

	@Then("^I am doing shipping & payments$")
	public void i_am_doing_shipping_payments() throws Throwable {
		
		driver.findElement(By.xpath("//select[@name='billing_address_id']")).click();
		Thread.sleep(1000);
		
		
		Select testing = new Select(driver.findElement(By.xpath("//select[@name='billing_address_id']")));
		testing.selectByVisibleText("New Address");
		
		Select testing1 = new Select(driver.findElement(By.id("BillingNewAddress_CountryId")));
		testing1.selectByVisibleText("India");
		
		Thread.sleep(1000);
		Select testing2 = new Select(driver.findElement(By.id("BillingNewAddress_StateProvinceId")));
		testing2.selectByIndex(0);
		
		driver.findElement(By.id("BillingNewAddress_City")).sendKeys("Pune");
		driver.findElement(By.id("BillingNewAddress_Address1")).sendKeys("Dhanori");
		driver.findElement(By.id("BillingNewAddress_Address2")).sendKeys("");
		driver.findElement(By.id("BillingNewAddress_ZipPostalCode")).sendKeys("411015");
		driver.findElement(By.id("BillingNewAddress_PhoneNumber")).sendKeys("1234567890");
		driver.findElement(By.id("BillingNewAddress_FaxNumber")).sendKeys("NA");

		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[@id='shipping-buttons-container']//input[@value='Continue']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[@id='shipping-method-buttons-container']//input[@value='Continue']"))
				.click();
		Thread.sleep(2000);

		driver.findElement(By.id("paymentmethod_2")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//div[@id='payment-method-buttons-container']//input[@value='Continue']")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("CardholderName")).sendKeys("Barabar Gordan");
		Thread.sleep(500);
		driver.findElement(By.id("CardNumber")).sendKeys("4485564059489345");
		Thread.sleep(500);
		driver.findElement(By.id("ExpireMonth")).sendKeys("04");
		Thread.sleep(500);
		driver.findElement(By.id("ExpireYear")).sendKeys("2020");
		Thread.sleep(500);
		driver.findElement(By.id("CardCode")).sendKeys("123");
		Thread.sleep(500);

		driver.findElement(By.xpath("//div[@id='payment-info-buttons-container']//input[@value='Continue']")).click();
		Thread.sleep(2000);

	}

	@Then("^Confirming order$")
	public void confirming_order() throws Throwable {
		driver.findElement(By.xpath("//input[@value='Confirm']")).click();
		Thread.sleep(2000);

		Assert.assertEquals(driver.findElement(By.xpath("//div[@class='title']//strong")).getText(),
				"Your order has been successfully processed!");
		Thread.sleep(2000);

		driver.findElement(By.linkText("Log out")).click();
		Thread.sleep(2000);
	}

}
