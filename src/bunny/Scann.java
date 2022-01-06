package bunny;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Scann extends Mammal{
	
	
	int numberOfEggs = 6;
	public String name;
	
	
	public void printName(int input) {
		System.out.print("bye");
	}
	
	public Scann(int age) {
		System.out.println("Scann");
	}
	
	public Scann() {
		System.out.println("hala2");
	}
	
	public static void main(String[] args) {
		
		Scann scann = new Scann();
		scann.printName(1);
		scann.printName(9.0);
		
		
		
		new Mammal();
		
		scann.setNumberOfEggs(-1);
		System.out.println(scann.numberOfEggs);
		
		
		//Q9 chapter 6
		new Scann().start();
		
		//Q10 chapter 6
//		Scann solution = new Scann();
//		solution.name = "Leory";
//		solution.parseName();
//		System.out.println("5");
		
		
		
		//Ask Q 7 chapter 6
//		Object x = 3;
//		x.toString();
		
	
		
		
		
		
		
	//	ASK
		//Example ClassCastException
//		Object obj = new Integer(3);
//		String str = (String) obj; 
//		System.out.println(str);
		
		
		//Example ArrayIndexOutOfBoundsException
//		int total = 0;
//		int [] count = new int[3];
//		for (int i = 0; i <= count.length; i++) //it should be < instead of <= because java tries to call 3
//			// which is out of bounds of the array count -> the largest possible index is 2
//			total+= count[i];
		
//		hala(1);  //this method keeps calling itself causing StackOverFlowError
		
		
		//ArithmeticException
//		int a = 0;
//		int b = 5;
//		int z = b / a;
//		System.out.println(z); 
		
	
		
	//	System.out.println("Please enter a number");
//		Scanner sc = new Scanner(System.in);   
//		//int input = sc.nextInt();
//		
//	    try {
//	         System.out.println(sc.hasNextInt());
//	         
//	      } catch (InputMismatchException e) {
//	         System.out.println("Exception thrown  :" + e);
//	
//	      } 
	    
	    //Q4 Chapter 5
	  //  public Number chew() throws RuntimeException { 
	 //   	System.out.println("Beaver is chewing on wood"); return 2;
	//    } // will not compile illegal modifier 
		
		
		//Example try statement 
		//the try statement gets executed and since no exception is thrown, the finally block gets executed 
		//next then the final block -> fta
			String s = "";
			
			try {
				s+= "f";
			} catch (Exception e) {
				s+= "b";
			} finally {
				s+= "t";
			}
			s+= "a";
			System.out.println(s);


	} 
	
	
	//Another Important Example: page 313 (Ask)
	
	public String exceptions() {
		
		String result = "";
		String v = null;
		
		try {
			try {					//the program runs normally and inner try gets executed first
				result+= "before";  //gets executed
				v.length();		//an exception is caught here
				result+= "after";//this block will be skipped
			} catch (NullPointerException e) { //the exception is caught here
				result+= "catch";				// this code gets executed
				throw new RuntimeException();  //throws a new exception
			} finally {			// finally block gets executed 
				result+= "finally"; //code is printed here
				throw new Exception(); //throw another exception
			}
		} catch (Exception e) { //the outer catch block caught the exception here
			result+= "done";   // this code gets printed
		}
		
		return result;  // before catch finally done
		
		
		
	}
	
	public void setNumberOfEggs(int numberOfEggs) { //setter
		if (numberOfEggs >= 0)
				this.numberOfEggs = numberOfEggs;
		
	}
	
	public  void numberOfEggs(int numberOfEggs) {
		if (numberOfEggs < 0)
			throw new IllegalArgumentException("Number of eggs must be greater than zero");
		this.numberOfEggs = numberOfEggs;
	}
	
	
	
	public static void hala(int num) {
		hala(1);
	}
	
	
	//Ask: Q 8 Chapter 6;
//	public Object Try() {
//		int a = 0;
//		int b = 0;
//		
//		try {
//			try { 
//				(a / b);
//			
//		} catch (RuntimeException e) {
//			return 0 ;
//		
//		} finally {
//			return "done";
//		}
//		
//		} catch (ArithmeticException e) {
//			return -1;
//		
//	}
//
//	}
	
	//Q9 chapter 6
	public void start() {
		try {
			System.out.print("Starting up ");
			throw new Exception();
			
		} catch (Exception e) {
			System.out.print("Problem ");
			System.exit(0);
		} finally {
			System.out.print("Shutting down ");
		}
	}
	
	//Q10 chapter 6
//	public void parseName() {
//		System.out.print("1");
//		try { 
//			System.out.print("2");
//			int x = Integer.parseInt(name);  
//			System.out.print("3");
//		} catch (NumberFormatException e) {
//			System.out.print("4");
//		} 
//	}
	
}


	


