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
		//return bookDao.fetchAllBooks();
		return bookDao.findAll();
	}

	@Override
	public BookEntity addBook(BookEntity newBook) {
		//return bookDao.addBook(newBook);
		return bookDao.saveAndFlush(newBook);
	}

	@Override
	public BookEntity updateBook(BookEntity updateBook) {
		//return bookDao.updateBook(updateBook);
		return bookDao.saveAndFlush(updateBook);
	}

	@Override
	public void deleteBook(int bookId) {
		//bookDao.deleteBook(bookId);
		bookDao.deleteById(bookId);
	}

	@Override
	public BookEntity fetchABook(int bookId) {
		//return bookDao.fetchABook(bookId);
		return bookDao.findById(bookId).get();
	}
}
