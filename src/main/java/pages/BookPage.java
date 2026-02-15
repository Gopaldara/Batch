package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.WaitUtil;

public class BookPage {
private WebDriver driver;
	
	private By first_Addtocart  = By.xpath("(//input[@value='Add to cart'])[1]"); 
	public BookPage(WebDriver driver) 
	{
		this.driver=driver;
	}
	public void clickfirstAddtocart()
	{
		WaitUtil.checkElementIsVisible(first_Addtocart).click();
	}
}

