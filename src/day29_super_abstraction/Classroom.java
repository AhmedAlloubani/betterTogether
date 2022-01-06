package day29_super_abstraction;

public class Classroom  {
	
	/*
	 * Extra task:
	 * - create a constructor in the Students class that accepts name and studentID and
	 *  assigns those values to the instance variables;
	 * - try to understand why your code stopped compiling;
	 * - troubleshoot and fix your code.
	 */
		public static void main(String[] args) {
			OnlineStudent ahmed = new OnlineStudent();
			ahmed.setName("Ahmed");
			ahmed.setCity("Fairfax");
			ahmed.setStudentID(24537278);
			ahmed.attendClass();
			System.out.println(ahmed);
			OnCampusStudent abiba = new OnCampusStudent();
			abiba.setName("Abiba");
			abiba.setCity("Fairfax");
			abiba.setStudentID(36387329);
			abiba.attendClass();
			abiba.attendClass(false);
			System.out.println(abiba);
		}
	}
