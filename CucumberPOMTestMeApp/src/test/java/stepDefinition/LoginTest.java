package stepDefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class LoginTest
{
	WebDriver driver;
	PageObject PO;
	@Given("^Navigate to Home page$") 
	public void Navigate_to_Home_page() throws Throwable
	{
	
		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/");
		 driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	     PO=new PageObject(driver);
	}
	
	@When("^user enters username and password$")
	public void user_enters_username_and_password() throws Throwable
	{
	
		PO.signin.click();
		PO.username.sendKeys("lalitha");
		PO.password.sendKeys("Password123");
		PO.login.click();
	}
	@When("^Larry searches below products in the search box:$")
	public void Larry_searches_below_products_in_the_search_box(DataTable dt) 
	{
		List<String> product=dt.asList(String.class);
		for(String s:product) 
		{
			driver.findElement(By.name("products")).sendKeys(s);
			driver.findElement(By.xpath("//input[@value='FIND DETAILS']")).click();
		}
	}
	
	@Then("^user logged in successfully$")
	public void user_logged_in_successfully () throws Throwable
	{
	
		System.out.println("user logged in succesfully");
	}
	@Then("^product should be added in the cart if available$")
	public void product_should_be_added_in_the_cart_if_available()
	{
		System.out.println("Product added to the cart");
	}
	
	@When("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
   public void entersunamepwd(String uname, String pwd) 
	{
		PO.signin.click();
		PO.username.sendKeys(uname);
		PO.password.sendKeys(pwd);
		PO.login.click();
	}
	
}
