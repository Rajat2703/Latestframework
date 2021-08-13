package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {
	public WebDriver driver;

	private By useremail = By.id("UserName");
	private By password = By.id("Password");
	private By sumbit = By.id("login_button");
	private By title = By.xpath("//h2[contains(text(),'Barnes')]");

	public Login(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getuseremail() {
		return driver.findElement(useremail);
	}

	public WebElement getpassword() {
		return driver.findElement(password);
	}

	public Login getsumbit() {
		driver.findElement(sumbit).click();
		Login lp = new Login(driver);
		return lp;
	}

	public WebElement gettitle() {
		return driver.findElement(title);
	}

}
