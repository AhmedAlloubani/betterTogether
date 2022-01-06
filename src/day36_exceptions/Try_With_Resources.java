package day36_exceptions;

import java.util.Scanner;

public class Try_With_Resources {
	
	public static void main(String[] args) {
		 
//		Scanner input = new Scanner(System.in);
//		
//		System.out.println("Please enter an integer");
//		
//		int num = 0;
//		
//		try {
//			 num = input.nextInt(); 
//		}catch (Exception e) {
//			e.printStackTrace();
//			System.out.println("You haven't inputted a number");
//		}finally {
//			input.close();
//		}
//		
//		System.out.println("The input: " + num);
		
		int num = 0;
		// try with resources will automatically close the resources
	try(Scanner input = new Scanner(System.in)) {
		System.out.println("Please enter an integer");
		 num = input.nextInt(); 
		
	}catch (Exception e) {
		e.printStackTrace();
	}
		
	System.out.println("Program is still running " + num);
		
		
	}

}
