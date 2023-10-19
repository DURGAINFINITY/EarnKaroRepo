package AutomationProject;

import org.testng.annotations.Test;

import pageobjects.searchPage;
import utilities.com.BaseTest;

public class FlipkartSearchPage extends BaseTest {

	@Test
	public void getLogin() throws Exception {

		initilizeTheDriver();
		driver.get("https://www.flipkart.com/");
		searchPage sp = new searchPage(driver);
		sp.getSearch();

	}

}
