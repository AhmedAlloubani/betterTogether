package day12_string_methods;

import java.util.Scanner;

public class Warmup_Task2 {
	
	public static void main(String[] args) {
		
		/*
		 * write a program that converts a name that was improperly written
		 * into a correct form.
		 * 
		 * Example: johN DoE -> John Doe
		 * 
		 */
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the first name");
		String firstName = input.nextLine();
		
		System.out.println("Please enter the last name");
		String lastName = input.nextLine();
		
		//                               
		String correctFirstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();
		
		String correctLastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1).toLowerCase();
		
		System.out.println(correctFirstName + " " + correctLastName);
	
	
	
	
	
	
	
	
	
	}

}
