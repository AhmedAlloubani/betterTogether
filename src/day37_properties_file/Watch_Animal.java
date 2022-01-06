package day37_properties_file;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static day37_properties_file.Config.*;

public class Watch_Animal {
	
	public static void main(String[] args) {
		
		System.setProperty(getProperty("driver"), getProperty("systemProperty"));
		
		WebDriver driver = new ChromeDriver();
		driver.get(getProperty("url"));
		
		driver.findElement(By.linkText("Tiger Cam")).click();
		
		try {
			Thread.sleep(15000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.quit();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
