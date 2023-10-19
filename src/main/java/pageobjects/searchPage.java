package pageobjects;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class searchPage {

	WebDriver driver;

	public searchPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//input[@name='q']")
	WebElement searchButton;

	@FindBy(xpath = "//div[text()='Above 20000 mAh']")
	WebElement mahFilter;

	@FindBy(xpath = "//div[text()='Brand']")
	WebElement clickBrand;

	@FindBy(xpath = "//input[@placeholder='Search Brand']")
	WebElement searchBrand;

	@FindBy(xpath = "//div[@class='QvtND5 _2w_U27']//span[contains(text(), 'MORE')] ")
	WebElement moreBrands;

	@FindBy(xpath = "//input[@placeholder='Search Brand']")
	WebElement brandName;

	@FindBy(className = "_38vbm7")
	List<WebElement> listOfResult;

	@FindBy(xpath = "//span[normalize-space()='Apply Filters']")
	WebElement applyFilters;

	public void getSearch() {

		searchButton.sendKeys("power bank" + Keys.ENTER);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");
		mahFilter.click();
		clickBrand.click();
		searchBrand.sendKeys("Mi");
		moreBrands.click();
		brandName.sendKeys("Mi");
		for (WebElement one : listOfResult) {
			if (one.getText().equalsIgnoreCase("MIOX")) {
				one.click();
				break;
			}
		}

		applyFilters.click();

	}

}
