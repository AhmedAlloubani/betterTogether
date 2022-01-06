package day27_overloading_overriding_super;

public class Widening_Autoboxing {
	
	 public void add(int num1)  {
		 System.out.println("Primitive int method");
	 }
	  public void add(byte num1) {
		  System.out.println("Byte method");
	  }
	  public void add(long num1) {
		  System.out.println("Long method");
	  }
	  public void add(double d1) {
		  System.out.println("Double method");
	  }
	  public void add(Integer num1) {
		  System.out.println("Reference type integer");
	  }
	  
	  public static void main(String[] args) {
		Widening_Autoboxing var = new Widening_Autoboxing();
		var.add((short)5); // since java can't find an exact match, it will widen to the next available one
		var.add(5);
		var.add((byte)5);
		var.add(5L);
	  }

}
