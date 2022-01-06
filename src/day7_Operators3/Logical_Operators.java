package day7_Operators3;

public class Logical_Operators {

	public static void main(String[] args) {
		
		/*
		 * && AND operator  Usage: true && true
		 * if both sides resolve to true the result will be true,
		 * if at least one of them is false then the result is false
		 *       
		 * || OR  operator
		 *  if at least one of the operands is true then the result is true  
		 * 
		 * 
		 */
 
		System.out.println(true && true);
		System.out.println(5 > 7 && 8 <= 4); // false
		System.out.println(5 == 5 && !false); // true
		
		System.out.println(true || true); // true
		System.out.println((13 > 9) || 5 != 6); // true
		
		System.out.println(true && true || false);
		//                      true    || false
		//                      true
		
		
		int ApplesCount = 20;
		int OrangesCount = 30;
		int PearsCount = 30;
		
		boolean comp = ApplesCount < OrangesCount || OrangesCount >= PearsCount;
		
		System.out.println(comp); // true
		
		boolean bool1 = !(7 > 5 && 6 != 5) && (9 > 5 || 10 > 4);
		System.out.println();
		
		
		
		
		
		
		
	}

}
