package bunny;

public class BatCode {
	
	public static void main(String[] args) {
		BatCode bat = new BatCode();
		System.out.println(bat.nearHun(90));
		System.out.println(bat.posNeg(-4, 5, true));
		System.out.println(bat.notString("bad"));
		
	}
	
	//Q1:
	//we can use math.abs to give the absolute number
	public boolean nearHundred(int n) {
		
			if (n >= 90 && n <=110 ||(n >= 190 && n <=210 )) 
				return true;
			else 
				return false;
	}	
	
	//we can solve it like this too
	//we can use math.abs to give the absolute number
	public boolean nearHun(int n) {
		return ((Math.abs(100 - n) <= 10) ||
			    (Math.abs(200 - n) <= 10));
	
	}
	
	//Q2:
	public boolean posNeg(int a, int b, boolean negative) {
		if ((a >= 0 && b < 0  || (a < 0 && b >= 0))  && negative == false)
			return true;
		if (a < 0 && b < 0 && negative == true)
			return true;
		else 
			return false;
	}
	
	//Or this solution
	public boolean posNe(int a, int b, boolean negative) {
		  if (negative) {
		    return (a < 0 && b < 0);
		  }
		  else {
		    return ((a < 0 && b > 0) || (a > 0 && b < 0));
		  }
		}
	
	//Q3:
	public String notString (String str) {
		 if(str.startsWith("not"))
			 return str;
		 else
			 return "not " + str;
	}
	
	//Q4:
	
	

	
	
	
		
	}


