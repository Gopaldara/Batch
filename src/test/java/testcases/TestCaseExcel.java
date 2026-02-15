package testcases;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.Homepage;
import pages.Registerpage;
import testdataprovider.ReadExcelData;

public class TestCaseExcel extends BaseTest {
	 


	@Test (dataProvider = "registerdata",dataProviderClass =ReadExcelData.class)
	public void registerUser( String Gender,String firstname, String lastName, String email, String password,String confirmPassword)
	{
	Homepage homepage = new Homepage(driver);
	homepage.clickRegisterButton();
	Registerpage registerpage= new Registerpage(driver);
	
    registerpage.register(Gender,firstname,lastName,email,password,confirmPassword);
	//String ER = "Your registration completed";
    //String AR= registerpage.checkSuccsestext();
	//Assert.assertEquals(AR, ER);
	System.out.println("registration completed");  
	   
	
   
}

}

