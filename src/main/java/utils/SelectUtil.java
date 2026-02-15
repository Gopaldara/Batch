package utils;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectUtil {
	
	public static Select getSelect(By locater)
	{
		WebElement dropdown = WaitUtil.checkElementIsVisible(locater);
		return new Select(dropdown);
	}

	public static void SelectByVisibleText(By locater,String text)
	{
		getSelect(locater).selectByVisibleText(text);
	}
	public static void SelectByVisibleIndex(By locater,int index)
	{
		getSelect(locater).selectByIndex(index);
	}
	public static void deSelectByIndex(By locater,int index)
	{
		getSelect(locater).deselectByIndex(index);
	}
	
	public static void deSelectByVisibleIndex1(By locater,int index)
	{
		getSelect(locater).deselectByVisibleText(null);
	}
	
	
	public static List<WebElement> fetchAllOptions(By locater)
	{
		return getSelect(locater).getOptions();
		
	}

	
	
	
}
