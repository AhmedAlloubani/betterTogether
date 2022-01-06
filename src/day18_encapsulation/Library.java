package day18_encapsulation;

public class Library {
	
	public static void main(String[] args) {
		
		Book book1 = new Book();
		
		book1.setTitle("OCA exam prep guide");
		book1.setAuthor("Boyarsky");
		book1.setType("Programming book");
		book1.setPrice(25);
		book1.setOnSale(false);
		
		System.out.println(book1.getPrice());
		
		
		Book book2 = new Book();
		book2.setTitle("Selenium Testing Tool A Complete Guide");
		book2.setAuthor("Gerardus Blokdyk");
		book2.setType("Programming book");
		book2.setPrice(20);
		book2.setOnSale(false);
		
		System.out.println(book2.getTitle());
		
		System.out.println(book1.getOnSale());
		System.out.println(book2.getOnSale());
		
		book2 = book1; // = new Book()
		
		book2.setOnSale(true);
		System.out.println(book1.getOnSale()); // true
		
		Book book3 = new Book();
		
		// Java allows us to call a method within another method.
		book3.setbookInfo("Functional Testing", "Programmer", "Programming book", 30, true);
		book3.getBookInfo();
		
		// Please create a combined getter method that outputs all the information about the book
		
		
		
		/*
		 * 
		 * 1. Data protection:
		 * 
		 * Book book3 = new Book();
		 * book3.setTitle("Top Secret documents");
		 * book3.setAuthor("US Government");
		 * book3.setType("Classified documents");
		 *
		 * String classifiedType = book3.getType();
	     *	
		 * System.out.println(classifiedType);
		 * 
		 * 
		 * 
		 * 2. Input constrains 
		 * 
		 * Date
		 * 
		 * private int day;
		 * private int month;
		 * private int year;
		 * 
		 * public void setDay(int day1) {
		 * 		if(day1 > 0 && day1 < 32) {
		 * 			day = day1;
		 * 		} else {
		 * 			System.out.println("The day can't be less than 0 and greater than 31");
		 * 		}
		 * 
		 * }
		 * 
		 */
	}
}
