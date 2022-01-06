package day24_arraylist;

public class ArrayList_Notes {
	
	/*
	 * Array: fixed size - int[] nums = {1,2,3, 4, 5}
	 * 
	 * ArrayList: flexible, it can be resized, elements can be added, can be removed and can be set when needed.
	 * 
	 * 													0		1		 2
	 * Example: ArrayList fruits = new ArrayList(); ["Peach", "Apple", "Cherry"]
	 * 			fruits.add("Peach");
	 * 			fruits.add("Apple");
	 * 			fruits.add("Cherry");
	 * 															 0			1
	 * 			fruits.remove(0); // this will delete "Peach" ["Apple", "Cherry"]
	 * 
	 * 			fruits.set(1, "Mango");                       ["Apple", "Mango"]
	 * 
	 * 			System.out.println(fruits.size());   total number of elements is 2
	 * 
	 * 			fruits.add(true);
	 * 			fruits.add(2.54);
	 * 
	 * 			System.out.println(fruits);           ["Apple", "Mango", true, 2.54]
	 * 
	 * 			System.out.println("My favorite fruit is " + fruits.get(0)); // Apple
	 * 		or  System.out.println("My favorite fruit is " + fruits.get(Apple)); // Apple
	 * 
	 * Methods of the ArrayList:
	 * 		- add(): adding a value to the end of the ArrayList by default, unless an index is provided
	 * 		- remove(): deletes an elements from the ArrayList (we can use index or the object itself)
	 * 		- set(): takes an index and replaces the element at that index with the provided value
	 * 		- size(): gives us a total number of elements
	 */

}
