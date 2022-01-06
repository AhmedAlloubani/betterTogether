package day32_properties_file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TimeOfDay {
	
	public static void main(String[] args) throws IOException {
		
		
		
		File file = new File("./src/day32_properties_file/Data.properties"); // right click -> Copy Qualified Name 
		FileInputStream input = new FileInputStream(file);
		
		Properties config = new Properties();
		config.load(input);
		
	//	String value = config.getProperty("timeOfDay");   // afternoon
		String value = config.getProperty("vehicle", "afternoon"); 
		// even though we were searching for the wrong key, default value was returned to us
		switch(value) {
		case "morning":
			System.out.println("Good Morning!");
			break;
		case "afternoon":
			System.out.println("Good Afternoon!");
			break;
		case "evening":
			System.out.println("Good Evening!");
			break;
		default:
			System.out.println("Hello");
		}
		
		
	}

}
