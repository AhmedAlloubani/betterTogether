package bunny;

//import java.io.IOException;

public class Chapter_6 {
	
	public String name;
	
	
	public static void main(String[] args) {
		
		Chapter_6 answer = new Chapter_6();
		answer.name = "Larry";
		answer.parseName();
		System.out.println("5");
		 
		
		//Q 11 Chapter 6 -> output 12 followed by stack trace NumberFormatException
//		answer.name = "Sam"	;
//		answer.parseNa();
//		System.out.println("6");
		
		//Q12 Chapter 6
//		answer.run();
//		System.out.print("6");
		
		
		//Q19 Chapter 6
		try {
			System.out.println("work real hard"); 
			} catch (IllegalArgumentException   e) {
			} catch (RuntimeException e) {
			}
		
		//Q20 Chapter 6 (ASK)
//		System.out.print("a");
//		try {
//			System.out.print("b");
//			throw new IllegalArgumentException(); 
//		} catch (IllegalArgumentException e) {
//			System.out.print("c");
//			throw new RuntimeException("1"); 
//		}	catch (RuntimeException e) { 
//				System.out.print("d");
//			
//			throw new RuntimeException("2");
//		} finally {
//			System.out.print("e");
//			throw new RuntimeException("3");
//			
//		}
	}
	
	//Q10 chapter 6
		public void parseName() {
			System.out.print("1");
			try { 
				System.out.print("2");
				int x = Integer.parseInt(name);  
				System.out.print("3");
			} catch (NumberFormatException e) {
				System.out.print("4");
				
			} 
		}
		
	//Q11 Chapter 6
//		public void parseNa() {
//			System.out.print("1");
//			try { 
//				System.out.print("2");
//				int x = Integer.parseInt(name);  
//				System.out.print("3");
//			} catch (NullPointerException e) {
//				System.out.print("4");
//			} 
//			System.out.println("5");     
//		}
		
		//Q12 Chapter 6 
//		public void run() {
//			System.out.print("1");
//			try { 
//				System.out.print("2");
//				name.toString();  
//				System.out.print("3");
//			} catch (NullPointerException e) {
//				System.out.print("4");
//				throw e;
//			} 
//			System.out.print("5");
//			
//		}
		
		//Q14 Chapter 6 (ASK)
//		public void ohNo() throws IOException {
//			throw new java.io.IOException();
//		}

}
