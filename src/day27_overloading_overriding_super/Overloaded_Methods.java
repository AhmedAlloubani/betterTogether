package day27_overloading_overriding_super;

public class Overloaded_Methods {
	
	public void go() {
		System.out.println("Going somewhere");
	}
	
	public void go(String where) {
		System.out.println("Going to " + where);
	}
	
	//public void go(String when) { - still the same method signature(will not compile)
		
	// }
	
	public void go(String where, int distance) {
		System.out.println("Going to " + where + " for " + distance + " miles");
	}
	
	public void go(int distance, String where) {  // will compile because Java take parameter sequancially
		System.out.println("Overloaded method, switched the arguments");
	}
	
	int go(int time, int distance) {
		System.out.println("Going for " + time + "minutes, for " + distance + " miles");
		return 5;
	}
	
	public void go(double d1, double d2) {
		System.out.println("Overloaded method woth two doubles");
	}
	public static void main(String[] args) {
		
		
	}

}
