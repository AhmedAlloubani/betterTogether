package day13_loops;

public class For_Loop {
	
	public static void main(String[] args) {
		
		//System.out.println("Meow!");
		//System.out.println("Meow!");
		//System.out.println("Meow!");
		//System.out.println("Meow!");
		//System.out.println("Meow!");
		//System.out.println("Meow!");
		
		
		// initialization ; condition ; iterator
		for (int count = 0; count < 10; count++) { // as soon as condition evaluates to false-> stop execution
			System.out.println("Meow!");
			
		}
	
	//	for (int count = 0;  count < 10; count++) { 
	//		System.out.println("Number: " + count);
	//		
			
			for (int count = 10; count >= 0; count--) {
				System.out.println("Number: " + count);
		}
		
			/*
			 *  the variable that was declared within the for loop will exist only within
			 *  the for loop
			 */
			
			// infinite loop - none of the components of the for loop are mandatory
		//	for (;;) {
		//		System.out.println();
		//	}
			
			
			for (int i = 1 ;i <= 10; i++) {
				System.out.println(i + "  " + i * i);
				
			}
	
	for (int evenNum = 2; evenNum <= 30 ; evenNum += 2 ) {
		System.out.println(evenNum);
	}
	
	
	
	
	
	
	
	
	
	
	
	}

}
