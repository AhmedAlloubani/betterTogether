package day22_arrays;

public class Static_Recap {
	
	/*
	 * What can be static?
	 * - variables;
	 * - methods;
	 * - blocks;
	 * - static inner classes;
	 * 
	 * Waht's special about statics?
	 * - static variables belongs to a class an d not to an individual instance;
	 * - static methods: they belong to a class, they are only able to see static variables and methods
	 * 		A.printString();
	 * 
	 * 		A a = new A();
	 * 		a.printString(); // will compile, but is not a proper form to call the static method.
	 * 
	 * 		this.var - is only applicable to instance variables
	 * 		this refers to a current instance of the class/blueprint
	 * 
	 * 		Example of static methods: System.gc(); - static way to invoke a method
	 * 		
	 * 	- blocks:
	 * 		- static: the block of code is only executed only once when the class is first used/loaded into the memory,
	 * 			it executes first, before non-static block and before constructor. No parameters, no returns.
	 * 			static{}.
	 * 		- non-static: runs everytime when an instance of the class is created. Runs after static block,
	 * 			and before constructor. No parameter, no returns. 
	 * 		- blocks of code are executed in a top-to-bottom manner;
	 * 
	 * - static import:
	 * 			import static day21_static_members.Utility.add;
	 * 
	 * 			A.add(); - not necessary
	 * 			add(); - can call it without the class name
	 */
	
	/*
	 * 		- Create a class named Dinner
	 * 		- Constructor that accepts and assigns the values to: person, appetizer, mainEntree, cakePieces
	 * 		- Data: person, appetizer, mainEntree, cakePieces = 10;
	 * 		- Methods: eatAppetizer(), eatMainEntree(), getPieceOfCake();
	 * 		- toString() method that outputs the information about your instance;
	 * 
	 * 		Dinner person1 = new Dinner("John Doe", "Crab Cakes", "Kebob",);
	 */

}


