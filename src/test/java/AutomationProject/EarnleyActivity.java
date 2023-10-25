package AutomationProject;

import org.testng.annotations.Test;

import pageobjects.EarnleyActivityPage;
import utilities.com.BaseTest;

public class EarnleyActivity extends BaseTest {

	@Test
	public void getLogin() throws Exception {

		initilizeTheDriver();

		driver.get("https://www.earnly.in/");
		EarnleyActivityPage ea = new EarnleyActivityPage(driver);
		ea.getEarnleyActivity();

	}

}
