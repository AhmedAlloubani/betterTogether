package day27_overloading_overriding_super;

public class Recap {
	
	public class RecapInner { // just an example about inner class (you will not have this at work, it is just an example)
		// inner class - can have any access modifier
	}
	
	private Recap() {
		// constructor can be private but no one will be able to instantiate an object
	}
	
	/*
	 * Inheritance: 
	 * 
	 * 		A <- B <- C
	 * 		Parent class <- Child class
	 * 		Super class <- Sub class
	 * 
	 * 		- is the ability of one class to acquire members (variables and methods)
	 *  of a parent class;
	 *  	- private members can't be inherited;
	 *  	- extend is the keyword that is used to set up inheritance;
	 *  	- default: we won't be able to access members of the parent class in a different package;
	 *  	- protected: we can access parent's members from within the same package + outside of
	 *  the package as well;	
	 *  	- constructors are not inherited (doesn't matter what access modifier you have);
	 *  	- statics can't be inherited, statics are shadowed;
	 *  
	 *  Access modifiers:	
	 *  
	 *  	- public;
	 *  	- private;
	 *  	- protected;
	 *  	- <default>;
	 *  
	 *  	private > default > protected > public
	 *  
	 *  1. What access modifier do I need to use if T want my variable to be visible only
	 *  within the same package? <default>
	 *  2. I need to use a method within the same package and also in subclasses in other packages? protected
	 *  3. I need a variable that cant't be changed and accessible only within a class? final private
	 *  	Example: final private int num1 = 5; // final means constant (you can't change it).
	 *  4. I need a method anyone can use. public
	 *  
	 *  variables, methods, constructors - all access modifiers are applicable
	 *  classes - can be public or default 
	 *  only one class can have public access modifier within the same file
	 *  Inner class can have all access modifiers
	 */

}

class Recap2 {
	// can't be public because we can't have have two public modifiers in the same file
	
	/*
	 * Task:
	 *  - Create a class Book;
	 *  	- private variable numberOfWords;
	 *  	- <default> variable author;
	 *  	- protected variable price;
	 *  	- public variable title
	 *  	- private method calculateWords(): void-> Print ("Calculating number of words...");
	 *  	- protected method getAuthor() - returns author's name;
	 *  	- public method setPrice() - sets the price and prints the price;
	 *  
	 *      - Create a class BookStore in the same package as Book;
	 * 	    - Create an object of the Book class and call all the variables and methods that are visible;
	 *      - Create a class Library located in a different package;
	 *  	- Create an object of the Book class and call all the variables and methods that are visible;
	 */
}
