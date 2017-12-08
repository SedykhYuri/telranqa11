package driver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

	private static final String DRIVER_DIR = "webdrivers";
	private static final String CHROME_PROPERTY_NAME = "webdriver.chrome.driver";
	private static final String CHROME_DRIVER_EXE = "chromedriver.exe";
	private static final String PROJECT_DIR = System.getProperty("user.dir");
	
	public static WebDriver getWebDriver() throws Exception {
		
		prepareDriver(CHROME_PROPERTY_NAME, CHROME_DRIVER_EXE);
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize(); 
		
		return driver;
	}
	
	private static void prepareDriver(String propertyName, String driverExe) throws IOException {
			System.setProperty(
					propertyName, 
					PROJECT_DIR 
					+ File.separator + "src" 
					+ File.separator + "main" 
					+ File.separator + "java" 
					+ File.separator + "webdrivers" 
					+ File.separator + driverExe);
	}
	
	
}
