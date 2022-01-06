package day10_recap_string_class;

import java.util.Scanner;

public class Recap {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);   // initializing Scanner
		
		// ==============================================
		System.out.println("Please enter a byte");    // prompting a user 
		byte num1 = input.nextByte();				  // processing user input	
		
		System.out.println("Byte num = " + num1);     // outputting the user input
		
		// ===========================================
		
		System.out.println("Please enter a short");
		
		short num2 = input.nextShort();
		
		System.out.println("Short num2 = " + num2);
		// ============================================
		
		System.out.println("Please enter a long");
		
		long num3 = input.nextLong();
		
		System.out.println("Long num3 = " + num3);
		//==============================================
		System.out.println("Please enter a boolean");
		
		boolean bool1 = input.nextBoolean();
		
		System.out.println("Boolean = " + bool1);
		//===============================================
		// for floating point data type, we don't need to provide a literal at the end
		// in console: float = 2.5; double = 10.3
		System.out.println("Please enter a float");
		
		float num4 = input.nextFloat();
		
		System.out.println("Float num = " + num4);
		
		input.close();
		
		/*
		 * Scanner class:
		 * -  java class lets us get a process user input
		 * - present in java.util package
		 * - import statement has to be placed after package declaration and before
		 * 	the class declaration
		 * - don't forget to prompt the user for input
		 * - all the Scanner methods if they are placed before textual input processing
		 * 	would require one extra nextLine() method
		 * - we can close the input stream (close Scanner) by typing input.close();
		 */
		
		
		
		
		
}
}