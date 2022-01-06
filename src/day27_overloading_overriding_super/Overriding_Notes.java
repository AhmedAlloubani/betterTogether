package day27_overloading_overriding_super;

public class Overriding_Notes {
	
	/*
	 * Method overriding (Run-Time Polymorphism) - is changing the implementation of the method that was
	 * inherited from a superclass.
	 * 
	 * public class A {
	 * 		public void m1() {
	 * 			print "Hi from class A!";
	 * 		}
	 * }
	 * 
	 * public class B extends A {
	 * 		public void m1() {
	 * 			print "Hi from class B!";
	 * 
	 * }
	 * 
	 * B b = new B();
	 * b.m1();         - "Hi from class A!"
	 * 
	 * What if I want to print "Hi from class B!"?
	 * 
	 *
	 * B b = new B()
	 * b.m1();        - "Hi from class B!"
	 * 
	 * Method overriding can only happen when one class inherits from another (must have IS-A relationship);
	 * 
	 * Method signature must be the same (method name and parameter list)
	 * 
	 * Benefits of overriding: ability to define the behavior specific to a sub class. Sub class
	 * is able to implement the parent's class method according to its needs. Provide a code
	 * reusability. 
	 * 
	 * Summary:
	 * 	- Inheritance
	 * 	- Access Modifiers:
	 * 		- applicability to classes, constructors, methods and variables
	 * 	- Method overloading
	 * 	- Method overriding
	 * 
	 * Next: 
	 * 		- method overriding
	 * 		- super. vs super() keywords;
	 * 		- constructors in the inheritance environment
	 * 
	 */

}
