package day30_abstraction;

public class Garage {

	public static void main(String[] args) {
	
//		Vehicle car = new Vehicle(); // can't create an object of abstract class
		
		Car toyota = new Car();
		toyota.setMake("Toyota");
		
		toyota.start();
		toyota.accelerate();
		toyota.brake();
		toyota.turnOff(); // this method is simply inherited from the super class
		
		toyota.openRoof();
		toyota.driveOnBattery();
		
		toyota.raiseSideWindows(); // we are calling a overridden default method
		
		Convertible.showOff();    // we are calling static method from interface

	}

}
