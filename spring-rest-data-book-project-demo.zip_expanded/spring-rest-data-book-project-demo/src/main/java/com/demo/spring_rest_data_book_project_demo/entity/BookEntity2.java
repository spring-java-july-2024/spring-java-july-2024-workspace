package com.demo.spring_rest_data_book_project_demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

@Entity
@Table(name="book_details")
public class BookEntity2 {

	@Id
	@Column(name="book_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bookId;
	
	@Column(name="book_title")
	private String bookTitle;
	
//	@Column(name="book_author")
//	private String bookAuthor;

	@ManyToOne
	@JoinColumn(name="book_author_id")
	private AuthorEntity2 author;
	
	@Column(name="book_genre")
	private String bookGenre;
	
	@Column(name="book_cost")
	private int bookCost;
	
	@Column(name="book_image_url")
	private String bookImageUrl;
}
