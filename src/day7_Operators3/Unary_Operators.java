package day7_Operators3;

public class Unary_Operators {

	/*
	 * +
	 * -
	 * ++
	 * --
	 */
	
	/*
	 * + + ====> +
	 * - + ===> -
	 * + - ===> -
	 * - - ===> +
	 */
	
	public static void main (String[] args) {
		
		int num1 = -5;
		System.out.println(+num1); // + + ===> 5
		System.out.println(-num1); // - + ===> -5
		System.out.println(+num1); // + - ===> -5
		System.out.println(+num1); // - - ===> 5
		
		int num2 = 10;
		System.out.println(-num2); // -10 unary negation doesn't affect the value of the variable
		System.out.println(num2);  // 10 because value is still the same
		
		/*
		 *  ++: increment (pre-increment and post-increment) increases the value by 1
		 *  				++var             var++
		 *  --: decrement (pre-decrement and post-decrement) decreases the value by 1
		 *                  --var             var--
		 */
		
		int num3 = 7;
		System.out.println(++num3); // 8 increments and then returns the value
		
		int num4 = 6;
		System.out.println(num4++); // 6 
		System.out.println(num4++); // 7
		
		int num5 = 0;
		System.out.println(--num5); // -1 decrements and then returns the value
		
		int num6 = 10;
		System.out.println(num6--); // 10 
		System.out.println(num6--); // 9
		
		/*
		 * unary plus and minus do not affect the value of the variable
		 * increment and decrement do affect the value of the variable
		 */
		
		int num9 = 3;
		int num10 = 11;
		
	//               3        11
		int num11 = num9 * num10++;
		System.out.println(num11);  // 33
		System.out.println(num10);  // 12
		
		int num12 = 2;
		int num13 = 4;
		//           2       5
		int num14 = num12 * ++num13;
		System.out.println(num14);  // 10
		System.out.println(num13);  // 5
		
		// Task 2 from slides
		int a = 1;
		//                           memory
		//
		a = -a-- + a++ / -a-- * --a;  // a
	// a = ?    + ?   /  ?   *  ?
	// a = -1   + ?   /  ?   *   ?     a = 0
	// a = -1    + 0   /  ?   *   ?     a = 1	
	// a = -1    + 0   / -1   *    ?    a = 0
	// a = -1    + 0   /  -1  *   -1	a= -1
	// a = -1;	
		
		System.out.println(a);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
