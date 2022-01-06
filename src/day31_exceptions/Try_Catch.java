package day31_exceptions;

public class Try_Catch {
	
	public static void main(String[] args) {
		
		try {
			System.out.println(10/0);
			String str = null;
			str.toUpperCase();   // NullPointer
		} catch(ArithmeticException e)	{
			System.out.println("Can't divide by zero!");
		} catch(NullPointerException e) {
			System.out.println("Null pointer");
		} catch(IndexOutOfBoundsException e) {
			System.out.println("Index out of bounds");
		}catch(Exception e) {
			System.out.println("Broad exception");
		}
		
		System.out.println("Program is still running!");
	}

}
