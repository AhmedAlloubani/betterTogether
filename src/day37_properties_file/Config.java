package day37_properties_file;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

//we created a utility class
public class Config {
	
	//note: most of utilities methods will be static 
	
	private static Properties config;
	
	//private constructor: prevents anybody from creating instance of this class
	//that's why we are setting the private constructor
	private Config() {
		
	}
	
	//we use static blocks when class is used for the first time and runs only one time
	
	//this block will run first
	static {
		
		try {
			File file = new File("./src/day37_properties_file/configuration.properties"); 
			FileInputStream input = new FileInputStream(file);
			
		    config = new Properties();
			config.load(input);
			input.close();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static String getProperty(String key) {
		return config.getProperty(key);
	}
	
	

}
