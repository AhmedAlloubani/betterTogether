package day18_encapsulation;

import java.util.Scanner;

public class Book {
	
	
	 
	/*
	 * Recap: 
	 * 
	 * - methods: 
	 * 		- void, no-args method: input.close()
	 * 		- void, with args: main(String[] args)
	 *  	- non-void, with args: text.charAt()
	 *  	- non-void, with no args: length(), toUpperCase()
	 *  
	 *  - encapsulation - data hiding, we are protecting the data from the code
	 *   that is not authorized to access it.
	 *   
	 *  - access modifiers: public, private 
	 *  	- public - available to everyone;
	 *  	- protected - available within the package and available to children
	 *  	- default (doesn't need to be specified explicitly) - available only within package
	 *  	- private - no one outside of the class will be able to access it
	 *  
	 *  - getters and setters: publicly available methods, retrieving and 
	 *  updating values of private variable
	 *  
	 *  	- get + name of the var that starts with Capitalized letter: getText()
	 * 		- set + name of the var that starts with Capitalized letter: setText(String str)
	 */
	private String title;
	private String author;
	private String type;
	private double price;
	private boolean onSale;
	
	public void setbookInfo(String bookTitle, String bookAuthor, String bookType, double bookPrice, boolean isOnSale) {
		
		setTitle(bookTitle);
		setAuthor(bookAuthor);
		setType(bookType);
		price = bookPrice;
		onSale = isOnSale;
	}
	
	public void getBookInfo() {
		System.out.println(title);
		System.out.println(author);
		System.out.println(type);
		System.out.println(price);
		System.out.println(onSale);
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String bookTitle) {
		title = bookTitle;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String bookAuthor) {
		author = bookAuthor;
	}
	public String getType() {
		Scanner input = new Scanner(System.in);
		System.out.println("Please provide your name to access secret documents");
		String name = input.nextLine();
		if(name.equals("Mr President")) {
			return type;
		} else {
			return "";
		}
	}
	public void setType(String bookType) {
		type = bookType;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double bookPrice) {
		price = bookPrice;
	}
	public boolean getOnSale() {
		return onSale;
	}
	public void setOnSale(boolean isOnSale) {
		onSale = isOnSale;
	}
}




