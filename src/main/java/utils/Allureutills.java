   package utils;

import java.io.ByteArrayInputStream;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import driver.DriverFactory;
import io.qameta.allure.Allure;
import io.qameta.allure.Attachment;

public class Allureutills {
	
	//@Attachment(value = "Failed Screen shot",type="image/png")
	public static void attchScreenshot()
	
	{
		byte[] ss  =((TakesScreenshot)DriverFactory.getDriver()).getScreenshotAs(OutputType.BYTES);
		
		Allure.addAttachment("screenshot", new ByteArrayInputStream(ss));
	}
	
	//For attching logs  
	public static void attachlog(String log)
	{
		Allure.addAttachment("Execution log", new String (log));
	}
	
	
	
}

//   Not working 
//	@Attachment(value = "Failed Screen shot",type="image/png")
//public static byte[] attchScreenshot()
//
//	
//	{
//		  return ((TakesScreenshot)DriverFactory.getDriver()).getScreenshotAs(OutputType.BYTES);
//		
//		//Allure.addAttachment("screenshot", new ByteArrayInputStream(ss));
//	}

//}
