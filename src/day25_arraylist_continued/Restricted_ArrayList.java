package day25_arraylist_continued;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;



public class Restricted_ArrayList {
	
	public static void main(String[] args) {
		
		ArrayList<String> fruits = new ArrayList<>();
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Mango");
	//	fruits.add(2.78);   // will not compile, ArrayList is restricted to only accept Strings
	//	fruits.add(true);
	//	fruits.add(10L);
		
		
		for (String fruit : fruits) { // Object data type is no longer needed here (in object you don't know what is coming (String, boolean ...etc))
			System.out.println("I love " + fruit);
		}
		
		// restrivting ArrayList to only one data type provides type safety - we know exactly what's 
		// inside the ArrayList at any given moment. 
		
		// create an ArrayList that takes only double values and add 5 different values to it.
		
	// primitive -> Wrapper Class	
		/*
		 * byte -> Byte
		 * short -> Short
		 * int -> Integer
		 * char -> Character
		 * float -> Float
		 * double -> Double
		 * long -> Long
		 * boolean -> Boolean
		 */
		
		ArrayList<Double> nums = new ArrayList<>();
		nums.add(1.37); // converting from a primitive to a Wrapper Class is autoboxing
						// converting from Wrapper Class to primitive is unboxing
		nums.add(2.56);
		nums.add(10.13);
		
		for (double num : nums) { // you can use both primitive and Wrapper class form in the loop
			System.out.println("The number is " + num);
		}
		
		// Create an ArrayList that can only accept chars -> Character
		// add grades inside A- F;
		// iterate and print those grades
		
		ArrayList<Character> grades = new ArrayList<>();
		
		grades.add('A');
		grades.add('B');
		grades.add('C');
		grades.add('D');
		grades.add('E');
		grades.add('F');
		
		for (Character grade : grades) {
			System.out.println(grade);
		}
		
//	or we can use this:
		for (int i = 0; i < grades.size(); i++) {
			System.out.println("The grade is " + grades.get(i));
		}
		
		// bigger containers in the left and smaller containers in the right:
		// WebDriver driver = new ChromeDriver();  
		//   Scanner input = new Scanner();	
		// ChromeDriver driver = new ChromeDriver();
		
		//java.util.List<String> list = new ArrayList<>(); // industry standard to use a bigger container in the left
		//list.add("1");
		//list.add("4");
	//	list.add("7");
		
		//for (String number : list) {
		//	System.out.println("Number " + number);
	//	}
		
		// Methods that accept and/or return ArrayList to us
		ArrayList_Methods.printList(fruits);
		System.out.println(ArrayList_Methods.createIntList());
		
		ArrayList<String> languages = new ArrayList<>();
		languages.add("Java");
		languages.add("Python");
		languages.add("Ruby");
		languages.add("C#");
		languages.add("HTML");
		languages.add("Cucumber");
		languages.add("JS");
		languages.remove(languages.size() -1);
		
		System.out.println(languages.indexOf("Ruby"));
		System.out.println(languages.get(languages.size() -1)); // we get the last element
		
		// Arrays class is a utility class for arrays
		// Collections class is a utility class for collections
		
		Collections.sort(languages); // sorts our list of Strings alphabetically
		
		System.out.println(languages);
		
		/*
		 * Create an ArrayList that contains 5 integers (10, 8, 6, 4, 2);
		 * Store this ArrayList into a List variable;
		 * Print the index of 4 using indexOf methods;
		 * Sort the collection
		 * Print the index of 4 using indexOf method
		 */
		
		List<Integer> ints = new ArrayList<>();
		ints.add(10); // 0
		ints.add(8);  // 1
		ints.add(6);  // 2
		ints.add(4);  // 3
		ints.add(2);  // 4
		
		System.out.println(ints.indexOf(4));
		Collections.sort(ints); // collection is a utility class for collection
		System.out.println(ints);
		System.out.println(ints.indexOf(4)); // now it becomes 1
		
		// Comparing ArrayLists using == and equals() method
		
		List<Integer> ints1 = new ArrayList<>();
		ints1.add(10); // 0
		ints1.add(8);  // 1
		ints1.add(6);  // 2
		ints1.add(4);  // 3
		ints1.add(2);  // 4
		
		List<Integer> ints2 = new ArrayList<>();
		ints2.add(10); // 0
		ints2.add(8);  // 1
		ints2.add(6);  // 2
		ints2.add(4);  // 3
		ints2.add(2);  // 4
		
		System.out.println(ints1 == ints2); // false because they occupy different memory slots ( == compares location in the memory)
		System.out.println(ints1.equals(ints2)); // true because .equals() methods checks contents
		
		// containsAll() - this method checks if one of the ArrayList contains all the members of the other one, doesn't care about order
		
		System.out.println(ints1.containsAll(ints2)); // it doesn't care about the order
		
		// Converting Array to ArrayList
		
		String[] flowers = {"Tulip", "Rose", "Cactus", "Lavender", "Daisies"}; // creating an array
		
		List<String> flowerList = Arrays.asList(flowers);    // converting it to List
		System.out.println(flowerList);
		
		List<Character> grades1 = Arrays.asList('A', 'B', 'C', 'D', 'E', 'F'); // combined approach
		System.out.println(grades1);
		
		// both of these examples create a fixed sized list 
		
		grades1.add('G'); // this will compile but will throw UnsupportedOperationException
	}

}
