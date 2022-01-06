package day21_static_members;

import static day21_static_members.Utility.add; // static import of the add() method
import static day21_static_members.Utility.multiply;

public class Calculator {
	
	public static void main(String[] args) {
		add(4, 7);  // we don't have even to provide the class name if we statically imported the method
		multiply(2, 3);
		Utility.calculate(2, 7);
	}

}
