package day24_arraylist;

public class Zoo {
	
	public static void main(String[] args) {
		
		Animal animal1 = new Animal("Zebra");
		Animal animal2 = new Animal("CocKroach");
		Animal animal3 = new Animal("Horse");
		Animal animal4 = new Animal("Racoon");
		Animal animal5 = new Animal("Ostrich");
		
		Animal[] southernSection = {animal1, animal2, animal3, animal4, animal5};
		
		for(Animal animal : southernSection) {
			System.out.println(animal.getName());
			
		}
	}

}
