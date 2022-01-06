package day29_super_abstraction;

public class Vehicle {
	
	int mileage = 10;
	static String type = "Family Car";
	
	public Vehicle() {
		super(); // java created this (Vehicle extends object which is an empty constructor)
		System.out.println("Vehicle Constructor");
	}
	
	public void navigate() {
		System.out.println("Using GPS");
	}

}
