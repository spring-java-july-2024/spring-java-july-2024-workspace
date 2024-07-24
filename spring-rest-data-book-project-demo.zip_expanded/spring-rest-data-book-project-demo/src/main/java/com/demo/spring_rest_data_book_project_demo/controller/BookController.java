package com.demo.spring_rest_data_book_project_demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.spring_rest_data_book_project_demo.entity.BookEntity;
import com.demo.spring_rest_data_book_project_demo.service.BookService;

@RestController
@RequestMapping("/api")
public class BookController {
	
	@Autowired
	BookService bookService;
	
	// http://localhost:8080/api/books
	@GetMapping("/books")
	public List<BookEntity> fetchAllBooks(){
		return bookService.fetchAllBooks();
	}
	
	// localhost:8080/api/books/203
	@GetMapping("/books/{bookId}")
	public ResponseEntity<BookEntity> fetchABook(@PathVariable("bookId") int bid) {
		BookEntity book = bookService.fetchABook(bid); 
		return ResponseEntity.ok(book);
	}
	
	// localhost:8080/api/books/202
	@DeleteMapping("/books/{bid}")
	public void deleteBook(@PathVariable("bid") int bookId) {
		bookService.deleteBook(bookId);
	}
	
	@PostMapping("/books")
	public BookEntity addBook(@RequestBody BookEntity newBook) {
		return bookService.addBook(newBook);
	}
	
	@PutMapping("/books")
	public BookEntity updateBook(@RequestBody BookEntity upBook) {
		return bookService.updateBook(upBook);
	}
}
