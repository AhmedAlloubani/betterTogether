package day30_abstraction;

public interface Payable  extends Doable {
	
	// public static final double BONUS = 0.05;		
	// public abstract double calculateBonus(double salary);
	 
	  	double BONUS = 0.05; // interface knows that this is still (public static final double BONUS = 0.05;)	
	  	double calculateBonus(double salary); //interface knows that this is still (public abstract double calculateBonus(double salary);
	 

}
