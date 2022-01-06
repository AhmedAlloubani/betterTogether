package day26_inheritance;

public class Child1 extends Parent {
	
	public static void main(String[] args) {
		
		Parent parent = new Parent();
		System.out.println(parent.lastName);
		
		System.out.println(parent.age);
	}

}
