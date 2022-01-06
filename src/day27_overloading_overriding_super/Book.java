package day27_overloading_overriding_super;

public class Book {
	
	private int numberOfWords;
	String author;
	protected double price;
	public String title;
	
	
	private void calculateWords() {
		System.out.println("Calculating number of words...");
	}
	
	protected String getAuthor() {
		return author;
	}
	
	public void setPrice(double price) {
		verifyPrice(price);
		this.price = price; // this refers to the instance variable
		System.out.println(price);
	}
	
	private void verifyPrice(double price) {     // not part of the question(just an addition)
		if  (price > 50) {
			System.out.println("Too expensive");
		} else {
			System.out.println("Good price");
		}
	}

	@Override // Auto-generate: right click -> source -> generate toString()
	public String toString() {
		return "Book [numberOfWords=" + numberOfWords + ", author=" + author + ", price=" + price + ", title=" + title
				+ "]";
	}
	
	
	

}
