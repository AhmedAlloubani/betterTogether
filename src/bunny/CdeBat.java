package bunny;

public class CdeBat {
	
	//delete a specific char
	public String name(String str, int n) {
		String front = str.substring(0 , n);
		String back = str.substring(n + 1, str.length());
		return front + back;
	}
	
	public static void main(String[] args) {
		CdeBat b = new CdeBat();
		System.out.println(b.name("kitten", 4));
		System.out.println(b.Exchange(""));
		
		int a = 3;
		int c = 113;
		int d = a % c;
		System.out.println(d);
		
		System.out.println(b.first3("a"));
		System.out.println(b.backAround("a"));
		System.out.println(b.nonNegative(-1));
		System.out.println(b.front22("Kitten"));
		System.out.println(b.startHi("HI"));
		System.out.println(b.icyHot(2, 120));
		System.out.println(b.in1020(8, 99));
		System.out.println(b.hasTeen(20, 10, 13));
		System.out.println(b.loneTeen(13,13));
		System.out.println(b.delDel(null));
		System.out.println(b.mixStart("ni"));
		System.out.println(b.startOz(""));
		System.out.println(b.intMax(3,2,60));
		System.out.println(b.close10(13,7));
		System.out.println(b.in3050(40, 50));
		System.out.println(b.max1020(9, 21));
		System.out.println(b.stringE("heeeello"));
		System.out.println(b.lastDigit(6,17));
		System.out.println(b.endUp("hello hello"));
		System.out.println(b.gag(null));
		System.out.println(b.everyNth("Miracle", 2));
		System.out.println(b.stringTimes("Hi", 3));
		System.out.println(b.frontTimes("ah", 3));
		System.out.println(b.countXX("abcxx"));
		System.out.println(b.stringSplosion("Code"));
		System.out.println(b.last2("axxxaaxx"));
		
		int [] nums = {3, 2, 7 , 7} ;
	//	System.out.println(b.arrayCount9(nums));
		System.out.println(b.arrayFront9(nums));
		
		
		System.out.println(b.stringMatch("xxcaazz", "xxbaaz"));
		
	
		
	}
	
	//exchange first and last index
	public String Exchange(String str) {
		if (str == null || str.length() <= 1) {
			return str;
		}
		return str.substring(str.length() -1) +
				str.substring(1, str.length() -1) +
				str.substring(0, 1);
		
		
	}
	
	public String first3(String str2) {
		if (str2 == null || str2.length() < 3) {
			
			return str2 + str2 + str2;
		}
	return	str2.substring(0,3) + str2.substring(0,3) + str2.substring(0,3);
		
		
	}
	
	
	public String backAround(String str) {
		if (str == null) {
			return str;
		} else if (str.length() <= 1) {
			return str + str + str;
		} else {

	String last = str.substring(str.length() -1);
	String front = last.concat(str);
	String end = front.concat(last);
	return end;
	}
	}
	
	public boolean nonNegative(int n) {
		if (n >= 0 && (n % 3 == 0 || n % 5 == 0)) 
			return true;
			
		else
			return false;
	}
	
	public String front22(String str) {
		if (str == null || str.length() < 1) {
			return str;
		} else if (str.length() <= 2) {
			return str + str + str;
		} else {
			String front = str.substring(0 ,2);
			
			return front + str + front;
			
		}
	}
	
	public boolean startHi(String str) {
		if (str.startsWith("hi"))
			return true;
		else 
			return false;
	}
	
	public boolean icyHot(int temp1, int temp2) {
		if (temp1 < 0 && temp2 > 100) 
			return true;
		else if (temp1 > 100 && temp2 < 0 )
			return true;
		else 
			return false;
	}
	
	public boolean in1020(int a, int b) {
		  if (a >=10 && a <= 20 || (b >= 10 && b <= 20 ))
			  return true;
		  else 
			  return false;
	}
	
	public boolean hasTeen(int a, int b, int c) {
		  if (a >=13 && a <=19 || (b >=13 && b <= 19) || (c >= 13 && c <= 19))
			  return true;
		  else
			  return false;
	}
	
	
	public boolean loneTeen(int a, int b) {
		if ((a >= 13 && a <= 19) ^ (b >= 13 && b <= 19))
		return true;

		
		else 
			return false;
			
	}
	
	  //delete del if it appears at index 1
	public String delDel(String str) {
		
		if (str == null || str.length() <= 1) {
			return str;
		}
		
		if (str.substring(1).startsWith("del"))
			return str.charAt(0) + str.substring(4);
		else 
			return str;
		
		
		
	}
	
	public boolean mixStart(String str) {
		
		if (str == null || str.length() <=2 ) {
			return false;
		}	
		
		String mix = str.substring(1,3);
		
		
		if (mix.startsWith("ix"))
		  return true;
		
		
	
		else 
		return false;
		
	}
	
	public String startOz(String str) {

	if (str.length() <= 2 && !str.startsWith("oz")) {
		return str;
	}
	
	
	String first = str.substring(0,1);
	String two = str.substring(1,2);
	if (first.startsWith("o") && !two.startsWith("z")) {
		return first;
	}else if (two.startsWith("z") && !first.startsWith("o")) {
		return two;
	}else if (first.startsWith("o") && two.startsWith("z")) {
		return first + two;
	} else {
		return "";
	}
		
	
	 
}
	//another solution same as method startOz
	public String startOt(String str) {
		  String result = "";
		  
		  if (str.length() >= 1 && str.charAt(0)== 'o') {
		    result = result + str.charAt(0);
		  }
		  
		  if (str.length() >= 2 && str.charAt(1)=='z') {
		    result = result + str.charAt(1);
		  }
		  
		  return result;
		}
	
	//or we can use math.Max()
	public int intMax(int a, int b, int c) {
		if (a > b && a > c)
			return a;
		else if (b > a && b > c)
			return b;
		else  
			return c;
		
		  
	}
	
	public int close10(int a, int b) {

		 
		 if (Math.abs(a - 10) > Math.abs(b - 10))
			 return b;
		 else if (Math.abs(b - 10) > Math.abs(a - 10))
			 return a;
		 
		 else 
			 return 0;
	
					
		  
	}
	
	public boolean in3050(int a, int b) {
			//  true		false      true        false
		  if ((a >= 30 && b <=40) && (b>= 30 && a <= 40))
			  return true;
		  
		  else if ((a>= 40 && b <= 50) && (b>=40 && a <= 50 ))
			  return true;
		  else 
			  return false;
	}
			  
		 
	public int max1020(int a, int b) {
		  if ((a >= 10 && a <= 20) && (b >= 10 && b <= 20 )) 
				 if (Math.abs(a - 20) > Math.abs(b - 20))
					 return b;
				 else 
					 return a;
			  
			  else if (a >= 10 && a <= 20)
				  return a;
			  else if (b >= 10 && b <= 20)
				  return b;
			  
			  else 
				  return 0;  
			  
			  
	}
	
	//Another solution max1020 (ASK)
	public int maxx1020(int a, int b) {
		  // First make it so the bigger value is in a
		  if (b > a) {
		    int temp = a;
		    a = b;
		    b = temp;
		  }
		  
		  // Knowing a is bigger, just check a first
		  if (a >= 10 && a <= 20) return a;
		  if (b >= 10 && b <= 20) return b;
		  return 0;
		}
	
	//solution for e appear at just 1,2 or 3 indexes
//	public boolean stringE(String str) {
//		if (str == null || str.length() <= 1) {
//			return false;
//		}
//
////		String e = str.substring(4, str.length());
//		if (str.substring(1,4).contains("e") && !str.substring(4, str.length()).contains("e"))
//			return true;
//	
//			
//		else 
//			return false;
//	}
	
	//return true if the string has one to 3 chars 'e'
	public boolean stringE(String str) {
		int count = 0;
		for (int i = 0; i < str.length() ; i++) {
			if (str.charAt(i) == 'e') count++;
		}
	return (count >= 1 && count <=3);
}
	//7,17 -> true
	//3,113 -> true
	public boolean lastDigit(int a, int b) {
		if (a % 10 == b % 10)
			return true;
	
	return false;
}
	//Ask how to make it a loop
	public String endUp(String str) {

		if (str.length() >=3)
					return str.substring(0,str.length() -3) + str.substring(str.length() - 3).toUpperCase();
				
		else 
			return str.toUpperCase();
	}
	
	
	
	//Another solution to endUp (for loop) 
	public String gag(String str) {
//		String str1 = str.substring(0 , str.length() -4).toUpperCase();
//		int i = 0;
		
		String result = "";
		
//		if (str == null) {
//			throw new NoStringException("String Is Null");
//		}
		
		if (str == null) {
			return null;
		}
			for ( int i = 0 ; i < str.length() ; i++) {
				if (i >= str.length() - 3)
				result += String.valueOf(str.charAt(i)).toUpperCase();
				
				else 
					result += String.valueOf(str.charAt(i));
			}			
					
			
			return result;

	}
	
	//important example 
	//print chars based on given n
	public String everyNth(String str, int n) {
		String result = "";
		
		for (int i = 0 ; i < str.length(); i = i+n) {
			result+= str.charAt(i);
		}
		
		return result;
			
		
	
	}
	
	public String stringTimes(String str, int n) {
		 String result = "";
		  for (int i=0; i<n; i++) {
		    result = result + str;  // could use += here
		  }
		  return result;
		}
	
	public String stringTimess(String str, int n) {
		  str = str.repeat(n);
					return str;
		}
	
	public String frontTimes(String str, int n) {
		String result = "";
		
		if (str == null || str.length() < 1) {
			return str;
		}
		
		for (int i = 0 ; i < n ; i++) {
			if (str.length() == 1) {
				result+= str.substring(0,1);
			} else if (str.length() == 2) {
				result+= str.substring(0,2);
			} else {
				result+= str.substring(0,3);
			}
			
			
		}
		
		
		return result;
			
			
			
			
	
	}
	
	int countXX(String str) {
		  int count = 0;
		  if (str == null) {
		    return count;
		  }
		  
		  for (int i = 0 ; i < str.length() - 1 ; i++) {
		    if (str.charAt(i) == 'x' && str.charAt(i+1) == str.charAt(i))
		    count++;
		  }
		  
		  return count;
		  
		}
	//Code -> "CCoCodCode"
	public String stringSplosion(String str) {
		  String result = "";
		  for (int i = 0; i <= str.length()  ; i++) {

			  result+= str.substring(0,i);
		 
		  }  
		  return result;
		 
		
	
	
	
	
	
	}
	
	
	public int last2(String str) {
		// Screen out too-short string case.
		  if (str.length() < 2) return 0;
		  
		  String end = str.substring(str.length()-2);
		  // Note: substring() with 1 value goes through the end of the string
		  int count = 0;
		  
		  // Check each substring length 2 starting at i
		  for (int i=0; i<str.length()-2; i++) {
		    String sub = str.substring(i, i+2);
		    if (sub.equals(end)) {  // Use .equals() with strings
		      count++;
		    }
		  }

		  return count;
	}
	
	public int arrayCount9(int[] nums) {
		int count = 0;
		for (int i = 0; i < nums.length ; i++) {
			if (nums[i] == 9) { 
				count++;
		}
			
		
		
	}
		return count;
	}
	
	
	
	public boolean arrayFront9(int[] nums) {
		  
		  int end = nums.length;
		  if (end > 4) end = 4;
		  
		  for (int i = 0; i < end; i++) {
			  if (nums[i] == 9 )
				  return true;
		  }
		  
		  return false;
	}
	
	public int stringMatch(String a, String b) {
		  int count = 0;
		  int index = 0;
		  
	if (a.substring(index, index+1).equals(b.substring(index , index+1))) {
		count++;
	}
	
	return count;
	}
	
}