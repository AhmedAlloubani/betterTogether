package day20_stack_heap;

public class Test_GC {
	
	public static void main(String[] args) {
		
			
		for(long i = 0; i < 1_000_000_000_000L; i++) {
			new Overflow_Heap();
			
		}
		
	}

}
