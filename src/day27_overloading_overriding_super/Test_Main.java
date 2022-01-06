package day27_overloading_overriding_super;

public class Test_Main {
	
	public static void main(String[] args) {
		
		for (String text : args) {
			System.out.println(text);
		}
		
		System.out.println(args.length);
		
		System.out.println(args[1]);   // Python
		
	//	if (args[0].equals("Hello")) {                  //   just an example (put Hello in the argument)
	//		System.out.println("Java is greeting you!");
	//	} else {
	//		System.out.println("Java is saying bye!");
	//	}
	}

}
