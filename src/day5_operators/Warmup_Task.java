package day5_operators;

public class Warmup_Task {
	
	/* - Create a variable of type long and
	 * 	name length and assign a value to it;
	 * 
	 * - Create a variable of type long and 
	 *name width and assign a value to it;
	 *
	 * Creat a variable of type int and name 
	 * 	sqFootage and assign a value based on proper 
	 * 	mathematical calculation of sq footage (lenght * width);
	 * 
	 * 
	 */
	public static void main (String[] args) {
		long lenght = 5, width = 3;
		
		// 4-byte         8-byte
		int sqFootage = (int) (lenght * width);
		
		
		System.out.println(sqFootage); // narrowing
	
		// String, long 
		// String text = "10";
		// long long1 = (long) text; non primitive type can't be converted to primitive
		// you can't convert text into a number using a casting
	}
		
		
		
}
