package day6_operators2;

public class Kahoot_Review {
	
	public static void main(String[] args) {
		
		int a = 20;
		int b = (byte) a;
		System.out.println(b);
		
		
	// Question 2
		// local variable has to be declared and assigned a value in order to use it
		//System.out.println(x +4); // line1 compilation fails 
		int x = 3;                // line 2
		
		
	// 	Question 3
		System.out.println("Text A" + 1 + 0);
		System.out.println("; Text B" + (20) + (1));
		
	// Question 4
		System.out.print("3 + 4 =" + 1 +4);
		System.out.println("; 3 + 4 =" + (1 + 4));
		
	// Question 5
		
		float a1 = 100.473F;
		short b1 = (byte) a1;
		System.out.println (b1); // byte b1 = 100
		
	// Question 6
		
		// byte byte1 = 200; // range for byte is -128 ... 127
		
	// Question 7
		
		System.out.println ((3 + 2) * 2 / 3 %2);
		// 1. () 2. +(inside then parenthesis) 3. *?%
		// 5 * 2 / 3 % 2
		// 10 / 3 % 2         10/3 will give us 3 since int doesnt carry decimal
		// 3 % 2
		// 1
		
		
		long a2 = 3000L;
		double b2 = (float) a2;
		int c = (short) b2;
		
		System.out.println(c % 1000); // the answer is 0
		
	// Question 11
		
		double a3 = 10/3;
		System.out.println(a3);
		
	// Question 12
		
		double dbl2 = 10.0/3;
		System.out.println(dbl2);
		
	// Question 13
		String text = "3.5" + 3;
		// int int1 = (int1) text; // we cant convert non primitive to primitive in casting
		//System.out.println(int1);
		
		
	// Question 14 
		double db1, db2, db3 = 10.5;
		// System.out.println(db2);   it will give an error because it is not declared (local variables must be intialized)
		
		
	// Question 15
		// System.out.println("Text" + 1*3 - 2);
		// "Text" + 3 -2
		// "Text3" - 2
		// compilation error
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
