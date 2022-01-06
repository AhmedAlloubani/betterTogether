package day23_arrays_continued;

import java.util.Arrays;

public class Arrays_Class {
	
	public static void main(String[] args) {
		
		// sort(array): static method with a utility class Arrays that sorts numbers from lowest to highest
		// and Strings alphabetically.
		
		int[] numbers = {2, 6, 8, 1, -3};
		
		Arrays.sort(numbers); // this method sorted numbers for us starting from the lowest one -> highest
		
		for(int number : numbers) {
			System.out.println(number);
		}
		
		String[] countries = {"Canada", "USA", "Mexico", "France", "Morocco"};
		Arrays.sort(countries); // this method sorts Strings alphabetically
		
		for(String country : countries) {
			System.out.println(country);
		}
		
		String[] nums = {"one", "two", "three", "four", "five"};
		Arrays.sort(nums);
		
		for(String num : nums) {
			System.out.println(num);
		}
		
		// toString(): this method will produce the textual representation of the elements contained
		// within the array
		
		Arrays.toString(nums); // this method by itself doesn't print anything
		System.out.println(Arrays.toString(nums));
		
		// binarySearch(array, element) - this method will search for the provided element and will 
		// return its index if found. Your array must be sorted first, otherwise this method will produce
		// unpredictable results. If the number is not present in the array then java would be looking
		// for a potential position of this number within the array, negating this index and subtracting
		// one from it -> this result will be returned as an int.
		
		//                   0  1  2  3  4  
		// int[] numbers = {-3, 1, 2, 6, 8};
		
		int result = Arrays.binarySearch(numbers, 4);
		System.out.println("The index of the provided number is : " + result);
		
		/*
		 * Create an array of integers (size = 6)
		 * Sort it
		 * Use binary search to find out the position of the number -1113456
		 * Output the position
		 * Print the array using ToString() method.
		 */
		
		int[] digits = {1, 4, 15, 0, 10, 3};
		Arrays.sort(digits);
		System.out.println(Arrays.binarySearch(digits, -1113456));
		System.out.println(Arrays.toString(digits));
		
		// equals(): designed specifically to compare arrays (checks if the values at the 
		// same positions are the same)
		
		String[] fruits1 = {"Apple", "Orange", "Mango"};
		String[] fruits2 = {"Apple", "Orange", "Mango"};
		
		System.out.println(Arrays.equals(fruits1, fruits2)); // true -> checks contents
		System.out.println(fruits1.equals(fruits2));        // false -> checks memory locations
		
		int[] nums4 = {1, 2, 3};
		int[] nums5 = {1, 2, 3};
		System.out.println(Arrays.equals(nums4, nums5));
		System.out.println(nums4.equals(nums5));
		
		// copyOf(array, length) : this method copies the provided array up to a certain length
		int[] original = {1, 4, 15, 0, 10, 3};
		
		int[] copied = Arrays.copyOf(original, original.length);
		System.out.println(Arrays.toString(copied));
		
		// array.clone: this method copies the whole array.
		
		int[] cloned = original.clone();
		System.out.println(Arrays.toString(cloned));
	}

}
