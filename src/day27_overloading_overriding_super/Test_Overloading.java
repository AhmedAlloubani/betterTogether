package day27_overloading_overriding_super;

public class Test_Overloading {
	
	public static void main(String[] args) {
		
		Overloaded_Methods var = new Overloaded_Methods();
		var.go();
		var.go("Java class");
		var.go("Selenium class", 5);
		var.go(2, "Soft skills class");
		var.go(1, 4);
		var.go(1.2, 6.8);
//		var.go(1, 2, 3, 4); // won't compile because Java is not finding a matching method available
		
		String text = "java";
		
		//Example about overloaded method that we used before:
		text.substring(1, 3);
		
		//Other Overloaded Methods:
		System.out.println();                           // 0 argument
		System.out.println("output to the console");    // 1 argument
		
		
	}

}
