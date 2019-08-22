package stepDefination;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DemoTestScript {
	@Given("^Launch the Browser as ChromeBrowser$")
	public void launch_the_Browser_as_ChromeBrowser() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Hello u are in gven annotation");
	}

	@When("^Launch the Application$")
	public void launch_the_Application() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Hello u are in gven annotation");
	}

	@Then("^Pass the UserName and Password$")
	public void pass_the_UserName_and_Password() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Hello u are in gven annotation");
	}

	@Then("^Login to Application after Clciks on Login Button$")
	public void login_to_Application_after_Clciks_on_Login_Button() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Hello u are in gven annotation");
	}

}
