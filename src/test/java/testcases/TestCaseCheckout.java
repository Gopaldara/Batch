package testcases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.BaseTest;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import listenser.Allurelisners;
import pages.BookPage;
import pages.CheckoutPage;
import pages.Homepage;
import pages.Registerpage;
import pages.ShoppingcartPage;

//@Epic("Demo shop application")
//@Feature("Checkout")

//  @Listeners(Allurelisners.class)
public class TestCaseCheckout extends BaseTest {
	private static Logger log = LogManager.getLogger(TestCaseCheckout.class);

	@Test
	@Severity(SeverityLevel.CRITICAL)
	@Description("user should order the product")
	@Step("user register with valid details")
	public void Checkout() {
		Homepage hp = new Homepage(driver);
		Registerpage rp = new Registerpage(driver);
		BookPage books = new BookPage(driver);
		ShoppingcartPage cart = new ShoppingcartPage(driver);
		CheckoutPage checkoutpage = new CheckoutPage(driver);

		hp.clickRegisterButton();
		
		log.info("User Registration started");
		rp.register("M", "admin", "Test", "Gopal0hh10575123507@gmail.com", "admin@123", "admin@123");
		hp.clickOnBooks();
		books.clickfirstAddtocart();
		log.info("User Added item to cart sucsessfully"); 
		hp.clickshoppingCart();
		cart.selectcountry("India");
		cart.clicktermsofservice();
		cart.Oncheckout();
		checkoutpage.Billingaddress("India", "Banglore", "rajaji", "580010", "973456728");
		log.info("User has  sucsessfully Filled the Billing Adress");
		checkoutpage.clickShippingAdressContine();
		checkoutpage.OnClickShippingmethod();
		checkoutpage.PaymentCashonDelivery();
		log.info("User has choosen sucsessfully payment method");
		checkoutpage.onpaymentmethodContine();

		checkoutpage.onpaymentmethodContine();
        checkoutpage.clickPaymentInfo();
        checkoutpage.clickconfirm();

		String AR = checkoutpage.getSuccessMsgg();
		String ER = "Your order has been successfully processed!";
		Assert.assertEquals(AR, ER);
		System.out.println(AR);
		log.info("User has sucsessfully  ordered");
	}
}
