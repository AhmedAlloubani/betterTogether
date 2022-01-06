package day22_arrays;

public class Dinner {
	
	String person, appetizer, mainEntree;
	static int cakePieces = 10;
	
//	static {
//		cakePieces = 10;
//	}
	
	public Dinner(String person, String appetizer, String mainEntree) {
		this.person = person;
		this.appetizer = appetizer;
		this.mainEntree = mainEntree;
		
	}
	
	public void eatAppetizer() {
		System.out.println("Eating appetizer");
	}
	
	public void eatmainEntree() {
		System.out.println("Eating mainEntree");
	}
	
	public void getPieceOfCake() {
		if (cakePieces <= 0) {
			System.out.println("No more cake");
		}else {
			cakePieces--;
		}
	}
	
	// toString method called automatically as soon as you try to print the object
	public String toString() {
		return "Person:" + person + " appetizer:" + appetizer + " mainEntree:" + mainEntree;

	}

}
