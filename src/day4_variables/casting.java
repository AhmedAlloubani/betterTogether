package day4_variables;

public class casting {
	
	public static void main (String[] args) {
		
		// casting is a conversion of one datatypes to another.
		/*
		 * types of castings:
		 * - explicit casting (narrowing)
		 * - implicit casting (widening)
		 */
	
		int num1 = 10;
		byte byte1 = (byte) num1; // explicit casting (narrowing)
		System.out.println(byte1); 
		
		byte byte2 = 10; // exception from the rule
		
		int num2 = 100;
		long long1 = (long) num2; //what's happening in the back
		//long long1 = num2;       // implicit casting (widening)
		
	
	
	
	}
	

}
