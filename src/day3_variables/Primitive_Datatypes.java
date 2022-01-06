package day3_variables;

public class Primitive_Datatypes {

	String Ahmed2 = "Boreeni";
	int num70; // instance variable
	int num80;
	
	public Primitive_Datatypes() {
		
		String name1 = new String();
		 System.out.println(Ahmed2);
	}
	
	public static void main(String[] args) {
		
	
	
	// we've declared two variables (we created containers)
		byte width =3; // we assign a value of 3 to a variable width
		byte length = 4; // we assign a value of 4 to a variable length
		byte sqFootage = (byte) (width * length);
		
		System.out.println(width);
		System.out.println(length);
		System.out.println(sqFootage);
		
		//byte public = 5; we can't use Java reserved words
		
		byte num1 = 10; // local
		// byte num2 = 300; 300 can't fit into byte 
		
		String ahmed;
		String Ahmed = "Ahmed";
		System.out.println(Ahmed);
		
		short num3 = 10;
		// short num4 = 50000; 50000 is too big too be stored in short
		
		int num5 = 10;
		// int num6 = 3000000000; 3000000000 is too big for int
		
		long num7 = 10;
		long num8 = 10L; // this number is for long type only
		// long num9 = 9_000_000_000_000_000_000_000_000; out of range
		
		// long >> int >> short >> byte
		// a smaller datatype can be placed inside bigger one
		
		
		byte num10 = 8;
		long num11 = 17;
		long num90 = num10 * num11;
		System.out.println(num90);
		
		// long cant be assigned to byte
		long num12 = 100; // 64 bit of space
		// byte num13 = num12;		
		
		// short can be assigned to int
		short num14 = 5;
		int num15 = num14; 
		
		// int num16 = 10.5; decimal values cant be stored in integer
		
		float num16 = 10.5F; // 4-byte datatype
		double num17 = 10.5; // 8-byte datatype
		
		long num18 = 10; // 10 is an int (4-byte dataype)
		
		// any whole number in java immediately  becomes 4-byte datatype (int) 
		// any decimal number in java immediately becomes an 8-byte double, unless specifically identified 
		
		// 8 byte     8 byte
		double num21 = 25.456;
		
		
		// 8 byte     8 byte
		long num20 = 10_000_000_000_000L;
		
		int num22 = 20;
		
		float num23 = 20.5F;
		double num24 = 20.5;
		
		
		System.out.println("=======================");
		
		byte num25 = 10;
		System.out.println(num25);
		short num28 = 10;
		System.out.println(num28);
		int num29 = 10;
		System.out.println(num29);
		long num30 = 10;
		System.out.println(num30);
		
		float num26 = num25;
		System.out.println(num26);
		double num27 = num25;
		System.out.println(num27);
		
		
		int num31 = 8; // 1. is it a whole number? if it's a whole number it's an int
		double num32 = 3.14; // 1. is it a fractional number? if it's a fractional it's a double
		
		
		float num33 = 10;
		
		byte num34 = 5;
		short num35 = 5;
		int num36 = 5;
		long num37 = 5;
		float num38 = 5;
		double num39 = 5;
		
		float num40 = num34;
		float num41 = num35;
		float num42 = num36;
		float num43 = num37;   // you can assign to float 
		float num44 = num38;
		
		//  4 byte       8 byte data
		// float num45 = num39; double is bigger than float and cant fit inside float 
		
		double num45= num34;
		double num46 = num35;
		double num47 = num36;
		double num48 = num37;
		double num49 = num38;
		double num50 = num39; 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
				
		
	}
	
	int num50 = num80;
	int num60 = num70;
	//int num40 = num1;
		
}
