package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Googlehomepage {
	
	public WebDriver driver;
	public Googlehomepage(WebDriver dr){
		driver =dr;
		PageFactory.initElements(driver,this);
	}
	// webElment searchBox = driver.findElement(by.name("q"));
	// searchBox.sendkeys(term);
	@FindBy(name="q")
	WebElement searchBox;
	
	public void enterSearchTerm(String term) {
		
		searchBox.sendKeys(term);
	}
		//WebElement searchButton = driver.findElement(By.name("btnK"));
		//searchButton.submit();
	@FindBy(name="btnK")
	WebElement searchButton;
	
	public void clickSearchButton() {
		searchButton.submit();
	}
		
		
		
		
	}