package day30_abstraction;

public class City {
	
	public static void main(String[] args) {
		Gas_Station exxon = new VA_Gas_Station(false);	
		exxon.method1(); // left side determines visibility (we can see method1)
//		exxon.method2(); // left side determines visibility (we can't see method2)
		exxon.sellGas(); // right portion determines what method will be called in case of overridden methods
		exxon.sellSnacks();
	}
	/*
	 * Dynamic polymorphism:
	 * 	  - it's the ability to use super class data type to store the sub-class object;
	 * 	  - left portion determines the visibility;
	 * 	  - right portion determines what method will be called for non-static methods
	 * 	  - for statics the left side determines what method will be called.
	 */
}