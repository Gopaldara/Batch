package utils;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class CaptureScreenshotutil {
	public static void captureScreenshot(WebDriver driver,String name) throws IOException
	{
		TakesScreenshot ts =(TakesScreenshot)driver;
		File tem = ts.getScreenshotAs(OutputType.FILE);
		File per =new File("./src/test/resources/Sceenshot/"+name +".png");
		FileHandler.copy(tem, per);
	}

}
