package day36_exceptions;

public class Classroom {
	
	public static void main(String[] args) throws OnlineStudentNotPresentException {
		
		Student student1 = new Student("Hamza");
		student1.attendedClass = false;
		student1.isOnlineStudent = false;
		Student student2 = new Student("Sergiy");
		student2.attendedClass = false;
		student2.isOnlineStudent = false;
		
		checkAttendance(student1);
		
	
	}
	
	
	
	public static void checkAttendance(Student student) throws OnlineStudentNotPresentException{
		if(student.isOnlineStudent == true && student.attendedClass == true) {
			System.out.println("Good job!");
			
		}else if(student.isOnlineStudent == true && student.attendedClass == false) {
			throw new OnlineStudentNotPresentException("Student missed the online class!");
		}else if (student.isOnlineStudent == false && student.attendedClass == true) {
			System.out.println("Good Job");
			
		}else if (student.isOnlineStudent == false && student.attendedClass == false) {
			throw new InClassStudentNotPresentException("In class student didn't attend");
		}else {
			System.out.println("Good Job!");
		}
		
	}

}