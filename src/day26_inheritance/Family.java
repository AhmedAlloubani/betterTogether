package day26_inheritance;

public class Family {
	
	public static void main(String[] args) {
		
		Parent parent = new Parent();
		Child1 child1 = new Child1();
		Child2 child2 = new Child2();
		GrandChild1 grandChild1 = new GrandChild1();
		GrandChild2 grandChild2 = new GrandChild2();
		
		parent.hello();
		child1.hello();
		child2.hello();
		grandChild1.hello();
		grandChild2.hello();
		
		grandChild1.name = "Michael";
		
		System.out.println("Grand child's name is " + grandChild1.name);
		System.out.println("Grand child's name is " + grandChild2.name);
		
	//	parent.name = "Peter";
		
		System.out.println("Grand child's name is " + grandChild2.name);
	}

}
