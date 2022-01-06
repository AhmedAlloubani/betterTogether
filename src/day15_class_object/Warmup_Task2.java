package day15_class_object;


public class Warmup_Task2 {
	
	public static void main(String[] args) {
		
		/*
		 * Remove duplicate characters from a String
		 * 
		 * Example: "aabbcc" -> "abc"
		 * Example: "marat" -> "mart"
		 * 
		 */
		
		
		//             012345
		String text = "aabbcc";
		String noDuplicates = ""; // 1:"a" 2: "a" 3: "ab" 4: "ab" 5: "abc" 6: "abc"
		
		for (int i = 0; i < text.length(); i++) {
			
			// i = 0; 0 < 6; !"".contains("a") = true
			// i = 1; 1 < 6; !"a".contains("a") = false, so nothing will be executed
			// i = 2; 2 < 6; !"a".contains("b") = true
			// i = 3; 3 < 6; !"ab".contains("b") = false
			// i = 4; 4 < 6; !"ab".contains("c") = true
			// i = 5; 5 < 6; !"abc".contains("c") = false
			// i = 6; 6 < 6; -> execution of the loop stops
			if (!noDuplicates.contains(text.charAt(i) + "")) {
				//                  ""      + text.charAt(0) = a -> we added a to an empty string
				noDuplicates = noDuplicates + text.charAt(i) + "";
			}
		}
		
		System.out.println(noDuplicates);
		
		
		
		
		
		
		
	}

}
