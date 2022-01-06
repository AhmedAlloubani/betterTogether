package day29_super_abstraction;

public class Recap {
	
	/*
	 * Method Overloading, Compile-Time Polymorphism, Static Polymorphism
	 * 		- same method name, different parameters ()
	 * 			- different data type;
	 * 			- change order;
	 * 			- additional parameters;
	 * 		- method signature: method name + list of parameters
	 * 		- method signature must be different to set up overloading
	 * 		- public void m1(String text) {}
	 * 		- public void m1(String str1) {} // same method signature - won't compile
	 * 
	 * 		- String m1(double dbl1) {} // access modifiers and return type don't matter
	 * 
	 * 			for method overloading, so it will compile.
	 * 		- String m1(String text1) {} // same method signature - won't compile
	 * 
	 * 		- overloading can be set up:
	 * 			- in the same class;
	 * 			- in the super  + sub class context;
	 * 
	 * 		public class A {
	 * 
	 * 			public void m1() {
	 * 				}
	 * 			
	 * 			public void m1(int i) {
	 * 			}
	 * 		}
	 * 
	 * 		public class B extends A {
	 * 			public void m1(String text) {
	 * 			}
	 * 		}
	 * 
	 * 		B b = new B();
	 * 		b.m1(); // 
	 * 
	 * 		A a = new A();
	 * 		a.m1("hello"); // it will not compile because parents can't see methods in the child class
	 * 
	 * 		1. Java will look for exact match; 
	 * 		2. Wider primitive data type;
	 * 		3. Wrapper class
	 * 		4. Java can't perform two actions at the same time: widening + autoboxing
	 * 		public class A {
	 * 
	 * 			public void m1(int i) {
	 * 				}
	 * 			
	 * 			public void m1(double i) {
	 * 			}
	 * 
	 * 			public void m1(Integer i) {
	 * 			}
	 * 
	 * 		}
	 * 
	 * 		A a = new A();
	 * 		a.m1("hello"); // won't compile because there is no String method
	 * 		a.m1(5);       // the first one will be called
	 * 		a.m1((byte)2);  // the first one will be called (next wider available primitive data type)
	 * 		a.m1(7);       // Wrapper class will be called (if we commented out the first and second method)
	 * 		a.m1(new Integer(9));  // the first one will be called (unboxing) (if we commented out the second and third method)
	 * 		a.m1(7.0); // shouldn't compile (if we commented out the first and second method) 
	 * 
	 * =======================================================
	 * 
	 * Method Overriding Run-Time Polymorphism, Dynamic
	 * 
	 * - changing the implementation of the method that was provided in the super class;
	 * - inheritance (IS-A relationship)
	 * - method signature must be the same
	 * - Annotation: @Override - performs additional checks. Inspects if there are mistakes/errors
	 * 
	 * 
	 * 		A a = new A();                 A
	 * 		B b = new B();			|             |
	 * 		C c = new C();          B             C
	 * 
	 * 		a.m1();
	 * 		b.m1();
	 * 		c.m1();
	 * 
	 * The actual method that will be called will depend on the type of the object that is stored in the variable
	 * thta's used to call this method.
	 * 
	 * 	- private method can't be overridden;
	 * 	- static method: static methods are inherited, but can't be overridden
	 * 
	 * Rules of overriding:
	 * 		- method signature must be the same;
	 * 		- only methods that are inherited can be overridden;
	 * 		- access modifier for the overriding method can't be more restrictive;
	 * 		- the return type of the overriding method must be the same or subclass (covariant return type)
	 * 
	 * 
	 * 		
	 */

}


