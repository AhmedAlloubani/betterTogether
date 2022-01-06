package bunny;

import java.util.Scanner;

public class ScannerCode {
	
	
	int num;
	
	static int num2;
	
	public int num3(String man) {
		return 4 * 4;
	}
	
//	public void num3(String ma) { it's not possible in Java to create two methods with same name and 
//								//signature but different return type. it is considered duplicate 
//	}

	
	public static void main(String[] args) {
		
		ScannerCode code = new ScannerCode();
		System.out.println(code.num);
		
		System.out.println(code.num3(null));
		
		//System.out.println(num);
		
		System.out.println(num2);
		String country;
		String capital;
		int population;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please input a country: ");
		country = input.next();
		
		switch(country) {
			case "USA":
				capital = "Washington, DC";
				population = 650_000;
				break;
			case "Jordan":
				capital = "Amman";
				population = 3_000_000;
				break;
			case "Iraq":
				capital = "Baghdad";
				population = 6_000_000;
				break;
			default:
				System.out.println("Invalid input");
				capital = "";
				population = 0;
				break;	
		}
		
		System.out.println("The capital is " + capital + ". Polulation is " + population);
		
		String result = population > 1_000_000 ? "population is greater than 1 mil" : "population is less than 1 mil";
		System.out.println(result);
		
		input.close();
				
		}
		
	}
	


