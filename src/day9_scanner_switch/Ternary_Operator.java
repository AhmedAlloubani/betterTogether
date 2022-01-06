package day9_scanner_switch;

import java.util.Scanner;


public class Ternary_Operator {
	
	public static void main(String[] args) {
	
	if(5 > 3) {
		System.out.println("5 is more than 3");
	}else {
		System.out.println("5 is not more than 3");
	}
	
	
	// condition ? (result if condition is true) : (result if condition is false)
	int num1 = 3;
	
	int result = num1 > 5 ? 4 : 5; //  the value has to be stored in the variable 
	
	System.out.println(result);
	
	
	
	System.out.println(3 > 3 ? "5 is more than 3" : "5 is not more than 3");
	
	Scanner input = new Scanner (System.in);
	System.out.println("What grade did you get?");
	int grade = input.nextInt();
	
	
	
//	if(grade == 100) {
//		System.out.println("You did great!");
//	} else if (grade == 80) {
//		System.out.println("You did good");
//	} else {
//		System.out.println("You didn't pass");
		
		System.out.println(grade == 100 ? "You did great!" : (grade == 80?  "You did good" : "You didn't pass"));
		
	}
	
	
	
	
	}
