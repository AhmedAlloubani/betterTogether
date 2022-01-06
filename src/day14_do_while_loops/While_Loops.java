package day14_do_while_loops;

public class While_Loops {
	
	public static void main(String[] args) {
		
		/* for (init ; condition ; iteration ;) {
		 *     statement;
		 * }
		 * 
		 * While () {
		 * 		statement;
		 * } 
		 */
		
//		while (true) {  // infinite loop
//			System.out.println("Hello");
//		}
		
//		while (9 > 8) {  // infinite loop
//			System.out.println("Hello");
//		}
		
		int a = 15;
		
		while (a > 8) {  
			// a = 9   (9 > 8) true
			// a = 8   (8 > 8) false
			System.out.println("Hello " + a);
			a--;
		}
		
		/*
		 * When boolean expression of the while loop evaluates to true
		 * we execute the statements in the While block.
		 * 
		 * When boolean expression of the while loop evaluates to false
		 * nothing gets executed
		 */
		
		/*
		 * For Loop and While Loop are interchangeable: for loop can be easily converted 
		 * to a while loop and vice versa.
		 */
		
		
		/*
		 * For Loop will be used when you know the number of iterations.
		 * 
		 * While Loop will be used when the number of iterations is not known.
		 */
		
		// conversion between for and while loops
		// for(init; condition; iteration)
		
		/*
		 * initialization;
		 * 
		 * While (condition) {
		 * 		statement;
		 * 		iteration;
		 * }
		 */
		
		for (int i = 0; i < 5; i++) {
			System.out.println("SDET " + i);
		}
		
		System.out.println("=====================");
		
		int i = 0;
		while (i < 5) {
			System.out.println("SDET " + i);
			i++;
		}
		
	}

}
