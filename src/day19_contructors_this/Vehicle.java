package day19_contructors_this;

public class Vehicle {
	
	/*
	 * Automatically generate getters and setters:
	 * 		right click on the main window -> Source -> Generate Getters and Setters
	 */
	
	private String make; // default value is null and it's left untouched
	private String model;
	
	/*
	 * 1. Constructor is a special method that doesn't have a return type and uses
	 * the class name as its name.
	 * 
	 * 2. Constructor is automatically called at the time of object creation
	 * 
	 * 3. If you do not explicitly create a constructor, a default no-argument constructor
	 * will be created by Java automatically
	 */
	
	public Vehicle() { 
		System.out.println("Adding vehicle to the parking lot");			  	
		
	}
	
	public Vehicle(String make) {
		System.out.println("Adding vehicle to the parking lot");
		this.make = make;
		this.model = "Fiesta";
	}
	
	//default no-argument constructor
	//public Vehicle() { 
	//			  	
		
	//}
	
	public Vehicle(String make, String model) {
		System.out.println("Adding vehicle to the parking lot");
		this.make = make;
		this.model = model;
		
	}
	
	public String getMake() {
		return make;
	}
	
	
	
	// public void setMake(String make) {
	//	make = make; // we are assigning a variable to itself
//	}
		
	public void setMake(String make) {
		this.make = make; // this keyword let us know that we are using an instance variable
						  // this - refers to the instance of the object
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String Model) {
		this.model = model;
	}
	
	public void setVehicleInfo(String vehicleMake, String vehicleModel) {
		setMake(vehicleMake);
		setModel(vehicleModel);
	}
}
