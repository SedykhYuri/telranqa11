package pages; 

import org.openqa.selenium.WebDriver;

import webObject.WebObject;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
	}

	WebObject mySiteLink = new WebObject("button Site page", "//*[text() = 'My Site']");
	
	
	public BaseMenuMySite linkToMySite(){
		ops.clickOnWebElement(mySiteLink);
		System.out.println("movie to My Site");
		return new BaseMenuMySite(driver);
	}
}