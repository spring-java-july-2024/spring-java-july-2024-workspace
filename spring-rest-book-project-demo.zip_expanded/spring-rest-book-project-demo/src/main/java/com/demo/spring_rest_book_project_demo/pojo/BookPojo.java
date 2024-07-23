package com.demo.spring_rest_book_project_demo.pojo;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class BookPojo {
	private int bookId;
	private String bookTitle;
	private String bookGenre;
	private int bookCost;
	private LocalDate bookPublished;
	private String bookImageUrl;
	
	
}
