package bunny;

public class Main extends ABC{
	
	//Q16 chapter 5
	//can't override the final method in the abstract class ABC
//	public void layEggs() {
//		System.out.println("lizzard laying esggs");
//	}
	
	private int result = 0;
	
	 public int add(int number) { // if you want a method to return a value, you can use a primitive 
								 // datatype such as (int, chr, etc)
		return result += number;
		
	}
	 
	 public int sub(int number) {
		 return result -= number;
	 }
	 
	 public void clear() {
		 result = 0;
	 }
	 
	 public void print() {
		 System.out.println(result);
	 }
	 
	 //Q 20 chapter 5
	 protected void fly() { System.out.println("Pelican is flying"); }
	 
	

}
