package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.SelectUtil;
import utils.WaitUtil;

public class CheckoutPage {
	
	private By BillingNewAddress_CountryId = By.id("BillingNewAddress_CountryId"); 
    private By BillingNewAddress_City = By.id("BillingNewAddress_City"); 
	private By BillingNewAddress_Address1= By.id("BillingNewAddress_Address1"); 
	private By BillingNewAddress_ZipPostalCode= By.id("BillingNewAddress_ZipPostalCode"); 
	private By BillingNewAddress_PhoneNumber = By.id("BillingNewAddress_PhoneNumber"); 
	private By Continuebtn= By.xpath("//input[@title='Continue' and @onclick='Billing.save()']");
	private By OnClickShipping= By.xpath("//input[@onclick='Shipping.save()']");
	private By OnClickShippingmethod= By.xpath("//input[@onclick='ShippingMethod.save()']");
	private By PaymentCashonDelivery  = By.xpath("//input[@value='Payments.CashOnDelivery']");
    private By clickonpaymentmethod= By.xpath("//input[@onclick='PaymentMethod.save()' and @type='button']");
	private By OnclickPaymentInfo= By.xpath(" //input[@onclick='PaymentInfo.save()' and @type='button']");
	private By Onclickconfirm =By.xpath("//input[@value='Confirm']");
	private By SuccessMsgg = By.xpath("//div[@class='title']/strong");
	  

private WebDriver driver;
	
	 
	public CheckoutPage(WebDriver driver) 
	{
		this.driver=driver;
	}

	public void Billingaddress(String text, String BillingNewAddressCity,String BillingNewAddressAddress1,
			String BillingNewAddressZipPostalCode,String BillingNewAddressPhoneNumber)
	{
	WaitUtil.checkElementIsVisible(BillingNewAddress_CountryId)	;
	SelectUtil.SelectByVisibleText(BillingNewAddress_CountryId,text);
	driver.findElement(BillingNewAddress_City).sendKeys(BillingNewAddressCity);
	driver.findElement(BillingNewAddress_Address1).sendKeys(BillingNewAddressAddress1);
	driver.findElement(BillingNewAddress_ZipPostalCode).sendKeys(BillingNewAddressZipPostalCode);
	driver.findElement(BillingNewAddress_PhoneNumber).sendKeys(BillingNewAddressPhoneNumber);
	driver.findElement(Continuebtn).click();
}
	public void clickShippingAdressContine()
	{
		WaitUtil.checkElementIsVisible(OnClickShipping).click();
	}
	
	public void OnClickShippingmethod()
	{
		WaitUtil.checkElementIsVisible(OnClickShippingmethod).click();
	}
	public void PaymentCashonDelivery()
	{
		WaitUtil.checkElementIsVisible(PaymentCashonDelivery).click();
	}
	
	public void onpaymentmethodContine()
	{
		WaitUtil.checkElementIsVisible(clickonpaymentmethod).click();
	}
	public void clickPaymentInfo()
	{
		WaitUtil.checkElementIsVisible(OnclickPaymentInfo).click();
	}
	public void clickconfirm()
	{
		WaitUtil.checkElementIsVisible(Onclickconfirm).click();
	}
	public String getSuccessMsgg()
	{
	return	WaitUtil.checkElementIsVisible(SuccessMsgg).getText();
	}
}
   
