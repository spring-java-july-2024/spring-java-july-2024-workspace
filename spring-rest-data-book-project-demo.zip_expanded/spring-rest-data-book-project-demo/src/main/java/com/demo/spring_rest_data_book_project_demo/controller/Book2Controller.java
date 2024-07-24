package com.demo.spring_rest_data_book_project_demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.spring_rest_data_book_project_demo.dao.BookDao2;
import com.demo.spring_rest_data_book_project_demo.entity.BookEntity2;

@RestController
@RequestMapping("/api")
public class Book2Controller {

	@Autowired
	BookDao2 bookDao2;
	
	@GetMapping("/books2")
	public ResponseEntity<List<BookEntity2>> getAllBooks(){
		return ResponseEntity.ok(bookDao2.findAll());
	}
	
	@GetMapping("/books2/{bid}")
	public ResponseEntity<BookEntity2> getABooks(@PathVariable("bid") int bookId){
		return ResponseEntity.ok(bookDao2.findById(bookId).get());
	}
}
