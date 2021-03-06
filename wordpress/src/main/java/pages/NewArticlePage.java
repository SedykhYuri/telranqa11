package pages;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.WebDriver;

import webObject.WebObject;

public class NewArticlePage extends BasePage {

	public NewArticlePage (WebDriver driver) {
		super(driver);
		
	}
	private static final String PROJECT_DIR = System.getProperty("user.dir");
	
	WebObject title = new WebObject ("field title","//textarea[@class='textarea-autosize editor-title__input']");//	"//div[@class='editor-title']");
	WebObject text = new WebObject ("field text body",	"//iframe[@title='Rich Text Area. Press Alt-Shift-H for help']");
	WebObject buttonPublish = new WebObject ("button Publish",	"//button[@class='button editor-publish-button is-primary']");
	WebObject buttonClose = new WebObject ("button Close",	"//button[@class='button editor-ground-control__back is-borderless']");
	WebObject buttonSave = new WebObject ("button Save",	"//span[@class='editor-ground-control__save-status']");
	public NewArticlePage enterTitle() {
		//System.out.println(titles.generateTitile());
	ops.writeToWebElement(title, titles.generateTitile());	
	return this;
	}
	
	public NewArticlePage enterText() {
		ops.writeToWebElement(text, textGen.generateRandomString(35));
		ops.clickOnWebElement(buttonSave);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		ops.clickOnWebElement(buttonPublish);
		                	
		System.out.println("Entered data to Title and text and pressed on button Publish");
		
		return this;
		}
	
	public NewArticlePage cklicOnButtonClose () {
	ops.clickOnWebElement(buttonClose);
	System.out.println("transmition on my site page");
	return this;
	}
	
	// method saves random generated site page title to the file pageTitle   
		public void saveTitle(){
			String titleText = ops.findWebElementOnPage(title).getText();

			String writeToDest = (PROJECT_DIR
                    +  File.separator + "src" 
                    + File.separator + "main" 
                 	+ File.separator + "resourses"
                    +File.separator + "pageTitle.txt");
			
			//File dest = new File (writeToDest);
			writeText.addStringToFile(titleText, writeToDest);
				
		}
		/*test example of the method where we get last Title from the file and 
		  remove it from the file. Not for use at this Class. ONLY FOR EXAMPLE!!!
		 */
		public void getLastTitleAndRemooveIt(){
			String filePath = (PROJECT_DIR
                    +  File.separator + "src" 
                    + File.separator + "main" 
                 	+ File.separator + "resourses"
                    +File.separator + "pageTitle.txt");
			String whole = readText.readFile(filePath);
			System.out.println(whole);
			String last = readText.getLastString(readText.readFile(filePath));
			System.out.println(last);
			writeText.writeStringToFile(writeText.RemooveLastString(whole), filePath);
		}
}
