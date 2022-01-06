package day_28_overriding_super_keyword;

public class Recap {
	
	
		
		/*
		 * private > <default> > protected > public
		 * 
		 * private - class only
		 * <default> - package private
		 * protected - package private + children(subclasses) in the other packages
		 * public - accessible by anyone
		 * 
		 * class:
		 * 		- outer: default or public (can't have two public classes within the same file)
		 * 		- inner: all of the access modifiers
		 * variables, methods, constructors: all of the access modifiers
		 * 
		 * main:
		 * 	- public: access modifier
		 * 	- static: belongs to the class
		 *  - void: return type - we are indicating we are not going to return anything
		 *  - ()  : parameter list
		 *  - String: non-primitive(Reference) data type;
		 *  - []    : array
		 *  - args  : variable name
		 *  - {}    : code block
		 *  
		 *  String[] args - this is an array of arguments that is optional for the programmer to provide
		 *  
		 *  CLI: we can provide an additional list of arguments after the compiled file name
		 *  	Example: java test 1 2 3 4 -> ?	 ["1", "2" , "3", "4"] length = 4
		 *  Eclipse:
		 *  	Run Configuration -> provide arguments there
		 *  
		 *  Overloading: 
		 *  	- creating multiple methods with the same name and different parameter list
		 *  (different method signature).
		 *  	- signature: name + list of arguments
		 *  	- java finds the match based on the list of parameters/arguments that you provide
		 *  	- java does it automatically
		 *  	- three ways to achieve overloading:
		 *  		- same method name + additional parameter;
		 *  		- changing the order of arguments;
		 *  		- changing the data type;
		 *  
		 *  	public void m1(String text, int num1) {}
		 *  	public void m1(String text1, int num2) {} // won't compile
		 *  	// changing the variable name is not a way to achieve overloading
		 *  
		 *  	Benefit: reusability
		 *  
		 *  How java finds the match?
		 *  
		 *  	public void m1(int num1) {}
		 *  	public void m1(float num1) {}
		 *  	public void m1(Integer num1) {}
		 *  
		 *  m1(new Integer (3));
		 *  
		 *  - java will look for the exact match;
		 *  - if there is no exact match then java will widen it to the next available primitive
		 *  - Autoboxing/unboxing
		 *  
		 *  While searching for the match, java can't perform two actions at the same time
		 *  Example: can't widen and autobox at the same time
		 *  
		 *  method(long a) {}
		 *  method(byte a) {}
		 *  
		 *  method(3);
		 *  
		 *  Overloaded methods can be set up in both super class and subclass:
		 *  
		 *  public class SuperClass {
		 *  	public void myMethod() {}
		 *  	public void myMethod (double d) {}
		 *  }
		 *  
		 *  public class SubClass extends SuperClass	{
		 *  	public void myMethod(String arg) {}
		 *  }
		 *  
		 * 	SubClass sb = new SubClass();
		 * 		sb.myMethod();
		 * 		sb.myMethod(2.54);
		 * 		sb.myMethod("Hello");
		 * 
		 * 
		 * 		SuperClass sp = new SuperClass();
		 * 		sp.myMethod();
		 * 		sp.myMethod(4.35);
		 * 		sp.myMethod("hello"); // it will not compile (parent class can't see the child's class members)
		 *  
		 */
		
		
	public static void main(String[] args) {
		
		method(3L);

}
	
	public static void method (long a) {
		System.out.println("Long method");
	}
	
	public static void method(byte a) {
		System.out.println("Byte method");
	}
}
