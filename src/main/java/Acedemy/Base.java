package Acedemy;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Base {
	
		public WebDriver driver;
		
		public WebDriver initializeDriver() throws IOException
		{
			if (this.driver != null)
				return this.driver;
			Properties prop = new Properties();
			

			FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\resources\\data.properties");
			
		    prop.load(fis);
			  String browserName = prop.getProperty("browser");
			  
			  
			  if(browserName.equals("chrome"))
			  {
				  System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\main\\java\\resources\\chromedriver.exe");
				  ChromeOptions option=new ChromeOptions();
				  driver= new ChromeDriver(option);
				  option.addArguments("headless");
			  }
			  else if(browserName=="firefox")
			  {
				  
				  
			  }
			  
			  driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
			  return driver;
			  
		}
     public String getScreenShotPath(String testCaseName, WebDriver driver) throws IOException
     {
    	 TakesScreenshot ts= (TakesScreenshot) driver;
    	 File source = ts.getScreenshotAs(OutputType.FILE);
    	 String dest = System.getProperty("user.dir")+"\\reports\\"+testCaseName+".png";
    	 FileUtils.copyFile(source,new File(dest));
    	 return dest;

     }
     

}


