package day22_arrays;

public class Restaurant {
	
	public static void main(String[] args) {
		
		Dinner father = new Dinner("John Doe", "Shrimp Cocktail", "Lamb Shank");
		father.eatAppetizer();
		father.eatmainEntree();
		father.getPieceOfCake();
		
		Dinner mother = new Dinner("Jane Doe", "Caesar Salad", "Red Lobster");
		mother.eatAppetizer();
		mother.eatmainEntree();
		mother.getPieceOfCake();
		
		Dinner child = new Dinner("Jackie Doe", "Arthicke dip", "Salmon");
		child.eatAppetizer();
		child.eatmainEntree();
		child.getPieceOfCake();
		
		System.out.println("Number of pieces of cake in the Dinner class: " + Dinner.cakePieces);
		
		System.out.println("Number of pieces of cake that father sees: " + father.cakePieces);
		System.out.println("Number of pieces of cake that mother sees: " + mother.cakePieces);
		System.out.println("Number of pieces of cake that child sees: " + child.cakePieces);
	}
	

}
