package day35_set_map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

public class Map_Practice {
	
	/*
	 * Map - is a store of a key-value pairs.
	 * 
	 * Map<String, String> map = new HashMap<>();
	 * 	- within the diamond brackets, you would specify two data types (one for the key, second - for the values)
	 * 	- HashMap is the concrete class that implements the Map interface.
	 * 
	 * 	- put() is used to add elements in the Map
	 * 	- size() is used to get the number of elements inside
	 * 	- keys can't contain duplicates
	 * 	- map doesn't keep the insertion order
	 * 
	 * a, apple
	 * b, banana
	 * c, cherry
	 * c, orange // not going to work (no duplicates allowed among keys)
	 * d, banana // values can contain duplicates
	 * 
	 * Map<Integer, String> map = new HashMap<>();  UserID -> Name
	 * Map<Integer, Integer> map = new HashMap<>(); Bank Account num -> Balance on the account
	 * Map<String, String> map = new HashMap<>();	Grade -> Numerical form	
	 * 
	 * 
	 * 	- remove(); removes the record based on key
	 * 	- containsKey(): checks if the specified key is available in the map and return true/false
	 * 	- containsValue(): checks if the specified value is available in the map and return true/false
	 * 
	 * 	- keySet(): provides a list of all the keys
	 * 	- values(): provides a list of all the values
	 * 	- entrySet(): one entry is one key-value pair, entrySet() gives you he list of all the entries
	 * 
	 * Map<Integer>, String> map = new TreeMap<>();
	 * 
	 * 	- tree map
	 */
	
	
	public static void main(String[] args) {
		
		
		Map<String, Integer> shoppingList = new HashMap<>();
		shoppingList.put("tomato", 5);
		shoppingList.put("onions", 10);
		shoppingList.put("watermelon", 1);
		shoppingList.put("noodels", 2);
		shoppingList.put("milk", 1);
		shoppingList.put("cantaloup", 7);
		
		System.out.println("Num of elements in the map: " + shoppingList.size());
		System.out.println(shoppingList);
		
		System.out.println("Num of tomatoes to buy: " + shoppingList.get("tomato"));
		System.out.println("Num of onions to buy: " + shoppingList.get("onions"));
		System.out.println("Num of cantaloupes to buy: " + shoppingList.get("cantaloup"));
		
		
		/*
		 * Create an employee salary map, put 5 records in. Print the size of the map.
		 * 
		 * Joel -> 120,000
		 */
		
		Map<String, Integer> salaries = new HashMap<>();  // TreeMap is another implementation of map that sorts the keys (doesn't sort values)
		salaries.put("Abiba", 108000);
		salaries.put("Harold", 107356);
		salaries.put("Ami", 108000);
		salaries.put("Abiba", 108000); // if the same key is provided that Java will override the existing value with the new value
		salaries.put("Dili", 108000);
		salaries.put("Dimasik", 1500000);
		
		System.out.println("Size: " + salaries.size());
		System.out.println(salaries);
		
		salaries.remove("Dimasik");
		System.out.println(salaries);
		
		Map<Integer, String> zipCodes = new HashMap<>();
		zipCodes.put(22030, "Fairfax");
		zipCodes.put(22015, "Burke");
		zipCodes.put(34698, "Dunedin");
		zipCodes.put(94583, "San Ramon");
		
		if(zipCodes.containsKey(22030)) {
			System.out.println("Fairfax is listed");
		}
		
		if(!zipCodes.containsKey(20010)) {
			System.out.println("DC isn't listed");
		}
		
		if(!zipCodes.containsValue("Burke")) {
			System.out.println("Burke is not listed");
		} else {
			System.out.println("Burke is in the map");
		}
		
		System.out.println("Keys: " + zipCodes.keySet()); // prints all the keys for us
		System.out.println("Values: " + zipCodes.values()); // prints all the values for us
		
		for (Integer zip : zipCodes.keySet()) {
			System.out.println("ZIP code: " + zip);
		}
		
		for (String city : zipCodes.values()) {
			System.out.println("City code: " + city);
		}
		
		for (Entry<Integer, String> entry : zipCodes.entrySet()) {
			System.out.println(entry);
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
			
		}
		
		
		
		// Find a key that is associated with the city Fairfax 
		for (Entry<Integer, String> entry : zipCodes.entrySet()) {
			if(entry.getValue().equals("Fairfax")) {
				System.out.println("The zip code associated with Fairfax is: " + entry.getKey());
			}
			
		}
		
		
		
	}

}
