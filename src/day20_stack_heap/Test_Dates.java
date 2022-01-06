package day20_stack_heap;

public class Test_Dates {
	
	public static void main(String[] args) {
		
		MyDate date1 = new MyDate();
		System.out.println(date1.getYear());
		
		MyDate date2 = new MyDate(13, 4, 2021);
		System.out.println(date2.getDay());
		
		System.out.println(date2); // even without calling .toString(), it will output 13/4/2021
		//System.out.println(date2.toString()); // this is how we call it
		/*
		 * toString() method is a special method that gets automatically called when you try to
		 * print the variable containing that object.
		 */
		
		MyDate date3 = new MyDate(200, 1500, -4563);
		System.out.println(date3);
		
		/*
		 * Incorrect date format
		 * Instead of the incorrectly provided value, your code should assign a value of 1
		 */
	}

}
