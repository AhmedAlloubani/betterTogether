package day40_properties;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Config {
	
	private Config() {
		
		
	}
	
	private static Properties config;
	
	
	
	static {
		
		try {
			File file = new File("./src/day40_properties/data.properties");
			
			FileInputStream input = new FileInputStream(file);
			
			config = new Properties();
			config.load(input);
		
		}catch (Exception e){
			e.printStackTrace();
		}
	}
	
	
	public static String getProperty(String key) {
		return config.getProperty(key);
	}

}
