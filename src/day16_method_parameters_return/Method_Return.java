package day16_method_parameters_return;

public class Method_Return {
	
	public int add(int num1, int num2) {
		int sum = num1 + num2;		
		return sum;
	}
	public String printStrings(String text, int n) {
		String result = "";
		for(int i = 0; i < n; i++) {
			result += text;
		}
		return result;
	}
	public void subtract(int num1, int num2) {
		if(num2 > num1) {
			return;      // equivalent to a break keyword in loops and switch
			// and it lets you escape the void method earlier
			// can be done inside the switch statement.
		}
		int result = num1 - num2;
		System.out.println(result);
	}
	/*
	 * int - is a return type (returns integer)
	 * return - is java reserved keyword that lets us return a specific value
	 * to a method caller
	 * 
	 * the return type can be both primitive and non-primitive data type
	 */
	public static void main(String[] args) {
		Method_Return var = new Method_Return();
		int num1 = var.add(3, 5);  // we need to store the int that this method returns
		System.out.println(num1);  // 8
		System.out.println(var.add(1, 6)); // return from the method can be utilized in the print statement
		String text = var.printStrings("Hello", 5); // the variable/container data type must match 
		// the return type of the method
		System.out.println(text);
		System.out.println(var.printStrings("Hello", 5));
		String str = "Hello";
		char char1 = str.charAt(1);
		System.out.println(str.charAt(1));
		int num2 = str.length();
		System.out.println(str.length());
		var.subtract(2, 9);
	}
}
	
