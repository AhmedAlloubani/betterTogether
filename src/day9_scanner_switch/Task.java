package day9_scanner_switch;

import java.util.Scanner;

public class Task {

	
	// 1. import Scanner
	// 2. declare and itialize the Scanner class
	// 3. process user for the first variable
	// 4. process user input for the second varaiable
	// 5. Output the sum of those variables
	
	// Practice (Not an Answer)
	public static void main(String[] args) {
		
		Scanner input1 = new Scanner (System.in);
		
		System.out.println("Please say your name");
		
		String name = input1.nextLine();
		
		System.out.println("My name is " + name);
		
		System.out.println("Where are you from?");
		String country = input1.nextLine();
		
		
		System.out.println("I am from " + country);
	//	===============================================================
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the first number");
		int num1 = input.nextInt();
		
		
		System.out.println("Please enter the second number");
		int num2 = input.nextInt();
		
		int sum = num1 + num2;
		
		System.out.println("The sum of two number is: " + sum);
		
		
		
	}
	
	
	
	
}
