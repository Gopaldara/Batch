package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import driver.DriverFactory;

public class ActionUtil {
	public static  Actions getActions () {
		
		return new Actions (DriverFactory.getDriver());
    }
public static void  mouseHovering(By locater) {
	WebElement element =WaitUtil.checkElementIsVisible(locater);
	getActions().moveToElement(element).perform();
	
}
public static void  doubleclick(By locater) {
	WebElement element =WaitUtil.checkElementIsVisible(locater);
	getActions().doubleClick(element).perform();
	
}

public static void scrollByAmout( int x , int y) {
	getActions().scrollByAmount(x, y).perform();
}
public static void dragAndDrop(By srclocater, By dstlocater) 
{
	WebElement src =WaitUtil.checkElementIsVisible(srclocater);
	WebElement dst = WaitUtil.checkElementIsVisible(dstlocater);
	getActions().dragAndDrop(src, dst).perform();
	
}

public static void keyDown(By locator)
{
	
	WebElement element =WaitUtil.checkElementIsVisible(locator);
	getActions().keyDown(element,Keys.CONTROL).perform();
}

public static void rightClick(By locator) {
	WebElement element =WaitUtil.checkElementIsVisible(locator);
	getActions().contextClick(element).perform();
	
	
}
	
}
