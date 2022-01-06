package day31_exceptions;

public class Basic_Exception {
	
	public static void main(String[] args) {
		
		
		int[] nums = {23, 12, 45, 67, 56};
		
		System.out.println(nums.length);
		System.out.println(nums[0]);
		System.out.println(nums[1]);
		System.out.println(nums[4]);
		
		
		
		try {
			System.out.println(nums[0]);  // this line will be printed
			System.out.println(nums[7]);  // Exception
			System.out.println(nums[1]);  // this line will not be printed
		} catch(Exception e) {
			System.out.println("Exception was caught!");
		}
		
		System.out.println(nums[2]);
		System.out.println(nums[3]);
		
		
		
		
	}

}
