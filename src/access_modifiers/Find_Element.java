package access_modifiers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Find_Element {
	
	static WebDriver driver;
	
//	You are tasked by your company to find an element with id "mega-banner-add" and get the text out of it. Y 
//	our company doesn't know which of the two websites it can be found at:either google website or yahoo website.
//	Instantiate your driver instance;
//	Navigate to the google website first, search for the element and try to get the text out of it;
//	In case it's not found there, your code must recover from the exception that might arise;
//	Once you have recovered from exception - navigate to the yahoo website and perform the search there;
//	In the finally block: quit your driver instance and either print "nothing was found" or the text of the element in question
//	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/ahmedalloubani/Downloads/chromedriver");
		findE();
		
	}
	
	public static void findE() {
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String text = "";
		
		//one solution 
		
		try {
			driver.findElement(By.id("\"mega-banner-add\""));
			text = driver.findElement(By.id("\"mega-banner-add\"")).getText();
			
		}catch (Exception e) {
			
			System.out.println("element not found at google");
			
		}
		try {
			driver.get("https://www.yahoo.com");
			text = driver.findElement(By.id("\"mega-banner-add\"")).getText();
			
		}catch (Exception e){
			
			System.out.println("elemnt not found at yahoo");
			
		}finally {
			if (text.equals("")) {
				System.out.println("Nothing was Found");
			}else {
				System.out.println(text);
			}
			
			driver.quit();
		}
		
		
		//The right solution
		
		try {
			driver.get("https://google.com");
			 text = driver.findElement(By.cssSelector("input[class='gNO89b']")).getAttribute("value");
			
		} catch (Exception e) {
			driver.get("https://yahoo.com");
			 text = driver.findElement(By.id("mega-banner-add")).getText();
			
			e.printStackTrace();
		}finally {
			if (text.equals("")) {
				System.out.println("Nothing waas found in both websites");
			}else {
				System.out.println(text);
			}
			driver.quit();
		}
		
	}
	
	
	

}
