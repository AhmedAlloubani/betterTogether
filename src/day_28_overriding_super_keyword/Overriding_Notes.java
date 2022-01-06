package day_28_overriding_super_keyword;

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
	 * 
	 * Overriding: The type of the object that is stored in the var will determine what kind of method to call;
	 * Overloading: The parameter list will determine what method to call;
	 * 
	 * Overriding: methods signature must be same
	 * Overloading: method signature must be different
	 * 
	 * Overriding rules:
	 * 		- method signature must be the same;
	 * 		- inheritance (IS-A relationship) must be set;
	 * 		- access modifier can't be more restrictive than in the overridden method;
	 * 			if the overridden method is public:
	 * 				- public -> public
	 * 				- protected -> public and protected
	 * 				- <default> default, protected and public
	 * 				- private -> can't be overridden
	 * 		- return type of the overriding method should be the same or subclass; 
	 * 			 - this was changed in Java 5, before - only the same return type;
	 * 			 - void in the super class, then void is the only return type that can be specified in the child class
	 * 			 - primitive in the super class, then the same primitive the only return type that can be specified 
	 * 		- private methods can't be overridden;
	 * 		- final methods can't be overridden;
	 * 		- final classes can't be extended thus, can't have methods that are overridden
	 * 
	 * Final keyword:
	 * 		variables: final with vars makes them constants;
	 * 		methods: final with methods prevents overriding;
	 * 		classes: final with classes make them non-extendable
	 * 
	 * Static methods can't be overridden. Static methods are shadowed/hidden when you try to set up overriding
	*/
}
