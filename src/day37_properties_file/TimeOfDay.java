package day37_properties_file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TimeOfDay {
											//	Input Output Exception
	public static void main(String[] args) throws IOException {
		
		//1-we go to the package, create new file and name it as -> data.properties.
		//2-we import the class File file = new File("copy qualified name for the data properties file") remove
		//everything before the src and put a dot instead.
		//3-Open the stream to start processing the content of the file -> FileInputStream input = new FileInputStream(file);
		//4-set out the object of the properties that helps us to deal with specific properties files
		//Properties config = new Properties();
		//
		
		
		
		//property file: to store key value pairs
		//its a place that represents the central point of control and data store for the test automation framework  
		//Dynamic (data driven framework), portable(give the code to anyone so he can connect it to his data
		//properties and use his own information
		//re-usability.
		
		
		
		
		
	//	String timeOfDay= "morning";
							//copy qualified name for the data properties file
		File file = new File("./src/day37_properties_file/data.properties"); //here we connected to the file
		FileInputStream input = new FileInputStream(file); //open the stream to start processing the content of the file
		
		
		Properties config = new Properties();//we are setting out the object of the properties that helps us to 
		//deal with specific properties files (if java finds that particular key, it will give you back the value,
		//otherwise, it will give you NULL.
		config.load(input);
		
									//this is the key
		switch(config.getProperty("timeOfDay")) {
		case"morning":
			System.out.println("Good Morning!");
			break;
		case"afternoon"	:
			System.out.println("Good Afternoon!");
			break;
		case"evening":
			System.out.println("Good evening!");
			break;
		default:
			System.out.println("Hello");
		}
	}

}
