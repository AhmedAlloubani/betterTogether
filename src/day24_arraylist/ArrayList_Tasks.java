package day24_arraylist;

import java.util.ArrayList;

public class ArrayList_Tasks {
	
	public static void main(String[] args) {
		
		/*
		 * Create an ArrayList called shopping list and include 5 items
		 *	print the number of items;
		 *	print them all in one line;
		 *	remove them all one by one
		 *	print all items removed from the shopping list.
		 */
		
		ArrayList shoppingList = new ArrayList();
		shoppingList.add("Toilet Paper");
		shoppingList.add("Mask");
		shoppingList.add("Sponge");
		shoppingList.add("Lemon");
		shoppingList.add("Tomato");
		
		System.out.println(shoppingList.size());
		System.out.println(shoppingList);
		
		//shoppingList.remove(0);
		//shoppingList.remove(1);
		//shoppingList.remove(2);
		//shoppingList.remove(3);
		//shoppingList.remove(4);
		
		shoppingList.removeAll(shoppingList);
		
		System.out.println(shoppingList);
		
	}

}
