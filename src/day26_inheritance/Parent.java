package day26_inheritance;

public class Parent {
	
	
/*	- Create class Parent:
	     public String name;
	     public void hello() {
		    prints "Hello from parent class";
	     }
	Create class Child1 -> inherits from Parent class;
	Create class Child2 -> inherits from Parent class;
	Create class GrandChild1 -> inherits from Child1 class;
	Create class GrandChild2 -> inherits from Child2 class;
	Create class Family {
		main method {
			Create object of Parent;
			create object of Child1;
			create object of Child2;
			create object of GrandChild1
			create object of GrandChild2
	}
	}
	Call hello method using each object.

}*/
	public String name = "Peter";
	
	private int PIN =1234; // will not be accessible outside of the class
	String lastName = "Langley"; // default access modifier
	protected int age = 42;
	
	
	public void hello() {
		System.out.println("Hello from parent class");
	}
	
	/*
	 * Access Modifiers:
	 * 
	 * 	- private: only visible/accessible within the class
	 * 	- <default>: accessible within a package (package-private access modifier)
	 * 	- protected: accessible within its package + accessible outside of the package only for subclasses
	 * 	- public: open to the world
	 */
}
