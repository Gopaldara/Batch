package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class DriverFactory {
	
private static ThreadLocal<WebDriver> tLDriver = new ThreadLocal<WebDriver>();
	
	public static void initDriver(String browser)
	{
	if(browser.equalsIgnoreCase("chrome"))
	{
		tLDriver.set(new ChromeDriver());  
	}
	 
	else if(browser.equalsIgnoreCase("Firefox"))
	{
		tLDriver.set(new FirefoxDriver());
	}
	else if(browser.equalsIgnoreCase("Edge"))
	{
		tLDriver.set(new EdgeDriver());	
	}
	}
	
	
	public static WebDriver getDriver()
	{
		return tLDriver.get();
	}
	public static void quitBrowser()
	{
		getDriver().quit();
		tLDriver.remove();
	}

}



