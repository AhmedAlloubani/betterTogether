package day14_do_while_loops;

public class Do_While_Loop {
	
	public static void main(String[] args) {
		
		boolean bool = false;
		
		while(bool) {
			System.out.println("Thursday");
		}
		
		// do-while loop executes the statement at least once,
		// that means that do-while loop will execute the statement even if the boolean
		//expression is false.
		do {
			System.out.println("Thursday");
		} while (bool);
		
		
		int i = 0;
		
		do {
			System.out.println(i);
			i++;
		} while (i < 10);
	
	/*
	 * do-while vs while
	 * 
	 * - do-while is a post-test loop (the condition is evaluated after statement was executed).
	 * - while loop is a pre-test loop (the condition is evaluated before statement was executed).
	 * 
	 * - the statement inside do-while will be executed at least once
	 * - the statement inside do-while won't be executed at least once
	 */
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
