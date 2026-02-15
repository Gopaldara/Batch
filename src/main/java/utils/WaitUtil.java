package utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import constants.ApplicationConstants;
import driver.DriverFactory;

public class WaitUtil implements ApplicationConstants{
	//private static WebDriver driver;

//	public  class WaitUtil1 extends BaseTest implements ApplicationConstan { 
		//private static WebDriver driver;
		//private static final int Timeout=10;
		public static WebElement checkElementIsVisible(By locater)
		{
			//return new WebDriverWait(DriverFactory.getDriver(),Duration.ofSeconds(Timeout))
					return new WebDriverWait(DriverFactory.getDriver(),Duration.ofSeconds(Timeout))
					.until(ExpectedConditions.visibilityOfElementLocated(locater)); 
		}
		

	}
