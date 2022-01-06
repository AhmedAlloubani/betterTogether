package day36_exceptions;

public class InClassStudentNotPresentException extends RuntimeException {
	
	public InClassStudentNotPresentException(String text) {
		super(text);
	}

}
