package day10_recap_string_class;

import java.util.Scanner;

public class Textual_Input_Processing {
	
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the number");
		
		int num1 = input.nextInt();
		input.nextLine();
		
		System.out.println("The number is " + num1);
		// =============================================
		// next() VS nextLine
		System.out.println("Please eneter your name");
		
		String text1 = input.next(); // processes the whole line for user input
		
		System.out.println("The name is " + text1);
		
		System.out.println("Please eneter your last name");
		
		String text2 = input.next();
		
		System.out.println("The name is " + text2);
		
		// nextLine() processes the whole line of user input
		// next() processes one word at a time
		
		
		
	}

}
