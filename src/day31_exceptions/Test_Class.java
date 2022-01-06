package day31_exceptions;

public class Test_Class implements Interface1, Interface2 {

	@Override
	public void raiseSideWindows() {
		Interface1.super.raiseSideWindows();  // super keyword usage with interfaces
		Interface2.super.raiseSideWindows();
	}
	
	

}
