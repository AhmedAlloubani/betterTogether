package day8_if_statements;

public class Single_If_Statement {

	/*
	 *  if statements :
	 *  - single if statement (1 option)
	 *  - if ... else statement (2 options)
	 *  - if ... esle if ... esle (multiple options)
	 *  - nested if statemnts     (multiple options)
	 */
	
	
	public static void main (String[] args) {
		
		if (10 > 9) {
			System.out.println("Happy Sunday!"); // this code will be executed
			// only if boolean expression resolves to true
			
		}
		
		int a = 100;
		// 100 == 101  // false    memory: a = 101
		if (a++ == 101) {
			a = 3000;
			System.out.println("The value of a has been incresed");
		}
		 System.out.println(a);
		
		
		int b = 100;
		// 100 == 100    // true      memory: b = 101
		if (b++ == 100) {
			b = 3000;
			System.out.println("The value of a has been incresed");
		
	}
	
		System.out.println(b); // 3000
		
		if (true) {
			System.out.println("if with curly braces");
			
		}
		// only the first statement belongs to an if condition without curly braces
		if (false) 
			System.out.println("if without curly braces"); // doesn't get printed
			System.out.println("Test");                    // gets printed
			
			
			
			byte age = 50;
			byte votingAge = 18;
			if (age >= votingAge) {
				System.out.println("You are eligible to vote");
			
			}
			if (age <= votingAge) {
				System.out.println("too young");
			}
			if (age < 10) {
				System.out.println("Super young");
			}
	// =============================================================		
			// write a program that checks if the number is even or odd
			boolean isRaining = false; // naming convention called "Java Beans"
			
			if(isRaining) {
				
				System.out.println("Get an umbrella"); // this will be executed if boolean exp is true
			} else {
				System.out.println("Get sunglasses");  // this will be executed if boolean exp is false
			}
			
			int num1 = 7;
			
			//   6 % 2 == 0
			//     0   == 0 (true)
			if (num1 % 2 == 0) {
				System.out.println("The number is even");
			} else { 
				System.out.println("The number is odd");
			}
		// ====================================================	
			
			/* if () {
			 * 		statement;
			 * } else if () {
			 * 		statement2;
			 * } esle if () {
			 * 		statement3;
			 * } esle {
			 * 		statement4;
			 * }
			 * 
			 */
			
			boolean isRaining2 = false;
			boolean isSnowing = false;
			boolean isSunny = true;
			
			if (isRaining2) {
				System.out.println("Get an umbrella");
			} else if (isSnowing) {
				System.out.println("Get a shovel");
			} else if (isSunny) {
				System.out.println("Get sunglasses");
			} else {
				System.out.println("Stay home!");
			}
			
			
	// ============================= nested if statements ===========================		
			
			
			/* if () {
			 * 		if() {
			 * 			statement1;
			 * 		} else {
			 * 			statemnt2;
			 * 
			 * 		}
			 * 	} else {
			 * 		if () {
			 * 			statment3;
			 * 		} else {
			 * 			statemnt4;
			 * 		}
			 * }
			 * 
			 * 
			 */
			
			int percentageGrade = 95;
			String letterGrade = "";
			
			if (percentageGrade >= 90) {
				letterGrade = "A";
			} else if (percentageGrade >= 70 && percentageGrade < 90) {
				letterGrade = "B";
			} else if (percentageGrade >= 50 && percentageGrade < 70) {
				letterGrade = "C";
				
			} else if (percentageGrade >= 25 && percentageGrade < 50) {
				letterGrade = "D";
			} else {
				letterGrade = "F";
				
			}
			
			System.out.println(letterGrade);
		
	
	int percentageGrade1 = 95;
	String letterGrade1 = "";
	
	if(percentageGrade1 >= 0 && percentageGrade1 <=100) {
		if(percentageGrade1 >= 90) {
			letterGrade1 = "A";
		} else if (percentageGrade1 >= 70 && percentageGrade1 < 90) {
			letterGrade1 = "B";
		} else if (percentageGrade1 >= 50 && percentageGrade1 < 70) {
			letterGrade1 = "C";
		} else if (percentageGrade1 >= 25 && percentageGrade1 < 50) {
			letterGrade1 = "D";
		} else {
			letterGrade1 = "F";
		}
	} else {
		System.out.println("Incorrect input, please input in 0 - 100 range");
	}
	
	System.out.println(letterGrade);
	
	
	}
	
}
