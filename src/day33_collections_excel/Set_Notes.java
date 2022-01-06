package day33_collections_excel;

import java.util.HashSet;
import java.util.Set;

public class Set_Notes {
	
	/*
	 * Data structure: 
	 * 		- array;
	 * 		- ArrayList;
	 * 		- Set;
	 * 		- Map;
	 * 
	 * Set - unordered collection of data that can not store duplicates
	 * 
	 * List<String> list = new ArrayList<>();
	 * Set<String> set = new HashSet<>();
	 */
	
	public static void main(String[] args) {
		
		Set<String> furniture =  new HashSet<>();
		furniture.add("Chair");
		furniture.add("Table");
		furniture.add("TV");
		furniture.add("Chair");  // set didn't allow this one to be added (can not store duplicates)
		furniture.add("Sofa");
		
		System.out.println(furniture);
		System.out.println(furniture.size());
		
	//	furniture.get(1); // this is not going to work because set is not indexed
	}

}
