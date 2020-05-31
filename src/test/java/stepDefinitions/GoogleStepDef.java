package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GoogleStepDef {

	WebDriver driver;
	@Given("^Launch Browser$")
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "D://Drivers//Chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	
	@When("^Launch URL$")
	public void launchURL() {
		driver.get("https://www.google.com");
	}
	
	@Then("^Validate Google Home page$")
	public void googleHome() {
		System.out.println("Google Page is launched");
	}
	
	@And("^Validate Google Title$")
	public void googleTitle() {
		System.out.println(driver.getTitle());
	}
	
	@And("^Enter (.*)$")
	public void googleSearch(String SearchTerm) {
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys(SearchTerm);
		searchBox.sendKeys(Keys.ENTER);
	}
	@Then("^Validate Google Search Page$")
	public void googleSearchPage() {
		System.out.println("Google Search Page is launched");
	}
	
	
	@Then("^Validate Gmail Link$")
	public void validate_Gmail_Link(){
		driver.findElement(By.linkText("Gmail")).click();
		System.out.println(driver.getTitle());
	   
	}

	@Then("^Validate Images Link$")
	public void validate_Images_Link()  {
		driver.findElement(By.linkText("Images")).click();
		System.out.println(driver.getTitle());
	   
	}
	
	@And("^Quit Browser$")
	public void closeBrowser() {
		driver.quit();
	}
}
