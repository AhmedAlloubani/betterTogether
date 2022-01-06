package day22_arrays;

public class Arrays_Basics {
	
	public static void main(String[] args) {
		
		
		String str1 = "Monday";
		String str2 = "Tuesday";
		String str3 = "Wednesday";
		String str4 = "Thursday";
		String str5 = "Friday";
		String str6 = "Saturday";
		String str7 = "Sunday";
		
		// Array - is a container that can hold multiple values
		
//data type array var = same as object creation but with square brackets (we provide the number of elements in brackets)
		String[] days = new String[7];
		days[0] = "Monday"; // we are assigning values to n array
		days[1] = "Tuesday";
		days[2] = "Wednesday";
		days[3] = "Thursday";
		days[4] = "Friday";
		days[5] = "Saturday";
		// days[6] = 11; // Arrays can contain only one data type (it will not compile)
		days[6] = "Sunday";
		
		System.out.println("Today is " + days[1]); // we are calling the number of this array
		System.out.println("Tomorrow is " + days[2]);
		System.out.println("Yesterday was " + days[0]);
		
		 //System.out.println("The day is " + days[9]); // this will compile but will throw an exception (it will give in error
		// because Index is out of bounds for length 7)
		// Arrays are fixed size and can not be extended or shortened after they were created. but the value inside
		// can be changed easily
		 
		 days[6] = "Funday";
		 System.out.println("Used to be Sunday: " + days[6]);
		 
		 days[1] = days[0];
		 days[2] = days[1];
		 
		System.out.println("Today is " + days[1]); 
		System.out.println("Tomorrow is " + days[2]);
		System.out.println("Yesterday was " + days[0]);
		 
		
	}

}
