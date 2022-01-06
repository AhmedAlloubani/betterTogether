package day21_static_members;

public class Meeting {
	
	/*
	 * Create an instance variable peopleCount
	 * 
	 * Create a method called increment() it will be incrementing peopleCount by 1
	 * 		- doesn't accept anything
	 * 		- doesn't return anything
	 * 
	 * Create another class called Conference
	 * 
	 * Instantiate two Meeting objects and increment them both by 1 using the increment method.
	 * 
	 * Check the peopleCount for both objects
	 * Change the peopleCount to static and see how it affects the peopleCount
	 */
	
	static int peopleCount;
	
	
	public void increment() {
		peopleCount++;
	}
		
	

}
