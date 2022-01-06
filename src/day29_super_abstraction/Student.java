package day29_super_abstraction;

public class Student {
	
	private String name;
	private int StudentID;
	
	// this constructor must be present to preserve the chain of constructors
	public Student() {
		
	}
	
	public Student(String name, int studentID) {
		this.name = name;
		this.StudentID = studentID;
	}
	
	public void attendClass() {
		System.out.println("Student attending class");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStudentID() {
		return StudentID;
	}

	public void setStudentID(int studentID) {
		StudentID = studentID;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", StudentID=" + StudentID + "]";
	}
	
	

}
