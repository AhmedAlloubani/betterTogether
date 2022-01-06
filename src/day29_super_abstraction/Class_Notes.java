package day29_super_abstraction;

public class Class_Notes  {
	
	/*
	 * this vs this()
	 * super. vs super()
	 * 
	 * Constructors in inheritance context
	 * 
	 * 
	 * - java automatically places super() at the beginning of each constructor that you create.
	 * - this creates a chain of constructor executions that go up to the object class.
	 * 
	 * A -> B -> C
	 * 
	 * C c = new C();
	 * 
	 * 1. The C constructor will start executing, followed by B, A, object;
	 * 2. The object of Object will be created first;
	 * 3. The object of A will be created second;
	 * 4. The object of B will be created third;
	 * 5. The object of C will be created last;
	 * 
	 * - super() must be called first line in constructor.
	 * - super() can accept parameters and will call the corresponding constructor in the super class.
	 * 
	 * - super() and this() can't be together in a constructor unless super() was provided automatically by java
	 * 
	 * super. vs this.
	 * 
	 * this was referring to class members
	 * super. is referring to super class members (inheritance must be in place)
	 * 
	 * - super only brings you to the parent class, can't change them to go multiple levels above
	 * 
	 * - if there is a constructor in a super class that accepts parameters, Java might create a default no-arg
	 * constructor (it will have a super() call inside) that will break the chain of constructors
	 * 
	 * Exercise: 
	 * 
	 * Create class Student:
	 * Name;
	 * StudentID
	 * attendClass()
	 * getters and setters;
	 * override toString method
	 * 
	 * Create class OnlineStudent inherits from Student
	 * City;
	 * Overrides attendClass() -> "Attending class using Zoom"
	 * getters and setters;
	 * override toString method
	 * 
	 * Create class OnCampusStudent inherits from Student
	 * City;
	 * Overrides attendClass() -> "Attending class in person"
	 * Overloads attendClass(boolean):
	 *	if true: Attending class using Zoom;
	 *	if false: Attending class in person
     * - getters and setters;	
     * - override toString method
	 */
	
}
