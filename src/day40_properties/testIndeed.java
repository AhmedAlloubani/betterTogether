package day40_properties;
import static day40_properties.Config.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testIndeed {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		
		System.setProperty(getProperty("driver"), getProperty("systemProperty"));
		
		driver = new ChromeDriver();
		
		driver.get(getProperty("url"));
		
		
		
	}

}
