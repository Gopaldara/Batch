package listenser;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import driver.DriverFactory;
import utils.CaptureScreenshotutil;
import utils.CurrentDateutil;

public class Listenser implements ITestListener {
	
		
		public void onStart (ITestContext context)
		{
			System.out.println(" Text Execution Start");
		}
		
		public void onTestStart (ITestResult result)
		{
			System.out.println(result.getName()+" "   +" Text Execution Start");
		}

		public void onTestSucess (ITestResult result)
		{
			System.out.println(result.getName()+" "   +" Text Execution Passed");
		}
		public void onTestFailure (ITestResult result)
		{
			try {
				CaptureScreenshotutil.captureScreenshot(DriverFactory.getDriver(), CurrentDateutil.getCurrentDate()+result.getName());
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			System.out.println(result.getName() + " "  +" Text Execution Failed");
		}
		
		public void onTestSkipped (ITestResult result)
		{
			System.out.println(result.getName()+" "   +" Text Execution Skipped");
		}
		
		
		public void onTestSucess (ITestContext Context)
		{
			System.out.println(" Text Execution Finished");
		}
		}


