package day32_properties_file;

public class Exceptions_Recap {
	
	/*
	 * Definition: unexpected even that happened during the code execution
	 * 
	 * try-catch
	 * 
	 * try {
	 * 		// try this code and see if it throws an exception
	 * 		// line 1 Exception
	 * 		// line 2
	 * 		// line 3
	 * } catch (NullPointerException e) {
	 * 		// execute this code
	 * }
	 * 
	 * Exception:
	 * 		- checked   (compile-time)
	 * 		- unchecked (run-time)
	 * 
	 * System.out.println(10/0); // ArithmeticException - java will let you to compile this code (unchecked)
	 * Thread.sleep(5000);       // InterruptedException - java won't let you compile this code (checked)
	 * 
	 * two solutions to a problem:
	 * 		- try-catch: we will take care of the exception ourselves;
	 * 		- throws: shifts the responsibility to the method that will be invoking the method we are in
	 * 
	 * We are able too throw a specific exception manually ourselves
	 * Example: throw new NullPointerException();
	 * 
	 * finally: always executes regardless if we have an exception in either try or catch
	 * System.exit(0); - will prevent finally block from executing
	 * 
	 * Multiple catch blocks:
	 * 		- only one of the catch clauses will be executed;
	 * 		- we should list all the exceptions from the smallest to the biggest
	 */
	
	public static void main(String[] args) throws Exception {
		
		try {
			 throw new NullPointerException();		  // exception
		 } catch (IllegalArgumentException e) {
			 	System.out.println("NullPointerException was caught!");
			 	System.out.println(10/0);              // exception
		 } catch (NullPointerException e) {
			 
		 } catch (Exception e) {
			 
		 } finally {
			 System.out.println("We are in the finally block");
		 }
	}

}
