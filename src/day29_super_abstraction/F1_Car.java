package day29_super_abstraction;

public class F1_Car extends SportCar {
	
	int gallons;
	static int numOfWheels;
	
	public F1_Car() {
		super("Nissan GTR");
		System.out.println("F1_Car Constructor");
	}
	
	public F1_Car(int gallons) {
		this.gallons = gallons;
	}
	
	public void accelerate() {
		System.out.println(("F1 is accelarating"));
	}
	
	public static void brake() {
		System.out.println("F1 is braking");
	}
	
	public void driver() {
		this.accelerate();
		this.numOfWheels =4; // it compiles but this. is 99% used to refer to instance variables (it never been used to refer to static variables)
	}

}
