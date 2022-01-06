package day24_arraylist;

public class Animal {
	
	private String name;
	
	public Animal(String name) {
		this.name = name; // we use (this.) for Java to differentiate between instance variable and parameter
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}
