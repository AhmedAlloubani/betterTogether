package day39_poperties;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

//we start creating a utility class

public class Config {
	
	private Config() {
		
	}
	

	
	private static Properties config;
	
	
		
		
	static {	
		try {
		File file = new File("./src/day39_poperties/configuration.properties");
		
		FileInputStream input = new FileInputStream(file);
		
		config = new Properties();
		config.load(input);
		
	} catch (Exception e) {
		e.printStackTrace();
	}

}
	
	public static String getProperty(String key) {
		return config.getProperty(key);
	}

	
	
	
}