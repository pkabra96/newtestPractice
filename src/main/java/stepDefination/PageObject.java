package stepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObject {
WebDriver driver;
	
	public PageObject(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(linkText="Log in")
	public  WebElement signin;
	
	@FindBy(name="Email")
	public   WebElement username;
	
	@FindBy(name="Password")
	public  WebElement password;
	
	@FindBy(xpath="//input[@value='Log in']")
	public  WebElement Login;
	
	@FindBy(linkText="Log in")
	public  WebElement login;
	
	
	
	@FindBy(linkText="Apparel & Shoes")
	public  WebElement category;
	
	@FindBy(linkText="Casual Golf Belt")
	public  WebElement subcategory;
	
	@FindBy(name="addtocart_40_EnteredQuantity")
	public   WebElement qty;
	
	@FindBy(name="add-to-cart-button-40")
	public   WebElement addcart;
	
	
	
	@FindBy(xpath="//*[@id=\\\"topcartlink\\\"]/a/span[1]")
	public  WebElement shopcart;
	
	@FindBy(name="termsofservice")
	public   WebElement terms;
	
	@FindBy(name="checkout")
	public   WebElement check;
	
	
	
	
	
	
	
	
	
	
	
	

}
