package day21_static_members;

import java.util.Scanner;

public class TestStrings {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter some text");
		String str = input.nextLine();
		
		StringUtil util = new StringUtil();
		String result = util.reverseString(str);
		
		System.out.println(result);
		
		input.close();
	}

}
