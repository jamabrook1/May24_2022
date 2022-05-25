package com.expedia.step_definitions;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginWithValidData {
	
	public WebDriver driver;
	
		
	 @Given("^User opens expedia application$")
	    public void user_opens_expedia_application() {
		 System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.expedia.com");
	    }

	    @When("^User clicks sign in $")
	    public void user_clicks_sign_in()  {
	    	driver.findElement(By.xpath("//div[text()='Sign in']")).click();
	      
	    }

	    @When("^User clicks sign in link$")
	    public void user_clicks_sign_in_link()  {
	    	driver.findElement(By.xpath("//a[text()='Sign in']")).click();
	       
	    }

	    @When("^User navigates to sign in Page$")
	    public void user_navigates_to_sign_in_page()  {
	    	
	       
	    }

	    @When("^User inserts valid email$")
	    public void user_inserts_valid_email()  {
	    	driver.findElement(By.xpath("//input[@id='loginFormEmailInput']")).click();
	    	driver.findElement(By.xpath("//input[@id='loginFormEmailInput']")).
	    	sendKeys("muhsinjon@gmail.com");
	    }

	    @When("^User inserts valid password$")
	    public void user_inserts_valid_password() {
	    	driver.findElement(By.xpath("//input[@id='loginFormPasswordInput']")).
	    	sendKeys("FBA1qq2dj3jr4");
	    }

	    @Then("^User click sign in button$")
	    public void user_click_sign_in_button()  {
	    	driver.findElement(By.xpath("//button[@id='loginFormSubmitButton']")).click();
	    }

	    @And("^User directed to login homepage$")
	    public void user_directed_to_login_homepage()  {
	    	
	        
	    }

	}