package day21_static_members;

public class Check_References {
	
	int num1; // instance variable with default value of 0;
	
	public static void main(String[] args) {
		
		int num2; // local variables don't have a default value
		
		String one, two;
		one = new String("a");
		two = new String("b");
		one = two;           // new String("a") becomes eligible for GC since no variables refer to it
		System.gc();         // we are suggesting/calling GC to come pick up unused objects
		String three = one;   // no additional objects eligible for GC
		one = null;           // no additional objects eligible for GC
	}

}
