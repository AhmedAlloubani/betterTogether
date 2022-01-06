package day11_string_class;

import java.util.Scanner;

// import java.lang.*; this is the String class is located
// java.lang package is imported automatically by java

public class String_Methods {
	
	public static void main(String[] args) {
		
		// to access all the methods available within String class you need to type
		// '.' and it will populate the string methods for you.
		
		String str1 = "Thursday";
		 // str1. -> example of how to see the available methods
		
		/*
		 *  charAt() - takes an index as an input and gives you the character that is
		 *  located at the particular index
		 */
		
		// Thursday
		// 01234567
		System.out.println(str1.charAt(4));
		System.out.println(str1.charAt(0));
		System.out.println(str1.charAt(7));
		//System.out.println(str1.charAt(20)); // index outside of boundaries, will give Exception.
		
		char char1 = str1.charAt(4);
		System.out.println(char1);
		
		//             012345
		String str2 = "Thurs day";
		System.out.println(str2.charAt(6));
		
	//	Scanner input = new Scanner (System.in);
	//	System.out.println("Please enter some text");
		//                    ( String      )
	//	char firstCharacter = input.nextLine().charAt(0);
	//	System.out.println(firstCharacter);
		
		/*
		 * length() - gives you the total amount of characters within this String as an int
		 * String str = "text";
		 * System.out.println(str.length()) // 4
		 */
		//             0123456789101112
		String str3 = "Washington DC";
		System.out.println(str3.length()); // 13 you would start calculating with 1
		
		int numOfChars = str3.length();
		System.out.println(numOfChars); // 13
	
		System.out.println("The index of the last character is: " + (str3.length() - 1)); // the index of the last character
		
		/*
		 * concat() - concatenates the String to the other String and output a NEW String (because String class is immutable)
		 * + vs concat(): + would convert the non-string datatype to a string first,
		 * and then concatenate them together.
		 */
		
		int num1 = 5;
		String str4 = "Prime Tech";
		System.out.println(str4.concat(" School"));
		// System.out.println(str4.concat(5)); concat() method doesn't convert automatically
		
		System.out.println(str4); // Prime Tech
		
		
		/*
		 * toUpperCase() - it takes a String and converts it to uppe rcase String
		 * and returns it as a NEW String
		 */
		
		System.out.println(str4.toUpperCase()); // PRIME TECH 
		
		String str5 = str4.toUpperCase();
		System.out.println(str5);  // Prime Tech - strings are immutable!
		
		
		/*
		 * toLowerCase() - it takes a String and converts it to lower case String
		 * and returns it as a NEW String
		 */
		
		System.out.println(str4.toLowerCase());
		String str6 = str4.toLowerCase();
		System.out.println(str6);
		
		System.out.println(str4);  // Prime Tech 
		
		/*
		 * trim() - removes the spaces before the String and after the string (leading and trailing spaces)
		 * String (leading and trailing spaces), it doesn't touch spaces in between words.
		 */
	
		String str7 = "        What a great day!        ";
		System.out.println(str7.trim()); // What a great day! (without leading and trailing spaces)
		
		/*
		 * substring(beginningIndex) - substring takes the portion of the existing string
		 * starting from the beginningIndex and ending with the last character of the String
		 * and returns the output as a NEW String.
		 * 
		 *               0123
		 * String str = "Java";
		 */
	
	System.out.println("++++++++++++++++++++++");
		String str8 = "Java";
		System.out.println(str8.substring(1)); // va
		
		String str9 = str8.substring(2);
		System.out.println(str9);
		System.out.println(str8);  // Strings are immutable (will not be affected)
		
		/*
		 * substring (beginningIndex, endingIndex) - substring takes the portion of the existing string
		 * starting from the beginningIndex and ending with the endingIndex of the String
		 * and returns the output as a NEW String.
		 * The beginning index is inclusive, the ending index is exclusive.
		 */
		//                                          26     33   37   43
		String address = "10304 Eaton pl, Suite 100 Fairfax, VA 22030";
		String city = address.substring(26, 33);
				System.out.println(city);
		String zip = address.substring(38, 43)	;
				System.out.println(zip);
	
		/*
		 * replace(oldChar, newChar) - the method will find all the characters that 
		 * match oldChar and replace them with the newChar.
		 * 
		 */
	
		String java = "Java is a very easy topic to study and we enjoy it! Java is great!";
		String result = java.replace('a', 'd');
		System.out.println(result);
		
		/*
		 * replace(oldCharSeq, newCharSeq) - the method will find all the characters sequences (same as String) that 
		 * match oldCharSeq and replace them with the newCharSeq
		 */
	
		System.out.println(java.replace("Java", "Python"));
		
		
		/*
		 * replaceFirst() - replaces only the first match that you provide with the new char/String
		 */
	
	
		System.out.println(java.replaceFirst("Java", "Python"));
	
	
	
	}

}
