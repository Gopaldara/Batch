package testcases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.BookPage;
import pages.CheckoutPage;
import pages.Homepage;
import pages.Registerpage;
import pages.ShoppingcartPage;

public class TestCaseStory extends BaseTest {
	
		private static Logger log = LogManager.getLogger(TestCaseCheckout.class);

		@Test
		public void Checkout() {
			Homepage hp = new Homepage(driver);
			Registerpage rp = new Registerpage(driver);
			BookPage books = new BookPage(driver);
			ShoppingcartPage cart = new ShoppingcartPage(driver);
			CheckoutPage checkoutpage = new CheckoutPage(driver);

			hp.clickRegisterButton();
			
			log.info("User Registration started");
			rp.register("M", "admin", "Test", "Gopal0hh10334735124507@gmail.com", "admin@123", "admin@123");
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


