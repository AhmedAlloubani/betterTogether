package day25_arraylist_continued;

import java.util.ArrayList;

public class ArrayList_Methods {
	
	public static void printList(ArrayList<String> list) {
		System.out.println(list);
		
		for (String element : list) {
			System.out.println(element);
		}
		
	}
	
	/*
	 * create a method named 'createIntList' that doesn't accept any
	 * argument and returns an ArrayList containing 5 integers
	 */

	
	public static ArrayList<Integer> createIntList() {
		
		ArrayList<Integer> nums = new ArrayList();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		nums.add(5);
		
		return nums;
	}
	
	
}
