package day10_recap_string_class;

import java.util.Scanner;

public class Switch_Recap {
	
	public static void main(String[] args) {
		
		
		/*
		 *  switch (key) {
		 *  case caseValue1:
		 *  	statement1;
		 *  	break;
		 * 	case caseValue2:
		 *  	statement2;
		 *  	break;
		 * 	case caseValue3:
		 *  	statement3;
		 *  	break;
		 * 	default:
		 * 		statement4;
		 * 		break;
		 */
		
		
		int num1 = 3;
		
		switch (num1) {
		case 1 :
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3 :
			System.out.println("Three");
			break;
		default:
			System.out.println("Invalid");
			break;
		}
	
	
	// write a program that says "Passed" if your grade is either A or B
	// says "Didn't pass" if your grade is C, D, E ot F
		
		char grade = 'A';
		
		if (grade == 'A' || grade == 'B') {
			System.out.println("Passed");
		} else {
			System.out.println("Didn't pass");
			
		}
		// absence of breaks can be used to imidiate the logical OR condition
		switch (grade) {
		case 'A':
		case'B' :
			System.out.println("Passed");
		default: 
			System.out.println("Didn't pass");
		}
	
	/*
	 * - case data type must match the ky's (expression in parenthesis) data type
	 * - if the key value matches one of the case values -> the corresponding 
	 * 	code block gets executed
	 * - break or closing curly bracket is used to exit the switch statement
	 * - if there is no break then the execution will continue the following cases
	 * - case is similar to else-if in if statements
	 * - default is similar to the else in if statements
	 * - default gets executed when there no matches against the key value
	 * - default can be placed anywhere in the switch block
	 * - case values can be placed anywhere as well 
	 * -  case value can be empty
	 * -  none of the blocks in the switch statement are mandatory
	 * - duplicate case values are not allowed
	 * - boolean, long, float and double can't be used in a switch statement
	 * 
	 * 
	 */
	//  user should input the current day of the week
	/*
	 * Tue -> SQL
	 * Wed -> Java Review
	 * Thu -> Java
	 * Sat -> Java
	 * Sun _> SQL
	 * default -> Day off
	 * 
	 */
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Please enter the current day of the week");
		String day = scanner.nextLine();
		
		
		
		switch (day) {
		case "Tuesday" :
			System.out.println("SQL");
			break;
		case "Wednesday":
			System.out.println("Java Review");
			break;
		case "Thursday" :
			System.out.println("Java");
			break;
		case "Saturday" :
			System.out.println("Java");
			break;
		case "Sunday" :
			System.out.println("SQL");
			break;
		default :
			System.out.println("Day off");
			
		}
		
	}

}
