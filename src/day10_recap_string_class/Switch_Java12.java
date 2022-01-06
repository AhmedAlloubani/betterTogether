package day10_recap_string_class;

public class Switch_Java12 {
	
	public static void main(String[] args) {
		
		// new switch statement is only available for java versions above 12
		
		String weekend = "";
		String day = "Sat";
		
		switch (day) {
			case "Sat", "Sun" -> weekend = "Weekend";
			case "Mon", "Tue", "Wed", "Thu", "Fri" -> weekend = "Weekday";
			default -> System.out.println("Invalid day of the week");
		}
		
		System.out.println(weekend);
		int num2 =6;
		
		int num = switch (num2) {
		case 5: yield 2;
		default:
			System.out.println("Unexpected value");
			yield 3;
		};
	
		System.out.println(num);
	}

}
