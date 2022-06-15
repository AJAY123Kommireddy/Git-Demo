package com.lambda;

public class BookMain {
public static void main(String[] args) {
		
		BookService bookService = new BookService();
		System.out.println(bookService.getServiceBooks());
	}
}
