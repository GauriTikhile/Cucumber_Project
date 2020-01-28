package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObject 
{
   WebDriver driver;
   
   public  PageObject(WebDriver driver)
  {
    PageFactory.initElements(driver,this);
  }
   @FindBy(xpath=("//a[@href='login.htm']"))
   public  WebElement signin;
   @FindBy(id="username")
   public  WebElement username;
   @FindBy(id=" password")
   public  WebElement password;
   @FindBy(name="login")
   public  WebElement login;
}