package pageobjects;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class addToCart {

	WebDriver driver;

	public addToCart(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//input[@name='q']")
	WebElement searchButton;

	@FindBy(xpath = "//span[contains(text(),'MORE')]")
	WebElement moreBrands;

	@FindBy(xpath = "//input[@placeholder='Search Brand']")
	WebElement brandName;

	@FindBy(className = "_38vbm7")
	List<WebElement> listOfResult;

	@FindBy(xpath = "//span[normalize-space()='Apply Filters']")
	WebElement applyFilters;

	@FindBy(xpath = "//div[@class='_31Kbhn WC_zGJ'] //div[@class='_3FdLqY']")
	WebElement priceAdjustment;

	@FindBy(xpath = "//div[contains(text(),'Price -- Low to High')]")
	WebElement lowToHigh;

	@FindBy(xpath = "//div[@class='_4rR01T']")
	List<WebElement> listOfMobiles;

	@FindBy(xpath = "//li[@class='_3V2wfe']")
	List<WebElement> mobileColours;

	@FindBy(xpath = "//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")
	WebElement addToCart;

	public void getAddToCart() throws Exception {

		searchButton.sendKeys("LAVA basic mobile" + Keys.ENTER);
		moreBrands.click();
		brandName.sendKeys("lava");

		for (WebElement one : listOfResult) {
			if (one.getText().equalsIgnoreCase("LAVA")) {
				one.click();
				break;
			}
		}

		applyFilters.click();
		Thread.sleep(1000);

		Actions ac = new Actions(driver);
		ac.dragAndDropBy(priceAdjustment, -170, 0).build().perform();

		lowToHigh.click();
		boolean status = false;
		String desired = "Candy Blue L";

		while (!status) {

			for (WebElement each : listOfMobiles) {

				if (each.getText().equalsIgnoreCase("LAVA A1 2021")) {

					Thread.sleep(1000);

					each.click();

					for (WebElement eachone : mobileColours) {

						if (eachone.getText().equalsIgnoreCase(desired)) {
							status = true;
							addToCart.click();
							break;

						}

					}
				}

				if (!status) {
					JavascriptExecutor js = (JavascriptExecutor) driver;
					js.executeScript("window.scrollBy(0,150)");
				}

			}

		}

	}
}
