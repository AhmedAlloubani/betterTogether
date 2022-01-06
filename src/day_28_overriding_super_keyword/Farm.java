package day_28_overriding_super_keyword;

public class Farm {
	
	public static void main(String[] args) {
		
		Animal animal = new Animal();
		Animal fluffy = new Cat();
		Animal clifford = new Dog();
		
		animal.makeSound();
		fluffy.makeSound();
		clifford.makeSound();
		
		fluffy.sleep(); // the object type will not determine what method is called because sleep() is static and
		// it's hidden and not ridden.
	
	
//	animal.purr(); // purr is specific to the cat class only
	//fluffy.burryBone(); // burryBone is specific to the Dog class only
	
	// fluffy.purr();
	// clifford.burryBone();


	}
}
