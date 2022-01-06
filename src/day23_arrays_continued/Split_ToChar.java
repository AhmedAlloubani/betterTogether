package day23_arrays_continued;

public class Split_ToChar {
	
	/*
	 * String methods that use arrays:
	 * 
	 * - split();
	 * 	 - takes a string as an argument and then divides/chops the string into multiple pieces
	 * 				using the provided string as a delimiter.
	 * 
	 * - toCharArray();
	 * 	- this method breaks down a string into chars	
	 */
	
	public static void main(String[] args) {
		 
		//             0   1    2     3   4  5    6       7
		String text = "I love Java, Java is my favorite topic!";
		String[] result = text.split(" ");
		
		System.out.println("The number of words is : " + result.length);
		
		System.out.println(result[0]);
		System.out.println(result[1]);
		
		for(String word : result) {
			System.out.println(word);
			
			
		}
		//==================================
		
		String str1 = "Hello, students!";
		
		char[] array = str1.toCharArray(); // Java broke down the string into multiple characters
		
		for(char letter : array) {
			System.out.println(letter);
		}
		
		
	}

}
