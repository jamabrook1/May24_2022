package interview;

import java.io.IOException;
import java.net.URL;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class practice {
		private String testUrl = "https://amazon.com";
		private WebDriver driver;
		
		@BeforeMethod
		public void setup() {
			System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
			@Test
			public void BrokenFindLinks() {
				driver.get(testUrl);
				List<WebElement> links = driver.findElements(By.tagName("a"));
				System.out.println("There are " + links.size() + " links");
				int brokenLinks = 0;
				for (WebElement link : links) {
					String url = link.getAttribute("href");
					try {
						URL linkUrl = new URL(url);
						HttpsURLConnection conn = (HttpsURLConnection) linkUrl.openConnection();
						int resCode = conn.getResponseCode();
						if (resCode >= 400) {
							System.out.println("Broken Links: " + link);
							brokenLinks++;
						}
					} catch (IOException e) {
						e.printStackTrace();
					}
	}
		driver.close();
			}}
