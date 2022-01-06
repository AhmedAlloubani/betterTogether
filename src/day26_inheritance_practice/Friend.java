package day26_inheritance_practice;

import day26_inheritance.Parent;

public class Friend  {
	
	public static void main(String[] args) {
		
		Parent parent = new Parent();
		// parent.age;         this class is not a subclass of the Parent and sits outside of the Parent's package
		// Friend willnot be able to access the protected int age.
	}

}
