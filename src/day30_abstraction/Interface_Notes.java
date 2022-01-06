package day30_abstraction;

public class Interface_Notes {
	
	/*
	 * How can we achieve abstraction in Java?
	 * 		- abstract classes;
	 * 		- interfaces.
	 * 
	 * Interface - is a collection of the abstract methods and public static final variables;
	 * 
	 * public interface Payable {
	 * 
	 * 		public static final double BONUS = 0.05;
	 * 		public abstract double calculateBonus(double salary);
	 * 
	 * 		double BONUS = 0.05;
	 * 		double calculateBonus(double salary);
	 * }
	 * 
	 * public interface Interface1 {
	 * 		void method1();
	 * }
	 * 
	 * public interface Interface2 {
	 * 		void method2();
	 * }
	 * 
	 * public class Human {
	 * 
	 * }
	 * 
	 * public class Child extends Human implements Interface1, Interface2 {
	 * 
	 * 	// we will be responsible to provide implementation to both of the parents' methods.
	 * }
	 * 
	 * One interface can be a parent to another interface, you must extend, not implement in this case.
	 * 
	 * The purpose of having interfaces:
	 * 		- provide actions but leave the implementation up to the children;
	 * 		- set up multiple inheritance.
	 * 
	 * Interfaces:
	 * 		- before Java 8: pure abstraction (only abstract methods and public static final vars were allowed)
	 * 		- Java 8: default methods, static methods (no longer pure abstraction)
	 * 			- default methods were added to provide backwards compatibility
	 * 			- static can also provide method body and be called in a static manner
	 * 		- After Java 9: provide the ability to breake down the code into smaller pieces (no longer pure abstraction)
	 * 			- private methods 
	 * 			- private static methods
	 * 
	 */

}
