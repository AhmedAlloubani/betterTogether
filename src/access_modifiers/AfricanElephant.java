package access_modifiers;

public class AfricanElephant extends Elephant {
	
	public static void main(String[] args) {
		
		
		AfricanElephant one = new AfricanElephant();
		one.move();
		one.age = 20;
		one.trunkLength = 2;
		one.hoard();
	}

}
