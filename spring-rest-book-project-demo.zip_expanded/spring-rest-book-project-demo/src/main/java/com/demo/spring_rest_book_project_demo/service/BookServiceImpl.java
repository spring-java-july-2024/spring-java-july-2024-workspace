package com.demo.spring_rest_book_project_demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.spring_rest_book_project_demo.dao.BookDao;
import com.demo.spring_rest_book_project_demo.pojo.BookPojo;

@Service
public class BookServiceImpl implements BookService{

	@Autowired
	BookDao bookDao;
	
	@Override
	public List<BookPojo> fetchAllBooks() {
		return bookDao.fetchAllBooks();
	}

	@Override
	public BookPojo addBook(BookPojo newBook) {
		return bookDao.addBook(newBook);
	}

	@Override
	public BookPojo updateBook(BookPojo updateBook) {
		return bookDao.updateBook(updateBook);
	}

	@Override
	public void deleteBook(int bookId) {
		bookDao.deleteBook(bookId);
	}

	@Override
	public BookPojo fetchABook(int bookId) {
		return bookDao.fetchABook(bookId);
	}

}
