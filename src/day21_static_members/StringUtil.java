package day21_static_members;

public class StringUtil {
	
	public String reverseString(String text) {
		
		String reversed = "";
		
		//01234
		//Hello
		//5 - length
		
		for(int i = text.length() -1; i >= 0 ; i-- ) {
			reversed = reversed + text.charAt(i);
		}
		
		return reversed;
	}
	
	

}
