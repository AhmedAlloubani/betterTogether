
public class Animal {
	
	String name;
	int age;
	String type;
	
	 Animal(String name, int age,String type) {
		 this.name = name;
		 this.age =age;
		 this.type =type;
		
	}
	 
	 Animal(int AnimalAge) {
		 age=AnimalAge ;
		
	}

	

	public static void main(String[] args) {
		
		Animal lion = new Animal("Jack",10,"lion");
		System.out.println(lion.name);
		System.out.println(lion.age);
		System.out.println(lion.type);
	

	}

}
