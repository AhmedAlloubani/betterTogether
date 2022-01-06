package day22_arrays;

public class Arrays_Exercise {
	
	public static void main(String[] args) {
		
		/*
		 * - Create an array called numbers that can hold 6 integers
		 * - Assign different values for each index
		 * - Print the sum of the first and third element of the array
		 * - Print the product of the second and fourth elements of the array.
		 * 
		 * Example: String[] days = new String[7];
		 */
	
		int[] numbers = new int[6];
		numbers[0] = 1;
		numbers[1] = 99;
		numbers[2] = 564;
		numbers[3] = 213;
		numbers[4] = 43;
		numbers[5] = 2; 
		
		System.out.println(numbers[0] + numbers[2]);
		System.out.println(numbers[1] * numbers[3]);
	
	
	
	}

}
