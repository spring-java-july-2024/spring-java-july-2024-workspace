package com.demo.spring_rest_data_book_project_demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.spring_rest_data_book_project_demo.entity.BookEntity;

@Repository
public interface BookDao extends JpaRepository<BookEntity, Integer>{
	
}
