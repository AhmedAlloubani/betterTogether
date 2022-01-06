package day27_overloading_overriding_super;

public class Overloading_Notes {
	
	/*
	 * public class A {
	 * 		public void m1() {}
	 * 		public void m1() {} - java won't let this compile (duplicate)
	 * 		private void m1(String text) {} java will let this compile
	 * 		public void m1(int i) {}
	 * 		public void m1(int i2) {} - var name doesn't change the method signature (won't compile)
	 * 		protected void m1(int num1, int num2) {}
	 * 		public void m1(double d1, double d2) {}
	 * 
	 * }
	 * 
	 * Method overloading (Compile-Time Polymorphism): when we have two methods with the same name and different parameter list,
	 * 	we call this method overloading.
	 * 
	 * 
	 * Signature of the method:
	 * 		- name of the method;
	 * 		- arguments list.
	 * Example: 
	 * 		- public void mm1() {} -> m1()
	 * 		- protected String m2(String text, int i){} -> m2(String text, int i)
	 * 
	 * Several ways to achieve method overloading:
	 * 
	 * 1. Same method + additional parameter
	 * 		Example: Java sees all the following as independent methods:
	 * 		public void go() {}
	 * 		public void go(String where) {}
	 * 		public void go(String where, int distance) {}
	 * 2. Same method name + different list of parameters
	 * 		public void go(String where, String how) {}
	 * 		public void go(String where, int distance) {}
	 * 		public void go(int time, int distance) {}
	 * 
	 * Java looks at overloaded methods as completely independent methods
	 * Java will automatically detect which method to call/invoke based on the parameter you provide
	 * 
	 * Example: go(), go(2, 5), go("Home")
	 * 
	 * Benefits: no need to create a bunch of different methods, reusability
	 * 
	 * public void myMethod() {}
	 * public void myMethod(String input) {}
	 * public double myMethod (String text) {} - won't compile, same method signature
	 * 
	 * Can an inherited method be overloaded? Yes, it can
	 * Example:
	 * 
	 * public class SuperClass {
	 * 		public void myMethod() {}
	 * 		public void myMethod(double d) {}
	 * }
	 * 
	 * public class SubClass extends SuperClass
	 * 		public void myMethod(String text) {}
	 * }
	 * 
	 * main() {
	 * 		SubClass sb = new SubClass();
	 * 		sb.myMethod();
	 * 		sb.myMethod(2.54);
	 * 		sb.myMethod("Hello");
	 * 
	 * 		SuperClass sp = new SuperClass();
	 * 		sp.myMethod();
	 * 		sp.myMethod(4.35);
	 * 		sp.myMethod("hello"); // it will not compile (parent class can't see the child's class members)
	 * }
	 * 
	 * 
	 * Example:
	 * public void add(int num1)  {}
	 * public void add(byte num1) {}
	 * public void add(long num1) {}
	 * public void add(double d1) {}
	 * 
	 * 
	 *  just an example :public void add(Integer num1) {}  (java will usually go to the Widening but if it is not available, it will go to Wrapper class
	 *  (autoboxing)).
	 * 
	 * main() {
	 * 		add(8);         - the int one will be called (any whole number will be int automatically)
	 * 		add((byte)8);   - the byte one will be called
	 * 		add(10L);       - the long one will be called 
	 * 		add(short)5);   - the int will be called due to widening (considered the next widening container for short)
	 * }		
	 * 
	 * Overloading sequence:
	 * 	- java will look for the exact match;
	 * 	- if there is no exact match, java will be looking for a wider primitive data type;
	 * 	- if there is no exact match and no wider primitive data type, java will be looking 
	 * for a reference data type;
	 * 	- if there is no exact match and no wider primitive data type, but there is a wider 
	 * reference data type (Wrapper class), java won't be able to autobox and widen at the same time
	 * so it won't compile.
	 * 
	 */

}
