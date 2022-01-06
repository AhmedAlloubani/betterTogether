package day31_exceptions;

public class Exception_Notes {
	
	/*
	 * Exception - is an unwanted or unexpected event
	 * 
	 * 1. Write the code;
	 * 2. Compile the code (javac: .java -> .class) byte code; compilation Errors/Issues (Compilation Fails)
	 * 3. Run the code (java: -> produces the result).- Exceptions
	 * 
	 * How can we recover from exceptions?
	 * 
	 * try - catch block
	 * 
	 * try {
	 * // the code that can potentially throw an exception
	 * } catch (Exception e) {
	 * 		// this block of code will execute only if the exception was caught
	 * }
	 * 
	 * We can have multiple catch clauses. Only one of them will be executed. Catch calsues have to be
	 * listed starting from the smallest one and increasing. If you have two exceptions that are on the same
	 * level in exception hierarchy, it doesn't matter which one to place first.
	 * 
	 * 	try {
	 * 		A;
	 * 		B;
	 * } catch (Exception e) {
	 * 		C;
	 * 		D;
	 * }
	 * 
	 * E;
	 * 
	 * 1. No exception anywhere -> A, B, E
	 * 2. Exception in A -> C, D, E
	 * 3. Exception in A, C -> nothing will be printed
	 * 4. Exception in B -> A, C, D, E
	 * 5. Exception in E -> A, B + exception
	 * 
	 * Two types of exceptions:
	 * 	- unchecked (Run-Time Exception): are the sub-type of Exception that is optional for the programmer to handle, 
	 * 	your code will compile even if you don't handle it;
	 * 	- checked (Compile-Time Exception): are the sub-type of Exception that is mandatory for the programmer to handle,
	 * your code will not compile if you don't handle it.
	 * 
	 * finally block:
	 * 	- the code in this block will run no matter what regardless if the exception happened
	 * in the try or catch block (System.exit is the exception;
	 * 
	 * we can not have more than 1 try and finally block;
	 * we can skip the catch block and go straight to finally (try - finally)
	 * 
	 * throw vs throws
	 * 
	 * throw - we use when we want to generate exception (Ex. throw new NullPointerException())
	 * throws - goes to the method header and shifts the responsibility of handling the checked exception
	 * to the method that will invoke this particular method that throws the exception.
	 * 
	 *
	 */

}
