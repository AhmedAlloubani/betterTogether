package day27_overloading_overriding_super;

public class Book_Store {
	
	public static void main(String[] args) {
		
		Book book1 = new Book();
	//	book1.numberOfWords = 1234; // not accessible, it's private
		book1.author = "Kathy Sierra"; // default (package private) is accessible
		book1.price = 26.39;           // we can access protected within the same package
		book1.title = "Head First Java"; // public - open to the world
		
	//	book1.calculateWords();          // private - not visible outside of a class
		book1.getAuthor();               // we can access protected within the same package
		book1.setPrice(32);              // accessible everywhere
		
		System.out.println(book1);
	}

}
