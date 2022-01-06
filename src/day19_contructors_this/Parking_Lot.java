package day19_contructors_this;

import java.util.Random;
import java.util.Scanner;

public class Parking_Lot {
	
	public static void main(String[] args) {
		
		Vehicle car1 = new Vehicle();
		car1.setMake("Tesla");
		
		System.out.println(car1.getMake());
		
		Vehicle car2 = new Vehicle("Ford", "GT");
		System.out.println(car2.getMake());
		System.out.println(car2.getModel());
		
		Vehicle car3 = new Vehicle("Ford");
		System.out.println(car3.getMake());
		System.out.println(car3.getModel());
		
		car3.setModel("Mustang GT");
		System.out.println(car3.getModel());
		
		Scanner scanner = new Scanner(System.in); // example of how we used constructors before
		
		String text = new String("Hello");        // example of how we used constructors before
		
		Random rand = new Random();               // the class used to generate random numbers
		System.out.println(rand.nextInt(100));    // random number from 0 to 100 will be generated
		
		
		
		
	}

}
