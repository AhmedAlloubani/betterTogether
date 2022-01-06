package day20_stack_heap;

public class Constructors_Recap {
	
	/*
	 * Recap Constructors:
	 * 
	 * - special method that doesn't have a return type uses class name as its name;
	 * - automatically run at the time of object creation;
	 * - we can have as many as constructors in a class as we would like;
	 * - if there are no constructors provided by the programmer, JDK will create default
	 * no-argument constructor for us;
	 * 
	 * public class A {
	 * 
	 * 		private int i;
	 * 
	 * 		public A() {
	 * 			i = 5;
	 * 			System.out.println("i has been assigned a value of 5 at the object creation");
	 * 		}
	 * 		
	 * 		public A(int i) {
	 * 			this(); // must be on the first line
	 * 			this.i = i;   // this. - reference to the instance variable
	 * 		}
	 * 
	 * 		getters
	 * 
	 * 		setters
	 * 	}
	 * 
	 * 	main:
	 * 
	 * 		A a1 = new A();
	 * 		System.out.println(a1.getI()); // 5
	 * 
	 * 		A a2 = new A(123);
	 */

}
