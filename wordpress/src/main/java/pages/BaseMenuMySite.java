package pages;

import org.openqa.selenium.WebDriver;

import webObject.WebObject;

public class BaseMenuMySite extends BasePage{

	 public BaseMenuMySite(WebDriver driver){
	  super(driver);
	 }
	 
	 WebObject viewSite = new WebObject("ViewSite", "//span[@class = 'menu-link-text'][text()='View Site']");
	 WebObject stats = new WebObject("Stats", "//span[@class = 'menu-link-text'][text()='Stats']");
	 WebObject plan = new WebObject("Plan","//span[@class = 'menu-link-text'][text()='Plan']");
	 WebObject sitePages = new WebObject("SitePages","//span[@class = 'menu-link-text'][text()='Site Pages']");
	 WebObject blogPosts = new WebObject("BlogPosts","//span[@class = 'menu-link-text'][text()='Blog Posts']");
	 WebObject media = new WebObject("Media","//span[@class = 'menu-link-text'][text()='Media']");
	 WebObject comments = new WebObject("Comments","//span[@class = 'menu-link-text'][text()='Comments']");
	 WebObject themes = new WebObject("Themes","//span[@class = 'menu-link-text'][text()='Themes']");
	 WebObject sharing = new WebObject("Sharing","//span[@class = 'menu-link-text'][text()='Sharing']");
	 WebObject people = new WebObject("People","//span[@class = 'menu-link-text'][text()='People']");
	 WebObject plugins = new WebObject("Plugins","//span[@class = 'menu-link-text'][text()='Plugins']");
	 WebObject domains = new WebObject("Domains","//span[@class = 'menu-link-text'][text()='Domains']");
	 WebObject settings = new WebObject("Settings","//span[@class = 'menu-link-text'][text()='Settings']");
	 WebObject addSitePages = new WebObject("AddSitePages", "//li[2]/ul[1]/li[1]/a[2]");
	 WebObject addBlogPosts = new WebObject("AddBlogPosts", "//li[2]/ul[1]/li[2]/a[2]");
	 WebObject addNewSite = new WebObject("AddNewSite", "//a[@class='button my-sites-sidebar__add-new-site is-borderless']");
	 WebObject buttonAddSitePages = new WebObject("button Add on SitePages","//li[@data-post-type='page']/a[@class='sidebar__button']");
	
	 
	 public BaseMenuMySite clickOnMySite() {
	 ops.clickOnWebElement(buttonAddSitePages);
	 return this;
	 }
}
