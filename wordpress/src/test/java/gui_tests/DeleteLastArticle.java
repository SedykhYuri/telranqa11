package gui_tests;

import org.testng.annotations.Test;

import pages.BaseMenuMySite;
import pages.HomePage;
import pages.LoginPage;
import pages.MySitePage;
import pages.NewArticlePage;

public class DeleteLastArticle extends BaseTest{
	public LoginPage loginPage;
	public HomePage home;
	public BaseMenuMySite menuMySite;
	public MySitePage mySitePage;
	
	
	@Test (priority=0)
	public void loginToAccount() {
		browseToUrl("https://wordpress.com");
		loginPage = new LoginPage(driver);
		loginPage.enterLogin("telranenglish");		
		home = loginPage.enterPassword("TREnglish");
		System.out.println("end");
	}
	
	@Test (priority=1)
	public void deleteLastArticle () {
		
		 menuMySite = home.linkToMySite();
		 menuMySite.clickOnSitePages();
		 mySitePage = new MySitePage (driver);
		 mySitePage.clickOnEllipsesOfLastArticle();
		 mySitePage.clickOnTrashButton();
		 

	}
}
