package day7_Operators3;

public class Relational_Operators {

	public static void main(String[] args) {
		
		/*
		 * Relational operators always resolve to tru/false
		 * >    greater than
		 * >=   greater or equal than
		 * <    less than
		 * <=   less or equal
		 * ==   equals
		 * ! =  not equal
		 * !    logical negation
		 * 
		 */

		System.out.println(10 > 9);  // true
		System.out.println(10 >= 10); // true
		
		boolean bool1 = 5 < 3;
		System.out.println(bool1); // false
		
		boolean bool2 = 6 <= 7;
		System.out.println(bool2); // true
		
		boolean bool3 = 4 == 7;  // false
		System.out.println(bool3);
		
		boolean bool4 = 7 == 7;
		System.out.println(bool4); // true
		
		boolean bool5 = 7 != 7;
		System.out.println(bool5); // false
		
		boolean bool6 = 3 != 8;
		System.out.println(bool6); // true
		
		boolean bool7 = true;
		System.out.println(!bool7); // false
		
		boolean bool8 = false;
		boolean bool9 = !bool8;
		System.out.println(bool9); // true
		System.out.println(bool8);
		// logical negation doesn't affect the value of the variable
		
		boolean bool10 = "Ajay" == "good guy";
		System.out.println(bool10); // false
		
		boolean bool11 = "Marat" != "bad guy";
		System.out.println(bool11);   // true
		
		// can't logically negate (!) a string or any non-boolean expression
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
