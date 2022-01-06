package day19_contructors_this;

public class BestBuy {
	
	public static void main(String[] args) {
		
		/*
		 * Java only automatically provides a no-arg constructor for you
		 * if you havn't created at least one constructor explicitly
		 */
		
		// Computer windows = new Computer(); will not compile, Java won't create a default one for you
		
		Computer windows = new Computer(64);
		System.out.println(windows.getRAM());
		System.out.println(windows.getCPU());
		
		Computer mac = new Computer(32, 3000, "MacOS");
		
		Computer wind =  new Computer();
		System.out.println(wind.getCPU());
	}

}
