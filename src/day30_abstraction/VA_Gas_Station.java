package day30_abstraction;

public class VA_Gas_Station extends Gas_Station{
	
	private boolean isGasAvailable;
	public VA_Gas_Station(boolean isGasAvailable) {
		this.isGasAvailable = isGasAvailable;
	}
	// rules of overriding: access modifier - can't be more restrictive
	@Override
	public void sellGas() {
		
		super.sellGas();
		
		//if(isGasAvailable) {
	//		System.out.println("Selling gas for $3.85");
	//	} else {
	//		System.out.println("Sorry, no gas!");
	//	}
	}
	
	public void method2() {
		System.out.println("Method2 in a child class");
	}
//	@Override - won't compile since statics can't be overridden
	public static void sellSnacks() {
		System.out.println("Static in the child class");
	}
}
