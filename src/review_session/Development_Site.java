package review_session;

public class Development_Site {
	
	//if you change the static member, other members will be affected
	//if you change the instance member, changes will be available to just that member
	
	public static void main(String[] args) {
		
		House house1 = new House(500_000, 3000, false);
		House house2 = new House(1_500_000, 8000, true);
		House house3 = new House(250_000, 1000, false);
		House house4 = new House(75_000, 4000, true);
		House house5 = new House(400_000, 2500, false);
		
		System.out.println(House.getCounter());
		System.out.println(house4.getHouseNumber());
		
		house4.setHouseNumber(41);
		
		System.out.println(House.getCounter());
		System.out.println(house4.getHouseNumber());
		
		System.out.println(house3.getHouseNumber());
		
		House.setCounter(10);
		
		House.setCounter(10);
		
		System.out.println(house5.getCounter());
		
	}
	
	
	
	
	
	
	
	
	

}
