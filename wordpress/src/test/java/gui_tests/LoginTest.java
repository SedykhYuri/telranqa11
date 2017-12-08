package gui_tests;

import org.testng.annotations.Test;

import gui_tests.BaseTest;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest extends BaseTest {

	public LoginPage loginPage;
	public HomePage home;
	
	@Test (priority=0)
	public void enterToUserAccountToWordPress() {
		browseToUrl("https://wordpress.com");
		loginPage = new LoginPage(driver);
		loginPage.enterLoginToUserAccount("telranenglish")
		.enterPasswordToUserAccount("TREnglish");
		home = loginPage.enterLoginToUserAccount("telranenglish")
				.enterPasswordToUserAccount("TREnglish");
		System.out.println("end");
	}
	
	
	
}
