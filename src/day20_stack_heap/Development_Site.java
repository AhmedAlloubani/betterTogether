package day20_stack_heap;

public class Development_Site {
	
	public static void main(String[] args) {
		
		House townhouse = new House();
		System.out.println(townhouse.getPrice());
		
		House singleFamily = new House("Single Family", "2021", 700_000);
		System.out.println(singleFamily.getPrice());
	}

}
