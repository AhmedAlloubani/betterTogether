package day35_set_map;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Personal_Data {
	
	/*
	 * Set - can't contain duplicates
	 * - set is not indexed
	 * 
	 * List - can contain duplicates
	 * - list is indexed
	 * 
	 * time complexity, space complexity
	 * 
	 * Generics - <String>, <String, Integer>, <String,<Integer, Integer>>
	 */
	
	//Java HomeWork
	
	public static void main(String[] args) {
		
	
	List<String> names = new ArrayList<>();
	names.add("Peter");
	names.add("John");
	names.add("Jane");
	names.add("Mary");
	names.add("Peter");
	
	System.out.println("Num of elements in the array lis: " + names.size());
	
	Set<String> SSNs = new HashSet();
	SSNs.add("012345678");
	SSNs.add("012985678");
	SSNs.add("012345678");
	SSNs.add("098353455");
	SSNs.add("097424567");
	
	System.out.println("Num of elements in the array lis: " + SSNs.size());
	
	if(Config.getProperty("selection").equals("names")) {
		System.out.println(names);
	} else if (Config.getProperty("selection").equals("SSNs")) {
		System.out.println(SSNs);
	} else {
		System.out.println("We don't have that kind of data structure");
	}
	}
}
