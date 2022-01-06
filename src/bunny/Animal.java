package bunny;

public class Animal extends Zoo{

	public Animal(String lion) {
		super(11111);
		System.out.println("Lion name from Animal "+lion);
		// TODO Auto-generated constructor stub
	}
	
	public Animal(int lion) {
		super(lion); //super must be the first statement in the constructor
		System.out.println("Lion name from Animal "+lion);
		// TODO Auto-generated constructor stub
	}
	

	
	public static void main(String[] args) {
		Animal animal = new Animal("Jack");
		//Animal animal2 = new Animal(1);
		
		
		int x = 0;
		for(long y = 0, z =4; x < 5 && y < 10;y++ , x++) {
			
			System.out.print(y + " ");
			//0,1,2,3,4
			//1,2,3,4,5
		}
	}

}
