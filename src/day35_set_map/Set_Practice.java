package day35_set_map;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Set_Practice {
	
	public static void main(String[] args) {
		
		/*
		 * add();
		 * size();
		 * contains();
		 * remove();
		 * 
		 *  - add();
		 *  
		 *  Implementation of Set:
		 *  	- Hash
		 */
		
		Set<Integer> numbers = new HashSet<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		System.out.println("Result of trying to add a duplicate element: " + numbers.add(1));
		
		// checking if the object is contained within the set
		if(numbers.contains(3)) {
			System.out.println("This set contains number 3");
		
		}
		
		numbers.remove(2); // 2 is not an index, it's an actual object that we are trying to remove
		
		System.out.println(numbers);
		
		Set<String> fruits = new HashSet<>();
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Mango");
		
		fruits.remove("Orange");
		boolean result = fruits.remove("Pineapple");
		System.out.println(result);
		
		System.out.println(fruits); // Orange was removed.
		 
	//	for (String fruit : fruits) {
	//		System.out.println(fruit);
	//		fruits.remove("Apple");    //ConcurrentModificationException - we can't adjust collection while looping through
	//	}
		
		Iterator<String> iter = fruits.iterator();
		
		while(iter.hasNext()) {
			
			String fruit = iter.next(); // next() gives you the element of the collection
			
			if (fruit.equals("Apple")) {
				iter.remove();
			}
		}
		
		System.out.println(fruits);
		
		Set<String> vehicles = new TreeSet(); // TreeSet automatically sort the elements as you are adding them
		vehicles.add("Car");
		vehicles.add("Bus");
		vehicles.add("Pickup Truck");
		vehicles.add("Semi");
		vehicles.add("Boat");
		
		System.out.println(vehicles);
	}
	
	

}
