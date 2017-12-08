package pages; 

import org.openqa.selenium.WebDriver;

import webObject.WebObject;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
	}

	WebObject mySiteLink = new WebObject("Move to My Site page", "//*[text() = 'My Site']");
	
	
	public HomePage linkToMySite(){
		ops.clickOnWebElement(mySiteLink);
		return this;
	}
}