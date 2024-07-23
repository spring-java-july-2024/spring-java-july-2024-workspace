package com.demo.spring_rest_book_project_demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.spring_rest_book_project_demo.pojo.BookPojo;
import com.demo.spring_rest_book_project_demo.service.BookService;

@RestController
@RequestMapping("/api")
public class BookController {
	
	@Autowired
	BookService bookService;
	
	// http://localhost:8080/api/books
	@GetMapping("/books")
	public List<BookPojo> fetchAllBooks(){
		return bookService.fetchAllBooks();
	}
	
	// localhost:8080/api/books/203
	@GetMapping("/books/{bookId}")
	public BookPojo fetchABook(@PathVariable("bookId") int bid) {
		return bookService.fetchABook(bid);
	}
	
	// localhost:8080/api/books/202
	@DeleteMapping("/books/{bid}")
	public void deleteBook(@PathVariable("bid") int bookId) {
		bookService.deleteBook(bookId);
		
	}
	
	@PostMapping("/books")
	public BookPojo addBook(@RequestBody BookPojo newBook) {
		return bookService.addBook(newBook);
	}
	
	@PutMapping("/books")
	public BookPojo updateBook(@RequestBody BookPojo upBook) {
		return bookService.updateBook(upBook);
	}
}