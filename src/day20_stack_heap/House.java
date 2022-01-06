package day20_stack_heap;

public class House {
	
	private String type;
	private String year;
	private double price;
	private boolean onSale;
	
	public House() {
		System.out.println("A new house has been added to the lot");
	}
	
	public House(String type) {
		this();
		this.type = type;
	}
	
	public House(String type, String year) {
		this();
		this.type = type;
		this.year = year;
	}
	
	public House(String type, String year, double price) {
		this();
		this.type = type;
		this.year = year;
		this.price = price;
	}

	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public boolean isOnSale() {
		return onSale;
	}
	public void setOnSale(boolean onSale) {
		this.onSale = onSale;
	}
	
	

}
