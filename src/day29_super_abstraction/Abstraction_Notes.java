package day29_super_abstraction;

public class Abstraction_Notes {
	
	/*
	 * Abstraction - one of the OOP concepts, we know an action name, we know what it's supposed to do but
	 * don't know how it's supposed to do it.
	 * 
	 * We are giving some guidance in terms of the action name but don't give any implementation details
	 * 
	 * We can achieve abstraction in Java using:
	 * 	- abstract classes;
	 * 	- interfaces.
	 * 
	 * Car:
	 * 		- start();
	 * 		- brake();
	 * 		- accelerate();
	 * 		- steer();
	 * 
	 * public abstract class Vehicle {
	 * 
	 * 		public abstract void start();
	 * 		public abstract boolean brake();
	 * 		public abstract void accelerate();
	 * }
	 * 
	 * abstract methods don't have the implementation, they don't have curly braces [] and the declaration
	 * of the method ends with ';'.
	 * 
	 * Purpose of abstraction: to provide a base or foundation for further development. We are providing
	 * 	behaviors but don't provide implementation and we force the subclass to give details.
	 * 
	 * 	public abstract class A {
	 * 		public abstract void m1();
	 * 	}
	 * 
	 * A a = new A(); // can't create an object of the abstract class.
	 * 
	 * How do we actually provide the implementation for these methods?
	 * 
	 * public class B extends A {
	 * 		// B is responsible for providing the implementation of the abstract methods
	 * 
	 * 		public void m1() {
	 * 			print ("B implementation of m1"); // following regular overriding rules
	 * 		}
	 * } 
	 * 
	 * 	When a regular class extends an abstract class it is signing a contract / agreeing to provide the 
	 * 		specific implementation of the abstract methods.
	 * 
	 * public abstract class A {
	 * 		public abstract void m1();
	 * 		public void m2(String text) {
	 * 			print text;
	 * 		}
	 * }
	 * 
	 * Abstract classes can have regular members, both variables and methods. You can't have abstract methods
	 * in a regular class. If you need to create abstract methods you'll need to create an abstract class.
	 * 
	 * Constructor is allowed in the abstract class.
	 * 
	 */

}
