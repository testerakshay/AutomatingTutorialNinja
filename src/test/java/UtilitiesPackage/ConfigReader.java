package UtilitiesPackage;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {
	
	//Seting up properties file 
	static Properties prop;
	static {
		try {	FileInputStream fis = new FileInputStream("C:\\Users\\sawad\\eclipse-workspace\\TutorialNinjaDemo\\src\\test\\resources\\config.properties");
			
		    prop = new Properties();
			prop.load(fis);
		}
		catch(Exception e) {
			System.out.println("exception occur");
		}
	}
	
	public static String getProperty(String key) {
		return prop.getProperty(key);
		
	}
}
