package com.demo.spring_rest_data_book_project_demo.dao;

import java.util.List;

import com.demo.spring_rest_data_book_project_demo.entity.BookEntity;

public interface BookDao {
	List<BookEntity> fetchAllBooks();
	BookEntity addBook(BookEntity newBook);
	BookEntity updateBook(BookEntity updateBook);
	void deleteBook(int bookId);
	BookEntity fetchABook(int bookId);
}
