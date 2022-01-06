package day29_super_abstraction;

public class SportCar extends Vehicle {
	
	public SportCar() {
		super(); // calling the no-argument constructor from the super class - prints "Vehicle Constructor"
		System.out.println("SportCar Constructor"); // prints "SportCar Constructor"
	}
	
	public SportCar(String make) {
		super(); // java does this automatically in every constructor you made
	}
	
	public SportCar(int gallons) {
		this("Lambo");
	}
	
	public void goFast() {
		System.out.println(super.mileage);  // reference to paren't class members
		System.out.println(super.type);    // will compile, but not recommended. (you should call it properly using the class name)
		super.navigate();
	}

}
