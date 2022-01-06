package day5_operators;

public class Concatenation {
	
	// concatenation - combining two strings together
	public static void main (String[] args) {
		
		System.out.println("Hello, " + "World");
		System.out.println("2" + "2");
		
		String var1 = "Hello,";
		String var2 = "students";
		
		System.out.println(var1 + var2);
		
		//=================================
		
		int int1 = 5;
		String var3 = "Tuesday";
		
		System.out.println(var3 + int1);
		// if one of the variables is a String, the "+" will act as concatenation
		// The second variable will be converted to text/String
		
		System.out.println("Hello" + 3 + 5);
		System.out.println(3 + "Hello" + 5);
		
		System.out.println(3 + 5 + "Hello");
		//                  8 + "Hello"
		//                  8Hello
		
		int age = 25;
		System.out.println("My age is:" + age);
		
		String text = "My age is:";
		System.out.println(text + " " + age);
		
		String result = text + " " + age;
		
		
		
		
		
		
		
		
		
	}

}
