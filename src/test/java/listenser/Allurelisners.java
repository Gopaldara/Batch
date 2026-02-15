package listenser;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import utils.Allureutills;

public class Allurelisners  implements ITestListener{
	
		
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
			System.out.println(result.getName()+" "   +" Text EXECUTION PASSED");
			
		}
		
		public void onTestFailure (ITestResult result)
		{
		
			System.out.println(result.getName() + " "  +" Text EXECUTION FAILED");
			Allureutills.attchScreenshot();
		}
		
		public void onTestSkipped (ITestResult result)
		{
			System.out.println(result.getName()+" "   +" Text EXECUTION SKIPPED");
		}
		
		
		public void onTestSucess (ITestContext Context)
		{
			System.out.println(" Text EXECUTION FINISHED");
		}
		

	}


