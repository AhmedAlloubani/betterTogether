package day9_scanner_switch;

import java.util.Scanner;
public class Switch_Statements {
	
	public static void main(String[] args) {
		
		/*
		 * 1- Monday
		 * 2 - Tuesday
		 * ....
		 * 7 - Sunday
		 */
				
		Scanner input = new Scanner(System.in);
		
		System.out.println("Input the number between 1 and 7");
		
		byte number = input.nextByte();
		
	//	if (number == 1) {
	//		System.out.println("Monday");
	//	} else if (number == 2) {
	//		System.out.println("Tuesday");
	//	} else if (number == 7) {
	//		System.out.println("Sunday");
	//	}
	
		
		/*
		 *  switch (number) {
		 *  case 1: 
		 *  	statement 1;
		 *  	statement2;
		 *  	break;
		 *  case 2:
		 *  	statement3;
		 *  	break;
		 *  case 7:
		 *  	statement4;
		 *  	break;
		 *  
		 *  	}
		 */
		
		// number from 1 to 7
		switch (number) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
				System.out.println("Invalid number");
		}
		
		
		
		
	}

}
