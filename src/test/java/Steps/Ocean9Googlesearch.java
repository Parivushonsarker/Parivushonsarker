package Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.Googlehomepage;
import common.GoogleBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Ocean9Googlesearch extends GoogleBase{

	WebDriver driver;
	
	Googlehomepage ghp;

	@Given("i am o google home page")
	public void i_am_on_google_home_page() {
		launchBrowser();	
	}

	@When("i enter search {string}")
	public void i_enter_search(String term) {
	//WebElement searchBox = driver.findElement(By.name("q"));
	//searchBox.sendKeys(term);
	ghp = new Googlehomepage(driver);
	ghp.enterSearchTerm(term);

	}

	@When("i click on google search button")
	public void i_click_on_google_search_button() {
		WebElement searchButton = driver.findElement(By.name("btnK"));
		searchButton.submit();
		
		

	}

	@Then("i receive related search results")
	public void i_receive_related_search_result() {
		
		WebElement results = driver.findElement(By.id("result-stats"));
		
		String searchcount = results.getText();
		
		System.out.println("========================================================");
		System.out.println(searchcount);
		System.out.println("========================================================");
		
	
		
	

	}

}
