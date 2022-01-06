package day31_exceptions;

import java.io.File;
import java.io.FileNotFoundException;

public class Checked_Exception {
	
	public static void main(String[] args) {
		
		System.out.println("Hello!");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
			System.out.println("Exception!");
		}
		System.out.println("Good bye!");
		
		File file = new File("/desktop/file.txt");
		
		try {
		FileInputStream input = new FileInputStream(file);
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}
	
	System.out.println("End of the program");

}
}
