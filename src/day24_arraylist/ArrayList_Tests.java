package day24_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_Tests {

	public static void main(String[] args) {
		
		/*
		 * Task1:
		 * 		- create an ArrayList containing days of the week;
		 * 		- create an array containing days of the week;
		 */
		
		ArrayList days = new ArrayList(); // generic or high level declaration of ArrayList
		days.add("Monday");
		days.add("Tuesday");
		days.add("Wednesday");
		days.add("Thursday");
		days.add("Friday");
		days.add("Saturday");
		days.add("Sunday");
		days.add("Extra day");
		days.add("Funday");
		days.add("Java day");
		
		days.remove(0); // removing Monday and Tuesday will be index 0
		days.remove(0); // removing Tuesday
		days.remove("Extra day"); // removing Extra day
		
		days.set(6, "Python Day"); // replace java day with python day
		
		days.add(0, "Tuesday"); // we are adding to a specific position
		
		days.add(2.45); // just to show that we can add double
		days.add(true); // just to show that we can add boolean
		days.add(10L);  // just to show that we can add long
		
	//	days.remove(20); // index out of bound exception
		
		System.out.println(days.size());
		System.out.println(days);
		
		for(Object obj : days) { // object is a highest class in Java hierarchy 
			System.out.println(obj + " text");
		}
		
		
		System.out.println("=======================");
		//===========================
		
		String[] daysArray = new String[7];
		daysArray[0] = "Monday";
		daysArray[1] = "Tuesday";
		daysArray[2] = "Wednesday";
		daysArray[3] = "Thursday";
		daysArray[4] = "Friday";
		daysArray[5] = "Saturday";
		daysArray[6] = "Sunday";
		
		System.out.println(daysArray.length);
		System.out.println(Arrays.toString(daysArray));

	}

}
