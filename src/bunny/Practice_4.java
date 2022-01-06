package bunny;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Practice_4 {
	
	public static void main(String[] args) {
		
		//Period: is a day or more of time.
		Period anuualy = Period.ofYears(1); //every one year
		Period quarterly = Period.ofMonths(3); //every 3 months
		Period everyThreeWeeks = Period.ofWeeks(3); // every three weeks
		Period everyOtherDay = Period.ofDays(2); // every 2 days
		Period everyYearAndWeek = Period.of(1, 0, 7); // every year and 7 days
		
		//Important: you can't chain methods when creating Period.
		//Duration: intended for smaller units -> days,hours,minutes,seconds and nanoseconds
		
		//Objects which can be used with Period:
		LocalDate Date = LocalDate.of(2015, 1, 20);
		LocalTime Time = LocalTime.of(6, 15);
		LocalDateTime DateTime = LocalDateTime.of(Date, Time);
		Period period = Period.ofMonths(1);
		System.out.println(Date.plus(period));  //2015-02-20
		System.out.println(DateTime.plus(period)); //2015-02-20T06:15
		//System.out.println(Time.plus(period)); //UnsuppoterdTemporalTypeException
		//it doesn't work because it attempts to add month to an object that only has a time
		
		//Formatting Dates and Times:
		LocalDate Date1 = LocalDate.of(2020, 1, 20);
		LocalTime Time1 = LocalTime.of(11, 12, 34);
		LocalDateTime DateTime1 = LocalDateTime.of(Date1, Time1);
		System.out.println(Date1.format(DateTimeFormatter.ISO_LOCAL_DATE));
		System.out.println(Time1.format(DateTimeFormatter.ISO_LOCAL_TIME));
		System.out.println(DateTime1.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
		//ISO is a standard for dates.
		
		//better way to write the code using SHORT or MEDIUM 
		DateTimeFormatter shortDateTime = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		DateTimeFormatter mediumDateTime = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
		System.out.println(shortDateTime.format(DateTime1)); // 1/20/20
		System.out.println(shortDateTime.format(Date1)); // 1/20/20
		//System.out.println(shortDateTime.format(Time1)); ////UnsuppoterdTemporalTypeException
		System.out.println(mediumDateTime.format(DateTime1)); // Jan 20, 2020, 11:12:34 AM
		//you can also create your own pattern using ofPattern();
		DateTimeFormatter pattern = DateTimeFormatter.ofPattern("MMMM dd, yyyy, hh:mm");
		System.out.println(DateTime1.format(pattern));
		//M -> 1  MM-> 01  MMM-> Jan   MMMM-> January
		// dd -> days
		//yyyy -> year or yy-> to output two digits
		//hh -> hours
		//mm -> minutes 
		
		//parse() method to convert a String to date or time
		DateTimeFormatter f = DateTimeFormatter.ofPattern("MM dd yyyy");
		LocalDate date0 = LocalDate.parse("01 02 2015", f);
		LocalTime time0 = LocalTime.parse("11:22"); 
		System.out.println(date0); // 2015-01-02 
		System.out.println(time0); // 11:22
		
		//================================================================
		//Summary QS
		
		//
		String s = "hello";
		String t = new String(s);
		System.out.println("hello" == s); //Ask
		System.out.println(t.equals(s)); //true
		System.out.println("hello" == s); //true
		System.out.println(t == s); //false
		System.out.println("hello" == t); //false
		
		//Q4
		StringBuilder sb = new StringBuilder();
		sb.append("aaa").insert(1, "bb").insert(4, "ccc");// "abbaccca"
		System.out.println(sb);
		
		//Q5  Ask
		String s1 = "java";
		StringBuilder s2 = new StringBuilder("java");
		System.out.println(s1.equals(s2.toString()));
		
		//Q6 Ask
		String roar1 = "roar";
		StringBuilder roar2 = new StringBuilder("roar");
		 Practice_4 practic = new Practice_4();
		 practic.roar(roar1, roar2);
		 System.out.println(roar1 + " " + roar2);
		 
		 //Q7 Ask
		 String numbers = "012345678";
		 System.out.println(numbers.substring(1, 3));//12
		 System.out.println(numbers.substring(7, 7));
		 System.out.println(numbers.substring(7));
		 System.out.println(numbers);
		 
		 //Q9 
		 String s0 = "purr";
		 System.out.println(s0.toUpperCase()); // PURR
		 System.out.println(s0.trim());// purr
		 System.out.println(s0.substring(1, 3)); // ur
		 s0+= " two"; // purr two
		 System.out.println(s0.length()); //8
		 
		 //Q10
		 String a = "";
		 a+= 2; //2
		 a+= 'c'; //2c
		 a+= false; //2cfalse
		 System.out.println(a);
		 if (a == "2cfalse") 
			 System.out.println("==");
		 if (a.equals("2cfalse")) 
			 System.out.println("equals");
		 
		 //Q11 ask
		 int total = 0;
		 StringBuilder letter = new StringBuilder("abcdefg");
		 total+= letter.substring(1, 2).length(); // 0+1 = 1
		 System.out.println(total);
		 
		 //Q12
		 StringBuilder number = new StringBuilder("0123456789");
		 number.delete(2, 8); //0189
		 number.append("-").insert(2, "+");	//01+89-
		 System.out.println(number);
		 
		 //Q13
		// StringBuilder b = "rumble"; //The code doesn't compile 
		 
		 //Q14
		 StringBuilder puzzle = new StringBuilder("Java");
		 puzzle.reverse();
		 System.out.println(puzzle);
		 
		 //Q15
		// int [][] types =  new int[];// not legal
		//int [][] java =  new int [][]; //not legal 
		 
		 //Q16:ASK
		 char[] c =  new char[2];
		 int length = c.length; // the correct one
		 
		 //Q17
		 ArrayList l = new ArrayList();
		 int length1 = l.size(); //the correct one 
		 
		 //Q19 ASK
		 ArrayList hala = new ArrayList();
		 //hala.remove(0);
		 
		 //Q20
		 List<String> list =  new ArrayList<String>();
		 list.add("one");
		 list.add("two");
		// list.add(7); //this will not compile
		 for (String ss : list)
			 System.out.println(ss);
		 
		 //Q21
		ArrayList<Integer> values =  new ArrayList<>();
		values.add(4); //[4]
		values.add(5);//[4,5]
		values.set(1, 6);//[4, 6]
		values.remove(0); //[6]
		for (Integer v : values)
			System.out.println(v); //6
		
		//Q22
		//int[] random = {6, -4, 12, 0, -10};
		System.out.println("Q22");
		int[] random = {6,12, -4, 0, -10};
		Arrays.sort(random);
		int x = 12;
		int y = Arrays.binarySearch(random, x);
		System.out.println(y); //2
		
		//Q23
		List<Integer> list0 = Arrays.asList(10, 4, -1, 5);
		Collections.sort(list0); //[-1, 4, 5, 10]
		Integer[] array = list0.toArray(new Integer[4]);
		System.out.println(array[0]); // -1
		
		//Q24
		String[] names =  {"Tom", "Dick", "Harry"};
		//List<String> list1 = names.asList(); //will not compile
		
		//Q25 Ask
		System.out.println("Q25");
		List<String> hex = Arrays.asList( "80" ,"37", "3A" , "FF");
	//	List<String> hex = Arrays.asList( "100" ,"101", "10200" , "10A0");

		Collections.sort(hex); //[30, 3A, 8, FF]
		System.out.println(hex);
		int x1 =  Collections.binarySearch(hex, "8"); //2
		int y1 = Collections.binarySearch(hex, "3A"); //1
		int z1 = Collections.binarySearch(hex, "4F");//-3
		System.out.println(x1 + " " + y1 + " " + z1); // 2 1 -3
		
		//Q26:Ask
		List<Integer> ages = new ArrayList<>();
		ages.add(Integer.parseInt("5")); //[5]
		ages.add(Integer.valueOf("6"));//[5, 6]
		ages.add(7);//[5, 6, 7]
		ages.add(null);//[5, 6, 7, null]
	//	for (int age : ages) {
		//	System.out.println("hello world");
		//	System.out.println(age); 
		//}//will throw a null pointer exception
		
		//Q27:
		List<String> one = new ArrayList<String>();
		one.add("abc");
		List<String> two = new ArrayList<>();
		two.add("abc");
		if (one == two)
			System.out.println("A");
		else if (one.equals(two)) 
			System.out.println("B");
		else 
			System.out.println("C");
		
		//Q28:
		LocalDate datt = LocalDate.of(2015, Month.JUNE, 21);
		System.out.println(datt);
		
		//Q29:
		LocalDate da = LocalDate.parse("2018-04-30", DateTimeFormatter.ISO_LOCAL_DATE);	
		da.plusDays(2);
		System.out.println(da);
		//da.plusHours(3); this will not compile because plusHours() is not defined for the LocalDate
		
		//Q30
		//LocalDate d = LocalDate.of(2018, Month.APRIL, 40); //exception invalid day of month
		//System.out.println(d.getYear()+ " " + d.getMonthValue() + " " + d.getDayOfMonth());
		
		//Q31
		LocalDate de = LocalDate.of(2018, Month.APRIL, 30);
		de.plusDays(2);
		de.plusYears(3);
		System.out.println(de.getYear() + " " + de.getMonth() + " " + de.getDayOfMonth()); // 2018 April 30
		//because Strings are immutable
		
		//Q32
		LocalDateTime i = LocalDateTime.of(2015, 5, 10, 11, 22, 33); //2015-05-10T11:22:33
		Period p = Period.of(1, 2, 3);
		i = i.minus(p); //2014-03-07T11:22:33
		DateTimeFormatter ff = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
		System.out.println(i.format(ff)); //11:22 AM 
		
		//Q33:
		LocalDateTime zone = LocalDateTime.of(2015, 5, 10, 11, 22, 33);//2015-05-10T11:22:33
		Period per = Period.ofDays(1).ofYears(2).ofMonths(3); //you can't chain period methods, and when you do
		//Java will consider the last method, apply it and ignore what's before.
		zone = zone.minus(per); //2013-05-09T11:22:33
		DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
		System.out.println(zone.format(dtf)); //  2/10/15, 11:22AM
		
	}
	
	public void roar (String roar1, StringBuilder roar2) {
		roar1.concat("!!!");
		roar2.append("!!!");
	}
// int [] a = {1,2,3};
	// int [] b = a;
	// b[2] = 4
	// sout (a) - > {1,2,4}
}
