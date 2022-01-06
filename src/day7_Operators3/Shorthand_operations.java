package day7_Operators3;

public class Shorthand_operations {

	public static void main(String[] args) {
		
		int num1 = 10;
		//num1 = num1 + 2;
		num1 += 2;     // shorthand addition
		System.out.println(num1);  // 12
		 //                         16      12   + 4 
		int num2 = num1 += 4;   // num1 = num1 + 4;
		System.out.println(num2);	
		
		//                       11     16   - 5
		int num3 = num2 -= 5; // num2 = num2 - 5
		System.out.println(num3);
		
		//                         22      11  * 2
		int num4 = num3 *= 2;   // num3 = num3 * 2;
		System.out.println(num4); // 22
		//                       0       22  % 2
		int num5 = num4 %= 2; // num4 = num4 % 2;
		System.out.println(num5);
		
		
				
				
				
				
		
		

	}

}
