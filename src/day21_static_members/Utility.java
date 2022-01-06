package day21_static_members;

public class Utility {
	
	static String operator = "-";
	
	public static void add(int num1, int num2) {
		if(operator.equals("+")) {
			System.out.println(num1 + num2);
		}
	}
	public static void multiply(int num1, int num2) {
		System.out.println(num1 * num2);
	}
	public static void calculate(int num1, int num2) {
		switch (operator) {
			case "+": System.out.println(num1 + num2); break;
			case "-": System.out.println(num1 - num2); break;
			default: System.out.println(0);
		}
	}
	/*
	 * Create a static method named calculate(int num1, int num2) 
	 * Depending on the outside static variable operator it will be switching between add, subtract.
	 */
}