package day17_method_parameters_recap;

public class Methods {
	
	public static void main(String[] args) {
		
		Method method = new Method();
		method.printString("Java Class");
		method.printEmail("helil", "primetechschool.com");
		method.printRange(5, 9);
		int max = method.findMax(2, 3);
		System.out.println(max);
	}

}
