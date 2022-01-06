package day31_exceptions;

public class Finally_Tests {
	
	public static void main(String[] args) {
		
	try {
		System.out.println("Hello!");
		System.out.println(10/0);
	} catch (Exception e) {
		System.out.println("Something went wrong!");
		System.out.println(10/0);
		System.exit(0); // kills the program
	} finally {
		System.out.println("Finally block");
		System.out.println("I will always run!");
		
	}
	
	System.out.println("End of the program");

	}

}
