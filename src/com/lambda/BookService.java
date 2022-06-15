package com.lambda;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookService {

	public List<Book> getServiceBooks(){
		
		List<Book> book  =new BookDB().getBooks();
		 
		Collections.sort(book,new Mycomparator());
		
		return book;
	}
	
	
	
}

class Mycomparator implements Comparator<Book>{

	@Override
	public int compare(Book o1, Book o2) {
		
		return o2.getName().compareTo(o1.getName());
	}
	
}