package day26_inheritance_practice;

import day27_overloading_overriding_super.Book;

public class AudioBook extends Book {
	
	public void testAccessModifiers()  {
		
	//	System.out.println(numberOfWords);  // private variables are not inherited
	//	System.out.println(author);         // default  - accessible within the same package only
		System.out.println(price);          // protected: AudioBook extends Book and is able to access the protected variables
		System.out.println(title);          // accessible to everyone
		
		System.out.println(getAuthor());    // we are able to access protected methods as well
	}

}
