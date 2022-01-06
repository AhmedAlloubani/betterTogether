package bunny;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class doWhile {
	public static void main(String[] args) {
		
		/*
		 * add
		 * set
		 * remove
		 * contains
		 * clear
		 * get
		 * indexOf(obj)
		 * equals
		 * size
		 */
		
		//Task One
	List<String> personal = new ArrayList<String>();
	
	List<String> checking = new ArrayList<String>();
	
	personal.add("Small Businesses");
	personal.add("Wealth Management");
	personal.add("Business & Institutions");
	personal.add("Security");
	personal.add("About Us");
	
	checking.add("Savings");
	checking.add("Credit Cards");
	checking.add("Home Loans");
	checking.add("Auto Loans");
	checking.add("Investing");
	checking.add("Better Money Habits");
	

	
	checking.add(personal.get(1));
	checking.remove(checking.get(5));
	
	Collections.sort(checking);
	
	
	System.out.println(checking);
	
	
	System.out.println(checking.equals(personal));
	
	
	//Task Two;

	}
	
	
}
