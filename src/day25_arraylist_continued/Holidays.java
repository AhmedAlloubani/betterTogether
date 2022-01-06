package day25_arraylist_continued;

import java.util.ArrayList;

public class Holidays {
	

		
		
		 /* Warmup Task:
			 * 
			 * Create class Holidays
			 * private static list holidays
			 * no-arg constructor that will add 6 holidays to the list
			 * static method isHoliday that accepts a string and checks if that holiday is in the list of the holiday is 
			 * in the list of holidays returns boolean
			 */
		
		private static ArrayList holidays = new ArrayList();
		
		public Holidays() {
			holidays.add("New Year");
			holidays.add("MLK");
			holidays.add("Valentine's");
			holidays.add("Mother's Day");
			holidays.add("Labor Day");
			holidays.add("Independence Day");
		}
		
		public static boolean isHoliday(String holiday) {
			
//			for (Object obj : holidays) {             we can do this (for-each loop)
//				if(obj.equals(holiday)) {
//					return true;
//			
//					
//				}
//			}	
				if(holidays.contains(holiday)) {           // or we can do this (.contains)
				return true;
			}
				return false;
		}
	}
			 
			 
	


