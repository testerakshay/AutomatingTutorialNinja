package BasePackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import UtilitiesPackage.ConfigReader;

public class BaseClass {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void setupBrowser() {
		
		

		String URL =ConfigReader.getProperty("url");
		String Browser = ConfigReader.getProperty("browser");
		
		if(Browser.equals("chrome")) {
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
	}
	
	@AfterMethod
	public void tearDown() {
		//driver.quit();
	}
	
}
