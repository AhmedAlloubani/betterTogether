package day36_exceptions;

public class Throw_Tests {
	
	public static void main(String[] args) throws InterruptedException{
		throwException();
		
	}
	
	//throwing an exception (you don't handle it, you are shifting the responsibility to java to deal with it
	//who will be invoking your method
	//Interview Question: there is only one way to handle exceptions by try and catch
	public static void throwException() throws InterruptedException {
		
	}
	
	
	public static void m1()  throws InterruptedException{
		Thread.sleep(1000);
		
	}
	
	
	
	
	
	
	
	
	

}
