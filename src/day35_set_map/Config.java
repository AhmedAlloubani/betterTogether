package day35_set_map;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Config {
	
	private static Properties config;
	
	private Config() { // it will prevent anybody from creating an object of this class
		
	}
	
	static {
		
		try {
			File file = new File("./src/day35_set_map/config.properties");
			FileInputStream input = new FileInputStream(file);
			config = new Properties();
			config.load(input);
			input.close();
		} catch (Exception e) {
			e.printStackTrace();
			
		}
	}
	
	public static String getProperty(String key) {
		return config.getProperty(key);
	}

}
