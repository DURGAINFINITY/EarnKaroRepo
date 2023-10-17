package AutomationProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class EarnkaroLoginPage {

	@Test
	public void getLogin() {

		ChromeOptions cp = new ChromeOptions();
		cp.setBrowserVersion("117");

		WebDriver driver = new ChromeDriver();
		driver.get("https://earnkaro.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.id("link_signin")).click();
		driver.findElement(By.id("uname")).sendKeys("mani82554@gmail.com");
		driver.findElement(By.id("btnLayoutContinue")).click();
		driver.findElement(By.id("pwd")).sendKeys("M@ni3848");
		driver.findElement(By.id("btnLayoutSignupPass")).click();

	}

}
