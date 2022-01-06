package day15_class_object;

import java.util.Scanner;

public class Warmup_Task4 {
	
	public static void main(String[] args) {
		
		
		/*
		 * Write a program that accepts a string and prints each
		 * character on a separate line
		 * 
		 * Example: "Hello" -> H    "Sunday" -> S
		 * 					   e                u
		 * 					   l                n
		 *                     l                d
		 *                     o                y		
		 */
		
		Scanner input = new Scanner (System.in);
		
		
		System.out.println("Please write Hello");
		
		String text = input.nextLine();
		
		for (int i = 0; i < text.length(); i++) {
			// i = 0; 0< 6; 'S' == 'a'   false ->   Output: S
			// i = 1; 1 < 6; 'u' == 'a'  false ->   Output: u
			// ....
			// i =4; 4 < 6;  'a' == 'a'   true ->   Output: no output
			// i = 5; 5< 6;  'y' == 'a'   false ->  Output: y
			//      primitive == primitive
			char currentChar = text.charAt(i);
			
			if (text.charAt(i) == 'a') {
				continue; // skips one iteration of the loop
			}
			System.out.println(currentChar);
		}
		input.close();
	
	
	
	
	
	}

}
