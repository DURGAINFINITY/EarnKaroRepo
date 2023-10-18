package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AffHistory {

	WebDriver driver;

	public AffHistory(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(className = "_30XB9F")
	WebElement clicktheBlog;

	@FindBy(xpath = "//img[@alt='Electronics']")
	WebElement clickEletronics;

	public void getHistory() {

		clicktheBlog.click();
		clickEletronics.click();
		List<WebElement> ele = driver.findElements(By.xpath("//div[@class='_16rZTH']/object[1]/a"));
		System.out.println(ele.size());

		for (WebElement one : ele) {
			if (one.getText().equalsIgnoreCase("Electronics GST Store")) {
				one.click();
			}
		}

	}

}
