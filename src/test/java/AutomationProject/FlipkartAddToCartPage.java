package AutomationProject;

import org.testng.annotations.Test;

import pageobjects.addToCart;
import utilities.com.BaseTest;

public class FlipkartAddToCartPage extends BaseTest {

	@Test
	public void getLogin() throws Exception {

		initilizeTheDriver();
		driver.get("https://www.flipkart.com/");
		addToCart ac = new addToCart(driver);
		ac.getAddToCart();

	}

}
