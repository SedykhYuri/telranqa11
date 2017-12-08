package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import webObject.WebObject;

public class LoginPage extends BasePage{

public LoginPage (WebDriver driver) {
		super(driver);
		
	}

WebObject buttonLogIn = new WebObject ("button Log In",	"//a[@id='navbar-login-link']");
WebObject fieldUsernameOrEmail = new WebObject ("Username or email field",	"//input[@id='usernameOrEmail']");
WebObject buttonSubmit = new WebObject ("button submit",	"//button[@class='button form-button is-primary']");
WebObject fieldPassword = new WebObject ("password field",	"//input[@id='password']");


public LoginPage enterLoginToUserAccount(String login) {
	ops.clickOnWebElement(buttonLogIn)
	.writeToWebElement(fieldUsernameOrEmail, login)
	.clickOnWebElement(buttonSubmit);
	return this;
}
public HomePage enterPasswordToUserAccount(String password) {
	
	ops.writeToWebElementWithTestIsDisplayed(fieldPassword, password)
	.clickOnWebElement(buttonSubmit);
	
	System.out.println("Login and password are entered");
	return new HomePage(driver);
}

}
