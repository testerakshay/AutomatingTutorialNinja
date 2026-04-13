package TestCasesPackage;

import org.testng.annotations.Test;

import BasePackage.BaseClass;
import PackagePOM.Register;

public class VerifyRegister extends BaseClass{
	
	@Test
	public void verifyingRegisterFeature() {
		Register rg = new Register(driver);
		
		
		
		
	}
	
	@Test(dataProvider = "registerDataForm")
	public void dataprovides(String a, String b) {
		
		
	}
		

}
