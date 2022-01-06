package day15_class_object;

import java.util.Scanner;

public class Warmup_Task3 {
	
	public static void main(String[] args) {
		
		/*
		 * 
		 * Continuous user input
		 * 
		 * User keeps entering Strings untill the word "Stop
		 * has been entered
		 */
		
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Please enter some text");
		
		while (true) {
			String text = scanner.nextLine();
			
			if(text.equalsIgnoreCase("Stop")) {
				break;
			}
			System.out.println("The text you entered is: " + text);
			System.out.println("Please enter text once again");
		}
		
		scanner.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
