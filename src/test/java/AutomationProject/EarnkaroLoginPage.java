package AutomationProject;

import org.testng.annotations.Test;

import pageobjects.LoginPage;
import utilities.com.BaseTest;

public class EarnkaroLoginPage extends BaseTest {

	@Test
	public void getLogin() throws Exception {

		initilizeTheDriver();

		driver.get("https://earnkaro.com/");
		LoginPage lp = new LoginPage(driver);
		lp.getLogin("mani82554@gmail.com", "M@ni3848");

	}

}
