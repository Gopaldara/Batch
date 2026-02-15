package base;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import driver.DriverFactory;
import utils.ReadProperty;

public class BaseTest {
 
	
		public static WebDriver driver;
		@Parameters("browser")
		@BeforeMethod
		public void setup(@Optional String browser) throws IOException
		
		{
			if(browser== null)
			{
				DriverFactory.initDriver(ReadProperty.getProperty("browser"));
			}
			else
			{
				DriverFactory.initDriver(browser);
			}
			
			driver = DriverFactory.getDriver();
			DriverFactory.getDriver()
			.manage().window().maximize();  
		 // DriverFactory.getDriver().get(ReadProperty.getproperty("url"));
		  DriverFactory.getDriver().get(ReadProperty.getProperty("url"));
			
		}
		@AfterMethod
		public void tearDown()
		{
			DriverFactory.quitBrowser();
		}
	}
