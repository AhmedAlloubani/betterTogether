package day18_encapsulation;

public class People {
	
	public static void main(String[] args) {
		
		Person person1 = new Person();
		// person1.SSN = "16116161616"; will not compile: SSN is private (encapsulated)
		// person1.DOB = "Feb 23, 1997"; will not compile: DOB is private (encapsulated)
		
		person1.name = "John Doe"; // we can assign a value to a public field
		
		person1.setSSN("1662662662626");
		String SSN = person1.getSSN();
		System.out.println(SSN);
	}

}
