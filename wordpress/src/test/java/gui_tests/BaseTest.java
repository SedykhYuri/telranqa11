package gui_tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import driver.Driver;
import operation.Operation;

public class BaseTest {
	protected WebDriver driver;
	protected Operation ops;
	
	@BeforeClass
	public void setUp() throws Exception{
		driver = Driver.getWebDriver();
	}
	
	@AfterClass
	public void cleanUp(){
		driver.quit();
	}
	
	protected void browseToUrl(String url) {
		driver.get(url);
	}
}