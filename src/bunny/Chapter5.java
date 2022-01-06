package bunny;

public abstract class Chapter5 {
	
	
	
	
	public static void main(String[] args) {
		
	
		
	}
	public void eat(int hieght) {
		System.out.println("hi");
		
	}
	
//	public int eat(int food) { will not compile because it's a duplicate method (same name same parameters)
//		return food;
//	}
	
	private String getNumberOfHumps(String d) {
		return "humps";
	}
	
	private int getNumberOfHumps(int tall) {
		return 1;
	}
	
//	private abstract void sing(); //abstract method can't be both private and abstract because it will not 
	//be accessible from subclasses
	// we do like this instead:
	protected abstract void sing(); //abstract method is terminated by a semicolon anddoesn't have a body
	

}
