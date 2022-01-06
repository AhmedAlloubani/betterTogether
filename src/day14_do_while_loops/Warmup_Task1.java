package day14_do_while_loops;

import java.util.Scanner;

public class Warmup_Task1 {
	
	public static void main(String[] args) {
		
		/*
		 * reverse a String:
		 * Example: "Java"
		 * Output: "avaJ"
		 * Case sensitive!
		 */
		
		// Java -> avaJ
		//             0123 
		
		// very important topic (interview questions)
		Scanner userInputProcessing = new Scanner(System.in);
		System.out.println("Please enter some text");
		String text1 = userInputProcessing.nextLine();
		
	//	String text = "Java"; //      a               v                a                     J
	//	String reversedString = "" + text.charAt(3) + text.charAt(2) + text.charAt(1) + text.charAt(0);
	//	System.out.println(reversedString);
	
		
		String reverseString = "";
		//   init    condition  iterator
		for (int i = text1.length() -1 ; i >=0;  i-- ) {
		//    i = 3       =     ""        +       'a'	       // a
		//    i = 2       =     "a"       +       'v'         // av
		//    i = 1       =     "av"      +       'a'        // ava
		//    i = 0       =     "ava"     +        'J'      // avaJ
			reverseString = reverseString + text1.charAt(i);
			
		}
		
		// i = 4;  i >= 0; i--     ->   3, 2, 1, 0
		System.out.println(reverseString);
	
	
	}

}
