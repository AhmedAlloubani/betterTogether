package day36_exceptions;

public class Exception_Methods {
	
	public static void main(String[] args) throws Exception {
		
		//e.printStackTrace(): output the message that shows where the problem has happened  to troubleshoot it.
		try {
		//System.out.println(10/0);
			//two ways to manually throw an exception:
			Exception exception = new Exception();
			throw new Exception("Manually generated Exception"); // manually generating/throwing an exception(more commonly used)
	//		throw exception;
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("This is also executed!");
	}

}
