package day21_static_members;

public class Conference {
	
	public static void main(String[] args) {
		
		Meeting room1 = new Meeting();
		room1.increment();
		
		Meeting room2 = new Meeting();;
		room2.increment();
		
		System.out.println("Number of people in roome 1:" + Meeting.peopleCount); // 2
		System.out.println("Number of people in roome 2:" + Meeting.peopleCount); // 2
	}

}
