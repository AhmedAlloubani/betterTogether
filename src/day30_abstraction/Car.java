package day30_abstraction;

public class Car extends Vehicle implements Convertible, Hybrid_Engine { // we have to provide all the three abstract methods in the Vehicle class for this class to not complain
	
	
	// default no-arg constructor will be provided
	public Car() {
		super();
	}
	
	
	
	@Override
	public void start() {
		System.out.println("Starting a car");
	}
	
	@Override
	public void brake() {
		System.out.println("Car is braking");
	}
	
	@Override
	public void accelerate() {
		System.out.println("Car is accelerating");
	}



	@Override
	public void openRoof() {
		System.out.println("Opening a roof");
		
	}



	@Override
	public void driveOnBattery() {
		System.out.println("Driving on the battery charge");
		
	}
	
//	@Override
//	public void raiseSideWindows() {
//		System.out.println("Raising windows slowly");
		
//	}

}
