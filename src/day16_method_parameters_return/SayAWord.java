package day16_method_parameters_return;

public class SayAWord {
	
	/*
	 * Create a method that replaces all of the methods
	 */
	
	// too time consuming to create a method for each indivisual fruit
	public void sayApple() {
		System.out.println("Apple");
	}
	
	public void sayPeach() {
		System.out.println("Peach");
	}
	
	public void sayPineapple() {
		System.out.println("Pineapple");
	}
	
	// we can accept a fruit name as a parameter and just output it
	public void sayFruit(String fruit) {
		System.out.println(fruit);
	}
	
	public static void main(String[] args) {
		
		SayAWord var = new SayAWord();
		var.sayFruit("Apple");
	}
}
