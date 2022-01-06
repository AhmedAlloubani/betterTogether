package bunny;


// important example about variables when goes outside of the scope. It doesn't compile 
public class eatIfHungry {
	
	public void eatIfHungry(boolean hungry) { // the method parameter here is available for the entire method
		 if (hungry) {                        // and (their scope is from line 7 to 17)
		 int bitesOfCheese = 1;
		 {
		 boolean teenyBit = true;
	System.out.println(bitesOfCheese);
	
	
	 }
	 }
	// System.out.println(teenyBit); // DOES NOT COMPILE because it goes out of scope which
		 // is outside the method (teenyBit scope is from line 10 to 13)
		 
		 // System.gc() A Method for Garbage Collection
		}

}

