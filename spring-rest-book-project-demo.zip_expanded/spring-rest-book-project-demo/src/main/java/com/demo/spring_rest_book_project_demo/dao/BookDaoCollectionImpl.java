package com.demo.spring_rest_book_project_demo.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.demo.spring_rest_book_project_demo.pojo.BookPojo;

@Repository
public class BookDaoCollectionImpl implements BookDao{

	List<BookPojo> bookDataStore;
	
	public BookDaoCollectionImpl() {
		bookDataStore = new ArrayList<>();
		bookDataStore.add(new BookPojo(201, "Harry Potter and the Order of Phoenix", "Fiction", 300, LocalDate.of(2005,06,06), ""));
		bookDataStore.add(new BookPojo(202, "Harry Potter and the Prizoner of Azkaban", "Fiction", 350, LocalDate.of(2010,05,03), ""));
		bookDataStore.add(new BookPojo(203, "Harry Potter and the Half Blood Prince", "Fiction", 250, LocalDate.of(2011,01,01), ""));
	}

	@Override
	public List<BookPojo> fetchAllBooks() {
		return bookDataStore;
	}

	@Override
	public BookPojo addBook(BookPojo newBook) {
		int newBookId = bookDataStore.get(bookDataStore.size()-1).getBookId() + 1;
		newBook.setBookId(newBookId);
		bookDataStore.add(newBook);
		return newBook;
	}

	@Override
	public BookPojo updateBook(BookPojo updateBook) {
		for(int i=0;i<bookDataStore.size();i++) {
			if(bookDataStore.get(i).getBookId() == updateBook.getBookId()) {
				bookDataStore.set(i, updateBook);
				break;
			}
		}		
		return updateBook;
	}

	@Override
	public void deleteBook(int bookId) {
		for(int i=0;i<bookDataStore.size();i++) {
			if(bookDataStore.get(i).getBookId() == bookId) {
				bookDataStore.remove(i);
				break;
			}
		}
	}

	@Override
	public BookPojo fetchABook(int bookId) {
		BookPojo returnBook = null;
		for(BookPojo eachBook : bookDataStore) {
			if(eachBook.getBookId() == bookId) {
				returnBook = eachBook;
				break;
			}
		}
		return returnBook;
	}
}
