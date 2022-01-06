package day14_do_while_loops;

import java.util.Scanner;

public class Warmup_Task2 {
	
	public static void main(String[] args) {
		
		/*
		 * Write an outlook mail login functionality:
			Username: future.sdet@outlook.com
			Password: PrimeTech
			User name is not case sensitive and must end with “@outlook.com”;
			If username doesn’t end with “@outlook.com” -> print “Invalid email address”
			Password is case sensitive;
			If username ends with “@outlook.com” but user name or password didn’t match:
			write “Invalid user name and password combination”;
			If both username and password are correct -> write “Login successful”
		 */
		
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Please enter the username");
		String inputtedUsername = scanner.nextLine();
		System.out.println("Please enter the password");
		String inputtedPassword = scanner.nextLine();
		
		// these are the values stored in the database
		String userName = "future.sdet@outlook.com";
		String password = "PrimeTech";
		
		if (inputtedUsername.toLowerCase().endsWith("@outlook.com")) {
			if (inputtedUsername.equalsIgnoreCase(userName) && inputtedPassword.equals(password)) {
				System.out.println("Login successful");
			} else {
				System.out.println("Invalid user name and password combination");
			}
		} else {	
			System.out.println("Invalid email address ");
		}
		
		scanner.close();
		
		
		
		
		
		
		
		
		
		
	}

}
