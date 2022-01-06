package day31_exceptions;

public class Recap {
	
	/*
	 * super. and super()
	 * 
	 * super. - is used to refer to the members of the parent class
	 * super() - is used to invoke the parents class constructor that matches the list of parameters
	 * 
	 * - must be placed on the first line of a constructor
	 * - super() keeps constructor chain together
	 * - java places super() inside a constructor automatically
	 * - this() and super() can't be together in a constructor unless super() was provided by java
	 * automatically
	 * 
	 * 
	 * 
	 * Abstraction - is used to provide guidelines and leave implementation to the child classes;
	 * - abstract class will force the child class to provide it's own implementation
	 * - the class that is forced to implement abstract methods is called concrete 
	 * - we can't create an object of an abstract class
	 * - we can have a constructor inside an abstract class
	 * - we need constructor to preserve the chain of constructors going all the way up to the object
	 * - we can only have abstract method in the abstract class
	 * 
	 * abstract class A {
	 * 		abstract method1();
	 * }
	 * 
	 * abstract class B extends A {
	 * 		abstract method2();
	 * 		method1() {
	 * 			print "Hello";
	 * 		}
	 * }
	 * 
	 * class C extends B {
	 * 
	 * 		method2() {
	 * 			print "Hi";
	 * 		}
	 * 
	 * 		method1() {
	 * 			print "Good morning";
	 * 		}
	 * 	}	
	 * 
	 * 
	 * Interface: 
	 * 
	 * Interface is a collection of:
	 * 		- abstract methods;
	 * 		- public static final variables. (Example: public static final int NUMBER = 5;)
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
	 * - with interfaces we don't extend we implement
	 * - one interface can be a parent to another interface (in this case we use extends keyword)
	 * - we can set up multiple inheritance with interfaces
	 * - interfaces can't have constructors
	 * - Object is not an ultimate parent of interfaces, however interfaces still get access
	 * to all of the object's methods
	 * 
	 * - public class A extends B implements C, D {
	 * 
	 * }
	 * 
	 * Popular Question in interview:
	 * 
	 * before Java 8: 100% or pure abstraction
	 * Java 8: default and static methods (no longer 100% or pure abstraction)
	 * 		- default to allow the developers to add new methods to the interfaces without affecting
	 * the classes that implements these interfaces already (backwards compatibility), requires method body
	 * 		- static: we also need to provide the method body, static belongs to the interface and can be 
	 * called statically.
	 * 
	 * Java 9 and after: provide the ability to break down the code into smaller pieces (no longer pure abstraction)
	 * 		- private 
	 * 		- private static
	 * 
	 * 
	 * 
	 * 
	 */

}
