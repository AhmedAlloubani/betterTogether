package day9_scanner_switch;

public class Warmup_Task {
	
	public static void main (String[] args) {
		
		/*
		 * Declare 3 int variables n1, n2, n3.
		 */
		//If only n1 equals to n2 -> syso n1 equals to n2
		//If only n2 equals to n3 -> syso n2 equals to n3
		//If only n3 equals to n1 -> syso n3 equals to n1
		//If all equal -> syso all equal
		//If none are equal -> syso non are equal
		
		int n1 = 20;
		int n2 = 20;
		int n3 = 20;
		
	//	if (n1 == n2 && n2 != n3) {
	//		System.out.println("n1 equals to n2");
	//	} else if (n2 == n3 && n2 != n1) {
	//		System.out.println("n2 equals to n3");
	//	} else if (n3 == n1 && n1 != n2) {
	//		System.out.println("n3 equals to n1");
	//	} else if (n1 == n2 && n2 == n3) {
	//		System.out.println("all are equal");
	//	} else {
	//		System.out.println("non are equal");
		
		if (n1 == n2 && n2 == n3) {
			System.out.println("all are equal");
		} else if (n1 == n2) {
			System.out.println("n1 equals to n3");
		} else if (n2 == n3) {
			System.out.println("n2 equals to n3");
		} else if (n3 == n1) {
			System.out.println("n3 equals to n1");
		} else { 
			System.out.println("none are equal");
			
		
		}
		
	}

}
