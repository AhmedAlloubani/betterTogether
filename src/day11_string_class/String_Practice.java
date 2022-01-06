package day11_string_class;

public class String_Practice {
	
	public static void main(String[] args) {
		
		/*
		 * String is a non-primitive data type (object) that
		 * represents a sequence of characters.
		 * 
		 * two ways to create a String:
		 * 	- via String literal;
		 * 	- using a 'new' keyword
		 */
		
		
		
		int num1 = 5;
		
		
		String text = "ABCDE";   // String literal creation places the String inside the String pool
		String text2 = new String ("ABCDE");  // object type creation places the String
											// inside Java Heap (but not inside the String pool)
		
	//	Scanner input = new Scanner(System.in);
		
		// objects are stored in a place called Java heap
		// String pool is an area within the Java Heap that's separated from the rest
		// of the objects
		
		// == vs .equal()
		// == actually compares the slots/spaces in the memory
		
		String str1 = new String ("cat");            // str1 and str2
		String str2 = new String ("cat");            // have different addresses 
		System.out.println(str1 + " " + str2);
		System.out.println(str1 == str2); // comparing addresses in the memory -> they are different
		//                    false
		
		
		String str3 = "dog"; // -> goes to a string pool // GHT54749040
		String str4 = "dog"; // Java sees there is 'dog' in the string pool already
		                     // it will connect str4 to the same memory spot
		
		System.out.println(str3 == str4); // true -> memory spots are the same
		
		System.out.println(str1 == "cat"); // false -> different addresses in memory
		
		// anything created with a 'new' keyword goes to heap
		// anything created using string literal goes to String pool
		
	}

}
