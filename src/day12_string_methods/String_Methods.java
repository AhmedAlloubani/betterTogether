package day12_string_methods;

public class String_Methods {
	
	public static void main(String[] args) {
		
		/*
		 * indexOf() - takes a char or a String as an input and returns the index of the 
		 * first char or A String that matches the input in the given string (returns an index as an integer)
		 */
		
	
		String str1 = "Our students are great!";
		System.out.println(str1.indexOf('g')); // 17
		
		System.out.println(str1.indexOf('e'));  // 8
		
		System.out.println(str1.indexOf('z')); // -1 in case the char or a string is not existed
		
		System.out.println(str1.indexOf("students")); // 4
		
		System.out.println(str1.indexOf("eat"));     // 19
		
		int num1 = str1.indexOf("r");
		System.out.println(num1);      // 2       
		
		// task: find the index of a letter "i" that is before "n" and after "g"
		String weather = "It is warm outside here in Virginia";
		
		System.out.println(weather.indexOf("ini")); // 31
		
		System.out.println(weather.indexOf('g') + 1); // 31 (another way)
		
		
		String address = "10304 Eaton Pl, suite 100 Fairfax, VA 22030";
		int beginIndex = address.indexOf("F");
		int endIndex = address.indexOf(", V");
		String city = address.substring(beginIndex, endIndex);
		System.out.println(city);
		
		// get the email domain and output it (gmail - is the email domain)
		String email = "john.doe@gmail.com";
		int beginIndex1 = email.indexOf("g");
		int endIndex1 = email.indexOf(".c");
		String domain = email.substring(beginIndex1, endIndex1);
		System.out.println(domain);
		
		
		/*
		 * lastindexOf() - takes a char or a String as an input and returns the index of the 
		 * last char or A String that matches the input in the given string (returns an index as an integer)
		 */
		
		// find the index of the last letter "b"
		String abc = "abcdabcd";
		
		int num2 = abc.lastIndexOf("b");
		int num3 = abc.indexOf("b");
		System.out.println(num2);
		System.out.println(num3);
		
		
		
		/*
		 * isEmpty()- checks if the String is empty (length = 0) and returns either
		 * true or false (boolean).
		 */
		
		String school = "Prime Tech";
		boolean result = school.isEmpty();
		System.out.println(result);   //false - this string is not empty
		
		String str2 = "  ";   // there is another method is called isBlank() - checks for actual text presence
		
		//        true
		if(str2.isEmpty()) {
			System.out.println("String is empty");
		} else {
			System.out.println("String is not empty");
		}
		
		/*
		 * equals() - checks if the actual textual value of two strings are the same
		 */
		
		String str3 = "Hello"; // String Pool
		String str4 = new String ("Hello"); // Heap
		
		System.out.println(str3 == str4); // false - str3 and str4 occupy different memory slots
		System.out.println(str3.equals(str4)); // true
		
		
		System.out.println("java".equals("Java")); // false because it's case sensitive
		 
		
		/*
		 * equalsIgnoreCase() - checks if the actual textual value of two strings are the same,
		 * ignoring the case
		 */
		
		System.out.println("java".equals("Java")); // true -> ignoring the case
		
		String s1 = "python";                // String Pool
		String s2 = "python";               // String Pool
		String s3 = new String("Python");   // Heap
		String s4 = new String("Python");   // Heap
		
		System.out.println(s1 == s2); // false
		System.out.println(s1.equals(s2)); // false
		System.out.println(s1.equalsIgnoreCase(s2)); // true
		
		System.out.println(s2 == s3); // false
		
		System.out.println(s1 == s2);  // true
		System.out.println(s3 == s4);  // false
		
		System.out.println(s1.equals(s2));  // true
		System.out.println(s3.equals(s4));  // true
		
		/*
		 * contains(str) - checks if the string is contained within the given String
		 * and returns either true or flase
		 */
	
		String fullName = "\"John Doe\"";
		System.out.println(fullName);
		
		
		boolean result2 = fullName.contains("John");
		System.out.println(result2);   // true
		
		boolean result3 = fullName.contains("Jane");
		System.out.println(result3);  // false
		
		System.out.println(fullName.contains("n D")); // true
		
		System.out.println(fullName.contains("\"")); // true
		
		/*
		 * Task from Matt: find out if sequence of letters j o h n  appears
		 * somewhere in the string ignoring the case
		 */
		String name = "jOHN";
		System.out.println(fullName.toLowerCase().contains(name.toLowerCase())); // true
		
		
		/*
		 * startsWith(str) - checks if the given String starts with the str that
		 * was provided as a parameter and returns either true or flase
		 */
		
		String topic = "Java";
		boolean result4 = topic.startsWith("J"); // true
		boolean result5 = topic.startsWith("j");
				System.out.println(result4);
				System.out.println(result5);
				
		boolean result6 = topic.startsWith("Jav"); // true
		System.out.println(result6);
		
		boolean result7 = topic.startsWith("ava"); // false
		System.out.println(result7);
		
		/*
		 * endssWith(str) - checks if the given String ends with the str that
		 * was provided as a parameter and returns either true or flase
		 */
		
		String language = "Python";
		System.out.println(language.endsWith("Pyth")); // false
		System.out.println(language.endsWith("thon")); // true
		System.out.println(language.endsWith("n"));    // true
		
		
		/* 
		 * usage of logical negation with String methods
		 */
		
		if (!language.endsWith("on")) {
			System.out.println("It doesn't end with 'on");
		} else {
			System.out.println("It does end with 'on'");
		}
	
		/*
		 * compareTo() - this method compares two Strings lexicographically 
		 * and returns the result as an int
		 */
	
		
		
		String str5 = "a";
		String str6 = "b";
		
		int comparisonResult = str5.compareTo(str6);
		System.out.println(comparisonResult);  // if string is smaller than other string -> we get negative number (ASCI table)
		
		
		String str7 = "a";
		String str8 = "a";
		
		int comparisonResult2 = str7.compareTo(str8);
		System.out.println(comparisonResult2); // if strings are equal -> we get 0
		
		
		String str9 = "b";
		String str10 = "a";
		
		int comparisonResult3 = str9.compareTo(str10);
		System.out.println(comparisonResult3); // if strings is bigger than the other string -> we get positive number
		
		
		// aaa
		// aab
		
		
		
	
	}

}
