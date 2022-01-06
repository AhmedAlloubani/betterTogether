package day15_class_object;

public class CellPhoneStore {

	public static void main(String[] args) {
		
		// Scanner input = new Scanner();
		
		System.out.println("Welcome to our cell Phone Store!");
		System.out.println("These are the phones we have:");
		System.out.println("========================================");
		
		// First object of the SmartPhone class
		SmartPhone cellPhone1 = new SmartPhone();
		cellPhone1.brand = "Samsung";
		cellPhone1.memorySize = 32;
		cellPhone1.price = 399.99;
		cellPhone1.call();
		cellPhone1.takeAPhoto();
		
		System.out.println("The name of this phone is " + cellPhone1.brand);
		System.out.println("The memory size of this phone is " + cellPhone1.memorySize + " GB");
		System.out.println("The price of this phone is $" + cellPhone1.price);
		
		
		System.out.println("========================================");
		
		// Second object of the SmartPhone class
		SmartPhone cellPhone2 = new SmartPhone();
		cellPhone2.brand = "iPhone";
		cellPhone2.memorySize = 64;
		cellPhone2.price = 799.99;
		cellPhone2.call();
		cellPhone1.takeAPhoto();
		
		System.out.println("The name of this phone is " + cellPhone2.brand);
		System.out.println("The memory size of this phone is " + cellPhone2.memorySize + " GB");
		System.out.println("The price of this phone is $" + cellPhone2.price);
		
		
		System.out.println("========================================");
		
		// Third object of the SmartPhone class
		
		SmartPhone cellPhone3 = new SmartPhone();
		cellPhone3.brand = "HTC";
		cellPhone3.memorySize = 8;
		cellPhone3.price = 149.99;
		
		
		System.out.println("The name of this phone is " + cellPhone3.brand);
		System.out.println("The memory size of this phone is " + cellPhone3.memorySize + " GB");
		System.out.println("The price of this phone is $" + cellPhone3.price);
		
		System.out.println("========================================");
		
		// Fourth object of the SmartPhone class
		SmartPhone cellPhone4 = new SmartPhone();
		System.out.println(cellPhone4.brand);
		System.out.println(cellPhone4.memorySize);
		System.out.println(cellPhone4.price);
		
		/*
		 * Default values of fields (instance variables):
		 * - non-primitive data types: null
		 * - integer family data types: 0
		 * - floating point data types: 0.00
		 * - boolean: false
		 */
		
		System.out.println(cellPhone1.brand); // Samsung
		System.out.println(cellPhone2.brand); // iPhone
		
//		cellPhone1.brand = "Nokia";
//		cellPhone2.brand = cellPhone1.brand;
//		
//		System.out.println(cellPhone1.brand); // Nokia
//		System.out.println(cellPhone2.brand); // Nokia

	}

}
