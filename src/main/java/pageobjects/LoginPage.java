package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "link_signin")
	WebElement signin;

	@FindBy(id = "uname")
	WebElement username;

	@FindBy(id = "btnLayoutContinue")
	WebElement Continue;

	@FindBy(id = "pwd")
	WebElement password;

	@FindBy(id = "btnLayoutSignupPass")
	WebElement signup;

	public void getLogin(String mail, String pass) {

		signin.click();
		username.sendKeys(mail);
		Continue.click();
		password.sendKeys(pass);
		signup.click();

	}

}
