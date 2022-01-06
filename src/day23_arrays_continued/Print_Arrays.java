package day23_arrays_continued;

public class Print_Arrays {
	
	public static void main(String[] args) {
		
		String[] fruits = {"Apple", "Ornage", "Cherry", "Pineapple", "Pear"};
		
		for (String fruit : fruits) {
			System.out.println(fruit);
			
		}
		
		/*
		 *  for each loop is a more convenient option to print an array
		 *  it has two sections separated by a colon
		 *  left section: variable with data type
		 *  right section: the array that we want to loop through
		 *  we can only go forward with this type of loop
		 */
		
		System.out.println(fruits); // toString() method in the Array class doesn't return any meaningful information.
		// toString() method that would return elements of the array was never created by Oracle/Sun developers.
		
		/*
		 * - create an array of doubles named prices that contain 5 values
		 * - loop through it using regular for loop and print each value on the same line separated by comma
		 * - loop through it using for-each loop and print each value on the same line separated by comma
		 * - find out the sum of all the values in the array using for-each loop
		 */
		
		double[] prices = {13.5, 23.4, 1, 2, 34.6};
		
		for (int i = 0; i < prices.length; i++) {
			System.out.print(prices[i] + ", ");
			
		}
		
		System.out.println();
		
		for (double price : prices) {
			System.out.print(price + ", ");
		}
		
		double sum = 0;
		
		for (double price : prices) {
			sum = sum + price; // sum += price
		}
		
		System.out.println();
		
		System.out.println("The sum of elements in the array is: " + sum);
		
		/*
		 * Interview Question:
		 * Reverse the prices array -> output all the numbers in the same line, comma-separated in the reverse order
		 */
		
		for (int i = prices.length -1; i >= 0; i--) {
			System.out.print(prices[i] + ", ");
			
			if (i == 0) {
				System.out.println(prices[i]); // this is how we print it without comma 
			}
		}
		
		
		
	}

}
