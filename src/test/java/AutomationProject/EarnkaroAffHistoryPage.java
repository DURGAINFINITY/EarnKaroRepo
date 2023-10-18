package AutomationProject;

import org.testng.annotations.Test;

import pageobjects.AffHistory;
import utilities.com.BaseTest;

public class EarnkaroAffHistoryPage extends BaseTest {

	@Test
	public void getLogin() throws Exception {

		initilizeTheDriver();

		driver.get("https://www.flipkart.com/");
		AffHistory ah = new AffHistory(driver);
		ah.getHistory();
		driver.close();
	}

}
