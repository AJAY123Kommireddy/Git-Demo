package com.lambda;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookService {

	public List<Book> getServiceBooks(){
		
		List<Book> book  =new BookDB().getBooks();
		 
		Collections.sort(book,(o1,o2) -> o1.getName().compareTo(o2.getName()));
		
		return book;
	}
	
	
	
}

//class Mycomparator implements Comparator<Book>{
//
//	@Override
//	public int compare(Book o1, Book o2) {
//		
//		return o2.getName().compareTo(o1.getName());
//	}
//	
//}