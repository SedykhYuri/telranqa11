package pages;

import org.openqa.selenium.WebDriver;

import operation.Operation;

public class BasePage {


	protected WebDriver driver;
	protected Operation ops;
	
	public BasePage(WebDriver driver){
		this.driver = driver;
		this.ops = new Operation(driver);
		
		
	}
}
