package interview;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchGoogle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		// Implicit wait
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Explicit wait
		// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		driver.findElement(By.name("q")).sendKeys("Selenium");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		

		// driver.findElement(By.xpath("//h3[text()='Selenium']")).click();

		// Explicit wait
		// WebElement element = wait
		// .until(ExpectedConditions.visibilityOfElementLocated

		By elelocator = By.xpath("//h3[text()='Selenium']");
		waitForElementPresent(driver, elelocator, 10).click();

	}
	// below generic method we should create and use for explicit way for multiple elements 

	public static WebElement waitForElementPresent(WebDriver driver, By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));

		return driver.findElement(locator);
	}
}
