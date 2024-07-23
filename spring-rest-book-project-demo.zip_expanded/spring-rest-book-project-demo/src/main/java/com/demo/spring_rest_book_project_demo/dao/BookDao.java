package com.demo.spring_rest_book_project_demo.dao;

import java.util.List;

import com.demo.spring_rest_book_project_demo.pojo.BookPojo;

public interface BookDao {
	List<BookPojo> fetchAllBooks();
	BookPojo addBook(BookPojo newBook);
	BookPojo updateBook(BookPojo updateBook);
	void deleteBook(int bookId);
	BookPojo fetchABook(int bookId);
}
