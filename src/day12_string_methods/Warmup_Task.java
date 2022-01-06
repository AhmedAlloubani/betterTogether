package day12_string_methods;

import java.util.Scanner;

public class Warmup_Task {
	
	public static void main(String[] args) {
		
		/*
		 * 1. Declare a scanner object
		 * 2. Ask a user to input a first and last name separately
		 * 3. Declare a String variable called fullName
		 * 4. concatenate and store full name in the variable
		 * 5. Display a total number of characters in the full name (with spaces)
		 * Output the initials: Elon Musk -> (make sure they are capital letters)
		 * 
		 * 
		 */
		
	
		Scanner input = new Scanner(System.in);
	
		System.out.println("Please enter your first name");
		String firstName = input.nextLine();
		
		System.out.println("Please enter your last name");
		String lastName = input.nextLine();
		
		// length() starts counting with 1
		String fullName = firstName + " " + lastName;
		System.out.println("Total num of chars: " + fullName.length());
		
		String firstInitial = firstName.substring(0, 1);  // "J"
		String secondInitial = lastName.substring(0, 1);  // "D"
		System.out.println("Initials: " + firstInitial.toUpperCase() + secondInitial.toUpperCase());
		
		firstInitial = firstName.charAt(0) + ""; // interview question
		secondInitial = lastName.charAt(0) + "";
		
		System.out.println("Initials using charAt() method: " + firstInitial.toUpperCase() + secondInitial.toUpperCase());
		
		
		
		
	
	
	}

}
