package day31_exceptions;

public class Throws_Tests {
	
	public static void throwException() throws InterruptedException {
		
	// 	Thread.sleep(2000);
		throw new InterruptedException();
	}
	
	public static void main(String[] args) throws InterruptedException {
		throwException();
	}

}
