package gui_tests;

import org.testng.annotations.Test;

import gui_tests.BaseTest;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest extends BaseTest {

	public LoginPage loginPage;
	public HomePage home;
	
	@Test (priority=0)
	public void loginToWordPressAccount() {
		browseToUrl("https://wordpress.com");
		loginPage = new LoginPage(driver);
		loginPage.enterLogin("telranenglish");		
		home = loginPage.enterPassword("TREnglish");
		System.out.println("end");
	}
	
}
 