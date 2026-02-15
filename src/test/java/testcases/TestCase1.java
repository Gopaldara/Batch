package testcases;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import pages.Homepage;
import pages.Registerpage;
import utils.Allureutills;

public class TestCase1 extends BaseTest {
	private static Logger log = LogManager.getLogger(TestCase1.class);
	
	
	//String email=RandomStringUtils.randomAlphanumeric(5)+"@gmail.com"    //(it will genrate single email id)  
	@Test
	//@Test(retryAnalyzer = listenser.RetryAnalyzer.class)
	@Severity(SeverityLevel.CRITICAL)
	@Description("user should login")
	public void registerUser()
	{
		
		String email=RandomStringUtils.randomAlphanumeric(5)+"@gmail.com"; // it will genrate random Multipule emails every time which we have mentioned in Retryazalyzer count
	Homepage homepage = new Homepage(driver);
	homepage.clickRegisterButton();
	log.info("iam in register page ");
	Registerpage registerpage= new Registerpage(driver);
	Allureutills.attachlog("user registration using emai: "+ email);
	registerpage.register("M", "admin", "Test", email, "admin@123", "admin@123");
	
	log.info("register has complteted");
	 String ER = "Your registration completed";
	
    String AR= registerpage.checkSuccsestext();
   // Assert.assertEquals(AR, ER);
	//System.out.println("registration completed");
	Allureutills.attachlog(AR);
	Allureutills.attchScreenshot();
	
}
	/*@Test
	public  void demotestcase()
	
	{
		Assert.assertEquals(true, false);
		Allureutills.attchScreenshot();
		
*/	
	}



