package day15_class_object;

import java.util.Scanner;

public class Warmup_Task1 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Please enter a string");
		String text = input.nextLine();
		
		for (int i = text.length() -1 ; i >= 0; i--) {
			// i = 3; 3 >= 0; charAT(3) = a
			// i = 2; 2 >= 0; charAt(2) = v
			// i = 1; 1 >= 0; charAt(1) = a
			// i = 0; 0 >= 0; charAt(0) = J
			// i = -1; -1>=0; -> no execution for this loop because it's false
			System.out.print(text.charAt(i));
		}
		
		input.close();
	
	
	
	
	
	
	
	
	}

}
