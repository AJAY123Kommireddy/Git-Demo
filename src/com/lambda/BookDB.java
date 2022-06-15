package com.lambda;

import java.util.ArrayList;
import java.util.List;

public class BookDB {

	public List<Book> getBooks() {
		List<Book> books = new ArrayList();
		books.add(new Book(1, "javabook", 500));
		books.add(new Book(2, "dotnet", 400));
		books.add(new Book(3, "python", 300));
		books.add(new Book(4, "c", 200));
		books.add(new Book(5, "c++", 100));

		return books;

	}
}
