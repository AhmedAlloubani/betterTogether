package day6_operators2;

public class Unary_Operators {
	
	public static void main(String[] args) {
		
		/*
		 * +
		 * - 
		 * ++
		 * --
		 * 
		 */ 
		
		
		
		int a = 10;
		int b = -a;
		System.out.println(b); // -10
		
		int c = +b;
		System.out.println(b);
		
		/*
		 * ++ Increment: pre-increment, post-increment
		 * -- Decrement: pre-decrement, post-decrement
		 */
		
		int num1 = 100;
		System.out.println(++num1); // pre-increment, value is 101
		
		int num2 = 100;
				System.out.println(num2++); // post-increment, value is 100 (increases the value once it has been utilized)
				System.out.println(num2); // 101 
				
				int x = 100;   // x = 100
				int y = x++ -1;
				System.out.println(y); // y = 99
				System.out.println(x); // x = 101 the new value because it's post-increment
				
				int d = 50;
				//      50  - 52 = -2
				int e = d++ - ++d;  // d = 51
				System.out.println(e);
				
				System.out.println("====================");
				System.out.println("Decrementation");
				
				int int1 = 10;             // 10
				--int1;                    // 9
				System.out.println(int1);  // 9
				
				int int2 = 5;      // int2 = 5
				//          5    - 1
				int int3 = int2-- -1;     // int2 = 4
				System.out.println(int3);
				System.out.println(int2);
				
				
				
				
				
				
				
				
				
				
				
				
				
	}

}
