package day10_recap_string_class;

public class Kahoot_Review {
	
	public static void main(String[] args) {
		
		// Question 1
		int num = 9;   // 9
		// 9          false          in memory 10
		if(num++ == 10) {
			System.out.println("Apple " + num); 
		} else {
			System.out.println("Orange " + num); // Orange 10
		}
		
		// Question 2
		
		int score = 0;
		// true
		if (score == 0) {
			score += 50; // score = score + 50 // 50
		
		}
		// true
		if (score != 0) {
		score += 50;  // score = score + 50 // 100
		
		System.out.println(score);  // 100
	}
	
		// Question 3
		
		char grade = 'A';
		//           true   ||  false
		boolean isPassed = grade == 'A' || grade == 'B'; // true
		//           false  ||  false
		boolean isPassed2 = grade == 'C' || grade == 'D';// false
		//   true || false
		if (isPassed || isPassed2) {
			System.out.println("You've passed the exam");
		} else {
			System.out.println("You failed");
		}
	
	
	// Question 4
		
		boolean a = true, b = !false;
		if(b) {
			System.out.println("B");
		} else if (a) {
			System.out.println("A");
		} else { 
			System.out.println("C");
		}
	
	
	// Question 5    doesn't compile (else has to go last)
	//	boolean result = true;
		
	//	if(result) {
	//		System.out.println("True");
	//	} else {
	//		System.out.println("False");
	//	} else if (result) {
	//		System.out.println("None of the above");
		
	
	// Question 8
	
		// a1= true,   b1 = false;
	boolean a1 = true, b1 = !a1;
	if(a1) {
		if (b1) {
			System.out.println("Monday");
		} else {
			System.out.println("Tuesday"); // the correct answer
		}
	} else {
		if (a1) {
			System.out.println("Thursday");
		} else {
			System.out.println("Friday");
		}
	}
		
		
		// Question 9
			int number = 10;
			//   9
			if(--number > 10) {
				System.out.println("Hello Prime " + number);
				//      9    ==  9   = true
			} else if (number == 9) {
				System.out.println("Hello, World " + number);
		
		
		// Question 10 
					boolean x = true; // true
					boolean y = !x == false; // true
					boolean z = y;           // true
					
					
			if (x)	 {
				System.out.println("Hello, everyone");
			} if (y) {
				System.out.println("Today is great day!");
				if (z) {
					System.out.println("Nice work, everyone!");
				}
			}
		
		
		
		}
	}

}
