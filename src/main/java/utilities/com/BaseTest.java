package utilities.com;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class BaseTest {

	ChromeOptions cp;
	Properties prop;
	FileInputStream fis;
	public WebDriver driver;

	public void initilizeTheDriver() throws Exception {

		prop = new Properties();
		fis = new FileInputStream(
				"C:\\Users\\katak\\Eclipse-practice\\OctProduct\\src\\main\\java\\data\\properties\\browser.properties");
		prop.load(fis);
		String browserName = prop.getProperty("browser");

		if (browserName.equalsIgnoreCase("chrome")) {

			ChromeOptions cp = new ChromeOptions();
			cp.setBrowserVersion("117");

			driver = new ChromeDriver();

		} else if (browserName.equalsIgnoreCase("firefox")) {
			FirefoxOptions cp = new FirefoxOptions();
			cp.setBrowserVersion("117");

			driver = new FirefoxDriver();

		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

}
