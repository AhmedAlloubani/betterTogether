package day5_operators;

public class Mixed_Integer_Operations {
	
	public static void main (String[] args) {
		
		byte width = 5;
		byte lenght = 7;
		
		byte sqFootage = (byte) (width * lenght);
		
		/* when byte and short datatypes are involved in 
		 * any sort of arithmetic operation they are immediately
		 * converted to an integer
		 */
		
		short firstNumber = 7;
		short secondNumber = 3;
		
		//short result = firstNumber + secondNumber; it will give you an error because in arithmetic operations 
		// it automatically considers it as int 
		
		// we should do like this instead:
		
		short result = (short) (firstNumber = secondNumber);
		
		
	}

}
