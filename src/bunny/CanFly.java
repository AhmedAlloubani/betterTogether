package bunny;

 interface CanFly {
	
	//INTERFACE variables (constant interface variables) must be public, static and final.  
	//Even if you don't put them, Java will insert them automatically
	int MAX = 100;
	static int MAX1 = 200;
	static final int MAX3 = 300;
	final static int MAX4 = 400;
	public final static int MAX5 = 500;

int amount = 10;

	//public static void eatGrass();
		//static interface methods must have a body
	
//Q8 chapter 5
//public int chew() {  // will not compile because abstract methods don't specify a body
//	return 13;
//}

// public abstract Object getWindSpan();

	default boolean isBlind() {
		return true;
	}
	
	public default int getNumberOfGills(int input) 
	{ return 2; }

}
