package interview;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Driver;
import java.time.Duration;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.cucumber.messages.internal.com.fasterxml.jackson.databind.introspect.TypeResolutionContext.Empty;

public class FindLInksAndBrokenLinks {
	private String testUrl = "https://expedia.com";
	private WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		// js=(JavascriptExecutor) driver;
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		Dimension size= driver.manage().window().getSize();
		System.out.println(size);

	}

	@AfterMethod
	public void tearDown() {
		driver.close();
	}

	@Test
	public void FindLinks() {
		driver.get(testUrl);
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("There are " + links.size() + " links");
		int brokenLinks = 0;

		for (WebElement link : links) {
			String url = link.getAttribute("href");
			System.out.println(url);
			if (url == null || url.isEmpty()) {
				System.out.println("Empty Link");
				brokenLinks++;
				continue;
			}
			// check URl
			try {
				URL linkUrl = new URL(url);
				HttpsURLConnection conn = (HttpsURLConnection) linkUrl.openConnection();
				conn.setConnectTimeout(5000);
				conn.connect();
				int resCode = conn.getResponseCode();
				if (resCode >= 400) {
					System.out.println("Broken Links: " + link);
					brokenLinks++;
				}
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
		System.out.println("There are " + brokenLinks + "broken links");
		// driver.close();
	}
	
	
	}

