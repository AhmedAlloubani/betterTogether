package day21_static_members;

public class Stack_Heap_Recap {
	
	/*
	 * 
	 * Java Memory Management:
	 * 
	 * - Stack:
	 * 	- primitives (data types, names and values)
	 * 	- non-primitives (data types and names of the variables) //left side is going to the stack      ex: Car car1 = new Car();
	 *  - methods whenever they are being called
	 * - Heap													// right side is going 	to the Heap		ex: car1.brand = "Toyota";	
	 * 	- objects and data related to the object
	 * 
	 * House house1 = new House();
	 * Car car1 = new Car();
	 * int num1 = 6; // everything goes to stack
	 * 
	 * GC - garbage collector (Java will do it automatically)
	 * System.gc(); - we can suggest Java pick up unused objects by giving this command
	 * protected void finalize() {} - this method will be executed when object is getting garbage collected
	 * 
	 * House house1 = new House("townhouse");
	 * House anotherHouse = new House("single family");
	 * 
	 * 1. house1 = null;
	 * 2. house1 = anotherHouse; // eligible for garbage collector 
	 * 3. house1 = new House();
	 * 
	 * As long as there is a least one variable referring/pointing to the object, it won't be 
	 * eligible for garbage collection.
	 * 
	 * When there are no variables pointing to the object, it will be marked for GC.
	 * 
	 */

}
