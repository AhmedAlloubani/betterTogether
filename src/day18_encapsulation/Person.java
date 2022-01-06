package day18_encapsulation;

public class Person {
	
	// public and private are access modifiers 
	
	public String name; // public - accessible to everyone
	public int age;
	private String DOB; // private - accessible only by the Person class
	private String SSN;
	public int height;
	
	/*
	 * getters and setters are publicly available methods that are used to
	 * access private instance variables.
	 * 
	 * getters and setters typically start with
	 * 		- get + var name(starting with capital letter)
	 * 		- set + var name(starting with capital letter)
	 */
	
	public void setSSN(String social) {
		/*
		 * verification logic to make sure the person has access to that data
		 */
		SSN = social;
	}
	
	public String getSSN() {
		/*
		 * verification logic to make sure the person has access to that data
		 */
		return SSN;
	}

}
