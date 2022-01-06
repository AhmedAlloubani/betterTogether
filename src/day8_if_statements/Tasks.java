package day8_if_statements;

public class Tasks {

	public static void main(String[] args) { 
		
	
	/*
		  A triangle is valid if the sum of all the three angles 
		  is equal to 180 degrees. Write a program that declares 
		  three integers as angles and check whether a triangle 
		  is valid or not.
		 */
		
		// boundary value analysis
		// 0, 180

		int int1 = 45;
		int int2 = 45;
		int int3 = 90;
		int sum = (int1 + int2 + int3);
		
		if (sum == 180) {
			System.out.println("A triangle is valid");
		} else {
			System.out.println("A triangle is not valid");
			
		}
		
		int angle1 = 0;
		int angle2 = 0;
		int angle3 = 180;
		
		int sum1 = angle1 + angle2 + angle3;
		
		if (sum == 180) {
			System.out.println("The triangle is valid");
		} else {
			System.out.println("The triangle is not valid");
		
		}
	
	// Stimulus check program
		int AGI = 100_000;
		boolean isMarried = false;
		
		if (isMarried) {
			if (AGI < 150_000) {
				System.out.println("You are getting a stimulus check");
			} else {
				if (AGI < 160_000) {
					System.out.println("You are getting a partial stimulus check");
				} else { 
					System.out.println("You are not getting a stimulus check");
				}
			}
			
		} else {
			if (AGI < 75_000) {
				System.out.println("You are getting a stimulus check");
			} else {
				if (AGI < 80_000) {
					System.out.println("You are getting a partial stimulus check");
				} else { 
					System.out.println("You are not getting a stimulus check");
		
				}
			}
		
	/* 
	 * Write a Java program to implement the following logic using if-else statement
	 * a- if hour is less than 12 noon, it's time for breakfast
	 * b- if hour is greater than or equal 12 noon but less than 2 PM, it's time for Lunch
	 * c- hour is greater than or equal to 5 PM, it's time for Dinner
	 * 
	 * 
	 */

			int time = 15;
			
			if (time < 12) {
				System.out.println("Breakfast time");
			} else if (time >= 12 && time < 14) {
				System.out.println("lunch time");
			} else if (time >= 17) {
				System.out.println("Dinner time");
			} else {
				System.out.println("Not a time to eat");
			}
			
			
			
			
		}
	}


			
			
			
}

			
			
			
