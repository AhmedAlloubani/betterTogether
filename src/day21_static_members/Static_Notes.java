package day21_static_members;

public class Static_Notes {
	
	/*
	 * Static Members:
	 * 		- variables;
	 * 		- methods;
	 * 		- blocks:
	 * 			- static initialization block;
	 * 			- non-static initialization block;
	 * 		- static inner classes;
	 * 
	 * Static variables belong to the Class and shared among all the instances/objects.
	 * They are also called Class variables (vs instance variables). They are written in italic in IDE
	 * and marked using a static keyword.
	 * 
	 * Static variables can be called using a class name instead of instantiating an object.
	 * Example: Game.numOfPlayers;
	 * 
	 * Static variables and methods are stored in the heap in the special location called 
	 * PermGen(Permanent Generation).
	 * 
	 * Methods:
	 * 
	 * 		- Java supports static methods as well as variables
	 * 		- we can create static methods by providing the static keyword in the method header/declaration
	 * 		- static methods can be called/invoked using the Class name
	 * 		- static methods can only see static variables
	 * 		- typically static methods will be used when they are not dependent on the outside information
	 * 		- a class in Java can have both static and non-
	 * 
	 * public class A{
	 * 		public static void print(String str) {
	 * 			Syso(str);
	 * 
	 * 		public void printTwice(String str) {
	 * 			Syso(str);
	 * 			Syso(str);
	 * 		}
	 * }
	 * 
	 * main {
	 * 	   A.print("text");
	 * 
	 * 	   A.printTwice(); // this method is non-static
	 * 	   A a = new A();
	 * 	   a.printTwice();				
	 * }
	 * 
	 * 	blocks: 
	 * 		- static initialization block: when you want a block of code to run only once when
	 * 		the class is first used(the class has bee loaded into the memory) you need to use static block
	 * 			- will run first in the class (execution precedes everything)
	 * 			- can't see and access non-static variables.
	 * 
	 * 		- non-static initialization block: when you need some logic to be executed everytime the object
	 * 			is created and that logic is supposed to precede the constructor execution.
	 *          - will run second after the static block first time, and then it run first for all
	 *          the following object creation.
	 * 
	 */
	

}
