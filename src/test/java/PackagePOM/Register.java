package PackagePOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register {
	
	private WebDriver driver;
	
	//clicking resgister button
	
	@FindBy(xpath = "//span[text() = 'My Account']//parent::a/i")
	private  WebElement button;
	
	@FindBy(xpath = "//a[contains(text(),'Register')]")
	private WebElement selRegister;
	
	//Form filling
	
	
	@FindBy(xpath = "//input[@name='firstname']")
	private WebElement name;
	
	@FindBy(xpath = "//input[@name='lastname']")
	private WebElement lastname;
	
	
	
	public Register(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver,this);
		
	}
	
	public void ClickRegister() {
		button.click();
		selRegister.click();
		
	}
	
	

	

}
