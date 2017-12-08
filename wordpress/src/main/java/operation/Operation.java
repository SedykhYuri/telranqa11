package operation;

import org.openqa.selenium.WebDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import operation.Operation;
import webObject.WebObject;



public class Operation  {
private WebDriver driver;
	
	public Operation(WebDriver driver){
		this.driver = driver;
	}
	
	private WebElement findWebElementOnPage(WebObject webObject){
		WebElement element = driver.findElement(By.xpath(webObject.xPath));
		System.out.println("Web Object " + webObject.description + " was found");
		return element;
	}
	
	public Operation clickOnWebElement(WebObject webObject){		
		WebElement webElement = findWebElementOnPage(webObject);
		if(webElement.isDisplayed()||webElement.isEnabled()) {
			webElement.click();
		System.out.println("Clicking on " + webObject.description);}
		else System.out.println("Element not found");
		//webElement.click();
		
		return this;
	}
	
	public Operation doubleClickOnWebElement(WebObject webObject){		
		WebElement webElement = findWebElementOnPage(webObject);
		Actions builder = new Actions(driver);
	    builder.doubleClick(webElement).build().perform();
		System.out.println("Double clicking on " + webObject.description);
		return this;
	}
		
	public Operation clearField(WebObject webObject) {
		WebElement webElement = findWebElementOnPage(webObject);
		webElement.clear();
		System.out.println("Clearing field: " + webObject.description);
		return this;
	}
	

	public Operation writeToWebElementWithTestIsDisplayed (WebObject webObject, String data){
		WebElement element = findWebElementOnPage(webObject);
		int count =0;
		while (count <=3  ) {
		
		if(element.isDisplayed()==false) {
			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(webObject.xPath)));
//			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			count++;}
			
		else {
		element.click();
		element.clear();
		element.sendKeys(data);
		System.out.println("Typing to " + webObject.description);
		count=4;
		}
		}
		return this;
	}
	
	public Operation writeToWebElement (WebObject webObject, String data) {
		WebElement element = findWebElementOnPage(webObject);
		if(element.isDisplayed()==false) {
			System.out.println("fail");
			try {
				Thread.sleep(2000);
				System.out.println("go");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}}
		element.click();
		element.clear();
		element.sendKeys(data);
		System.out.println("Typing to " + webObject.description);
		return this;
	}
	
	private List<WebElement> findWebElementsOnPage(WebObject webObject){
		List<WebElement> listWebElements = driver.findElements(By.xpath(webObject.xPath));
		System.out.println("List web Objects " + webObject.description + " was found");
		return  listWebElements;
	}
	
	public int countWebElementsOnPage(WebObject webObject) {
		System.out.println("To count elements " +webObject.description);
		return  findWebElementsOnPage(webObject).size();
			
	}
	
	
	
}
