package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Register {
	public WebDriver driver;
	
	By Fullname = By.id("user_name");
	By email = By.id("user_email");
	By password= By.id("user_password");
	By cpassword= By.id("user_password_confirmation");
	By subscribe =By.id("user_unsubscribe_from_marketing_emails");
	By accept  =By.id("user_agreed_to_terms");
	By signup =  By.xpath("//input[@value ='Sign Up']");
	
	public Register(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement getFullname()
	{
		return driver.findElement(Fullname);
	}
	
	public WebElement getemail()
	{
		return driver.findElement(email);
	}
	public WebElement getpassword()
	{
		return driver.findElement(password);
	}
	public WebElement getcpassword()
	{
		return driver.findElement(cpassword);
	}
	public WebElement getsubscribe()
	{
		return driver.findElement(subscribe);
	}
	public WebElement getaccept()
	{
		return driver.findElement(accept);
	}
	public WebElement getsignup()
	{
		return driver.findElement(signup);
	}
	
	
	

}
