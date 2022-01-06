package day_28_overriding_super_keyword;

public class Cat extends Animal {
	
	int age; // hiding/shadowing of the variable
	
//	@Override
	public static void sleep() { // static method is hidden
		System.out.println("Cat is sleeping");
	}
	
	@Override                        // annotation indicating that method is overridden
	public void makeSound() {		 // performs additional checks
		System.out.println("Meow!");
	}
	
	public void purr() {
		System.out.println("Cat is purring");
	}

	@Override  // toSting() coming from the object class
	public String toString() {
		return "Cat [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
}
