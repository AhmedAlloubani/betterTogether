package day26_inheritance_practice;

import day27_overloading_overriding_super.Book;

public class Library {
	
	public static void main(String[] args) {        // this related to the exercise in the Book class day27
		
		Book book2 = new Book();
//		book1.numberOfWords = 1234; // not accessible, it's private
//			book2.author = "Kathy Sierra"; // default (package private) is  not accessible in the different package
//			book2.price = 26.39;           // we can't access protected from the different package
			book2.title = "Head First Java"; // public - open to the world
			
		//	book1.calculateWords();          // private - not visible outside of a class
		//	book2.getAuthor();               // we can't access protected from the different package
			book2.setPrice(32);              // accessible everywhere
			
			System.out.println(book2);
	}

}
