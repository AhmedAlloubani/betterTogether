package bunny;

public class CanHop implements CanFly{
	
	public boolean isBlind() {
		return true;
	}
	public static void main(String[] args) {
		
		CanFly fly = new CanHop();
		System.out.println(fly.isBlind());
	}
	
	
	//Ask Q18 chapter 5
	public String getNumberOfGills() 
	{ return "4"; }
	
//	public String getNumberOfGills(int input) { //will not compile because the return type in CanFly is not 
//		return "6"; 							//compatible with the return type of this method 	
//	}

}
