package pages;

import org.openqa.selenium.WebDriver;

import operation.Operation;
import utilities.GeneratorTitles;
import utilities.RandomTextGenerator;
import utilities.TextFileWriter;

public class BasePage {


	protected WebDriver driver;
	protected Operation ops;
	protected GeneratorTitles titles;
	protected RandomTextGenerator textGen;
	protected TextFileWriter writeText;
	
	public BasePage(WebDriver driver){
		this.driver = driver;
		this.ops = new Operation(driver);
		
		
	}
}
