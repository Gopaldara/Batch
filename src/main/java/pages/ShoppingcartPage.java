package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.SelectUtil;
import utils.WaitUtil;

public class ShoppingcartPage {
	private By  CountryDropdown = By.id("CountryId");
	private By estimateshipping = By.id("estimateshipping");
	private By termsofservice = By.id("termsofservice");
	private By Oncheckout = By.id("checkout");
	private WebDriver driver;

	public ShoppingcartPage(WebDriver driver) 
	{
		this.driver=driver;
	}
	public void selectcountry(String text)
	{
		SelectUtil.SelectByVisibleText(CountryDropdown,text);
	}
	public void clickestimateshipping()
	{
		WaitUtil.checkElementIsVisible(estimateshipping).click();
	}
	public void clicktermsofservice()
	{
		WaitUtil.checkElementIsVisible(termsofservice).click();
	}
	
	public void Oncheckout()
	{
		WaitUtil.checkElementIsVisible(Oncheckout).click();
	}
}
