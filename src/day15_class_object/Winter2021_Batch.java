package day15_class_object;

public class Winter2021_Batch {
	
	public static void main(String[] args) {
		
		// 1st object
		PrimeTech_Student mamatweli = new PrimeTech_Student();
		mamatweli.name = "Mamatweli Turdy";
		mamatweli.gender = "Male";
		mamatweli.country = "East Turkistan";
		
		mamatweli.javaSkill = 100;
		mamatweli.memeSkill = 30;
		
		System.out.println("My name is " + mamatweli.name);
		System.out.println("I'm " + mamatweli.gender);
		System.out.println("I'm from " + mamatweli.country);
		System.out.println("My java skil is " + mamatweli.javaSkill);
		System.out.println("My meme skill is " + mamatweli.memeSkill);
		
		System.out.println("===========================================");
		
		// 2nd object
		PrimeTech_Student jefferson = new PrimeTech_Student();
		jefferson.name = "Jefferson Medranda";
		jefferson.gender = "Male";
		jefferson.country = "Japan";
		
		jefferson.javaSkill = 100;
		jefferson.memeSkill = 350;
		
		System.out.println("My name is " + jefferson.name);
		System.out.println("I'm " + jefferson.gender);
		System.out.println("I'm from " + jefferson.country);
		System.out.println("My java skil is " + jefferson.javaSkill);
		System.out.println("My meme skill is " + jefferson.memeSkill);
		
		
	}

}
