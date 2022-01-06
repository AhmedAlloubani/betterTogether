package bunny;

public abstract class ABC {
	
	public final void layEggs() { System.out.println("Reptile laying eggs");
	}
	
	//Q17 chapter 5
	//abstract method don't have a body
//	public abstract void dive() {};
	
int i = 6;
long c = 7777;
//int b = (int) (i * c); //cating




float f = 7876f;

float z = i * c;
long y = (long) (i * f);


	
	//Q20 chapter 5
	private void fly() { 
		System.out.println("Bird is flying"); 
	}
	//following Q20 chapter 5
	public static void main(String[] args) {
		ABC bird = new Main();
		bird.fly();    //it will compile fine, because the method is accessible within the class
					   //but not visible to other classes 
		
	
	}

}
