package bunny;

import java.util.function.*;

public class Qst22 {
	
	//Q26
	int age;
	
	//Q23
	String value = "t";
	{value+= "a";}
	{value+= "c";}
	
	public Qst22() {
		value+= "b";
	}
	
	public Qst22(String s) {
		value+= s;
	}
	
	//ASK
	static String result = "";
	
	{result+= "c";}
	
	static {
		result+= "u";
		result+= "r";
	}
	
	public static void main(String[] args) {
		
		System.out.print(result + " ");
		System.out.print(result + " ");
		
		new Qst22();
		new Qst22();
		new Qst22();
		
		System.out.println(result + " ");
		
		Qst22 order = new Qst22("f");
		order = new Qst22(); //we created another object here -> is going call the default nor-arg constructor
		System.out.println(order.value);
		
		Qst22 panda = new Qst22();
		
		panda.age =1;
		check(order, o -> panda.age < 5);
		
	
		
	}//Q26
	private static void check(Qst22 Qs, Predicate<Qst22> pred) {
		
		String result = pred.test(Qs) ?  "match" : "not match";
		System.out.println(result);
	}
	
	//Q27 and Q29ask 
	
	
	
	

}
