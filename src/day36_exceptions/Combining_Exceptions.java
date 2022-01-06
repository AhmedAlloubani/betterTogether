package day36_exceptions;

public class Combining_Exceptions {
	
	public static void main(String[] args) {
		
		try {
			System.out.println(10/0);
		}catch (ArithmeticException | NullPointerException e) {
			System.out.println("Exception Caught");
		}
		System.out.println("Exception Caught");
	}
	
	
	
	

}
