package bunny;

import java.util.ArrayList;
import static java.util.Collections.*;

public class Practice_5  {
	
	//once you changed a static variable, it will changed all the instances of the class automatically
	//BUT when you change an instance variable, it will change JUST one instance of the class
	
	//private String color = "blue";
	public  String name = "Ahmed";
	public static String myName ;
	public String str2 = "hala";
	public static String str = "quack";
	public static boolean bool;
	
	
	
	//private static final String bench; //final field must be initialized at declaration
	//you can do like this instead
	private static final String bench;
	private static final String Ahmed =  "Ahmed";
	
	static {
		bench = "left";
	}
	
	
	
//  public static String average = str2 + str;  //won't compile because a static variable can't call a reference variable
	public String str3 = str2 + str; // a reference variable can call a static variable 
	
	//Methods and Encapsulation 
	private int cats () {
		return 4 + 6;
	}
	
	
	public void meth(ArrayList<String> list) {
		sort(list);
	}
	
	
	
	int integerable() {
		int temp = 9;
		return temp;
		
	}
	
	//ASK
	static long longable () {
		long c =  85888888888888888L;
		return  c;
	}
	
	public static void walk(int start, int... nums) {
		System.out.println(nums.length);
		
	}
	
	public static void run(int...nums) {
		System.out.println(nums[1]);
	}
	
	public static void main(String[] args) {
		System.out.println(longable());
		int dogs = 17;
		Practice_5 practic = new Practice_5();
		Practice_5 practic2 = new Practice_5();
		System.out.println("*********");
		System.out.println(practic.name);
		practic.speak("jack");
		System.out.println(practic.name);
		System.out.println(practic2.name);
		practic2.speak("3zrayeel");
		System.out.println(practic2.name);
		System.out.println("*********");
		
		//Practice_5 t = new Practice_5("black");
		
		System.out.println(practic.cats());
		
		walk(1); //this means Java creates an array of lenght zero for nums
		walk(1,2); //Java converts this value to an array of length one
		walk(1,2,3); //one as a start and two more values, Java converts these two added values to 
		//an array of length two
		walk(1, new int[] {1,2}); //passes one as a start and an array of length two
		
		run(11, 22); // we call index one which is ->22 (it uses same as array indexing)
		
		//calling a static variabel(you just put the class name before it and you're done)
		System.out.println(Practice_5.str);
		//and you can also call it using instance of the of object 
		System.out.println(practic.str);
		
		//there is only one static variable (str), we just changed from "Squash" to "WOW" to finally "Damn"
		Practice_5.str = "Squash";
		practic.str = "WOW";
		Practice_5 pr = new Practice_5();
		pr.str = "Damn";
		System.out.println(Practice_5.str);
		
		//Ask
		//calling an instance variable from an static method
		practic.str2 = "Right";
		practic.str="Ahmed";
		System.out.println(practic.str2);
		System.out.println(practic2.str2);
		System.out.println(practic.str);
		System.out.println(practic2.str);
		
		System.out.println(bool); //default value of the static variable from type boolean
		System.out.println(values);
		System.out.println(NUM_SECONDS_PER_HOUR);
		
		
		speak1("Sparky");
		System.out.println(myName);
		
		StringBuilder name = new StringBuilder();
		speak2(name);
		System.out.println(name); //Webby because both variables name and s point to the same StringBuilder so 
		//any changes made to the StringBuilder are available to both references.
		
		int a = 60;
		int b = 70;
		int temp = 0; //60
		
		temp = a; //60
		a = b; // 70
		b= temp;
		
		//Ask about how both compile When Java do one conversion only when calling the method kick()
		kick(4);
		kick(4L);
		
//		System.out.println(t.color);
		
		//premium
		//1 free book evry purchaes of 5 or more
		//2 free every purchase of 8 or more 
		//regular
		//1 with 7 or more
		//2 with 12 or more
		
		//freebooks the appropriate value -> isPremiumCustomer
		//nbooksPurchase - int
		

		//Boreeni Question
		boolean isPremium = false;
		int nbooks = 5;
		
		if (isPremium) {
			if (nbooks >= 5 && nbooks < 8)
				System.out.println("one");
			else if (nbooks >= 8)
				System.out.println("two");
//			else 
//				System.out.println("not eligible");
			
		   	
		} else {
			 if (nbooks >= 7 && nbooks < 12)
	   			System.out.println("one");
	   		else if (nbooks >= 12)
	   			System.out.println("two");
//	   		else 
//	   			System.out.println("you're not eligible");
		}
		
		System.out.println(practic.howMany(true, true, true));
		System.out.println(practic.howMany(false, new boolean[2]));
		
		
		length = 20;
		System.out.println(length);
		
		
		//belongs to Q16
		int value = 9;
		long result = square(value);
		System.out.println(value);
		
		//belongs to Q17 
		StringBuilder s1 = new StringBuilder("s1");
		StringBuilder s2 = new StringBuilder("s2");
		StringBuilder s3 = work(s1, s2);
		System.out.println("s1 =" + s1);
		System.out.println("s2 =" + s2);
		System.out.println("s3 =" + s3);
		
			 }
			 
		 
			
		
		
		
	//static variables 
	//Ask (how come values is a reference variable)
	private static final ArrayList<String> values = new ArrayList<>();
	{
		values.add("ss"); //values is a reference variable so it compiles fine. All what's important 
		//is that we don't reassign the final values to point to a different object
		//Example
		ArrayList<String> letter = new ArrayList<>();
	//	values = letter; //won't compile because it's final so we can't assign it to another object
		
		
	}
	
	//Static Initialization
	
	private static final int NUM_SECONDS_PER_HOUR;
	private static final int NUM_OF_HOURS = 4;
	
	static {  //-> Static initializer (The static initializer runs when the class is first used. 
		     //The statements in it run and assign any static variables as needed)
		int numSecondsPerMinute = 60;
		int numMinutesPerHour = 60;
		NUM_SECONDS_PER_HOUR = numSecondsPerMinute * numMinutesPerHour;
		
		//if a final static variable was declared at the beginning, it must be also initialized
		//inside the static method, otherwise, it won't compile
		
		//a final static variable if declared and assigned a value, it can't be reassigned again 
		//even if we assign the same value(because it's constant -> final)
		//EXAMPLE:
		//NUM_OF_HOURS = 4; //it can't be assigned again because it's final
		
		//Important:
		//You can use constructors instead of static and instance initializers because it's easy to read
	}
	
	//Ask how to print it in the main method
	public  void speak(String name) {
		this.name = name;
		
	}
	
	public  static void speak1(String myName) {
		Practice_5.myName = myName;
		
	}
	
	public static void speak2(StringBuilder s) {
		s.append("Webby");
	}
	
	//Overloading:
	
	public void fly (int numMiles) {
		
	}
	
//	public int fly (int numMiles)  {  won't compile because it's a duplicate method (overloading is not happening here)
//		                              same parameter inside the method
//	}                                  the only difference is the return type
	
	//Another example
	public void fly1(int numMiles) {
		
	}
	
//	public static void fly1(int numMiles) { duplicate method again with same parameters 
//		the only difference is that the first one is instance method and the second is static
//	}

	//Another example:
	public void fly (int[] lengths) {
		
	}
	
//	public void fly(int... lengths ) { it won't compile because we have another duplicate method here, since 
	//Java treats Varargs as if they were Arrays so here we have same parameters 
//		
//	}
	
	
	//The difference between Arrays and varargs that when you call them :
	//Arrays ->  for example: fly(new int[] {1,2,3});
	//Varargs -> you can call the varargs with stand-alone parameter -> example:
	//						  fly(1,2,3);

//Only one conversion Java will do 
	public static void kick(long l) {
		
	}
	public static void kick(long... l) {
		
	}

	//Constructors
	
//	public Practice_5(String color) {
//		this.color = color;  //we assign the parameter color to the instance variable color
//	}
	
	static {
		{add(2);}
	}
	
	static void add(int num) {
		System.out.println(num + " ");
	}
	
	//Chapter Questions: 
	//Q3: 
	public int methodD() {
		return 9;
	}
	
	//Q4:
	//public void moreA (String... values, int... nums) { Varargs must be the last parameter
		
	//}
	
	public void moreE(String[] values, int... nums ) {
		
	}
	
	//Q5   
	public int howMany(boolean b1, boolean... b2) {
		return b2.length;
		
	}
	
	//Q10 and Q12 ASK Q14
	
	public static int length= 30;
	
	//Q15 very important 
	//when call the method, Java try to look for the exact match, if did'nt find it, it will promote it to 
	//something close. Example : when call a method like this: public void print(float x) sysout("float")
	//and we have another method like this: public void print (Object o) sysout("Object")
	//main method-> test.print(6.789); -> the output will be -> Object. it will call the Object method because 
	//6.789 is double so double -> Double -> Object.
	
	
	//Q16
	public static long square(int x) {
		long y = x * (long) x;
		x= -1;
		return y;
	}
	
	//Q17
	public static StringBuilder work (StringBuilder a, StringBuilder b) {
		a = new StringBuilder("a");
		b.append("b");
		return a;
	}
	
	

}
