package TestCasesPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class VerifyLogin {
	
	@DataProvider(name= "testdata")
	public Object[] []sendData(){
		 Object[][] Data= {{"testerakshaysawade@gmail.com","Tester@2412"},{"testerakshaysawade@gmail.com","Tester@2413"}};
		return Data;
	}
	
	@Test(dataProvider = "testdata")
	public void VerifyLogin(String email, String pass) throws FileNotFoundException {
		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@title='My Account']")).click();
		driver.findElement(By.xpath("(//a[contains(text(), 'Login')])[1]")).click();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pass);
		driver.findElement(By.xpath("//input[@value=\"Login\"]")).submit();
		
		
		//Screnshot
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File file = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\sawad\\eclipse-workspace\\TutorialNinjaDemo\\Screenshots\\SS.png");
		try {
			FileUtils.copyFile(file, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
//
	

}
