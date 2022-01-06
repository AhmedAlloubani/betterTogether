package bunny;
//ask Q 19 (Summary Qs)



//ask about this Q:
public class Practice_2 {
	int count;
	
	public  Practice_2() {
		count =4;
	}
	
	
	public void Practic_2() {
		count =4;
	}
		public static void main(String[] args) {
			
			Practice_2 s = new Practice_2();
			
			
			System.out.println(s.count);
			
			double b = 6;
			double y1= 4;
			double x1 = 3 + 2 * --y1; // from right to left (decrement first and then muliply by 2 then add 3)
			System.out.println(x1); // 9.0
			System.out.println(y1);
			
			
			double t = 33.1;
			//float g = 2.1; // this will not compile because we can't convert float to double 
			//we should  post-fix it with f ( float g = 2.1f). 
			
		//	int R = !5;               // can't apply a logical negation to a numeric expression.
		//	boolean bool = -true;     // can't apply a negation operator to a boolean.
		// boolean bool2 = !0;         same thing will not compile.and you can't assign an int value to a boolean.
			
			int x = 3;
			int y = ++x * 5 / x-- + --x; // 4 * 5 / 4 + 2 = 20/4 + 2 = 5 + 2 = 7.
			//      4 * 5 / 4 + 2 = 7      
			System.out.println(y);
			//long L = 666666666666; // out of range because it considers it as int so you shot post-fix it with L
		
	   // Casting:
		int v = (int)1.0; //converting floating point number to integral value.
		short g = (short)888888; //Overflow occurs here: Overflow: when a number is so large 
		                         //that it will no longer fit within the data type. 
		System.out.println(v);
		System.out.println(g);
		
		//Example about Overflow:
		System.out.println(2147483647+1); // Overflow occurs here -> the given number is the maximum value 
		                                  // an int can contain, so if we add 1 to it, it will cause it to  wrap 
										  // to the next negative number -> The output = -2147483648
		
		//Important example:
		short a = 10;
		short e = 3;
	//	short z = a * e; // this line will not compile because in arithmetic operations, Java will automatically 
		                //promote short to int, so you can't convert from int to short (as you're trying to convert 
						//a larger data type into a smaller data type.
		short z = (short) (a * e); // You can do this instead to override it if you need the result to be short.
		
		//Important example:
		long r = 10;
		int f = 5;
	//	f = f * r; //will not compile because it can't convert from long to int  
		f = (int) (f * r); // you can solve this by explicit casting. 
		f *= r; // or you can use a compound operator which will cast f to a long value and  
				// apply the multiplication of two long values and then cast the result as int.
		
		//Example:
		long dogs = 6;
		long cats = 5;
		cats = (dogs = 3); // assignment operator does two things here, it sets the value of variable dogs 
						   // to be 3 and returns a value of the assignment which is also 3.
		System.out.println(dogs);
		System.out.println(cats);
		
		
	//	boolean bo = true || (w > 4); //short circuit operators: The right-hand operator may never be evaluated
									  //if the left-hand operator can determine the final result.			
		//System.out.println(bo);
		
		//Another Example:
		int n = 6;
		boolean q = (n >= 6) || (++n >= 6); //No need to evaluate the right-hand operator because the left-hand
		System.out.println(q);              //already determine the value. 							
		System.out.println(n); //so the output of the right-hand operator will be 6 because it's never 
		//reached out. It will not be incremented. 
		
		//Example:
		int num = 5;
		double num1 = 5.0;
		System.out.println(num == num1); //int is promoted to the larger data type and floating point
										 //so the result will be true (5.0 == 5.0).
		
		//Comparison
		boolean boool = false;
		boolean boool2 = (boool = true); //tricky because this is an assignment operator not comparison
		System.out.println(boool2); // the output will be true 
		

		int hoursOfDay = 11;
		int morningGreetingCount = 1;
		
		if(hoursOfDay < 15) {
			System.out.println("Good Afternoon");
			} else if(hoursOfDay < 11) {
			System.out.println("Good Morning"); // UNREACHABLE CODE because if the the first (if) is executed
												//no need to execute the second one (if the value is less than 
												//11 then it must be less than 15 too which match the first condition 
			} else {
			System.out.println("Good Evening");
			}
		
		boolean price = false;
		
		if (price) {
			System.out.println("hi");
		} else {
			System.out.println("bye");
		}
		
		int number = 20;
		
		if (number == 5) {
			System.out.println(number);
		} else if (number == 6) {
			System.out.println("yes");
		} else if (number == 0){
			System.out.println("no");
		} else {
			System.out.println("wi");
		}
		
		
		//Ternary
		int hala1 = 10;
		int hala2 = (hala1 > 5)? (hala1 * 2) : (hala1  * 3);//Parenthesis around ternary are helpful
															// but not required 
		//Another example:
		System.out.println((hala1 > 5)? (hala1*2) : "Zebra"); // the second and third operands are not 
		//required to be from the same data type. Sysout statement doesn't care that the statements are 
		//completely different data type because it can convert both to String.
		
		//while this example: 
		//int Animal = (hala1 > 5)? (hala1 * 2) : "Zebra"; //will not compile because the compiler does know
		//that "Zebra" is from different data type and can't be converted into int.
		
		int o = 1;
		int u = 1;
		final int k = o < 10? o++ : u++; //k = 1
		System.out.println(o + "," + u); // 2 1
		System.out.println(k);// 1
		System.out.println(o); // 2
		
		int dayOfWeek = 5;
		switch(dayOfWeek) {
		case 0: 
			System.out.println("Sunday");
			
		default:
			System.out.println("Weekday");  //will jump to the default section then to the following block
											//until it finds break statement of finishes the structure
		case 6:
			System.out.println("Saturday");
			
		}
		
		int roomInBelly = 5;
		int bitesOfCheese = 5;
		
		while (roomInBelly > 0 && bitesOfCheese > 0) {
			roomInBelly--;
			bitesOfCheese--;
			System.out.println(bitesOfCheese + "pieces of cheese left");
		}
		
		System.out.println("tttttttttttttttttttttttttttttttttttttttttttttt");
		int e1 = 0;
		
		do {
			e1++;            // Java will execute the statement first then 
		
		} while (false);     // check the conditional expression
		System.out.println(e1);
		
		
		
		
		
		
		//for loop
		for (int i = 0; i < 10; i++ ) {
			System.out.println(i + " ");
		}
		
	//	for (;;) {                                // creating infinite for loop
		//	System.out.println("hello world");
	//	}
		
		System.out.println("***********************************");
		int x2 = 0;
		for(long y2 = 0, z2 =4; x2 < 5 && y2 < 10; x2++, y2++) {
			System.out.print(y2 + " ");
		}
		  System.out.println("*******************************************");
	//	int x3 = 0;
	//	for(long y3 = 0, x3 = 4; x < 5 && y3 < 10; x++, y++) {  
	//		System.out.print(x3 + " "); // will not compile because we redeclare the same variable x3
	//	}                               //in the initialization section (duplicate Variable)
		
		// -> we can fix the previous example by:
		int x3 = 0;
		long y3= 10;
		
		for (y3 = 0, x3 = 4; x3 < 5 && y3 < 10; x3++, y3++) {  // now it will compile because it simply assigns a value 
			System.out.println(x3 + " ");                      //to it in the initialization block not declare it
		}
		
		//Another example:
		for(long y4 = 0, x4 = 4; x4 < 5 && y4 < 10; x4++, y4++) { System.out.print(y + " " );
		}
		System.out.print(x); // DOES NOT COMPILE because the variable is declared inside the for loop and have 
		//a limited scope inside the loop so using it outside the for loop block will not work.
		
		//Enhanced for loop (for-each loop)
		final String[] names = new String[3]; // the right hand must be an Array or Iterable object and left-
		names[0] = " Ahmed";                   // hand side has a matching type.
		names[1] = "Samir";
		names[2] = "John";
		

		
		
		for (String name : names) {
			System.out.print(name + ", ");
		}
		//Another example:
		String[] years = new String[3];  //it will generate nulls (3 nulls)
		for (String year : years) {
			System.out.println(year);
		}
		
		//Another example:
	//	String[] years1 = new String[3];  //it will not compile because the left-hand side doesn't define 
	//	for (int year1 : years1) {        //an instance of a string, so it doesn't match the right -hand side
	//				System.out.println(year1);
	//	}
		
		//first the inner loop repeats until the value of d is 4 then will be decremented to 3 and outputted
		     // then 0. Once it reaches 0, the outer loop will terminate. 
		
		//how to convert the for-exh loop to for loop
		for (int ir = 0; ir < names.length; ir++) {
			String name = names[ir];
			System.out.println(name + ", ");
		}
		
		//Another example 
		java.util.List<String> names1 = new java.util.ArrayList<String>();
		names1.add("Ruby");
		names1.add("Salma");
		names1.add("Adam");
		
		for (int i = 0 ; i < names1.size(); i++) {
			String name = names1.get(i);
		 if (i > 0) {
			 System.out.println(", ");
		 }
			System.out.println(name);
		}
	
		
		//Another example:
		int[] values = new int[3];
		
		values [0] = 10;
		values [1] = 5;
		values [2] = 15;
		
		for (int i = 1; i < values.length; i++) {
			System.out.println(values[i] - values[i-1]);
		}
		
		System.out.println("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
		//Nested Loops:
		int[][] myComplexArray = {{5,2,1,3},{3,9,8,9},{5,7,12,7}};
		for (int[] mySimpleArray : myComplexArray) {
			for (int i = 0; i < mySimpleArray.length; i++) {
				System.out.println(mySimpleArray[i] + "\t");
			}
			System.out.println();
		}
	
		
		  
		//Another Example:
		int d = 20;
		
		while (d > 0) {  
			do {
				
				d-=2;      
			} while (d > 5);
			d--;
			System.out.println(d+ "\t"); // 17/14/11/8/5 
			
		}
		
		
		
		//Another Example:
		//break PARENT_LOOP; exit the entire structure of the loop
		//break; will exit inner loop when the condition is met.
		//no break; the code will search for the last value in the entire structure that has a matching value.
		int[][] list = {{1,13,5},{1,2,5},{2,7,2}}; 
		int searchValue = 2;
		int positionX = -1;
		int positionY = -1;
		PARENT_LOOP: for(int i=0; i<list.length; i++) { 
			for(int j=0; j<list[i].length; j++) {
				
			if(list[i][j]==searchValue) { 
			positionX = i;
			positionY = j;
			break PARENT_LOOP; //will exit the entire PARENT_LOOP structure
				} 
			}
		}
		if(positionX==-1 || positionY==-1) {
			System.out.println("Value "+searchValue+" not found"); } else {
			System.out.println("Value "+searchValue+" found at: " + "("+positionX+","+positionY+")");
			} 
		
		int [][] complex = {{3456},{8,8,8,8},{7,8,0,3},{7,3,2,1}};
		
		for (int i = 0; i < complex.length; i++) {
			for (int j = 0; j < complex[i].length; j++ ) {
				
			}
		}

		
		
		//continue Statement Example: Ask about this
		FIRST_CHAR_LOOP: for (int a4 = 1; a4 <= 4; a4++) { 
			for (char x5 = 'a'; x5 <= 'c'; x5++) {
			if (a4 == 2 || x5 == 'b')
				continue FIRST_CHAR_LOOP; //whenever the value is 2 or 'b', the parent loop gains control
										  //if there is no optional label, the inner loop will gain control	
			System.out.println(" " + a + x + " "); //1a,3a,4a
			}
			
		}
		
		//Summary Questions
		//Ask about this 
		int x6 = 0;
		while(x6++ < 10) {
			
		}
		System.out.println(x6);
		String message = x6 > 10 ? "Greater than" : "Less Than";
		System.out.println(message+", "+x6);
		
		//Ask about this // list used to add, remove elements, change the length (more flexible)
		java.util.List<Integer> list1 = new java.util.ArrayList<Integer>();
		System.out.println("arratlist elements "+list1 );
		System.out.println("arratlist size "+list1.size() );
		//created an empty list {}
		list1.add(14);
		list1.add(10);
		list1.add(100);
		System.out.println("arratlist elements "+list1 );
		System.out.println("arratlist size "+list1.size() );
		
		for(int x7 : list1) { // x7= 14 , x7 = 10 , x7 =100
		System.out.print(x7 + ", ");
		if(x7 == 10) {
		break; 
		}
		}
		System.out.println();
		
		//ask about this
		int x8 = 4;
		System.out.println(x8 > 2 ?( x8 < 4 ? 10 : 8) : 7); //8
		
		boolean van =  true, van1 =true;
		int raf = 20;
		
				//true         false
		 van = (raf != 10) ^ (van1 = false); //true
		 System.out.println(van + ", " +raf+", " + van1); //true, 20, false (the value of van1 changed to false
		                                                 //because we assigned a new value to it (van1 = false)
		
		 //Ask about this:
	 for (int i = 0; i < 10 ; ) { // it keeps assigns the old value which is always 0
			i= ++i;                  //infinite loop and doesn't terminate 
		
		 System.out.println("Hala Hala");
	 }
		 
		 byte aq = 40, bq = 50;
		 byte sum = (byte) (aq + bq);
		 System.out.println(sum);
		 
		 
		int number1 = 50, number2 = 75;
		boolean b1 = number1 >= number2;
		if (b1 = true) {            //the result here will be true because we assigned a new value to b1
			                        // we used (=) but if we used (==), it will be false.
			System.out.println("Success");
		} else {
			System.out.println("Fail");
		}
		 
		//Ask about this
		//int cat = 1, dog = 15;
		//while (x < 10) {
		//	dog--;
		//	cat++;
		//	System.out.println(x+", "+y);
		//}
		
		
		//Ask about this:	
//		do {
//			  int  hat = 1;
//			
//			System.out.println(hat++ + " ");		
//		} while (hat <= 10) ;
			
		//Ask about this
			boolean keepGoing = true;
			int result1 = 15, ii = 10;
			
			do {
				ii--;
				if (ii == 8) keepGoing = false;
				result1 -= 2;
			}while (keepGoing) ;
			System.out.println(result1);
			
			
			//ask
			int count5 = 0;
			ROW_LOOP: for(int row = 1; row <=3; row++)
			for(int col = 1; col <=2 ; col++) {
			if(row * col % 2 == 0) 
				continue ROW_LOOP; 
			count5++;  //1 first loop
			           //then will be incremented in the second time 
			}
			
			System.out.println(count5); //2
			
			
			int flowers = 10;
			int baskets = 4;
			
			if (baskets > flowers ) {
				System.out.println("no space");
			} else if (flowers >= baskets) {
				System.out.print("space available ");
				flowers++;
				
			}else {
				System.out.println("invalid number");
				
				
			}
			System.out.println(flowers);
			
			int m = 9, j = 1, x10 = 0; 
			while(m > j) {
				m--;
				j += 2;
				x10 += m + j; //x10 = x10 + m + j
							  //First loop x10 = 11
							  //Second x10 loop = 23
				              //Third x10 loop = 36
				
				} 
			System.out.println(x10);
			

			final char a20 = 'A', d20 = 'D';
			char grade = 'B';
			
			switch(grade) { 
			case a20:
			case 'B': System.out.print("great"); 
			case 'C': System.out.print("good");  break;
			case d20:
			case 'F': System.out.print("not good");
			
			//the output will be greatgood. it will print great since it's the first matching branch and then 
			//goes to the next following branch, prints it and then break.
			}
			
			
			
			
			
		}
		 
		}
		
		                           
		
		
		
		
		
		
		
	


