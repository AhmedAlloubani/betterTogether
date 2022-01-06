package day9_scanner_switch;

import java.util.Scanner; // import a Scanner class from java.util package


public class Scanner_Practice {
	
	public static void main (String [] args) {
	// variable declaration	  object creation
		Scanner input = new Scanner(System.in) ;
		System.out.println("Please enter your age"); // user prompt
		
		
		byte age = input.nextByte(); // user input will be saved age variable 
		input.nextLine(); // numeral type processing doesn't move 
		                  // take you to the next line
		System.out.println("My age is : " + age);
		
		System.out.println("Please enter your occupation"); // user prompt
		
		
		String occupation = input.nextLine();
		
		
		System.out.println("My occupation is : " + occupation);
		
		
		
	}

}
