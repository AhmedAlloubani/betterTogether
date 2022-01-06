package bunny;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Practice_3 {
	
	int a4 = 1;
	int b4 = 3;
	
	public int sumDouble (int a4, int b4) {
		
		
		if (a4 != b4) {
			return a4 + b4;
		} else {
			return (a4+b4) * 2;
		}
	}
	

	public static void main(String[] args) {
		
		
		
//		Scanner input = new Scanner(System.in);
//		System.out.println("What's your name?");
//		String name = input.nextLine();
//		String answer = "pizza";
//		System.out.println("Your name is " + name);
//		
//		
//		Scanner input2 = new Scanner(System.in);
//		
//		System.out.println("Enter Your Age");
//		int age = input.nextInt();
//		input.nextLine();
//		
//		
//		
//		
//		
//		
//		
//		
//		if (age <= 18) {
//			System.out.println("WhAT'S YOUR FAV FOOD?");
//		input.nextLine();
//			
//						//pizza 
//					if (input.equals(answer))	{
//						
//						System.out.println("mine too");// mine too
//					} else {
//						System.out.println("not mine");
//					}
//												// not mine
//		} else if (age > 18) { // your an adult
//			System.out.println("University");
//		} else if (age > 22) { // 
//			System.out.println("Work");
//		} else if (age > 60) {
//			System.out.println("Retired");
//		}
		
		
		
		//String Concatenation:
		
		String s = "1"; // currently holds "1"
		s += "2";       // currently holds "12"
		s += 3;         // currently holds "123"
		System.out.println(s); //123
		
		String s1 = "1";
		String s2 = s1.concat("2");
		s2.concat("3"); //this will print 12 because String class is immutable.
		System.out.println(s2);
		//BUT if we do like this:
		s2 = s2.concat("3");
		System.out.println(s2); //it will output 123 
		
		//=================================================
		//String Methods:
		//	Length();
		//charAt(); //The method signature -> char charAt(int index)
		//indexOf();
		//subString(); int subString(int beginIndex) 
		//			   int subString(int beginIndex, int endIndex)
		//toLowerCase() toUpperCase(); String toLowerCase(String str)
		//							   String toUpperCase(String str)
		//startsWith()  endsWith();
		//contains(); boolean contains(String str)
		//replace(); String replace(char oldChar, char newChar)
		//           String replace(charSequence oldChar, charSequence newChar)
		//trim():
		String str = "Stadiumt";
		
		System.out.println(str.length()); //8
		System.out.println(str.charAt(0));// S
		System.out.println(str.indexOf('t', 1)); //1
		System.out.println(str.indexOf("adium", 2)); //2
		System.out.println(str.substring(3));//diumt
		System.out.println(str.substring(str.indexOf('u')));//umt
		System.out.println(str.substring(0,4));//Stad note that index 4 is not included
		System.out.println(str.substring(0,8));//Stadiumt
		System.out.println(str.substring(3,3));//empty String
		System.out.println(str.toLowerCase());// stadiumt
		System.out.println(str.toUpperCase());// STADIUMT
		System.out.println("AHMED1432".toLowerCase());//ahmed1432
		System.out.println("abc".equals("ABC"));//false
		System.out.println("ABC".equalsIgnoreCase("abc"));//true
		System.out.println("abc".startsWith("a"));//true
		System.out.println("ABC".startsWith("a"));//false
		System.out.println("ABC".endsWith("C"));//true
		System.out.println("abc".endsWith("abc"));//true
		System.out.println(str.contains("Sta"));//true
		System.out.println("ABDFGR".replace("AB", "ab"));//abDFGR
		System.out.println("\t abc\n".trim());//abc
		System.out.println("hala     ".trim());//hala 
		//=================================================
		
		//Method Chaining
		String start = "AniMal   ";
		String trimmed = start.trim(); //AniMal
		String lowerCase = trimmed.toLowerCase(); //animal
		String result = lowerCase.replace("an", "An");
		System.out.println(result);//Animal
		
		//In the exam you will see like this: Four String objects
		//start by evaluating from left to right
		String result2 = "AniMal   ".trim().toLowerCase().replace("an", "An");
		System.out.println(result2);
		
		//Another Example:
		String a = "abc";
		String b = a.toUpperCase(); //"ABC"
		b = b.replace("B", "2").replace('C', '3');//A23
		System.out.println("a = " + a + " b = " + b);
		//================================================
		
		StringBuilder alpha = new StringBuilder(); //a new StringBuilder object is instantiated
		
		for (char current = 'a'; current <= 'z' ; current++) {
			alpha.append(current); // .append() adds a character to the StringBuilder object each time through 
			//the for loop and appends the value of current to the end of alpha. 
			System.out.println(alpha);
		}	
			//Chaining StringBuilder class
			
			StringBuilder sb = new StringBuilder("start");
			sb.append("+middle");
			System.out.println(sb);
			StringBuilder same = sb.append("+end");
			System.out.println(same);
			System.out.println(sb); //(sb) points to the same object that (same) points to, SO they would 
									//print out the same value
			
			//Another Example:
			StringBuilder a1 = new StringBuilder("abc");
			StringBuilder b1 = a1.append("de");
			b1 = b1.append("f").append("g");
			System.out.println("a1= " + a1 + " b1=" + b1);
			//both will output the same value "abcdefg" because we created the StringBuilder just one time. a1 and 
			//b1 points to the same object, So the assignment to b1 does nothing. b1 is already points to the 
			//same StringBuilder. 
			
			//Creating a StringBuilder:
			StringBuilder sb1 = new StringBuilder(); //creating a StringBuilder with an empty sequence of characters 
			StringBuilder sb2 = new StringBuilder("animal");//creating a StringBuilder containing a specific value
			StringBuilder sb3 = new StringBuilder(10);//how big the eventual value will be. reserve a certain number 
			//of slots for character. 
			
			//Example
			StringBuilder sub = new StringBuilder("animals");
			String sub1 = sub.substring(sub.indexOf("a"), sub.indexOf("al")); 
			int len = sub.length();//7
			char ch = sub.charAt(6);//s
			System.out.println(sub1 + " " + len + " " + ch); //anim 7 s
			
			//append(); it adds a parameter to the StringBuilder and returnsa reference to the current 
			           //StringBuilder
			StringBuilder c = new StringBuilder("animal").append(1).append('c');
			System.out.println(c);
			
			//insert(); insert a character at a requested index
			StringBuilder f = new StringBuilder("animals");
			f.insert(7, "-");//animals-
			f.insert(0, "-");//-animals-
			f.insert(4, "-");//-ani-mals- 
			f.insert(8, "-");//-ani-mal-s-
			System.out.println(f);//be aware that when we add and remove, indexes will be changed 
			
			//delete(int start, int end) and deleteCharAt(int index):
			StringBuilder stt = new StringBuilder("abcdef");
			stt.delete(1, 3);//adef 
			//stt.deleteCharAt(5);//throws an exception
			System.out.println(stt);
			
			//reverse();
			StringBuilder FG = new StringBuilder("ABC");
			FG.reverse();
			System.out.println(FG);//CBA
			
			//toString();
		//	String toString();
		//	String v = FG.toString();
			//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
			
			String t2 = "Hello World";
			String t1 = "Hello World";
			System.out.println(t1 == t2);//true (both point to the same memory location)
			
			String t3 = "Hello World";
			String t4 = "Hello World".trim(); 
			System.out.println(t3 == t4);//true 
			
			String t5 = "Hello World";
			String t6 = " Hello World".trim();
			System.out.println(t5 == t6);//false because a new object is created (one is computed at the runtime 
			//since it's is not the same at the compile-time, a new object is created
			System.out.println(t5.equals(t6));//true because we used logical equality 
			
		//	char letter[]  = {1, 4, 6, 7,7 ,7 };
			
	boolean bSmile = true;
	boolean aSmile = false;
	
	if (bSmile && aSmile)  {
		System.out.println(true);
	} else if (!bSmile && !aSmile) {
		System.out.println(true);
	} else {
		System.out.println(false);
	}
	
	//System.out.println(/* 5 + 3*/ - 9 + 6 /*8*//2) ; //*+4*/ - 10
			
		
	char[] letters = {'t', 'g', 'h', 's'};
	
	int[] numbers = new int[3]; //int specifies the type of array with size of 3. the brakets tell you
	//that it's an array. When you do this, you set all the elements to the default value. for example int default
	//value is 0. 
	
	//Or you can create an array like this 
	int[] numbers2 = new int[] {1,2,4,6,7,7};
	int[] numbers3 = {42,65,86,20}; //Java calls this an anonymous array because you don't specify
	//the type and size. 
	
	//you can do this to create an array:
	// int[] numbers;
	//OR this:
	// int numbers[];
	
	int[] ids, types; //creating two arrays from type int
	int ids1[], types1; //creating ids1 as an array of type int. And types1 which is a regular integer(NOT an array)
	//Important: int is a primitive WHILE int[] is an object.
	
	System.out.println("Looke hhhhhhhhhhhhhhhhhhh");
	String[] bugs = {"crickets", "beetle", "ladybug"};
	String[] alias = bugs;
	System.out.println(bugs.equals(alias)); //true because in equals(), we compare if the references are 
	//equal NOT what inside the array itself (the elements of the array). 
	System.out.println(bugs.toString());//[L means it's an array
	                                    //Java.Lang.String is the reference type
										//@4dc63996 is the hash code
	
	//Ask about this
	int[] numbers0 = new int[10];
	
	for (int i = 0; i < numbers0.length; i++) {
		numbers0[i] = i + 5;
		
		
		//numbers0[1] = 1 + 5;

		//{5,6,7,8,0......}
		System.out.println(i); //will loop the output to print the value inside. 
		//BUT if we print the array variable Sysout(numbers0), it will give us a hash code.
	}
	
	
	//in the for loop, if we have an array [10], we should use < variable.length() because it will match the index 
	//number, SO <= variable.length() will not work
	
	//Example
	int[] nums = new int[10];
	nums[9] = 5;
	System.out.println(nums[8]);
	
	//====================================
	
	//Arrays Sorting: from Array class :
	//java.util.* 
	//OR java.util.Arrays
	
	int[] pens = {6, 9, 1};
	Arrays.sort(pens);
	for (int i = 0 ; i < pens.length ; i++) {
		System.out.print(pens[i] + " " + '\t');
	}
	
	//Another Example;
	String[] strings = {"10", "9", "100"};
	Arrays.sort(strings);
	for (String string : strings) {
		System.out.println(string + " "); //in Strings, it will sort alphabetically so 1 comes before 9
		//And uppercase sort sorts before lowercase. 
	}
	
	//Arrays Searching:
	int[] numbs = {2,4,6,8};
	System.out.println(Arrays.binarySearch(numbs, 2));// 0   it will search the index
	System.out.println(Arrays.binarySearch(numbs, 6)); //2 
	System.out.println(Arrays.binarySearch(numbs, 1)); // -1 because the element is not found 
	System.out.println(Arrays.binarySearch(numbs, 8)); // 3
	
	//Multidimensional Arrays:
	
	//this is how we create and declare a multidimensional array
	String[][] rectangle = new String[3][4]; //an array of 3 elements refers to an array of 4 elements
	
	//asymmetric multidimensional array
	int[][] differentSize = {{1,4},{3},{9,8,7}};
	
	//another way to create asymmetric
	int [][] differentSiz = new int [4][];
	differentSiz[0] = new int [5]; //Array index 0 contains 5 elements 
	differentSiz[1] = new int [3]; //Array index 1 contains 3 elements
	
	
	int[][] towd = new int [3][2];  //{{1,2},{1,2},{1,2}}
	for (int i = 0 ; i < towd.length ; i ++) {
		for (int j = 0 ; j < towd[i].length ; j++)
			System.out.print(towd[i][j] + " "); //prints element
	System.out.println(); //time for a new row
	}
	
	//Or use enhanced for loop
//	for (int[] inner : twod) {
	//	for (int num : inner)
	//		System.out.println(num + " ");
//	}
	
	
	//Creating ArrayList
	
	ArrayList list1 = new ArrayList(); //we didn't specify anything in <> therefore the type is object 
									   //which includes everything except primitives. 
	ArrayList list2 = new ArrayList(10);
	ArrayList list3 = new ArrayList(list2);
	
	//generics: which allows you to specify the type of class that the ArrayList will contain 
	ArrayList<String> list4 = new ArrayList<String>();
	ArrayList<String> list5 = new ArrayList<>();
	
	//add()
	list1.add("hawk"); //hawk -> it stores the String in the no longer empty ArrayList
	list1.add(Boolean.TRUE); //true
	System.out.println(list1); // [hawk, true]
	
	
	list4.add("lion");
	//list4.add(Boolean.TRUE); doesn't compile because just Strings allowed in here(we already specified
	//the class which is String -> ArrayList<String> list = new ArrayList<String>();)
	
	List<String> birds = new ArrayList<>();
	birds.add("hawk");//[hawk]
	birds.add(1, "robin");//[hawk, robin]
	birds.add(0, "blue jay");//[blue jay, hawk, robin]
	birds.add(1, "cardinal");//[blue jay, cardinal, hawk, robin]
	System.out.println(birds);//[blue jay, cardinal, hawk, robin]
	
	//remove
	System.out.println(birds.remove("hawk")); //true
	System.out.println(birds.remove("lion")); //false because no such element was found
	System.out.println(birds.remove(0));//blue jay
	
	//isEmpty and size()
	
	System.out.println(birds.isEmpty()); //false
	System.out.println(birds.size()); // 2
	
	//clear(); discard all the elements of the ArrayList
	//contains(); checks whether a certain value is in the ArrayList
	
	//.equals(); compare two lists
	
	List<String> one = new ArrayList<>();
	List<String> two = new ArrayList<>();
	System.out.println(one.equals(two)); //true because they have the same size(the two ArrayList objects
	//are equal. 
	
	//===================================================
	//Wrapper Classes:
	
	int primitive = Integer.parseInt("123"); //converts a String to an int primitive
	Integer warpper = Integer.valueOf("123"); //converts a String to Integer wrapper class
	System.out.println(primitive);
	//Important: letters and dots are not valid for Integer value and it will throw an exception:
	//NumberFormatException
	//Example:
	//int bad1 = Integer.parseInt("a"); throws an exception
	
	//char doesn't participate in the parse/valueOf methods, because String is made up of characters, And 
	//you can simply use charAt()
	
	
	//Autoboxing:
	
	List<Double> wieghts = new ArrayList<>();
	wieghts.add(50.0); // [50.0] autoboxes the double primitive into Double object
	double first = wieghts.get(0); // 50.0  -> retrieves the Double and unboxes it to double primitive
	
	
	List<Integer> heights = new ArrayList<>();
	heights.add(null); //we add null to the list -> it is legal 
	//int first2 = heights.get(0); // NullPointerException , we can't unboxes null to an int primitive. 
	
	//Important example:
	List<Integer> number = new ArrayList<>();
	number.add(1);//[1]
	number.add(2); //[1,2]
	number.remove(1);
	System.out.println(number);//it will output 1 because we call the method remove which will remove index 
	//1 which is 2 so we will get the output [1]. Java calls the remove method rather than autoboxing.
	//if we want to remove 2, we can force wrapper class by doing this:
	//number.remove(new Integer(2));
	
	//======================================================
	//Converting between array and List:
	
	//From List to array -> toArray()
	List<String> list6 = new ArrayList<>();
	list6.add("hawk");
	list6.add("robin");
	String[] stringArray = list6.toArray(new String[0]); 
	System.out.println(stringArray.length);//2
	
	//From array to List -> Arrays.asList()
	String[] array = {"hawk", "robin"}; //{hawk, robin}
	List<String> list7 = Arrays.asList(array); //returns fixed size list
	System.out.println(list7.size()); //2
	list7.set(1, "bird"); // {hawk, bird} it just added bird in the robin position and took off robin from
	//the array because it is fixed size list and can't have 3 elements
	//set() is acceptable here because it replaces values so it doesn't change the size such as add() or remove()
	//list7.add("bird"); //throws an exception (UnsupportedOperation Exception)
	//list7.remove(1); same exception 
	System.out.println(list7);
	
	//Ask about Varargs 
	
	//Sorting ArrayList: Collections.sort()
	
	ArrayList<Integer> games = new ArrayList<>();
	games.add(99);
	games.add(81);
	games.add(50);
	Collections.sort(games);
	System.out.println(games);
	
	//==================================================
	
	//Working with Dates and Times: needs an import -> java.time.*;
	//Each of the three classes has a static method called now() that gives the current date and time
	System.out.println(LocalDate.now());
	System.out.println(LocalTime.now()); //time will display hours, minutes, seconds and nanoseconds 
	System.out.println(LocalDateTime.now());
	
	//method signature:
	//public static LocalDate.of(int year, int month, int dayOfMonth);
	//public static LocalDate.of(int year, Month month, int dayOfMonth);
	LocalDate date = LocalDate.of(2015, Month.JANUARY, 02);
	LocalDate date1 = LocalDate.of(2015, 01, 02);
	
	//method signature
	//public static LocalTime.of(int hours, int minutes, int seconds, int nanoseconds)
	LocalTime time = LocalTime.of(6, 15); // hour and minutes 
	LocalTime time1 = LocalTime.of(6, 15, 30); // + seconds
	LocalTime time2 = LocalTime.of(6, 15, 30, 200); // + nanoseconds 
	
	//method signature
	//public static LocalDateTime.of(int year, int month, int dayOfMonth, int hour, int minutes, int seconds,
	//int nanoseconds);
	LocalDateTime dateTime = LocalDateTime.of(2015, Month.JANUARY, 20, 6, 15, 30);
	LocalDateTime datetime1 = LocalDateTime.of(date1, time1);
	
	//LocalDate d = new LocalDate(); //it doesn't compile because date and time have private constructors
	//to force you to use the static methods. 
	

    //LocalDate.of(2015, Month.JANUARY, 32) // throws DateTimeException 
	//because you put invalid number ->32
	
	LocalDate date0 = LocalDate.of(2015, Month.JANUARY, 01);
	System.out.println(date0); // 2015-01-01
	date0 = date0.plusDays(2);
	System.out.println(date0); // 2015-01-03
	date0 = date0.plusWeeks(5);
	System.out.println(date0); // 2015-02-07
	date0 = date0.plusMonths(2);
	System.out.println(date0); //2015-04-07
	date0 = date0.plusYears(3);
	System.out.println(date0); //2018-04-07
	

	
	LocalDate date6 = LocalDate.of(2020, Month.FEBRUARY, 20);
	LocalTime time6 = LocalTime.of(5, 15);
	LocalDateTime dati = LocalDateTime.of(date6, time6);
	System.out.println(dati);
	dati = dati.minusMonths(1); 
	System.out.println(dati); // 2020-01-20T05: 15
	dati = dati.minusDays(3);
	System.out.println(dati); //2020-01-17T05:15
	dati = dati.minusHours(2);
	System.out.println(dati); //2020-01-17T03:15
	dati = dati.minusMinutes(5);
	System.out.println(dati); //2020-01-17T03:10
	dati = dati.minusSeconds(30);
	System.out.println(dati);//2020-01-17T03:9:30 Java smart enough to show the seconds when needed
	
	//Ask about chaining if we commented the upper code
	//LocalDateTime dati = LocalDateTime.of(date6, time6.minusDays(1).minusHours(2).minusSeconds(20));
	
	LocalDate datee = LocalDate.of(2020, Month.JANUARY, 20); 
	datee.plusDays(10);
	System.out.println(datee); //it will print the same date because adding 10 is useless.It is immutable 
	//we should do like this instead
	//datee = datee.plusDays(10);
	
	
	//LocalDate Start = LocalDate.of(2020, Month.JANUARY, 01);
	//LocalDate End = LocalDate.of(2020, Month.APRIL, 01);
	//performAnimalEnrichment(Start, End);
	
	
	
	
	
	}
	
	
	

}
