package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EarnleyActivityPage {

	WebDriver driver;

	public EarnleyActivityPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[@class='btn btn-primary nav-btn']")
	WebElement getStarted;

	@FindBy(xpath = "//div[text()='Login/Signup']")
	WebElement LoginOrSingup;

	@FindBy(name = "username")
	WebElement userName;

	@FindBy(xpath = "//a[contains(@class,'btn pr fw-bold')]")
	WebElement Continue;

	@FindBy(name = "password")
	WebElement password;

	@FindBy(css = ".btn.pr.fw-bold.btn-primary.btn-xxl.db")
	WebElement Conti;

	public void getEarnleyActivity() throws Exception {

		getStarted.click();
		LoginOrSingup.click();
		userName.sendKeys("manibabu82554@gmail.com");
		Thread.sleep(10000);
		Continue.click();
		password.sendKeys("M@ni3848");
		Thread.sleep(10000);
		Conti.click();

	}

}