package day26_inheritance;

public class Zoo {
	
	public static void main(String[] args) {
		
		Cat fluffy = new Cat();
		
		fluffy.sleep();
		fluffy.purr();
		
		System.out.println(fluffy.age);
		// System.out.println(fluffy.numberOfLegs); // private variable is not accessible to the sub class 
		fluffy.age =5;
		System.out.println(fluffy.age);
		
		Elephant dumbo = new Elephant();
		dumbo.sleep();
		dumbo.run();
		
		dumbo.shower();
	}

}
