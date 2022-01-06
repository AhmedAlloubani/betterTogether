package day16_method_parameters_return;

import java.util.Scanner;

public class Methods_Multiple_Parameters {
	
	public void add(int num1, int num2) {
		int sum = num1 + num2;
		System.out.println(sum);
		
	}
	
	public void printStrings(String text, int n) {
		for(int i = 0;i < n ; i++) {
			System.out.print(text);
		}
	}
	
	/*
	 * Create a method that accepts a String and a number n as an input and 
	 * output that string n times the same line
	 * 
	 * Example: ("Hello", 3) -> HelloHelloHello
	 * Example: ("*", 5) -> *****
	 */
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the first num");
		int num1 = input.nextInt();
		
		System.out.println("Please enter the second num");
		int num2 = input.nextInt();
		
		Methods_Multiple_Parameters var = new Methods_Multiple_Parameters();
		var.add(2,  6); // 8 - java follows the logical sequence when assigning values to parameters
		var.add(num1, num2);  // 8
		
		input.close();
		
		var.printStrings("Sunday", 10); // if we reverse parameters, it will not  work here because we have different data types
										// example var.printStrings(10, "Sunday"); -> will not compile (Java execute it sequentially)			
	
		//var.printStrings("Sunday"); // will not compile: java expects two parameters but gets only one
		//var.printStrings("Sunday", 10, 12); // will not compile: too many parameters
		
	}

}
