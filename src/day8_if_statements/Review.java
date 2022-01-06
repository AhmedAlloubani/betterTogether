package day8_if_statements;

public class Review {

	public static void main (String[] args) {
		
		// Question 1
		
		boolean isMorning = !!!!!false; // logical negation 5 times in a row
		System.out.println(isMorning);  // true
		
		
		// Question 2 
		//                 true !=  true
		boolean result = !false != ("Java" != "Easy");
		System.out.println(result); // false
		
		// Question 3
		
		int a = 100;double b = a+= 100/20; // double b = a = a + 5; -> b = 100 + 5
		System.out.println(a); // 105
		
		// example: when we say a += 5; that means >>> a = a + 5;
		
		// Question 4
		
		boolean bool1 = 128 > '7' || 5 == 4;
		System.out.println(bool1); // true
		
		// Question 6
		
		boolean bool2;
		bool2 = 4>= 5 && 'a' > 'b';
		System.out.println(bool2); // false
		
		// Question 7 
		
		int x = 9999999;
		int y = 10;
		System.out.println(x * y / 10 % x);
		//                (9999999 * 10 / 10 % 9999999)
        //                (9999999 % 9999999)
		//                      0
		
		// Question 8
		
		int x1 = 100;
		int y1 = (byte) 100;
		//                     true &&     100  ==    101    // true
		System.out.println(x1 >= y1 && (x1 + 1 == x1*2/2 + 1));
		
		// Question 9
		int num1 = 50;
		
		 // System.out.println("a > 50 : " + bool3);
		  boolean bool3 = true;
		
		  
		  // Question 10
		  
		  System.out.println(2 + 9 + "6"); // 116
		  
		  // Question 11
		  
		  boolean bool4 = 1 + 11 + "3" == "123";
		  System.out.println(bool4); // true
		  
		  // Question 12 
		  
		  int num3 = 100;
		  num3 += 200; // num3 = num3 + 200 >>>> 300
		  System.out.println(num3++ + " " + num3); // memory: num3 = 301
		  //                 300 + " " + 301
		  //                 300 301
		  
		  // Question 13
		  
		  int c = 10;
		  // int d = c++ + ++c + d + c-- - --c - c; // compilation failure because d is not declared
		//  System.out.println(d);
		  
		  // local variable can't be used unless it has been assigned a value.
		  
		  
		  int e; // can be left not initialized, not used > no compilation failure
		//  System.out.println(e); but when you use it, it will give an error
		  
		  
		//  Question 14
		  
		  System.out.println((10 * 2)/ (5 * 4) * 1000 / 10 % 100);
		  //                   20 / 20  * 1000 / 10 % 100
		  //                   1000 / 10 % 100
		  //                    100 % 100
		  //                     0
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
