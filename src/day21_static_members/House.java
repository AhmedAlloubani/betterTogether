package day21_static_members;

public class House {
	
	static int count;
	static String HOA;
	
	static {
		System.out.println("Static initialiazation block");
		System.out.println("I run only once");
		
		count = 0;
		HOA = "My lovely HOA";
	}
	
	{
		System.out.println("initialiazation block");
		System.out.println("I run everytime the object created");
	}
	
	public House(String typeOfHouse) {
		System.out.println("This is constructor");
		System.out.println("I run everytime the object created");
		
	}
	
	// will run only once when class is loaded to the memory

}
