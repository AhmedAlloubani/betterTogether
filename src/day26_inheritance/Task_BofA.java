package day26_inheritance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task_BofA {
	
	public static void main(String[] args) {
		
		List<String> tab1 = Arrays.asList("Personal", "Small Business", "Wealth Management", "Businesses and Institutions", "Security");
		System.out.println(tab1.size());
		
		List<String> tab2 = new ArrayList<>();
		tab2.add("Checking")		;
		tab2.add("Savings")		;
		tab2.add("Credit Cards")		;
		tab2.add("Home Loans")		;
		tab2.add("Auto Loans")		;
		tab2.add("Investing")		;
		tab2.add("Better Money Habits");
		
		tab2.add(tab1.get(2));
		tab2.remove(6);
		
		Collections.sort(tab2);
		
		System.out.println(tab2);
		
		System.out.println(tab2.containsAll(tab1));
	}

}
