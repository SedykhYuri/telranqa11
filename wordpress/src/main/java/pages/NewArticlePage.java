package pages;

import org.openqa.selenium.WebDriver;

import webObject.WebObject;

public class NewArticlePage extends BasePage {

	public NewArticlePage (WebDriver driver) {
		super(driver);
		
	}
	
	WebObject title = new WebObject ("field title","//textarea[@class='textarea-autosize editor-title__input']");//	"//div[@class='editor-title']");
	WebObject text = new WebObject ("field text boby",	"//iframe[@title='Rich Text Area. Press Alt-Shift-H for help']");
	WebObject buttonPublish = new WebObject ("button Publish",	"//button[@class='button editor-publish-button is-primary']");
	WebObject buttonClose = new WebObject ("button Close",	"//button[@aria-label='Close preview']");
	
	public NewArticlePage enterTitle() {
		//System.out.println(titles.generateTitile());
	ops.writeToWebElement(title, titles.generateTitile());	
	return this;
	}
	
	public NewArticlePage enterText() {
		ops.writeToWebElement(text, textGen.generateRandomString(35)).clickOnWebElement(buttonPublish);
		                	
		System.out.println("Entered data to Title and text and pressed on button Publish");
		
		return this;
		}
	
	public NewArticlePage cklicOnButtonClose () {
	ops.clickOnWebElement(buttonClose);
	System.out.println("transmition on my site page");
	return this;
	}
}
