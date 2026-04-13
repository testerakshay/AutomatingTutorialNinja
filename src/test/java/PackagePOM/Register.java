package PackagePOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register {
	
	private WebDriver driver;
	
	@FindBy(xpath = "//span[text() = 'My Account']//parent::a/i")
	private  WebElement button;
	
	@FindBy(xpath = "//a[contains(text(),'Register')]")
	private WebElement selRegister;
	
	public Register(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver,this);
		
	}
	
	public void ClickRegister() {
		button.click();
		selRegister.click();
	}
	

}
