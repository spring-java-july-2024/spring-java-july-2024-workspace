package com.demo.spring_rest_data_book_project_demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.spring_rest_data_book_project_demo.dao.BookDao;
import com.demo.spring_rest_data_book_project_demo.entity.BookEntity;


@Service
public class BookServiceImpl implements BookService{

	@Autowired
	BookDao bookDao;
	
	@Override
	public List<BookEntity> fetchAllBooks() {
		return bookDao.fetchAllBooks();
	}

	@Override
	public BookEntity addBook(BookEntity newBook) {
		return bookDao.addBook(newBook);
	}

	@Override
	public BookEntity updateBook(BookEntity updateBook) {
		return bookDao.updateBook(updateBook);
	}

	@Override
	public void deleteBook(int bookId) {
		bookDao.deleteBook(bookId);
	}

	@Override
	public BookEntity fetchABook(int bookId) {
		return bookDao.fetchABook(bookId);
	}

}
