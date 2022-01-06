package day23_arrays_continued;

public class Array_Methods {
	
	/*
	 * Q1:
	 * Create a static method that accepts an array as a parameter (data type String)
	 * The method should be called printArray() and should print all the values 
	 * in the same line separated by a comma
	 */
	public static void main(String[] args) {
		
		String[] letters = new String[3]; // Q1
		letters[0] = "A";
		letters[1] = "B";
		letters[2] = "C";
//		letters[3] -> out of bounds
		
		String[] cities = {"Fairfax", "Washington DC", "Baltimore"};
		
		printArray(letters);
		printArray(cities);
		printArray(new String[] {"Toyota", "Honda", "Bentley"});
		printArray("Toyota Honda Bentley".split(" ")); 
		
		
		
		int[] numbers = buildArray(1, 3, 5, 7, 8);   // Q2 answer
		// System.out.println(numbers); this will print hashcode
		for(int number : numbers) {
			System.out.println(number);
		}
		
		// String[] cars = new String[] {"Toyota", "Honda", "Bentley"};
	
	}
	// public -> continue
	
	 public static void printArray (String[] array) {
		
		 for(String text : array) {
			 System.out.print(text + ", ");
		 }
		 System.out.println();
		 
	}
	 
	 /*
	  * Q2:
	  * Create a static method called builArray that accepts five different numbers, builds an array of the length = 5,
	  * that contains all these numbers and returns it to a caller.
	  */
	
	 
	 public static int[] buildArray(int num1, int num2, int num3, int num4, int num5) {
		 //               1      3     5    7     8
		 int[] result = {num1, num2, num3, num4, num5};
		 return result;
		 
	 }

}
