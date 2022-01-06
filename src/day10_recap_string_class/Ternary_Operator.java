package day10_recap_string_class;

public class Ternary_Operator {
	
	public static void main(String[] args) {
		
		/*
		 * if(condition) ==> condition ?
		 * else          ==>   :      ?
		 * else if(condition) ==>  : condition ?
		 */
		
		boolean condition = true;
		int num1 = 5;
		
		if (condition) {
			num1 = 8;
		} else {
			num1 = 15;
		}
		
		System.out.println(num1);
		
		
		//                 true/false ? 8 : 15
		System.out.println(condition ? 8 : 15);
		
		
		// without curly braces only one statement will belong to the if condition
		// with curly braces we can provide as many statements as would like
		int FICO = 800;
		
		if(FICO > 720) {
			System.out.println("You are approved for mortgage");
		} else {
			System.out.println("Denied mortgage");
		}
		
		System.out.println(FICO > 720 ? "You are approved for mortgage" : "Denied mortgage");
		
		
		/*
		 * credits
		 * 
		 * if(credits < 30) {
		 * 	syso -> "freshman"
		 * } else if (credits >=30 && credits < 60) {
		 * 	syso -> "sophomore"
		 * } else if (credits >=360 && credits < 90) {
		 * 	syso -> "junior" 
		 * ] else {
		 * 	"senior" (credits > 90)
		 */
		
		
		int credits = 95;
		
		System.out.println(credits < 30 ? "freshman" : credits < 60 
				? "sophomore" : credits < 90 ? "junior" : credits > 90 ? 
						"senior" : "invalid");
		
		
	}
	
	
	

}
