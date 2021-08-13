package Acedemy;

import java.io.IOException;

import org.testng.annotations.Test;

import pageobject.Register;

public class HomePage extends Base {

	@Test
	public void baseNavigation() throws IOException {
		driver = initializeDriver();
		driver.get("https://sso.teachable.com/secure/9521/users/sign_up?reset_purchase_session=1");
		Register reg = new Register(driver);
		reg.getFullname().sendKeys("Rajat");
		reg.getemail().sendKeys("Pradeep@etelligens.in");
		reg.getpassword().sendKeys("1234567Aa");
		reg.getcpassword().sendKeys("1234567Aa");
		reg.getsubscribe().click();
		reg.getaccept().click();
		reg.getsignup().click();
	}

	
}


