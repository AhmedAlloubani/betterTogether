package day30_abstraction;

public abstract class Vehicle extends Transportation {
	
	private String make;
	
	public Vehicle() {
		// we can create a constructor in the abstract class
	}
	
	public abstract void start();
	public abstract void brake();
	public abstract void accelerate();
	
	public void turnOff() {
		System.out.println("Turning off the engine of " + make);
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}
	
	/*
	 *  It is optional for an abstract class to provide implementation of the abstract methods
	 *  inherited from the abstract class. This will relieve the first concrete class from the 
	 *  responsibility of overriding it.
	 */
	@Override
	public void move() {
		System.out.println("Vehicle is moving");
	}
}
