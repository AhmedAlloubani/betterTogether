package day23_arrays_continued;

public class Array_Size {
	
	public static void main(String[] args) {
		
		/*
		 * How do we find the size of the array? (the number of elements of an array)
		 */
		
		String text = "Sunday";
		System.out.println("The length of this string is " + text.length()); // length with brackets, is a method
		
		int[] numbers = new int[4];
		numbers[0] = 3;
		numbers[1] = 2;
		numbers[2] = 5;
		numbers[3] = 1;
		
		System.out.println("The size of this array is " + numbers.length); //printing the number of elements.
		// we use length without brackets for arrays. 
		
		int[] nums = {1, 2, 3, 4, 5, 6, 7}; // another way to create/declare an array (doesn't require number of elements upfront)
		System.out.println("The size of this array is: " + nums.length);
		
		int[] num2 = new int[] {1, 4, 6, 8}; // another way of creating an array
		
		/* 
		 * Warmup Task:
		 * 	create an array named vegetables and intialize it with 5 vegetables;
		 * 	print the length of this array
		 * 	print the last element;
		 * 	assign the value of the third element to the second element. 	
		 */
		
		//                        0          1         2          3         4          5           6
		String[] vegetables = {"Tomato", "Potato", "Cucumber", "Carrot", "Pepper", "Broccoli", "Spinach"};  //length is 7
		System.out.println("The length of this array is " + vegetables.length);
		System.out.println(vegetables[4]);
		vegetables[1] = vegetables[2];
		//Extra
		System.out.println("The last element is " + vegetables[vegetables.length -1]); // this is how we print the last element
		
		//*****************
		int i = 0;
		
		System.out.println(vegetables[i]); // Tomato
		
		i++; //                       1
		System.out.println(vegetables[i]); // Cucumber
		
		i++; //                       2
		System.out.println(vegetables[i]); // Cucumber
		
		i++; //                       3
		System.out.println(vegetables[i]); // Carrot
		
		i++; //                       4
		System.out.println(vegetables[i]); // Pepper
		
		i++; //                       5
		System.out.println(vegetables[i]); // Broccoli
		
		i++; //                       6
		System.out.println(vegetables[i]); // Spinach
		
	//	i++; //                       7
		//System.out.println(vegetables[i]); // Exception!
		
		System.out.println("===================================");
		
		for (int index = 0; index < vegetables.length; index++) {
			System.out.println(vegetables[index]);
		}
		
		
		
	}

}
