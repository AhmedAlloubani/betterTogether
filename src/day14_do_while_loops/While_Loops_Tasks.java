package day14_do_while_loops;

import java.util.Scanner;

public class While_Loops_Tasks {

	public static void main(String[] args) {
		
		/*
		 * Use for then while loop to print all even numbers from 1 -100
		 * 
		 * once we reach 28 we need to stop
		 * we want to skip the number 28
		 */
		
		/*
		 * - break - places a hard stop on the loop execution and forces you out
		 * of the loop.
		 * 
		 * - nothing can be placed after the break keyword within the loop
		 * it will create unreachable statement.
		 * 
		 * - continue - helps 
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the beginning number");
		int beginNum = input.nextInt();
		
		System.out.println("Please enter the ending number");
		int endNum = input.nextInt();
		
//		for (int i = beginNum; i <= endNum ; i = i + 2) {
//			if(i == 28) {
//				break;
//				// System.out.println("Hello"); // unreachable, it will not compile
//			}
//			System.out.println(i);
			
			
//		}
		
//	or	for (int i =2; i <= 100; i = i +2) {
//			System.out.println(i);
//		}
	
//		System.out.println("=========================");
		
//		int i =beginNum;
//		while (i <= endNum) {
//			if (i == 28) {
//				break;
//			}
//			System.out.println(i);
//			i = i + 2;
//		}
	
	
		for (int i = beginNum; i <= endNum ; i = i + 2) {
			if(i == 28) {
				continue;
				// System.out.println("Hello;"); // unreachable statement, will not compile
			}
			System.out.println(i);
		
		System.out.println("==========================");
		
		}
		
		int i = beginNum;
		while (i <= endNum) {
			if (i == 28) {
			continue;
		}
			System.out.println(i);
		
		
		
		
		}
	
	}

}
