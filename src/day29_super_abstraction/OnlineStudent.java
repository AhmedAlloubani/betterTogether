package day29_super_abstraction;

public class OnlineStudent extends Student {
	
	private String city;
	
	public OnlineStudent() { // one of the ways to fix broken chain of constructors
		super("", 0);
	}
	
	
	@Override
	public void attendClass() {
		System.out.println("Attending class using zoom");
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "OnlineStudent [city=" + city + ",name=" + getName() + ", StudentID=" + getStudentID() + " ]";
	}
	
	
	
	

}
