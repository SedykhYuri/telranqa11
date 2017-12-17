package pages;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import webObject.WebObject;

public class SitePagesPage extends BasePage {

	public SitePagesPage(WebDriver driver) {
		super(driver);	
	}
	WebObject buttonPages = new WebObject ("button Pages",	"//a[@href='/pages/telranenglish.wordpress.com']");
	
	WebObject ellipsesTestLastArticle = new WebObject("Ellipsis on Test article", "//div[@class='card page is-compact']//*[contains(@class,'actions-toggle')][1]");
	WebObject trashButton = new WebObject("Trash Button after clicking on Ellipsis", "//button[@class='popover__menu-item page__trash-item']");
	
	
	public SitePagesPage clickOnEllipsesOfLastArticle(){
		ops.clickOnWebElement(ellipsesTestLastArticle);
		return this;
	}
	
	public SitePagesPage clickOnTrashButton(){
		ops.clickOnWebElement(trashButton);
		return this;
	}
	
	public  void firstArticle(){
		System.out.println("1");
		//ops.clickOnWebElement(buttonPages);
		System.out.println("2");
		String text =  driver.findElement(By.xpath("id(\"pages\")/div[2]/div[1]/a[1]")).getText();
				                                                     //.getAttribute("textContent");
//		String text2 = text.replaceAll("[^0-9]+", "");
//	//System.out.println(text2);
//	int qualityOnePlus =Integer.parseInt(text2);
//	System.out.println("Found OnePlus Cell phones - "+qualityOnePlus);
	System.out.println(text);
	}

}
