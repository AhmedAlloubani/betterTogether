package day5_operators;

public class Operator_Precedence {
	
	public static void main (String[] args) {
		
		
		// 12 + 6/3   //14
		
		// 4 * 5 * 6 / 4 % 2 // left to right
		// 4 * 5 * 6 / 4  2 - 3 - 4 + 2 // left to right
		
		System.out.println(4 + 6 * 2);
		System.out.println(12 / 4 - 1);
		System.out.println(5 + 7 * 2 - 4);
		System.out.println(8 - 6 / 3 + 2);
		System.out.println(11 - 2 * 3 + 5 - 3);
		
		// Grouping with parenthesis
		
		// 1 + 2 - 2 + 3 // 4
		// 1 + 2 - (2 + 3) // -2
		
		
		/*
		 *  1. ()
		 *  2. Precedence
		 *  3. Associativity
		 */
		
		// 1- (), 2 - (unary negation), 3 - */%, 4 - +-
		
		
	}

}
