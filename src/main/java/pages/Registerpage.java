package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.WaitUtil;



public class Registerpage {
private WebDriver driver;
	
	private By  g_male= By.id("gender-male"); 
	private By  g_female= By.id("gender-female");
	private By firstName=By.id("FirstName");
	private By lastName= By.id("LastName");
	private By email = By.id("Email");
	private  By password=By.name("Password");
	private By confirmpassword=By.id("ConfirmPassword");
	private By register_button=By.id("register-button");
	private By registermsg= By.xpath("//input[@class='button-1 register-continue-button']");
	
	public Registerpage(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	public void clickMale_rb()
	{
		WaitUtil.checkElementIsVisible(g_male).click();
	}
	public void clickFemale_rb()
	{
		WaitUtil.checkElementIsVisible(g_female).click();
	}
	
	public void enterFirstname(String text)
	{
		WaitUtil.checkElementIsVisible(firstName).sendKeys(text);
	}
	
	public void enterLaststname(String text)
	{
		WaitUtil.checkElementIsVisible(lastName).sendKeys(text);
	}
	
	public void enterEmail(String text)
	{
		WaitUtil.checkElementIsVisible(email).sendKeys(text);
	}
	
	public void enterPassword(String text)
	{
		WaitUtil.checkElementIsVisible(password).sendKeys(text);
	}
	
	public void enterConfirmPassword(String text)
	{
		WaitUtil.checkElementIsVisible(confirmpassword).sendKeys(text);
	}
	
	public void clickRegister()
	{
		WaitUtil.checkElementIsVisible(register_button).click();
	}
	
	public String checkSuccsestext()
	{
		return WaitUtil.checkElementIsVisible(registermsg).getText();
	}
	public void register( String Gender,String firstname, String lastName, String email, String password,String confirmPassword)
	{
		
		if(Gender == "M")
		{
			clickMale_rb();	
		}
		else
		{
			clickFemale_rb();
		}
		
		enterFirstname(firstname);
		enterLaststname(lastName);
		enterEmail(email);
		enterPassword(password);
		enterConfirmPassword(confirmPassword);
		clickRegister();		
	}
	}



