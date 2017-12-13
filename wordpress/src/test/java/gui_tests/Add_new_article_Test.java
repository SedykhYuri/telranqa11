package gui_tests;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.NewArticlePage;
import webObject.WebObject;
import pages.BaseMenuMySite;

public class Add_new_article_Test extends BaseTest{
	public LoginPage loginPage;
	public HomePage home;
	public BaseMenuMySite menuMySite;
	public NewArticlePage newArticle;
	
	@Test (priority=0)
	public void loginToAccount() {
		browseToUrl("https://wordpress.com");
		loginPage = new LoginPage(driver);
		loginPage.enterLogin("telranenglish");		
		home = loginPage.enterPassword("TREnglish");
		System.out.println("end");
	}
	
	@Test (priority=1)
	public void pressToButtonAdd () {
		
		menuMySite = home.linkToMySite();
		 menuMySite.clickOnMySite();
		 newArticle = new NewArticlePage (driver);
		 newArticle.enterTitle().enterText().cklicOnButtonClose();
		 
	}
}
