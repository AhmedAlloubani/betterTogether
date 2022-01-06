package day30_abstraction;

public interface Convertible {
	
//	public Convertible() {   // interfaces can't have constructors
//		
//	}
	
	void openRoof();
	public default void raiseSideWindows() {
		raiseLeftWindow();                 // we've broken down a bigger functionality into smaller pieces
		raiseRightWindow();
		showOffOnWestCoast();              // we can call both static and non-static methods from 
		System.out.println("Raising side windows");
	}
	
	public static void showOff() {
	//	raiseRightWindow();          // we can't call non-static method from within the static method
		showOffOnEastCoast();        // we can call static methods from within static method
		showOffOnWestCoast();
		System.out.println("Showing off");
	}
	
	private void raiseLeftWindow() {
		System.out.println("Raising left window");
		showOffOnEastCoast();        // we can call static methods from within the non-static method
	}
	
	private void raiseRightWindow() {
		System.out.println("Raising right window");
	}
	
	private static void showOffOnWestCoast() {
		System.out.println("Showing off driving convertible");
	}
	
	private static void showOffOnEastCoast() {
		System.out.println("Showing off with hard top");
	}
	
	

}
