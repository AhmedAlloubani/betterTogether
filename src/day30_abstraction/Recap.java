package day30_abstraction;

public class Recap {
	
	public class Recap extends Object {
		/*
		 * super keyword
		 * 
		 * super. - reference to the members in the parent class
		 * this. - reference to the members of the current class
		 * 
		 * super. and this. can be used to refer to static members, however it's not a good practice and
		 * static members have to be referenced in a static manner (ClassName.methodName())
		 * 
		 * super() - is used in the first line of a constructor
		 * 		- we use super() to invoke the corresponding constructor in the parent class
		 * 		- super(String text, int num1) - java will be looking for the constructor that accepts
		 * these parameters in the super class
		 * 		- super only brings you one level up
		 * 		- super() and this() in explicit form can't be used in the same constructor
		 * 		- any constructor that was created will have super() automatically added in the first line
		 * 		- Example:
		 * 				public Class() {
//		 * 					super(); - will be added automatically regardless of you typing it
		 * 					this();
		 * 				}
		 * this() - is used in the first line of a constructor
		 * 		- we use this() to invoke the corresponding constructor in the same class
		 * 
		 * 
		 * 	Animal -> Elephant -> African_Elephant
		 * 	
		 *  African_Elephant el = new African_Elephant();
		 *  
		 *  1. public (){
		 *  	super();
		 *  }
		 *  
		 *  2. public Elephant(){
		 *  	super();
		 *  }
		 *  
		 *  3. public Animal(){
		 *  	super();
		 *  }
		 *  
		 *  4. public Object(){
		 *  	
		 *  }
		 *  
		 *  1. Object-type object will be created first
		 *  2. Animal
		 *  3. Elephant
		 *  4. African_Elephant 
		 *  
		 *  ==============================
		 *  
		 *  Abstraction
		 *  - abstract keyword:
		 *  	- abstract class - can contain abstract methods (regular class can not!)
		 *  	- abstract method - no implementation needed
		 *  		- Example: public abstract void m1();
		 *  	- abstract class can contain regular members as well;
		 *  	- can't create an object of the abstract class;
		 *  	- abstract class forces you to implement to abstract methods;
		 *  	- regular methods are optional to implement;
		 *  	- abstract can extend another abstract class;
		 *  	- concrete class: first regular class that is forced to implement the abstract methods
		 *  	- can an abstract class extend a regular class? yes, it can.
		 */
		public Recap() {
//			super();
			this("Text");
		}
		public Recap(String text) {
		}
		public Recap(int num1) {
		}
		public void method1() {
//			this("Hello");
		}
	}
}
