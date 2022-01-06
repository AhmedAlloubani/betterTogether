package day39_poperties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static day39_poperties.Config.*;

public class testEtsy {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		
		System.setProperty(getProperty("driver"), getProperty("systemProperty"));
		
		driver = new ChromeDriver();
		
		driver.get(getProperty("url"));
		
		JavascriptExecutor js =  (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,4000)");
		
	}

}
