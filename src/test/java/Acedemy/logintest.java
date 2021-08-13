package Acedemy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobject.Login;

public class logintest extends Base {
	private static Logger LOG = LogManager.getLogger(logintest.class.getName());
	public WebDriver driver;

	@BeforeTest
	public void initialize() throws IOException {

		driver = initializeDriver();//inheritance is used there is no need to create object hence we used extend
		                             //listener extent report are part of interface hence we used implement
		                             //if static is used for variable then one original copy will be shared we cant
		                              //make driver static especially in parral execution as
		                             //static advantage is it does allocation only once

	}

	@Test(dataProvider = "getdata")
	public void login(String username, String password, String text) throws IOException, InterruptedException {

		LOG.info("Driver is running");
		

		driver.get("https://cxco.ca-build.com/Public/Login?ReturnUrl=%2F");

		driver.manage().window().maximize();
		Login lp = new Login(driver);
		
		lp.getuseremail().sendKeys(username);
		lp.getpassword().sendKeys(password);
		LOG.info("Login into commonareas");
		String ee = driver.getTitle();
		LOG.info("Tombarnes");

		Assert.assertEquals(ee, "LOGIN");

	}

	@AfterTest
	public void teardown() {

		driver.close();

	}

	@DataProvider

	public Object[][] getdata()

	{

		Object[][] data = new Object[1][3];
		data[0][0] = "tombarnes@commonareas.work.dev";
		data[0][1] = "1234567Aa";
		data[0][2] = "Restricted user";

		return data;
	}

}
