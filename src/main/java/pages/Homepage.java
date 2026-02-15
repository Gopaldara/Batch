package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.WaitUtil;

public class Homepage {

	private WebDriver driver;
	
	private By register = By.xpath("//a[@class='ico-register']"); 
	private By books = By.xpath("//ul[@class='top-menu']/descendant::a[1]"); 
	private By shopping_cart = By.xpath("//span[.='Shopping cart']");
	
	
	public Homepage(WebDriver driver) 
	{
		this.driver=driver;
	}
	public void clickRegisterButton()
	{
		WaitUtil.checkElementIsVisible(register).click();
	}
	
	public void clickOnBooks()
	{
		WaitUtil.checkElementIsVisible(books).click();
	}
	public void clickshoppingCart()
	{
		WaitUtil.checkElementIsVisible(shopping_cart).click();
	}


}

