package day17_method_parameters_recap;

public class Method {
	
	/*
	 * 1. Create a method that accepts a String and prints it out. Name it printString()
	 * 2. Create a method that accepts an email and also accepts a domain name (gmail.com)
	 * 	  and prints the full email address to the console.	
	 * 	  Example:
	 *       - marat
	 *       - primetechschool.com
	 *    Output:
	 *    	 - marat@primetechschool.com	  
	 * 3. Create a method called printRange() that accepts two numbers and prints all the numbers in between
	 *    Example: 5, 9
	 *    Output: 5,6,7,8,9	
	 * 4. Create a method that accepts two numbers and returns the bigger number
	 *    Example: 2, 3  | -2, -10
	 *    Return: 3      | -2 
	 */ 

	public void printString(String text) {
		System.out.println(text);
	}

	public void printEmail (String name, String domain) {
		String emailAddress = name + "@" + domain;
		System.out.println(emailAddress); 
		
	}
	public void printRange (int num1, int num2) {
		
		for (int i = num1; i <= num2; i++) {
			if (i != num2) {
				System.out.print(i + ",");
			} else {
				System.out.println(i);
			}
		
	}
		
		
		}
	
	public int findMax(int num1, int num2) {
		if (num1 > num2)
				return num1;
		else
				return num2;
	}

}
