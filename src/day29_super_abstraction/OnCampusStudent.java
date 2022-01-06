package day29_super_abstraction;

public class OnCampusStudent extends Student {
	
	private String city;
	
	@Override
	public void attendClass() {
		System.out.println("Attending class in person");
	}
	
	public void attendClass(boolean isOnline) {
		if(isOnline) {
			System.out.println("Attending class using Zoom");
		
	} else {
		System.out.println("Attending class in person");
		
	}

}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	@Override
	public String toString() {
		 return "OnCampusStudent [city=" + city + ",name=" + getName() + ", StudentID=" + getStudentID() + " ]";
		
	}
	
	
}